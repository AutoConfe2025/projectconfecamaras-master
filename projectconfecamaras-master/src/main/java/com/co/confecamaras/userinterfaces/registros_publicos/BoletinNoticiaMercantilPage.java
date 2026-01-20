package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class BoletinNoticiaMercantilPage {

    public static final Target CAMPO_ANO_MES_GENERAR = Target.the("campo de año y mes")
            .locatedBy("//input[@id='anomes']");
}
