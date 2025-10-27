package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionSirefInscripcionesPage {
    public static Target LINK_NOTIFICAR_SMS = Target.the("accion de notificar sms").locatedBy("//a[contains(@data-original-title,'Notificar')]");
    public static Target BTN_NOTIFICAR_EMAILS = Target.the("notificara a los correos asociados").locatedBy("//*[text()='Notificar emails']");
    public static Target BTN_NOTIFICAR_SMS = Target.the("notificar a celulares").locatedBy("//*[text()='Notificar celular']");
    public static Target TXTA_OBSERVACION = Target.the("ingresar una observacion").locatedBy("#_observaciones");
    public static Target BTN_REGRESAR = Target.the("regresar a la vista anterior").locatedBy("//*[text()='Regresar']");
}
