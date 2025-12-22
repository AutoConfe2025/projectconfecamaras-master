package com.co.confecamaras.utils.News.evidencias;

import com.co.confecamaras.utils.News.evidencias.Reportes; // Asumiendo que esta clase existe
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException; // Necesario para Files.createDirectories

public class BaseEvidencias {

    // --- VARIABLES ESTÁTICAS GLOBALES ---
    public static String ESCENARIO = "Temp";

    // RUTA donde Serenity guardará la carpeta de la ejecución (Única por Test Suite/Escenario)
    public static String RUTA_EVIDENCIAS = "";

    // RUTA DE LA CARPETA DE DESCARGAS DEL SISTEMA OPERATIVO (Valor por defecto del navegador)
    public static String RUTA_DESCARGA_SISTEMA = detectarCarpetaDescargasSistema();

    private static int NUMERO_EJECUCIONES = 1;

    // --- MÉTODOS DE INICIALIZACIÓN Y LÓGICA ---

    /**
     * Detecta automáticamente la carpeta de descargas del sistema operativo (Windows, Linux, macOS).
     * @return Ruta absoluta del directorio de descargas.
     */
    private static String detectarCarpetaDescargasSistema() {
        try {
            String userHome = System.getProperty("user.home");
            String osName = System.getProperty("os.name").toLowerCase();
            Path downloadPath;

            if (osName.contains("win")) {
                downloadPath = Paths.get(userHome, "Downloads");
            } else if (osName.contains("mac")) {
                downloadPath = Paths.get(userHome, "Downloads");
            } else { // Linux/Unix
                Path linuxPathEs = Paths.get(userHome, "Descargas");
                downloadPath = Files.exists(linuxPathEs) ? linuxPathEs : Paths.get(userHome, "Downloads");
            }

            // Aseguramos que la carpeta exista antes de devolverla
            Files.createDirectories(downloadPath);
            return downloadPath.toAbsolutePath().toString();

        } catch (IOException e) {
            e.printStackTrace();
            return Paths.get(System.getProperty("user.home")).toAbsolutePath().toString();
        }
    }

    /**
     * Construye y asigna la estructura de carpetas de evidencias ÚNICA para la ejecución.
     * DEBE SER LLAMADA EN EL @Before.
     * * @param nombreEscenario Nombre del módulo o escenario actual.
     * @return Ruta absoluta de la carpeta de ejecución creada.
     */
    public static String pathEvidence(String nombreEscenario) throws Exception {

        String inicio_usuario = System.getProperty("user.home");

        // 1. Carpeta Base: ~/.EVIDENCIAS_DESCARGAS
        Path carpeta_base = Paths.get(inicio_usuario, ".EVIDENCIAS_DESCARGAS");
        Files.createDirectories(carpeta_base);

        // 2. Carpeta Módulo/Escenario: /DigitacionGeneral
        Path carpeta_modulo = carpeta_base.resolve(nombreEscenario);
        Files.createDirectories(carpeta_modulo);

        // 3. Carpeta Ejecución Única: /Ejecucion 1 (Genera un número secuencial)
        Path carpeta_ejecucion;
        int currentExecution = NUMERO_EJECUCIONES;

        do {
            carpeta_ejecucion = carpeta_modulo.resolve("Ejecucion " + currentExecution);
            currentExecution++;
        } while (Files.exists(carpeta_ejecucion));

        // El número de ejecución se incrementa SOLO si la carpeta fue creada
        Files.createDirectories(carpeta_ejecucion);
        NUMERO_EJECUCIONES = currentExecution;

        // 4. Asignar la ruta a la variable estática RUTA_EVIDENCIAS
        // ESTA ASIGNACIÓN ES CLAVE Y OCURRE AQUÍ, NO EN LA INICIALIZACIÓN.
        RUTA_EVIDENCIAS = carpeta_ejecucion.toAbsolutePath().toString();

        return RUTA_EVIDENCIAS;
    }

    /**
     * Abre la carpeta de evidencias de la ejecución actual.
     */
    public static void openPath() {
        try {
            if (RUTA_EVIDENCIAS == null || RUTA_EVIDENCIAS.trim().isEmpty()) {
                throw new IllegalStateException("La ruta de evidencias (RUTA_EVIDENCIAS) no ha sido inicializada. Debe llamar a pathEvidence() primero.");
            }

            Desktop.getDesktop().open(new File(RUTA_EVIDENCIAS));
            Reportes.reportEvent(Reportes.INFO, "Evidencias almacenadas en: " + RUTA_EVIDENCIAS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}