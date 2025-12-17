package com.co.confecamaras.userinterfaces.utils;

import net.serenitybdd.screenplay.targets.Target;

public class FechasDinamicasPage {

    public static final Target ELEMENTO_FECHA_DINAMICA =
            Target.the("Elemento de fecha dinámica con ID: {0}")
                    .locatedBy("//*[@id='{0}']");
}