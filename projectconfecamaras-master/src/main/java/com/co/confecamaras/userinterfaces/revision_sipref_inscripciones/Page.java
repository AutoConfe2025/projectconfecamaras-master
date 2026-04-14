package com.co.confecamaras.userinterfaces.revision_sipref_inscripciones;

import net.serenitybdd.screenplay.targets.Target;

public class Page {

    public static final Target CAMPO_FECHA = Target.the("campo de fecha")
            .locatedBy("//input[@type='date']");

    public static final Target BOTON_NOTIFICAR = Target.the("boton notificar")
            .locatedBy("(//a[@data-original-title='Notificar'])[1]");

    public static final Target BOTON_EMAILS = Target.the("boton emails")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");

    public static final Target BOTON_CEULAR = Target.the("boton celular")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");

    public static final Target BOTON_REGRESAR= Target.the("boton regresar")
            .locatedBy("//button[contains(text(),'Regresar')]");

    public static final Target BOTON_MARCAR_COMO_REVISADO= Target.the("boton marcar como revisado")
            .locatedBy("(//a[@data-original-title='Marcar como revisado'])[1]");

    public static final Target CAMPO_OBSERVACIONES_MARCAR= Target.the("campo para colocar observaciones")
            .locatedBy("//textarea[@class='form-control border-danger']");
}
