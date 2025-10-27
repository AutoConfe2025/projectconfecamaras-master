package com.co.confecamaras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class RecibirPagoUI extends PageObject {

    public static final Target BTN_POP_UP_ATENCION_CERRAR = Target.the("Seleccionar el tipo identificacion")
            .located(By.cssSelector("div[class='modal-dialog'] div[class='modal-footer'] button[type='button']"));

    public static final Target SELECT_TIPO_IDENTIFICACION_PAGO = Target.the("Seleccionar el tipo identificacion")
            .located(By.id("_idtipoidentificacioncliente"));

    public static final Target TXT_IDENTIFICACION_PAGO = Target.the("Escribir el numero de identificacion")
            .located(By.id("_identificacioncliente"));

    public static final Target BTN_VERIFICAR_IDENTIFICACION_PAGO = Target.the("Boton verificar identificacion")
            .located(By.xpath("//button[text()='Verificar identificación']"));

    public static final Target TXT_NOMBRE_CLIENTE = Target.the("Cuadro de texto Nombres del cliente o razón social").
            located(By.id("_nombrecliente"));

    public static final Target TXT_PRIMER_NOMBRE = Target.the("Cuadro de texto Primer nombre").
            located(By.id("_nombre1cliente"));

    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("Cuadro de texto Segundo nombre").
            located(By.id("_nombre2cliente"));

    public static final Target TXT_PRIMER_APELLIDO = Target.the("Cuadro de texto Primer apellido").
            located(By.id("_apellido1cliente"));

    public static final Target TXT_SEGUUNDO_APELLIDO = Target.the("Cuadro de texto Segundo apellido").
            located(By.id("_apellido2cliente"));

    public static final Target TXT_DIRECCION_COMERCIAL = Target.the("Cuadro de texto  Dirección comercial").
            located(By.id("_direccion"));

    public static final Target MENU_DES_MUNICIPIO = Target.the("Menu desplegable Municipio comercial").
            located(By.id("_idmunicipio"));

    public static final Target TXT_CODIGO_POSTAL = Target.the("Cuadro de texto Codigo postal").
            located(By.id("_codposcom"));

    public static final Target BTN_DUPLICAR = Target.the("Boton Duplicar").
            located(By.cssSelector("a[href='javascript:duplicarDireccion();']"));

    public static final Target TXT_TEL_FIJO = Target.the("Cuadro de texto Teléfono fijo").
            located(By.id("_telefono"));

    public static final Target TXT_NUM_CELULAR = Target.the("Cuadro de texto Nro. Celular").
            located(By.id("_celular"));

    public static final Target MEN_DES_PAIS = Target.the("Cuadro de texto País").
            located(By.id("_pais"));

    public static final Target MEN_DES_LENGUAJE = Target.the("Cuadro de texto Lenguaje").
            located(By.id("_lenguaje"));

    public static final Target TXT_EMAIL = Target.the("Cuadro de texto Email").
            located(By.id("_email"));

    public static final Target MENU_DES_CODIGO_REGIMEN = Target.the("Cuadro de texto Codigo regimen").
        located(By.id("_codigoregimen"));

    public static final Target MENU_DES_RESPONSABILIDAD_FISCAL = Target.the("Cuadro de texto Responsabilidad fiscal").
            located(By.id("_responsabilidadfiscal"));

    public static final Target BTN_OK_DATOS_INCOMPLETA = Target.the("Boton datos del cliente está incompleto").
            located(By.cssSelector("button[class='btn btn-primary']"));

    public static final Target TXT_EMAIL_CONFIRMACION_PAGO = Target.the("Escribir la confirmacion del email")
            .located(By.id("_emailconfirmacion"));

    public static final Target BTN_GENERAR_RECIBO_PAGO = Target.the("Boton generar recibo")
            .located(By.xpath("//button[text()='Generar recibo']"));

    public static final Target BTN_CONTINUAR_PAGO = Target.the("Boton continuar")
            .located(By.xpath("//button[text()='Continuar']"));
}