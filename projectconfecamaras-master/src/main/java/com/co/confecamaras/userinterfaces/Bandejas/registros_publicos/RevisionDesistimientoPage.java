package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionDesistimientoPage {
    /*
    LOCATORS PARA MARCAR NOTIFICACION PRESENCIAL
     */
    public static Target INP_QUIEN_CONFIRMA = Target.the("quien hablo").locatedBy("#hablocon");
    public static Target TXTA_DETALLE = Target.the("detalle de conversacion").locatedBy("#detalle");

    // LOCATORS QUE PUEDEN SER GENERALES
    public static Target BTN_CONFIRMAR = Target.the("confirmar los detalles").locatedBy("//*[text()='Confirmar']");
    public static Target LINK_REGRESAR = Target.the("regresar").locatedBy("//*[text()='Regresar']");
}
