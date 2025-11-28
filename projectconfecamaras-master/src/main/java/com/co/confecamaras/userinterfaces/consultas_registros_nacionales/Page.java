package com.co.confecamaras.userinterfaces.consultas_registros_nacionales;

import net.serenitybdd.screenplay.targets.Target;

public class Page {

    public static final Target CAMPO_INGRESO_NIT = Target.the("campo de ingreso de nit")
            .locatedBy("//input[@id='nit']");

    public static final Target BOTON_CONSULTAR = Target.the("boton consultar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_ACCION = Target.the("boton accion")
            .locatedBy("(//span[@role='button'])[1]");

    public static final Target BOTON_ACCION_2 = Target.the("boton accion 2")
            .locatedBy("(//span[@role='button'])[2]");

    public static final Target BOTON_ACCION_3 = Target.the("boton accion 3")
            .locatedBy("(//span[@role='button'])[3]");
        public static final Target BOTON_CERRAR = Target.the("boton cerrar")
            .locatedBy("//button[@class='swal2-cancel swal2-styled']");
}
