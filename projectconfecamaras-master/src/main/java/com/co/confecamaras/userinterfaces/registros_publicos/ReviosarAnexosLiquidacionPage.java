package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ReviosarAnexosLiquidacionPage {

    public static final Target CAMPO_NUMERO_RECUPERACION =Target.the("campo numero de recuperacion")
            .locatedBy("//input[@id='_numrec']");

    public static final Target BOTON_CARGAR_NUMERO_RECUPERACION =Target.the("boton cargar numero de recuperacion")
            .locatedBy("//a[contains(text(),'Cargar')]");

    public static final Target BOTON_LIBRO_VER_PDF =Target.the("boton cargar numero de recuperacion")
            .locatedBy("//*[@id=\"gridanx\"]/div[2]/table/tbody/tr[2]/td[13]");
}
