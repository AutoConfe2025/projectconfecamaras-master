package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoCancelacionProponentePage {

    //FLUJO CANCELACION
    public static final Target BOTON_SOLICITUD_CANCELACION_PROPONENTE = Target.the("boton de ingreso a modulo de cancelacion")
            .locatedBy("(//div[@class='p-card-body'])[7]");

    public static final Target BOTON_IMPRIMIR_FORM_CANCELACION_PROPONENTE = Target.the("boton de imprimir formulario de cancelacion")
            .locatedBy("(//button[@id='btnGrabarLiquidacionInscripcionProponentes'])[2]");

    public static final Target BOTON_CERRAR_PDF_FORMULARIO = Target.the("boton de imprimir formulario de cancelacion")
            .locatedBy("//button[@class='swal2-cancel swal2-styled']");

    public static final Target BOTON_RECIBIR_PAGO_CANCELACION_PROPONENTE = Target.the("boton de recibir pago de cancelacion de proponente")
            .locatedBy("(//button[@id='btnGrabarLiquidacionInscripcionProponentes'])[1]");
}
