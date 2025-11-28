package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class ConsecutivosDocumentos{

    public static final Target CAMPO_CAMBIO_EMAIL= Target.the("campo de cambio numero email")
            .locatedBy("//div[@id='gridbox']//tr[9]/td[5]");

    public static final Target CAMPO_CUSASIONES= Target.the("campo de causaciones")
            .locatedBy("//td[@class='  cellselected']");
    public static final Target BOTON_GRABAR = Target.the("boton grabar mantenimiento")
            .locatedBy("//a[@class='myButton']");



}
