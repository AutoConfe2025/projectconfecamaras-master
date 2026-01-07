package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class InformeProductividadPage {

    public static final Target CAMPO_FECHA_INI = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target LISTA_TIPO_INFORME = Target.the("lista de tipo de informe")
            .locatedBy("//select[@id='_tipoinforme']");

    public static final Target OPCION_INFORME_PRODUCTIVIDAD_LISTA_TIPO_INFORME = Target.the("opcion informe de productividad lista de tipo de informe")
            .locatedBy("//option[@value='1']");

    public static final Target BTN_GENERAR = Target.the("boton generar")
            .locatedBy("//button[contains(text(),'Generar')]");
}
