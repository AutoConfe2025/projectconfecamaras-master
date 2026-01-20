package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ExtraccionNoRenivadosSS1727Page {

    public static final Target CAMPO_ANO_CORTE = Target.the("campo de año de corte")
            .locatedBy("//input[@id='anocorte']");

    public static final Target LISTA_AMBIENTE = Target.the("lista de seleccion de ambiente")
            .locatedBy("//select[@id='ambiente']");

    public static final Target LISTA_CAMARA = Target.the("lista de seleccion de ambiente")
            .locatedBy("//select[@id='cc']");

    public static final Target OPCION_MANIZALES_LISTA_CAMARA = Target.the("opcion manizales lista de seleccion de ambiente")
            .locatedBy("//option[contains(text(),'CAMARA DE COMERCIO DE MANIZALES')]");
}
