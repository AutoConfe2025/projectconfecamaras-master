package com.co.confecamaras.userinterfaces.Bandejas.revision_desistimientos;


import net.serenitybdd.screenplay.targets.Target;

public class page {

    public static final Target BOTON_VER_DESISTIMIENTO = Target.the("boton ver desistimiento")
            .locatedBy("//a[@data-original-title='Ver desistimiento']");

    public static final Target BOTON_TELEFONICA = Target.the("boton telefonica")
            .locatedBy("//a[@data-original-title='Marcar notificado telefonicamente']");

    public static final Target BOTON_PRESENCIAL = Target.the("boton presencial")
            .locatedBy("//a[@data-original-title='Marcar notificado presencialmente']");
    public static final Target CAMPO_HABLO_CON = Target.the("campo hablo con")
            .locatedBy("//input[@class='form-control border-danger']");

    public static final Target CAMPO_DETALLE = Target.the("campo detalle")
            .locatedBy("//textarea[@class='form-control border-danger']");

    public static final Target BOTON_CONFIRMAR = Target.the("boton confirmar")
            .locatedBy("//button[@class='btn btn-primary btn-md']");
}
