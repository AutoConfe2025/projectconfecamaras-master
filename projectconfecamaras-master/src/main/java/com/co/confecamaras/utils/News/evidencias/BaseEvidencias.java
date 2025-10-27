package com.co.confecamaras.utils.News.evidencias;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BaseEvidencias {
    public static String ESCENARIO = "Temp";
    public static String RUTA_EVIDENCIAS = "";

    public static String RUTA_DESCARGA = "";
    private static int NUMERO_EJECUCIONES = 1;

    public static String pathEvidence(String escenario) throws Exception {
        // CREA UNA NUEVA CARPETA INICIAL DE EVIDENCIAS
        String inicio_usuario = System.getProperty("user.home");
        Path carpeta_evidencias = Paths.get(inicio_usuario, ".EVIDENCIAS_DESCARGAS");
        if (!Files.exists(carpeta_evidencias))
            Files.createDirectory(carpeta_evidencias);

        // CREA LA CARPETA DEL STEP QUE SE VA A EJECUTAR
        Path carpeta_modulo = null;
        try {
            carpeta_modulo = carpeta_evidencias.resolve(escenario);
            if (!Files.exists(carpeta_modulo))
                Files.createDirectory(carpeta_modulo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // CREA LA CARPETA EN SECUENCIA POR EJECUCION POR MODULO, AQUI SE ESPERA GUARDAR ALGUN TIPO DE EVIDENCIA
        Path carpeta_ejecucion;
        do {
            carpeta_ejecucion = carpeta_modulo.resolve("Ejecucion " + NUMERO_EJECUCIONES);
            NUMERO_EJECUCIONES++;
        } while (Files.exists(carpeta_ejecucion));
        Files.createDirectory(carpeta_ejecucion);
        return carpeta_ejecucion.toAbsolutePath().toString();
    }

    public static void configurarRutaReporte(String nueva_ruta_reporte){
        System.setProperty("serenity.outputDirectory",nueva_ruta_reporte);
    }

    // ABRE LA CARPETA CREADA DURANTE LA EJECUCION
    public static void openPath() {
        try {
            Desktop.getDesktop().open(new File(RUTA_EVIDENCIAS));
            Reportes.reportEvent(Reportes.INFO,"Evidencias almacenadas en: "+ RUTA_EVIDENCIAS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
