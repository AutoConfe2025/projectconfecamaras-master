package com.co.confecamaras.userinterfaces.ServiciosVirtuales;

import net.serenitybdd.screenplay.targets.Target;

public class ServiciosVirtualesPage {
    public static Target BTN_HOME =Target.the("boton de inicio").locatedBy("//a[@href='javascript:inicio();']/span");
    public static Target OPT_SOLICITAR = Target.the("solicitar certificados").locatedBy("//span[text()='Solicitar']");
    public static Target OPT_PAGAR = Target.the("permite realizar pagos").locatedBy("//span[text()='Pagar']");
}
