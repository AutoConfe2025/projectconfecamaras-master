package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class PageNuevaDigitalizacion {

    public static final Target CAMPO_CODIGO_BARRAS = Target.the("campo de ingreso de codigo de barras")
            .locatedBy("//input[@id='_idradicacion']");

    public static final Target BOTON_CONSULTAR = Target.the("boton consultar codigo de barras")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");


    public static final Target BOTON_LIMPIAR = Target.the("boton limpiar formulario")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[2]");
    public static final Target BOTON_NUEVA_CONSULTA = Target.the("boton nueva consulta")
            .locatedBy("//a[contains(text(),'Nueva búsqueda')]");

    public static final Target CAMPO_RECIBO = Target.the("campo de recibo")
            .locatedBy("//input[@id='_numerorecibo']");

    public static final Target CAMPO_NOMBRE = Target.the("campo de recibo")
            .locatedBy("//input[@id='_nombre']");

    public static final Target CAMPO_IDENTIFICADOR = Target.the("campo identificador")
            .locatedBy("//input[@id='_identificador']");
}
