package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class SimulacionPagElectronicoPage {

    public static final Target CAMPO_NUMERO_RECUPERACION = Target.the("campo numero de recuperacion")
            .locatedBy("//input[@id='_numrec']");

    public static final Target CAMPO_NUMERO_LUQUIDACION = Target.the("campo numero de liquidacion")
            .locatedBy("//input[@id='_numliq']");


}
