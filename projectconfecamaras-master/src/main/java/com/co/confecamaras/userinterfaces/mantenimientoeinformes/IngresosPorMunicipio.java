package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class IngresosPorMunicipio {

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha fin")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target CAMPO_FECHA_INICIO = Target.the("campo de fecha inicio")
            .locatedBy("//input[@id='_fecini']");

    public static final Target BOTON_GENERAR = Target.the("boton generar")
            .locatedBy("//a[@class = 'myButton']");

    public static final Target BOTON_RELACION_MOVIMIENTOS_MUNICIPIO = Target.the("boton generar")
            .locatedBy("(//a[@target='_blank'])[1]");
}
