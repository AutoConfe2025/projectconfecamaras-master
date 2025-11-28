package com.co.confecamaras.userinterfaces.Bandejas.tramites_reingresados;

import net.serenitybdd.screenplay.targets.Target;

public class page {

    public static final Target BOTON_ESCANEAR= Target.the("boton de escanear")
            .locatedBy("(//a[@data-original-title='Escanear'])[1]");

    public static final Target BOTON_VER_RECIBO_CAJA= Target.the("boton ver recibo de caja")
            .locatedBy("(//img[@onmouseover])[1]");

    public static final Target BOTON_FINALIZAR= Target.the("boton finalizar")
            .locatedBy("//a[@data-original-title='Finalizar escaneo y digitalización']");

    public static final Target BOTON_CONTINUAR= Target.the("boton continuar")
            .locatedBy("//button[@class='btn btn-success']");
    public static final Target LISTA_USUARIO= Target.the("lista de usuario")
            .locatedBy("//select[@class='form-control border-danger']");

    public static final Target OPCION_CAJAQA= Target.the("opcion de lista caja qa ")
            .locatedBy("//option[@value='CAJAQA']");

    public static final Target BOTON_ASIGNAR= Target.the("Boton asignar")
            .locatedBy("//button[@class='btn btn-primary btn-md']");


}
