package com.co.confecamaras.userinterfaces.ServiciosVirtuales;

import net.serenitybdd.screenplay.targets.Target;

public class SolicitudCertificadosPage {
    //
    public static Target INP_MATRICULA = Target.the("ingresar matricula").locatedBy("#matricula");
    public static Target INP_PROPONENTE = Target.the("ingresar proponente").locatedBy("#proponente");
    public static Target INP_NOMBRE = Target.the("ingresar nombre").locatedBy("#nombre");
    public static Target INP_PALABRAS = Target.the("ingresar palabras").locatedBy("#palabras");
    public static Target INP_IDENTIFICACION = Target.the("ingresar identificacion").locatedBy("#identificacion");
    public static Target BTN_CONTINUAR = Target.the("continuar proceso").locatedBy("//*[contains(text(),'Continuar')]");
    public static Target BTN_CONTINUAR_POPUP = Target.the("continuar proceso").locatedBy("//a[text()='Continuar']");

    //
    public static Target INP_BUSCAR = Target.the("buscador").locatedBy("//input[@type='search']");
    public static Target TABLE_INFORMACION = Target.the("informacion almacenada").locatedBy("//table[@id='tablaConsultaExpedientes']/tbody/tr");

    //
    public static Target INP_CANTIDAD_CERTIFICADOS = Target.the("ingresar cantidad de certificados").locatedBy("#certimat");
    public static Target TEXT_CODIGO_RECUPERACION = Target.the("ubicacion codigo de recuperacion").locatedBy("//div[@class='bootbox-body']//b");
    public static Target BTN_OK = Target.the("ok para cerrar alerta").locatedBy("//button[text()='OK']");
}
