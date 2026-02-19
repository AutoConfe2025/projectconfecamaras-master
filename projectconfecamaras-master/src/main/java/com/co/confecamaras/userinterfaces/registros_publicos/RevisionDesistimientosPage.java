package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionDesistimientosPage {

    public static final Target BOTON_REVISAR = Target.the("boton de revision")
            .locatedBy("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[14]");

    public static final Target BOTON_REGENERAR = Target.the("boton de regenerar")
            .locatedBy("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[15]");
}
