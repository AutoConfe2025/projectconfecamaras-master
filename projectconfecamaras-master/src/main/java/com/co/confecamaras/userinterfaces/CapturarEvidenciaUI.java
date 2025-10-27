package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CapturarEvidenciaUI extends PageObject {

    public static final Target BTN_CONTINUAR_CAPTURAR_EVIDENCIA = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), 'Continuar')]"));

    public static final Target BTN_CERRAR_PROCESO_PAGO = Target.the("Boton Cerrar")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));

    public static final Target SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA_1 = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("_idtipoidentificacioncliente"));
    public static final Target TXT_IDENTIFICACION_CAPTURAR_EVIDENCIA_1 = Target.the("Escribir numero de identificacion")
            .located(By.id("_identificacioncliente"));
    public static final Target SELECT_TIPO_IDENTIFICACION_CAPTURAR_EVIDENCIA = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("_idtipoidentificacioncliente"));
    public static final Target TXT_IDENTIFICACION_CAPTURAR_EVIDENCIA = Target.the("Escribir numero de identificacion")
            .located(By.id("_identificacioncliente"));
    public static final Target BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA = Target.the("Boton verificar identificacion")
            .located(By.xpath("//button[contains(text(), 'Verificar identificación')]"));

    public static final Target TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA = Target.the("Escribir nombre cliente razon social")
            .located(By.id("_nombrecliente"));

    public static final Target TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA = Target.the("Escribir primer nombre")
            .located(By.id("_nombre1cliente"));

    public static final Target TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA = Target.the("Escribir segundo nombre")
            .located(By.id("_nombre2cliente"));

    public static final Target TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA = Target.the("Escribir primer apellido")
            .located(By.id("_apellido1cliente"));

    public static final Target TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA = Target.the("Escribir segundo apellico")
            .located(By.id("_apellido2cliente"));

    public static final Target TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA = Target.the("Escribir direccion comercial")
            .located(By.id("_direccion"));

    public static final Target SELECT_MUNICIPIO_COMERCIAL_CAPTURAR_EVIDENCIA = Target.the("Seleccionar municipio comercial")
            .located(By.xpath("//select[@id=\"_idmunicipio\"]"));

    public static final Target SELECT_MUNICIPIO_COMERCIAL_DOS_CAPTURAR_EVIDENCIA = Target.the("Seleccionar municipio comercial")
            .located(By.id("_idmunicipio"));

    public static final Target TXT_CODIGO_POSTAL_CAPTURAR_EVIDENCIA = Target.the("Escribir codigo postal")
            .located(By.id("_codposcom"));

    public static final Target BTN_DUPLICAR_CAPTURAR_EVIDENCIA = Target.the("Boton duplicar")
            .located(By.xpath("(//*[contains(text(), 'Duplicar')])[1]"));

    public static final Target TXT_FIJO_CAPTURAR_EVIDENCIA = Target.the("Escribir telefono fijo")
            .located(By.id("_telefono"));

    public static final Target TXT_CELULAR_CAPTURAR_EVIDENCIA = Target.the("Escribir numero celular")
            .located(By.id("_celular"));

    public static final Target TXT_EMAIL_CAPTURAR_EVIDENCIA = Target.the("Escribir email")
            .located(By.id("_email"));

    public static final Target TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA = Target.the("Escribir confirmacion email")
            .located(By.id("_emailconfirmacion"));

    public static final Target BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA = Target.the("Boton duplicar")
            .located(By.xpath("(//*[contains(text(), 'Duplicar')])[2]"));

    public static final Target TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA = Target.the("Escribir fecha expedicion")
            .located(By.id("_fechaexpradicador"));

    public static final Target BTN_SUBIR_ARCHIVO_CARGAR_CONTRATOS = Target.the("Boton subir archivo")
            .located(By.id("userfile"));

    public static final Target BTN_SUBIR_ARCHIVO_CAPTURAR_EVIDENCIA = Target.the("Boton subir archivo")
            .located(By.id("formRnec"));

    public static final Target BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA = Target.the("Boton generar recibo")
            .located(By.xpath("//button[text()='Generar recibo']"));

    public static final Target BTN_GENERAR_RECIBO_DOS_CAPTURAR_EVIDENCIA = Target.the("Boton generar recibo")
            .located(By.xpath("(//button[text()='Generar recibo'])[2]"));

    public static final Target TXT_NUMERO_IDENTIFICACION_CAPTURAR_EVIDENCIA = Target.the("Escribir numero identificacion")
            .located(By.id("_identificacioncliente"));

    public static final Target BTN_DESCARGAR_RECIBO_CAJA_IM7_CAPTURAR_EVIDENCIA = Target.the("Boton descargar recibo de caja .im7")
            .located(By.xpath("(//table//td[@style=\"width: 30%;\"]//a[@target=\"_blank\"])[1]"));

    public static final Target BTN_DESCARGAR_RADICADO_CAPTURAR_EVIDENCIA = Target.the("Boton descargar radicado")
            .located(By.xpath("(//table//td[@style=\"width: 30%;\"]//a[@target=\"_blank\"])[2]"));

    public static final Target BTN_DESCARGAR_RECIBO_CAJA_CAPTURAR_EVIDENCIA = Target.the("Boton descargar recibo de caja")
            .located(By.xpath("(//table//td[@style=\"width: 30%;\"]//a[@target=\"_blank\"])[3]"));


    public static final Target BTN_DESCARGAR_CERTIFICADO_CODIGO_CAPTURAR_EVIDENCIA = Target.the("Boton descargar certificado codigo")
            //.located(By.xpath("//table//td[@style=\"width: 50%;\"]//a[@target=\"_blank\"]"));
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[7]/div/div/div/div/div/table/tbody/tr/td[2]/a"));

    public static final Target BTN_DESCARGAR_CERTIFICADO_CODIGO_DOS_CAPTURAR_EVIDENCIA = Target.the("Boton descargar dos certificado codigo")
            //.located(By.xpath("(//table//td[@style=\"width: 50%;\"]//a[@target=\"_blank\"])[2]"));
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[7]/div/div/div/div/div/table/tbody/tr/td[2]/a"));

    public static final Target LBL_MENSAJE_FINAL_TRANSACCION = Target.the("Mensaje final transaccion")
            .located(By.xpath("//*[contains(text(), 'Resumen final de la transacción')]"));

    public static final Target LBL_MENSAJE_FINAL_TRANSACCION_DOS = Target.the("Mensaje final transaccion")
            .located(By.xpath("//*[@id=\"v-pills-messages\"]/table/tbody/tr[3]/th"));
}
