package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraRapidaCertificadosCupoAfiliado extends PageObject {

    public static Target BOTON_OPCION_BUSCAR = Target.the("Boton de seleccion de opciones de busqueda").
            located(By.xpath("//option[@value='3']"));
    public static Target CUADRO_TEXTO_MATRICULA = Target.the("Cuadro de texto de busqueeda de la matricula").
            located(By.id("search"));
    public static Target BOTON_CONSULTAR = Target.the("Dar clic en el boton consultar").
            located(By.xpath("//button[@type='submit']"));
    public static Target BOTON_SELECCIONAR = Target.the("Dar clic en el boton con el icono del carrito de compras").
            located(By.xpath("//a[@class='btn btn-outline-success']"));
    public static Target BOTON_AÑADIR = Target.the("Dar clic en el boton añadir").
            located(By.xpath("(//button[@class='sc-add-to-cart btn btn-success btn-sm pull-right mt-2 '])[1]"));
    public static Target BTN_VER_CARRRITO = Target.the("Boton ver carrito").
            located(By.cssSelector("button.btn-primary:nth-child(2)"));
    public static Target BTN_CUPO_AFILIADO = Target.the("Boton cupo de afiliado").
            located(By.cssSelector("button[class='btn btn-primary mt-1 sc-afiliado']"));
    public static Target TXT_EMAIL = Target.the("Cuadro de texto deValidación matrícula afiliada").
            located(By.id("email"));
    public static Target TXT_CONTRASEÑA_AFILIADO = Target.the("Cuadro de texto contraseña afiliado").
            located(By.id("password"));
    public static Target BTN_CONTINUAR_CLAVE_AFILIADO = Target.the("Boton continuar Validación matrícula afiliada").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));
    public static Target BOTON_OK = Target.the("Seleccionar el boton OK").
            located(By.xpath("(//button[normalize-space()='OK'])[1]"));
    public static Target BTN_DESCARGAR_CERTIFICADO = Target.the("Dar Clic en el boton de descarga del certificado").
            located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[2]"));
    public static Target VALIDACION_TITULO_CERTIFICADO = Target.the("Valida el titulo certificado").
            located(By.id("start"));
    public static Target BTN_CONTINUAR = Target.the("Selecciona el boton de continuar para cerra la ventana del certificado").
            located(By.xpath("//button[normalize-space()='Continuar']"));
    public static Target BTN_DATOS_RECIBO = Target.the("Seleccionar la opcion datos del recibo").
            located(By.id("v-pills-messages-tab"));
    public static Target VALIDACION_NOMBRE_RECIBO = Target.the("Valir un parametro recibo del la ventana").
            located(By.xpath("//th[normalize-space()='Recibo']"));
    public static Target BTN_SERVICIOS = Target.the("Selecionar la opcion servicios").
            located(By.id("v-pills-home-tab"));
    public static Target VALIDACION_FORMA_DE_PAGO = Target.the("Validar mensaje de forma de pago").
            located(By.xpath("//h5[normalize-space()='Forma de pago']"));
    public static Target BTN_SOPORTES = Target.the("Seleccionar el Boton soportes").
            located(By.id("soportesT"));
    public static Target BTN_VER = Target.the("Selecciona el boton ver").
            located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target MENSAJE_DOCUMENTO = Target.the("Mensaje del popad del PDF").
            located(By.xpath("(//h5[normalize-space()='Ver documento'])[1]"));
    public static Target BTN_CERRAR = Target.the("Seleccionar la X de cerrer popad").
            located(By.xpath("//button[@aria-label='Cerrar']"));
    public static Target MENSAJE_VALIDACION_CUPO_AFILIADO = Target.the("Mensaje de finalizacion del flujo").
            located(By.xpath("//h4[normalize-space()='Soportes de la transacción']"));

}
