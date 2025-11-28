package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionRecibosCaja {

    public static final Target CAMPO_NUMERO_DE_RECIBO = Target.the("campo de numero de recibo").
            locatedBy("//input[@id='_recibo']");

    public static final Target BOTON_CONSULTAR = Target.the("boton consultar").
            locatedBy("//input[@class='myButton']");

    public static final Target BOTON_EDITAR = Target.the("boton editar").
            locatedBy("(//a[@target='_self'])[1]");

    public static final Target BOTON_REGRESAR = Target.the("boton consultar").
            locatedBy("//a[@class='myButton']");

    public static final Target CAMPO_IDENTIFICACION = Target.the("campo consultar").
            locatedBy("//input[@id='_identificacion']");

    public static final Target CAMPO_FECHA = Target.the("campo fecha").
            locatedBy("//input[@id='_fecini']");

}
