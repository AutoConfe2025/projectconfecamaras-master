package com.co.confecamaras.userinterfaces.certificados_automaticos;

import net.serenitybdd.screenplay.targets.Target;

public class AutomaticoExistenciaCajaPage {

    public static final Target BOTON_SOLICITAR_CERTIFICADO = Target.the("boton de seleccion tramite de registro mercantil solicitar certificado")
            .locatedBy("//span[text()='Solicitar certificados']");

    public static final Target BOTON_SOLICITAR_CERTIFICADO_PROPONENTE = Target.the("boton de seleccion tramite de registro mercantil solicitar certificado")
            .locatedBy("(//div[@class='p-card-content'])[4]");

    public static final Target BOTON_CERTIFICADO_AUTOMATICO = Target.the("boton de seleccion certificado atomatico")
            .locatedBy("//button[contains(text(),'Cert. Automáticos')]");

    public static final Target BOTON_CERTIFICADO_ESPECIALES = Target.the("boton de seleccion certificado especiales")
            .locatedBy("//button[contains(text(),'Cert. Especiales')]");

    public static final Target LISTA_TIPO_CERTIFICADO = Target.the("lista de tipo de certificado")
            .locatedBy("//select[@id='tipocertificado']");

    public static final Target CAMPO_EXPLIQUE_CERTIFICACION_NECESITA = Target.the("campo de ingreso de expliacion de tipo de certificado que se necesita")
            .locatedBy("//textarea[@id='explicacion']");
    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS = Target.the("campo de ingreso de cantidad de certificados a solicitar")
            .locatedBy("//input[@id='certiexi']");

    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_PROPONENTE = Target.the("campo de ingreso de cantidad de certificados proponente a solicitar")
            .locatedBy("(//input[@id='certiprop'])[1]");

    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESADL = Target.the("campo de ingreso de cantidad de certificados esadl a solicitar")
            .locatedBy("//input[@id='certiesadl']");

    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_LIBROS = Target.the("campo de ingreso de cantidad de certificados libros a solicitar")
            .locatedBy("//input[@id='certilib']");

    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES = Target.the("campo de ingreso de cantidad de certificados especiales a solicitar")
            .locatedBy("//input[@id='certiesp']");

    public static final Target CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA = Target.the("campo de ingreso de cantidad de certificados matricula a solicitar")
            .locatedBy("//input[@id='certimat']");
    public static final Target BOTON_CONTINUAR_SOLICITUD_CERTIFICADO = Target.the("boton de continuar con la solicitud del certificado")
            .locatedBy("//button[contains(.,'Continuar')]");

    public static final Target BOTON_DESCARGAR_RECIBO_GENERADO = Target.the("boton descargar recbo generado")
            .locatedBy("//a[contains(text(),'Descargar')]");
}
