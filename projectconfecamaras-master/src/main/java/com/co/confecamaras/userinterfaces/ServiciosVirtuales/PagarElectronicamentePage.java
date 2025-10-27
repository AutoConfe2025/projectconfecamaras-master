package com.co.confecamaras.userinterfaces.ServiciosVirtuales;

import net.serenitybdd.screenplay.targets.Target;

public class PagarElectronicamentePage {
    // INGRESAR CODIGO DE RECUPERACION DE PAGO
    public static Target INP_NUMERO_RECUPERACION = Target.the("numero de recoperacion").locatedBy("#_numrec");
    public static Target BTN_CONTINUAR = Target.the("continuar proceso").locatedBy("//*[text()='Continuar']");

    //INGRESAR INFORMACION DE QUIEN PAGARA
    public static Target TXT_CODIGO_RECUPERACION = Target.the("continuacion de pago").locatedBy("//p/strong[contains(text(),'Código')]");
    public static Target TXT_VALOR = Target.the("valor a pagar").locatedBy("//p/strong[contains(text(),'Valor')]");
    public static Target INP_NUMERO_IDENTIFICACION = Target.the("ingresar numero identificacion").locatedBy("#_identificacioncliente");
    public static Target BTN_PAGAR = Target.the("redireccion a pagar").locatedBy("//button[contains(text(),'Pagar')]");

    // INGRESAR INFORMACION DE PAGO
    public static Target DPW_TIPO_DOCUMENTO = Target.the("seleccionar tipo documento").locatedBy("#tipoDocumento");
    public static Target OPT_TIPO_DOCUMENTO = Target.the("tipo documento colombia").locatedBy("(//li[@aria-label='Cédula Ciudadania'])[1]");

    public static Target INP_NUMERO_CELULAR = Target.the("ingresar numero de celular").locatedBy("#celularComprador");

    public static Target DPW_PAIS = Target.the("seleccionar pais").locatedBy("#paisComprador");
    public static Target OPT_DPW = Target.the("seleccionar opcion").locatedBy("//li[@aria-label='{0}']");

    public static Target DPW_CIUDAD = Target.the("seleccionar ciudad").locatedBy("#ciudadComprador");
    public static Target INP_BUSQUEDA_DPW = Target.the("ingresar ciudad").locatedBy("//input[contains(@class,'p-dropdown-filter p-inputtext')]");

    public static Target CHK_TRATAMIENTO_DATOS = Target.the("aceptar tratamiento de datos").locatedBy("//div[@role='checkbox']");

    // MEDIO DE PAGO
    public static Target BTN_PSE = Target.the("pagar por PSE").locatedBy("(//div[@tooltipposition='top'])[1]");
    public static Target BTN_VISA = Target.the("pagar por Visa").locatedBy("(//div[@tooltipposition='top'])[2]");
    public static Target BTN_MASTERCARD = Target.the("pagar por mastercard").locatedBy("(//div[@tooltipposition='top'])[3]");
    public static Target BTN_AMERICAN_EXPRESS = Target.the("pagar por american express").locatedBy("(//div[@tooltipposition='top'])[4]");

    public static Target CARD_MEDIO_PAGO = Target.the("contenedor de medio de pago").locatedBy("//div[@class='container firstoken']");
    public static Target INP_NUMERO_TARJETA = Target.the("ingresar numero de tarjeta").locatedBy("//input[@name='card_number']");
    public static Target INP_CODIGO_SEGURIDAD = Target.the("ingresar codigo de seguridad").locatedBy("//input[@placeholder='CVV']");
    public static Target INP_FECHA_EXPIRACION = Target.the("ingresar codigo de seguridad").locatedBy("//input[@placeholder='MM/YY']");
    public static Target DPW_CUOTAS = Target.the("ingresar numero de cuotas").locatedBy("//p-dropdown[@id='nroCuotas']//input/following::span[1]");
    public static Target BTN_PAGAR_TX = Target.the("pagar transaccion").locatedBy("//button//span[text()='Pagar']");
    public static Target POPUP = Target.the("mensaje de estado de transaccion").locatedBy("//h3[contains(text(),'Transacción')]");
    public static Target BTN_FINALIZAR_TX = Target.the("finalizar transaccion").locatedBy("//button/span[text()='Finalizar']");
    //public static Target BTN_FINALIZAR_TX = Target.the("finalizar transaccion").locatedBy("(//button[@id='prt4'])[1]");
}
