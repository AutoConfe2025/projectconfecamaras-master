package com.co.confecamaras.userinterfaces.consultas_registros_nacionales;

import net.serenitybdd.screenplay.targets.Target;

public class Page {

    public static final Target CAMPO_INGRESO_NIT = Target.the("campo de ingreso de nit")
            .locatedBy("//input[@id='nit']");

    public static final Target BOTON_CONSULTAR = Target.the("boton consultar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_ACCION = Target.the("boton accion")
            .locatedBy("(//td[@class='text-center'])[5]");

    public static final Target BOTON_ACCION_2 = Target.the("boton accion 2")
            .locatedBy("(//td[@class='text-center'])[10]");

    public static final Target BOTON_ACCION_3 = Target.the("boton accion 3")
            .locatedBy("(//td[@class='text-center'])[15]");
        public static final Target BOTON_CERRAR = Target.the("boton cerrar")
            .locatedBy("//button[@class='swal2-cancel swal2-styled']");
}
