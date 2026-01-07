package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class InscripcionesLibrosPage {

    public static final Target CAMPO_FECHA_INCIAL = Target.the("campo fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FINAL = Target.the("campo fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target BOTON_GENERAR_INFORME_RESUMIDO_LIBROS = Target.the("boton informe resumido en libros")
            .locatedBy("//a[@class='myButton']");

    public static final Target BOTON_DESCARGAR_CSV = Target.the("boton descargar csv")
            .locatedBy("//a[contains(text(),'Descargar CSV')]");
}
