package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class FirmadoElectronicoPage {

    public static final Target CAMPO_NUMERO_RECUPERACION = Target.the("campo de numero de recuperacion")
            .locatedBy("//input[@id='_numrec']");

    public static final Target CAMPO_EMAIL_FIRMANTE = Target.the("campo de email firmante")
            .locatedBy("//input[@id='_emailfirmante']");

    public static final Target CAMPO_IDENTIFICACION_FIRMANTE = Target.the("campo de identificacion firmante")
            .locatedBy("//input[@id='_identificacionfirmante']");

    public static final Target CAMPO_NOMBRE_FIRMANTE = Target.the("campo de nombre firmante")
            .locatedBy("//input[@id='_nombrefirmante']");

    public static final Target CAMPO_CELULAR_FIRMANTE = Target.the("campo de celular firmante")
            .locatedBy("//input[@id='_celularfirmante']");

    public static final Target CAMPO_CLAVE_FIRMANTE = Target.the("campo de clave firmante")
            .locatedBy("//input[@id='_clavefirmante']");

    public static final Target LISTA_AMBIENTE = Target.the("lista ambiente")
            .locatedBy("//select[@id='_ambiente']");

    public static final Target LISTA_AFECTAR_LIQUIDACION = Target.the("lista afectar liquidacion")
            .locatedBy("//select[@id='_afectar']");

    public static final Target LISTA_CONTROL_FIRMANTE = Target.the("lista control firmante")
            .locatedBy("//select[@id='_controlfirmante']");
}
