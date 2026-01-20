package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RelacionLiquidacionesPage {

    public static final Target CAMPO_FECHA_INICIAL = Target.the("Campo de fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target CAMPO_SOLO_PAGADAS = Target.the("campo de solo pagadas")
            .locatedBy("//input[@id='_solopagadas']");

    public static final Target CAMPO_SOLO_FIRMADAS = Target.the("campo de solo firmadas")
            .locatedBy("//input[@id='_firmadas']");

    public static final Target BTN_GENERAR = Target.the("boton generar liquidaciones")
            .locatedBy("//a[contains(text(),'Generar')]");
}
