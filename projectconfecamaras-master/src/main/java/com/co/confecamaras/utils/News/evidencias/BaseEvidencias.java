package com.co.confecamaras.utils.News.evidencias;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseEvidencias {

    public static String ESCENARIO = "Temp";
    public static String RUTA_EVIDENCIAS = "";
    public static String RUTA_DESCARGA = detectarCarpetaDescargas(); // ✅ Detectada automáticamente

    private static int NUMERO_EJECUCIONES = 1;

    /**
     * Detecta automáticamente la carpeta de descargas según el sistema operativo.
     * Compatible con Windows, Linux y macOS.
     */
    public static String detectarCarpetaDescargas() {
        try {
            String userHome = System.getProperty("user.home");

            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                Path winPath = Paths.get(userHome, "Downloads");
                Files.createDirectories(winPath);
                return winPath.toString();
            }

            if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                Path macPath = Paths.get(userHome, "Downloads");
                Files.createDirectories(macPath);
                return macPath.toString();
            }

            Path linuxPath = Paths.get(userHome, "Descargas"); // muchos equipos en español
            if (!Files.exists(linuxPath)) {
                linuxPath = Paths.get(userHome, "Downloads");
            }

            Files.createDirectories(linuxPath);
            return linuxPath.toString();

        } catch (Exception e) {
            e.printStackTrace();
            // Último recurso
            return Paths.get(System.getProperty("user.home")).toString();
        }
    }

    /**
     * Construye la estructura de carpetas de evidencias.
     */
    public static String pathEvidence(String escenario) throws Exception {

        String inicio_usuario = System.getProperty("user.home");

        Path carpeta_evidencias = Paths.get(inicio_usuario, ".EVIDENCIAS_DESCARGAS");
        Files.createDirectories(carpeta_evidencias);

        Path carpeta_modulo = carpeta_evidencias.resolve(escenario);
        Files.createDirectories(carpeta_modulo);

        Path carpeta_ejecucion;
        do {
            carpeta_ejecucion = carpeta_modulo.resolve("Ejecucion " + NUMERO_EJECUCIONES);
            NUMERO_EJECUCIONES++;
        } while (Files.exists(carpeta_ejecucion));

        Files.createDirectories(carpeta_ejecucion);

        RUTA_EVIDENCIAS = carpeta_ejecucion.toAbsolutePath().toString();

        return RUTA_EVIDENCIAS;
    }


    public static void configurarRutaReporte(String nueva_ruta_reporte) {
        System.setProperty("serenity.outputDirectory", nueva_ruta_reporte);
    }


    public static void openPath() {
        try {
            if (RUTA_EVIDENCIAS == null || RUTA_EVIDENCIAS.trim().isEmpty()) {
                throw new Exception("La ruta de evidencias no está definida.");
            }

            Desktop.getDesktop().open(new File(RUTA_EVIDENCIAS));
            Reportes.reportEvent(Reportes.INFO, "Evidencias almacenadas en: " + RUTA_EVIDENCIAS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
