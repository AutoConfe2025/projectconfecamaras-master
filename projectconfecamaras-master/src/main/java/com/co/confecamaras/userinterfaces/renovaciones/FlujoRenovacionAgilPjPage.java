package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoRenovacionAgilPjPage {

    public static final Target BOTON_NUEVO_VALOR_ESTABLECIMIENTO_AGIL = Target.the("campo de nuevo valor en visual agil establecimiento")
            .locatedBy("(//span[@data-pr-tooltip='Editar'])[2]");

    public static final Target BOTON_DILIGENCIAR_PJ_AGIL = Target.the("boton de diligenciar pj")
            .locatedBy("(//button[contains(text(),'Diligenciar')])[1]");

    public static final Target LISTA_AUTORIZACION_MENSAJES = Target.the("lista de autorizacion de mensajes")
            .locatedBy("//select[@id='ctrmennot']");

    public static final Target CAMPO_VALOR_ESTABLECIMIENTO_ACTIVOS_VINCULADOS = Target.the("campo de ingreso de valor de activos")
            .locatedBy("//input[@id='actvin_2026']");

    public static final Target BOTON_ABRIR_PDF_DE_FIRMA_PJ = Target.the("abrir pdf firma 1")
            .locatedBy("(//button[@data-pr-tooltip='Visualizar'])[1]");

    public static final Target BOTON_ABRIR_PDF_DE_FIRMA_PJ_2 = Target.the("abrir pdf firma 2")
            .locatedBy("(//button[@data-pr-tooltip='Visualizar'])[2]");
}
