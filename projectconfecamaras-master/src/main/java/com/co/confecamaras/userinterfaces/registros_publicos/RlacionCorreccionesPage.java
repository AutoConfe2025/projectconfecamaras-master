package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RlacionCorreccionesPage {

    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo de ingreso de fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FINAL = Target.the("campo de ingreso de fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target BTN_GENERAR_RELACION_CORRECCION = Target.the("boton generar")
            .locatedBy("//a[@class='myButton']");

    public static final Target BTN_DESCARGAR_ARCHIVO = Target.the("boton descargar archivo")
            .locatedBy("//a[contains(text(), 'Descargar archivo')]");
}
