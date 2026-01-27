package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class SoportesCajaPage {

    public static final Target CAMPO_NUMERO_RECUPERACION = Target.the("campo numero de recuperacion")
            .locatedBy("//input[@id='_numrec']");

    public static final Target BOTON_DESCARGAR = Target.the("boton descargar")
            .locatedBy("//a[contains(text(),'Descargar')]");

    public static final Target BOTON_DESCARGAR_2 = Target.the("boton descargar 2")
            .locatedBy("(//a[contains(text(),'Descargar')])[2]");
}
