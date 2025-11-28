package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.annotations.Subject;
import org.junit.Assert;

import java.io.File;
import java.util.Arrays;

@Subject("Validar finalización real de una descarga")
public class ControlDescargas implements Task {

    private final String rutaDescarga;
    private final int maxSegundosEspera;
    private final int tiempoEntreIntentosMs = 1000;

    private static final String[] EXTENSIONES_TEMPORALES = {
            ".crdownload", ".part", ".tmp", ".download"
    };

    public ControlDescargas(String rutaDescarga, int maxSegundosEspera) {
        this.rutaDescarga = rutaDescarga;
        this.maxSegundosEspera = maxSegundosEspera;
    }

    public static ControlDescargas hastaTerminar(String rutaDescarga) {
        return new ControlDescargas(rutaDescarga, 60);
    }

    public static ControlDescargas hastaTerminar(String rutaDescarga, int segundos) {
        return new ControlDescargas(rutaDescarga, segundos);
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

        long tiempoInicio = System.currentTimeMillis();
        long tiempoMaximo = maxSegundosEspera * 1000;

        File ultimoArchivoDescargado = null;
        long ultimoTamano = -1;
        int ciclosIguales = 0;

        while (System.currentTimeMillis() - tiempoInicio < tiempoMaximo) {

            File[] archivos = carpeta.listFiles();
            if (archivos == null) archivos = new File[]{};

            // 1. Buscar archivos temporales aún activos
            boolean existeArchivoTemporal = Arrays.stream(archivos)
                    .anyMatch(file -> Arrays.stream(EXTENSIONES_TEMPORALES)
                            .anyMatch(file.getName()::endsWith));

            if (existeArchivoTemporal) {
                dormir();
                continue;
            }

            // 2. Obtener el archivo más reciente
            File archivoFinal = Arrays.stream(archivos)
                    .filter(File::isFile)
                    .max((a, b) -> Long.compare(a.lastModified(), b.lastModified()))
                    .orElse(null);

            if (archivoFinal == null) {
                dormir();
                continue;
            }

            // 3. Verificar si ya NO está creciendo
            long tamActual = archivoFinal.length();

            if (archivoFinal.equals(ultimoArchivoDescargado) && tamActual == ultimoTamano) {
                ciclosIguales++;

                // Si durante 3 ciclos no cambia => descarga completada
                if (ciclosIguales >= 3) {
                    actor.attemptsTo(LogEvent.recordevent(
                            Reportes.PASSED,
                            "Descarga finalizada: " + archivoFinal.getName()
                    ));
                    return;
                }
            } else {
                ciclosIguales = 0;
            }

            ultimoArchivoDescargado = archivoFinal;
            ultimoTamano = tamActual;

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
