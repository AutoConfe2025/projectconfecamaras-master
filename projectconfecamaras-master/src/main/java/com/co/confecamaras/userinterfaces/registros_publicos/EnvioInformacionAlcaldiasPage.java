package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class EnvioInformacionAlcaldiasPage {

    public static final Target LISTA_MUNICIPIO = Target.the("lista de seleccion de municipio")
            .locatedBy("//select[@id='_municipio']");

    public static final Target OPCION_MANIZALESLISTA_MUNICIPIO = Target.the("opcion de manizales de la lista de seleccion de municipio")
            .locatedBy("//option[contains(text(),'17001 - MANIZALES')]");
}
