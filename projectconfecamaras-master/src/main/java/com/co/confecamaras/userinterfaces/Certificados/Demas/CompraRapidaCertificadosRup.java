package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraRapidaCertificadosRup extends PageObject {
    public static Target BOTON_OPCION_BUSCAR = Target.the("Boton de seleccion de opciones de busqueda").
            located(By.xpath("//option[@value='4']"));
    public static Target CUADRO_TEXTO_MATRICULA = Target.the("Cuadro de texto de busqueeda de la matricula").
            located(By.id("search"));
    public static Target BOTON_CONSULTAR = Target.the("Dar clic en el boton consultar").
            located(By.xpath("//button[@type='submit']"));
    public static Target BOTON_SELECCIONAR = Target.the("Dar clic en el boton con el icono del carrito de compras").
            located(By.xpath("//a[@class='btn btn-outline-success']"));
    public static Target BOTON_AÑADIR = Target.the("Dar clic en el boton añadir").
            located(By.xpath("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[1]"));
    public static Target BTN_MI_CARRITO = Target.the("Dar clic en el boton Mi carrito").
            located(By.cssSelector(".btn.btn-outline-primary.btn-sm"));
    public static Target BTN_PAGAR = Target.the("Dar clic en el boton pagar").
            located(By.cssSelector("button[class='btn btn-info sc-cart-checkout mt-1']"));
    public static Target TXT_CORREO = Target.the("Cuadro de texto correo").
            located(By.cssSelector("input[placeholder='Correo electrónico']"));
    public static Target BTN_OK = Target.the("Boton OK en Por favor digite su correo electrónico:").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));
    public static Target BTN_OK_PAGO = Target.the("Boton Pago").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));
    public static Target VALIDACION_VENTANA_EMERGENTE_CERTIFICADO = Target.the("Se valida la ventana emergente del certificado").
            located(By.id("swal2-title"));
    public static Target BTN_CONTINUAR_TIPO_C = Target.the("Selecciona el boton continuar").
            located(By.xpath("//button[normalize-space()='Continuar']"));
    //public static Target XXXXX = Target.the().located(By);
    //public static Target XXXXX = Target.the().located(By);
    //public static Target XXXXX = Target.the().located(By);
    //public static Target XXXXX = Target.the().located(By);
    //public static Target XXXXX = Target.the().located(By);

    public static Target BTN_OK_VENTANA_INFORMACION = Target.the("Seleccionar el boton ok de la ventana de informacion").
            located(By.xpath("//button[normalize-space()='OK']"));

    public static Target BTN_DESCARGA_CERTIFICADO = Target.the("").
            located(By.xpath("//th[@scope='row']//a[@class='btn btn-outline-primary btn-sm']"));

    public static Target BTN_SOPORTES = Target.the("Seleccionar el boton soportes").
            located(By.id("soportesT"));
    public static Target BTN_VER_SOPORTE = Target.the("Selecionar clic en el boton ver soporte").
            located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target MENSAJE_VALIDACION_SOPORTES = Target.the("Mensaje de finalizacion del flujo").
            located(By.xpath("//h4[normalize-space()='Soportes de la transacción']"));
    public static Target MENSAJE_VALIDACION_PAGO_NO_PRESENCIAL = Target.the("").
            located(By.xpath("(//h5[normalize-space()='Ver documento'])[1]"));
}
