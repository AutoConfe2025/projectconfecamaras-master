package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionSirefRadicacionesPage {
    public static Target TXTA_OBSERVACION = Target.the("ingresar una observacion").locatedBy("#_observaciones");
    public static Target BTN_REGRESAR = Target.the("regresar a la vista anterior").locatedBy("//*[text()='Regresar']");

}
