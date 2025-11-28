package com.co.confecamaras.utils.bandejas.oficios_requerimientos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class constants {

    public static final String OFICIOS_REQUERIMIENTOS = "Oficios y requerimientos";
    public static final String TEXTO_COMENTARIO = "esta es una prueba de automatizacion qa";
    public static final String TEXTO_NUMERO_DEL_DOCUMENTO = "2025QA";
    public static final String FECHA;
    public static final String MENSAJE_ARCHIVACION_EXITOSA = "El código de barras  739254 quedó respondido y archivadoRegresar";
    public static final String MENSAJE_ALERTA_ARCHIVAR = "El código de barras 739254 no está en un estado que permita su archivo en forma natural. Está seguro de archivarlo?";

    static {
        FECHA = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}