package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoRenovacionPnAfiliadoPage {

    public static final Target CAMPO_COSTOS_AFILIACION = Target.the("campo texto de cuota de afiliacion")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]");

    public static final Target CAMPO_VALOR_AFILIACION = Target.the("campo valor de cuota de afiliacion")
            .locatedBy("//*[@id=\"seccionCentral\"]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[5]");
}
