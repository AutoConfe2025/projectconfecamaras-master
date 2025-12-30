package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ResumenIngresoPorFechaPage {

    public static final Target FECHA_INI = Target.the("campo fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target FECHA_FIN = Target.the("campo fecha fin")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target BOTON_CONSULTAR_POR_SEDE_FECHA = Target.the("boton consultar por fecha y sede")
            .locatedBy("//a[@class='myButton']");
}
