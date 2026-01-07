package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ExportarMatriculasPage {

    public static final Target CAMPO_FECHA_INI = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha fin")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target CAMPO_DETALLADO_RESUMIDO = Target.the("campo de detallado o resumido")
            .locatedBy("//input[@id='_tipo']");

    public static final Target CAMPO_TASA_AFILIADOS = Target.the("campo de tasa o afiliados")
            .locatedBy("//input[@id='_matriculas']");

    public static final Target BTN_EXTRAER = Target.the("boton de extraer")
            .locatedBy("//a[contains(text(),'Extraer')]");

    public static final Target BTN_DESCARGAR_CSV = Target.the("boton de descargar csv")
            .locatedBy("//a[contains(text(),'Descargar')]");
}
