package com.co.confecamaras.userinterfaces.certificados_automaticos;

import net.serenitybdd.screenplay.targets.Target;

public class CompraRapidaCertificadoEspecialesPage {

    public static final Target BOTON_INICIAL_SI = Target.the("boton de si de inicio de la pagina")
            .locatedBy("//span[text()=\"SI\"]");

    public static final Target BOTON_INICIAL_NO = Target.the("boton de no de inicio de la pagina")
            .locatedBy("//span[text()=\"NO\"]");

    public static final Target CAMPO_NOMBRES_RAZON_SOCIAL = Target.the("campo de razon social")
            .locatedBy("//input[@id='nombreRazonSocialInput']");

    public static final Target CAMPO_IDENTIFICACION_CERTIFICACIONES_ESPECIALES = Target.the("campo de razon social")
            .locatedBy("//input[@id='identificacionInput']");

    public static final Target LISTA_SELECCION_TIPO_CERTIFICADO = Target.the("lista de seleccion de tipo de certificado")
            .locatedBy("//select[@id='tipoCertificadoSelect']"); //01.15

    public static final Target CAMPO_CANTIDAD_CERTIFICACIONES_ESPECIALES = Target.the("campo de cantidad de certificados")
            .locatedBy("//input[@id='cantidadInput']");

    public static final Target BOTON_CONTINUAR_SI = Target.the("boton de continuar si de inicio de la pagina")
            .locatedBy("//button[normalize-space()='Continuar']");

    public static final Target BOTON_MATRICULA_CERTIFICADO_ESPECIALES = Target.the("boton matricula certificados especiales")
            .locatedBy("//span[normalize-space()='Matrícula']");

    public static final Target CAMPO_MATRICULA_CERTIFICADO_ESPECIALES = Target.the("campo matricula certificados especiales")
            .locatedBy("//input[@class='p-inputtext p-component']");

    public static final Target BOTON_BUSCAR_MATRICULA_CERTIFICADO_ESPECIALES = Target.the("boton buscar matricula certificados especiales")
            .locatedBy("//button[@class='btn-primary rounded-circle ml-2 p-button p-component p-button-icon-only']");

    public static final Target BOTON_SELECCIONAR_MATRICULA = Target.the("boton seleccionar matricula certificados especiales")
            .locatedBy("//button[text()=\"Seleccionar\"]");

    public static final Target LISTA_SELECCION_TIPO_CERTIFICADO_ESPECIAL = Target.the("lista de seleccion de tipo de certificado especial")
            .locatedBy("//select[@id='tipoCertificadoSelect']"); // 01.11

    public static final Target CAMPO_INGRESO_EXPLICACION_CERTIFICADO = Target.the("campo de ingreso de texto de explicacion de tipo de certificado")
            .locatedBy("//textarea[@id='motivoTextArea']"); //pruebas automatizadas

    public static final Target BOTON_SOLICITAR_CERTIFICADO_ESPECIAL = Target.the("boton de solicitar certificado especial")
            .locatedBy("//button[normalize-space()='Solicitar']");
}
