package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class InformeSICPage {


    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='fecini']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='fecfin']");

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo de correo electronico")
            .locatedBy("//input[@id='emailusuariosistema']");

    public static final Target BTN_EXTRAER = Target.the("boton extraer")
            .locatedBy("//button[contains(text(),'Extraer')]");

    public static final Target BTN_GENERAR = Target.the("boton generar")
            .locatedBy("//button[contains(text(),'Generar')]");
}
