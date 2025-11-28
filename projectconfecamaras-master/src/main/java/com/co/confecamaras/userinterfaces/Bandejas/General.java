package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;

public class General {

    public static final Target OPCION_BANDEJA = Target.the("prima opcion de bandeja")
            .locatedBy("//span[@class='opcion']");
}
