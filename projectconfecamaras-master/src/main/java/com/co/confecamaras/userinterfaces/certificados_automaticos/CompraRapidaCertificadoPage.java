package com.co.confecamaras.userinterfaces.certificados_automaticos;

import net.serenitybdd.screenplay.targets.Target;

public class CompraRapidaCertificadoPage {

    public static final Target BOTON_MATRICULA_COMPRA_RAPIDA_CERTIFICADO = Target.the("boton de seleccion de matricula")
            .locatedBy("//span[contains(text(),'Matrícula')]");

    public static final Target BOTON_PROPONENTE_COMPRA_RAPIDA_CERTIFICADO = Target.the("boton de seleccion de proponente")
            .locatedBy("//span[contains(text(),'Proponente')]");

    public static final Target CAMPO_INGRESO_MATRICULA_COMPRA_RAPIDA = Target.the("campo de ingreso matricula compra rapida")
            .locatedBy("//input[@id='filtro']");

    public static final Target BOTON_REALIZAR_BUSQUEDA_MATRICULA_COMPRA_RAPIDA = Target.the("boton de busqueda compra rapida")
            .locatedBy("//button[@class='ml-2 rounded-circle  p-button p-component p-button-icon-only p-button-rounded p-button-info']");

    public static final Target BOTON_SELECCIONAR_COMPRA_RAPIDA = Target.the("boton de seleccionar compra rapida")
            .locatedBy("//button[@id='0']");

    public static final Target BOTON_AÑADIR_PRIMERA_CARD_SELECCION = Target.the("boton de añadir primera card compra rapida")
            .locatedBy("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[1]");

    public static final Target BOTON_AÑADIR_SEGUNDA_CARD_SELECCION = Target.the("boton de añadir segunda card compra rapida")
            .locatedBy("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[2]");

    public static final Target BOTON_AÑADIR_TERCERA_CARD_SELECCION = Target.the("boton de añadir tercera card compra rapida")
            .locatedBy("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[3]");

    public static final Target BOTON_AÑADIR_CUARTA_CARD_SELECCION = Target.the("boton de añadir cuarta card compra rapida")
            .locatedBy("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[5]");

    public static final Target BOTON_AÑADIR_QUINTA_CARD_SELECCION = Target.the("boton de añadir quinta card compra rapida")
            .locatedBy("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[4]");

    public static final Target BOTON_PAGAR_COMPRA_RAPIDA = Target.the("boton de pagar compra rapida")
            .locatedBy("//button[@class='btn btn-outline-primary sc-cart-checkout mt-1']");

    public static final Target CAMPO_INGRESO_CORREO_ELECTRONICO = Target.the("campo de ingreso de correo electronico")
            .locatedBy("//input[@id='swal2-input']");

    public static final Target BOTON_OK_CAMPO_INGRESO_CORREO_ELECTRONICO = Target.the("boton ok de campo de ingreso de correo electronico")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

}
