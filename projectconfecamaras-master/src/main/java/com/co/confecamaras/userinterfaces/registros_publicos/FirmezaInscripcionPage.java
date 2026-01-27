package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class FirmezaInscripcionPage {

    public static final Target CAMPO_INSCRIPCION =  Target.the("campo de inscripcion")
            .locatedBy("//input[@id='_inscripcion']");

    public static final Target BOTON_LEVANTAR_FIRMEZA =  Target.the("levantar firmeza")
            .locatedBy("//input[@value='Levantar Firmeza']");
}
