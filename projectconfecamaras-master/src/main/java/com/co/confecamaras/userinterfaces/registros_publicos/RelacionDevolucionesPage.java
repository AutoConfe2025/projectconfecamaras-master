package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RelacionDevolucionesPage {

    public static final Target CAMPO_FECHA_INI = Target.the("campo de fecha incial devolcuiones")
            .locatedBy("//input[@id='_fechaini']");

    public static final Target CAMPO_FECHA_FINAL = Target.the("campo de fecha final devolcuiones")
            .locatedBy("//input[@id='_fechafin']");

    public static final Target BTN_GENERAR_DEVOLUCION = Target.the("boton de generar devolcuion")
            .locatedBy("//button[contains(text(), 'Generar')]");

    public static final Target BTN_GENERAR_DEVOLUCION_ALERTA = Target.the("boton de generar devolcuion de la alerta")
            .locatedBy("(//button[contains(text(), 'Generar')])[2]");
}
