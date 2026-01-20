package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RevisionKardexPrepagosPage {

    public static final Target BOTON_LIBRO_KARDEX = Target.the("boton libro kardex")
            .locatedBy("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]");

    public static final Target BOTON_CREAR = Target.the("boton crear")
            .locatedBy("//a[contains(text(),'Crear')]");

    public static final Target CAMPO_TIPO_MOVIMIENTO = Target.the("boton crear")
            .locatedBy("//input[@id='_tipomov']");

    public static final Target CAMPO_CONCEPTO = Target.the("boton concepto")
            .locatedBy("//input[@id='_concepto']");

    public static final Target CAMPO_VALOR = Target.the("boton valor")
            .locatedBy("//input[@id='_valor']");
}
