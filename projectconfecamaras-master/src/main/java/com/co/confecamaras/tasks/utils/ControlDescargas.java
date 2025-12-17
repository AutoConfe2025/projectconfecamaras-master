package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import org.junit.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

@Subject("Validar finalización real de una descarga")
public class ControlDescargas implements Task {

    private final String rutaDescarga;
    private final int maxSegundosEspera;
    private final int tiempoEntreIntentosMs = 1000;
    private final long tiempoMinimoModificacion;

    // Mantenemos esto aunque no lo usemos, por si el navegador lo usa internamente.
    private static final String[] EXTENSIONES_TEMPORALES = {
            ".crdownload", ".part", ".tmp", ".download"
    };

    // Constructor 1 (DEFAULT)
    public ControlDescargas(String rutaDescarga, int maxSegundosEspera) {
        this(rutaDescarga, maxSegundosEspera, 0);
    }

    // Constructor 2 (Principal: Acepta el tiempo de inicio para ignorar archivos viejos)
    public ControlDescargas(String rutaDescarga, int maxSegundosEspera, long tiempoMinimoModificacion) {
        this.rutaDescarga = rutaDescarga;
        this.maxSegundosEspera = maxSegundosEspera;
        this.tiempoMinimoModificacion = tiempoMinimoModificacion;
    }

    // Fábrica 3 (NUEVA: CON TIEMPO DE INICIO - Usada en VerRutaTask)
    public static ControlDescargas hastaTerminar(String rutaDescarga, int segundos, long tiempoInicioMs) {
        return new ControlDescargas(rutaDescarga, segundos, tiempoInicioMs);
    }

    public static ControlDescargas hastaTerminar(String rutaDescarga, int segundos) {
        return new ControlDescargas(rutaDescarga, segundos);
    }

    public static ControlDescargas hastaTerminar(String rutaDescarga) {
        return new ControlDescargas(rutaDescarga, 60);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        File carpeta = new File(rutaDescarga);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            actor.attemptsTo(LogEvent.recordevent(
                    Reportes.FAILED,
                    "La carpeta de descargas no existe o no es válida: " + rutaDescarga
            ));
            Assert.fail("Carpeta inválida: " + rutaDescarga);
        }

        actor.attemptsTo(LogEvent.recordevent(
                Reportes.INFO,
                "Validando descargas en: " + rutaDescarga
        ));

        long tiempoInicioLoop = System.currentTimeMillis();
        long tiempoMaximo = maxSegundosEspera * 1000;

        while (System.currentTimeMillis() - tiempoInicioLoop < tiempoMaximo) {

            File[] archivos = carpeta.listFiles();
            if (archivos == null) archivos = new File[]{};

            // 1. Obtener el archivo más reciente que sea NUEVO (modificado después del clic)
            File archivoFinal = Arrays.stream(archivos)
                    .filter(File::isFile)
                    // Filtramos por tiempo: El archivo debe ser más nuevo que el momento del clic.
                    .filter(file -> file.lastModified() >= tiempoMinimoModificacion)
                    // Filtramos cualquier archivo que aún tenga una extensión temporal por si acaso.
                    .filter(file -> !Arrays.stream(EXTENSIONES_TEMPORALES).anyMatch(file.getName().toLowerCase()::endsWith))
                    // Obtenemos el más reciente de los archivos FILTRADOS
                    .max(Comparator.comparingLong(File::lastModified))
                    .orElse(null);

            if (archivoFinal != null) {
                // ARCHIVO NUEVO DETECTADO. Asumimos que la descarga ha terminado.
                // Ya no verificamos el tamaño ni la estabilización (para evitar el bloqueo de Acrobat).
                actor.attemptsTo(LogEvent.recordevent(
                        Reportes.PASSED,
                        "Descarga finalizada (Detección por Archivo Nuevo): " + archivoFinal.getName()
                ));
                return; // Éxito: Salimos del bucle
            }

            dormir();
        }

        actor.attemptsTo(LogEvent.recordevent(
                Reportes.FAILED,
                "Timeout esperando finalización de la descarga"
        ));

        Assert.fail("Timeout esperando descarga. Carpeta: " + rutaDescarga);
    }

    private void dormir() {
        try {
            Thread.sleep(tiempoEntreIntentosMs);
        } catch (InterruptedException ignored) {}
    }
}