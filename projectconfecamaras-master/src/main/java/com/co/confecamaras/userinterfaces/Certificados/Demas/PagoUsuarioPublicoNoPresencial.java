package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagoUsuarioPublicoNoPresencial extends PageObject {
    //**************************************** Pago no presencial ******************************************************//

    /************************TU COMPRA ************************************/
    public static Target BOTON_CERRAR = Target.the("Boton cerra ventana emergente Apreciado cliente").
            located(By.cssSelector("div[class='modal-dialog modal-dialog-centered modal-lg1200'] div[class='modal-footer'] button[type='button']"));

    public static Target BOTON_CONTINUAR = Target.the("Boton continuar para pago no presencial como usuario publico").
            located(By.id("submit"));

    public static Target MENU_DESPLEGABLE_TIPO_DE_CLIENTE = Target.the("Menu desplegable para escoger el tipo de cliente").
            located(By.xpath("//option[normalize-space()='Persona natural']"));

    public static Target MENU_DESPLEGABLE_TIPO_IDENTIFICACION = Target.the("Seleccionar el tipo de Identificacion").
            located(By.xpath("//option[@value='1']"));
    public static Target TXT_IDENTIFICACIO_CLIENTE = Target.the("Cuadro de texto para el numero de identificacion").
            located(By.id("_identificacioncliente"));
    public static Target TXT_PRIMER_APELLIDO = Target.the("CUadro de texto del primer apellido").
            located(By.id("_apellido1cliente"));
    public static Target TXT_MOVIL = Target.the("Cuadro de texto del movil").
            located(By.id("_movil"));
    public static Target MENU_DESPLEGABLE_LENGUAJE = Target.the("Seleccionar del menu desplegable una opcion").
            located(By.xpath("//option[@value='es']"));

    public static Target TXT_CONFIRMACION_CORREO = Target.the("Cuadro de texto de confirmacion del correo")
            .located(By.id("_email"));

    public static Target BTN_OK_FALTA_INFORMACION = Target.the("Boton OK Debe indicar al menos un nombre y un apellido para el cliente")
            .located(By.xpath("(//button[normalize-space()='OK'])[1]"));

    public static Target TXT_SEGUNDO_APELLIDO = Target.the("")
            .located(By.id("_apellido2cliente"));

    public static Target TXT_PRIMER_NOMBRE = Target.the("")
            .located(By.id("_nombre1cliente"));

    public static Target TXT_SEGUNDO_NOMBRE = Target.the("")
            .located(By.id("_nombre2cliente"));

    public static Target TXT_DIRECCION = Target.the("")
            .located(By.id("_direccion"));

    public static Target MENUDES_MUNICIPIO = Target.the("")
            .located(By.id("_idmunicipio"));

    public static Target TXT_TELEFONO_FIJO = Target.the("")
            .located(By.id("_telefono"));




    public static Target BTN_PAGAR_SISTEMA_TUCOMPRA = Target.the("Boton de pago para pasarela de pago").
            located(By.xpath("//button[normalize-space()='Pagar con Sistema TuCompra']"));

    public static Target BTN_PAGAR_PSE = Target.the("Boton de pago para pasarela de pago").
            located(By.xpath("//button[normalize-space()='Pagar con PSE o Tarjeta de Crédito']"));
    public static Target VALIDACION_PASARELA_DE_PAGO = Target.the("").
            located(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Continuar'])[1]"));
    public static Target MENU_DESPLE_TIPO_DOCUMENTO = Target.the("Menu desplegable Tipo documento").
            located(By.id("tipoDocumento"));
    public static Target MENU_DESPLE_CC = Target.the("Menu desplegable CEDULA DE CIUDADANIA").
            located(By.xpath("//li[@aria-label='Cédula Ciudadania']"));
    public static Target TXT_CELULAR_PAGO = Target.the("Cuadro de texto numero Celular").
            located(By.id("celularComprador"));

    public static Target MENU_DESPLE_PAIS = Target.the("Menu desplegable para escoger el pais").
            located(By.id("paisComprador"));
    public static Target TXT_PAIS = Target.the("Cuadro de texto para escoger el pais").
            located(By.xpath("//*[@id=\"paisComprador\"]/div/div[3]/div[1]/div/input"));
    public static Target BTN_COLOMBIA = Target.the("Selecionar el pais").
            located(By.cssSelector("li[aria-label='COLOMBIA']"));
    public static Target MENU_DESPLEGABLE_CIUDAD = Target.the("Desplegar el menu de las ciudades").
            located(By.id("ciudadComprador"));
    public static Target TXT_CIUDAD = Target.the("Cuadro de texto de las ciudades").
            located(By.xpath("//*[@id=\"ciudadComprador\"]/div/div[3]/div[1]/div/input"));
    public static Target BTN_BOGOTA = Target.the("Seleccionar las ciudad").
            located(By.cssSelector("li[aria-label='Bogotá']"));
    public static Target CHECBOX_POLITICAS = Target.the("Seleccionar la caja de texto de las politicas de privacidad").
            located(By.id("politicas"));

    public static Target MENUDES_INDICATIVO = Target.the("Seleccionar indeicativo del pais").
            located(By.xpath("(//span[@class='p-dropdown-trigger-icon ng-tns-c53-5 pi pi-chevron-down'])[1]"));

    public static Target MENUDES_INDICATIVO_PAIS = Target.the("Seleccionar pais").
            located(By.xpath("//div[contains(text(),'COLOMBIA +57')]"));

    public static Target BTN_CONTINUAR = Target.the("Dar clic en el boton continuar").
            located(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Continuar'])[1]"));
    public static Target BTN_VISA = Target.the("Seleccionar la opcion Visa").
            located(By.xpath("//div[@class='p-col-12 p-xl-6 p-lg-6 p-md-5 p-sm-12']//div[2]//div[1]//div[1]//div[1]"));

    public static Target TXT_NUMETO_TARGETA = Target.the("Ingresar en el cuadro de texto el numero de la targeta ").
            located(By.id("cc-number"));

    public static Target TXT_NUMETO_TARGETA_1 = Target.the("Ingresar en el cuadro de texto el numero de la targeta ").
            located(By.xpath("//*[@name=\"card_number\"]"));

    public static Target TXT_CODIGO_SEGURIDAD = Target.the("Ingresar el codigo de seguridad en el cuadro de texto").
            located(By.xpath("//*[@name=\"card_security_code\"]"));

    public static Target TXT_FECHA_EXPIRACION = Target.the("Desplegar el menU del mes en fecha de vencimiento").
            located(By.xpath("//*[@name=\"card_expiration_date\"]"));

    public static Target BTN_MES = Target.the("Del menu desplegable del mes seleccionar el mes 12").
            located(By.cssSelector("li[aria-label='12']"));
    public static Target MENU_DESPLEGABLE_ANO = Target.the("Desplegar el menU del mes en fecha de vencimiento").
            located(By.id("anoVen"));
    public static Target BTN_ANO = Target.the("seleccionar el año 2024").
            located(By.cssSelector("li[aria-label='2024']"));

    public static Target MENU_DESPLEGABLE_CUOTA = Target.the("Desplegar menu de numero de cuotas").
            located(By.id("nroCuotas"));

    public static Target BTN_CUOTA = Target.the("Selecionar las cuotas").
            located(By.cssSelector("li[aria-label='1']"));
    public static Target BTN_PAGAR = Target.the("Clic en el boton pagar").
            located(By.cssSelector("button.p-ml-2:nth-child(3)"));
    public static Target BTN_FINALIZAR = Target.the("Boton de Finalizacion pago transaccion")
            .located(By.id("prt4"));

    /************************PLACE TO PLAY ************************************/
    public static Target BTN_TARJETA = Target.the("Boton Tarjeta de Crédito / Débito / Prepago").
            located(By.cssSelector("button[title='Tarjeta de Crédito / Débito / Prepago']"));
    public static Target TXT_DATOS_TARJETA = Target.the("Cuadro de texto Datos de la tarjeta").
            located(By.id("cardNumber"));
    public static Target TXT_MES_ANO = Target.the("Cuadro de texto mes y año").
            located(By.id("date"));
    public static Target TXT_CCV = Target.the("Cuadro de texto password").
            located(By.id("cvv"));
    public static Target BTN_PAGAR_PLACETOPLAY = Target.the("Boton Pagar").
            located(By.cssSelector("button[type='submit']"));
    public static Target BTN_VOLVER_COMERCIO = Target.the("Boton Volver al comercio").
            located(By.cssSelector("button[class='btn']"));
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
    //public static Target XXXXX = Target.the("").located(By.);
}
