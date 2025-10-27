package com.co.confecamaras.userinterfaces.Certificados.usuariocaja;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioCajaPage {
    public static final Target CHECK_BOX_CONSULTA = Target.the("Checkbox para elegir tipo de consulta")
            .located(By.xpath("//select[@id='selectS']/option[@value='1']"));

    public static final Target TXT_INFORMACION = Target.the("Txt para ingresar el tipo de dato a consultar")
            .located(By.id("criterio"));

    public static final Target BTN_CONTINUAR = Target.the("Boton para continuar con la consulta")
            .located(By.xpath("//button[@type='submit' and contains(@class, 'btn btn-primary newConsultar float-right')]"));

    public static final Target BTN_ACCIONES = Target.the("Boton para desplegar opciones de acciones de expediente")
            .located(By.xpath("//i[contains(@class, 'fa-solid fa-ellipsis') and @aria-hidden='true']"));

    public static final Target DIV_TRAMITE_MERCANTIL = Target.the("Lista desplegable de acciones de tramites mercantil")
            .located(By.cssSelector("div.card-header.cursorPointer[data-target='#G3']"));

    public static final Target BTN_SOLICITAR_CERTIFICADOS = Target.the("Bonton para solicitar certificados")
            .located(By.xpath("//a[@data-fn='escogerTipoSolicitud']"));

    public static final Target BTN_SOLICITUD_CERTIFICADO_AUTOMATICO = Target.the("Boton para iniciar el proceso de certificado automatico")
            .located(By.xpath("//button[@type='button' and contains(@class, 'btn btn-primary bootbox-accept') and text()='C. Automáticos']"));

    public static final Target TEXTO_SISTEMA_INTEGRAL = Target.the("Texto superior del modulo de  factirar cliente generico")
            .located(By.className("navbar-brand"));
    public static final Target TXT_CERTIFICADOS_DE_MATRICULA = Target.the("Boton para digitar la cantidad de de certificadps")
            .located(By.id("certimat"));

    public static final Target SELECT_TIPO_DE_SOLICITUD = Target.the("Seleccionar el tipo de solicitud que desea realizar")
            .located(By.xpath("//*[@id=\"tipoSolicitudCer\"]/option[3]"));

    public static final Target BTN_GENERAR_LIQUIDACION = Target.the("Bton que genera la liquidacion")
            .located(By.id("generarLiquidacion"));

    public static final Target BTN_FACTURAR_A_CLIENTE_FINAL = Target.the("Bton para obtner la factura")
            .located(By.xpath("//button[@class='btn btn-primary btn-md' and text()='Facturar a cliente final genérico']"));

    public static final Target BTN_CONTINUAR_FACTURACION = Target.the("Btn para cibfurnar la facturacion del cliente")
            .located(By.xpath("//button[@data-bb-handler='confirm' and @type='button' and contains(@class, 'btn btn-success') and text()='Continuar']"));

    public static final Target TITULO_PAGINA_FACTURACION = Target.the("Texto central de la pagina de facuracion")
            .located(By.xpath("//p[contains(text(), 'CAMARA DE COMERCIO CORE QA 20')]"));

    public static final Target BTN_GENERAR_RECIBO = Target.the("Boton para generar el recibo de la facturacion")
            .located(By.xpath("//button[@type='button' and contains(@class, 'btn btn-primary btn-md') and text()='Generar recibo']"));

    public static final Target BTN_CONFIRMAR_LIQUIDACION = Target.the("Boton para confirmar la liquidacion del usuario")
            .located(By.xpath("//button[@class='btn btn-success'][text()='Continuar']"));

    public static Target VALOR_TOTAL = Target.the("")
            .located(By.xpath("(//strong[contains(text(),'$0.00')])[1]"));
    public static Target VALOR_PAGADO = Target.the("")
            .located(By.xpath("(//strong[contains(text(),'$0.00')])[2]"));
    public static Target VALOR_VUELTAS = Target.the("")
            .located(By.xpath("(//strong[normalize-space()='$0.00'])[1]"));
    public static final Target LINK_DESCARGA_RECIBO = Target.the("Enlace para descargar el recibo")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[5]/div/div/div/div/div/table/tbody/tr[3]/td[2]/a"));

}
