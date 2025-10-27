package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ControlCalidadPage {

    public static Target LINK_FORMULARIO = Target.the("digitar formulario").locatedBy("//a[text()='Digitar formulario']");
    public static Target LINK_CERTIFICADO = Target.the("descargar certificado").locatedBy("//a[text()='Ver certificado']");
    public static Target LINK_VOLVER_DIGITACION = Target.the("digitar a digitacion").locatedBy("//a[text()='Volver a digitación']");
    public static Target LINK_VOLVER_BANDEJA = Target.the("volver a la bandeja").locatedBy("//*[text()='Volver a la bandeja']");
    public static Target MSG_POUP = Target.the("mensaje de la alerta").locatedBy("//div[@class='bootbox-body']");
}
