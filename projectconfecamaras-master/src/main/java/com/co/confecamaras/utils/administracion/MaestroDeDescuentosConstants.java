package com.co.confecamaras.utils.administracion;

import java.util.Random;

public class MaestroDeDescuentosConstants {

    public static final String MAESTRO_DESCUENTOS_BUSQUEDA = "Maestro de Descuentos";

    public static final String  VALOR_ID = String.valueOf(generarNumeroAleatorio());

    public static final String NOMBRE_ = "ESTUDIANTES";

    public static final String VALOR_TIPO = "A";

    public static final String CONDICIONADO_ = "N";

    public static String generarNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        return Integer.toString(numeroAleatorio);
    }
}
