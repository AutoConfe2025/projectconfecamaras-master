package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class MatrizServicioPage {

    public static final Target BOTON_GENERAR_ACARCHIVO = Target.the("boton de generar archivo")
            .locatedBy("//a[contains(text(),'Generar Archivo')]");

    public static final Target BOTON_DESCARGAR_ACARCHIVO = Target.the("boton de descargar archivo")
            .locatedBy("//a[contains(text(),'Descargar archivo')]");
}
