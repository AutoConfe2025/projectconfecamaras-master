package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class AlarmasRegistrosPage {

    public static final Target MSG_DETECTOR_ALARMAS = Target.the("almacena el mensaje").
            locatedBy("//div[@id='frameSecundarioCentral']/center/table//div");

    public static final Target BTN_SINCRONIZAR = Target.the("verifica si hay alarmas").
            locatedBy("//span[normalize-space()='\"Sincronizar Alarmas\"']");
}
