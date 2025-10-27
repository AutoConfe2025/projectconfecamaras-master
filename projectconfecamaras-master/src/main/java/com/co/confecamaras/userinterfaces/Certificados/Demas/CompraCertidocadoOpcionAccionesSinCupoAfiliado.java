package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompraCertidocadoOpcionAccionesSinCupoAfiliado {

    public static Target BTN_TRAMITES_Y_CONSULTAS_DEL_EXPEDIENTE = Target.the("Selecciona el boton de tramites y consultas del expediente").
            located(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[3]/a[1]/div[2]"));
    public static Target TXT_BUSQUEDA = Target.the("Ingresar en el cuadro de texto la matricula").
            located(By.id("filtro"));
    public static Target BTN_CONSULTAR = Target.the("Selecciona el boton consultar").
            located(By.id("consulta"));
    public static Target BTN_ACCIONES = Target.the("Seleccionar el boton acciones").
            located(By.xpath("//a[@class='btn btn-sm btn-outline-primary offset-1']"));
    public static Target BTN_OPCIONES_MERCANTIL = Target.the("Seleccionar del menu acciones la pestaña opcion mercantil").
            located(By.xpath("(//div[@class='card-header h6 cursorPointer'])[2]"));
    public static Target BTN_SOLICITAR_CERTIFICADO = Target.the("Seleccionar del menu opciones mescantil Solicitud de certificados").
            located(By.xpath("(//a[@data-fn='escogerTipoSolicitud'])[1]"));
    public static Target BTN_CERTIFICADO_AUTOMATICO = Target.the("").
            located(By.xpath("(//button[normalize-space()='C. Automáticos'])[1]"));
    public static Target TXT_CERTIFICADOS = Target.the("Seleccionar la cantidad de certificados").
            located(By.id("certimat"));
    public static Target BTN_CONSULTAR_SOLICITUD_CERTIFICADO = Target.the("Seleccionar el boton Continuar").
            located(By.id("generarLiquidacion"));
    public static Target BTN_OK = Target.the("Seleccionar el boton OK posterior al pago").
            located(By.cssSelector("button[class='btn btn-primary bootbox-accept']"));
    public static Target BTN_DESCARGAR_CERTIFICADO = Target.the("Boton de descarga del certificado").
            located(By.xpath("//th[@scope='row']//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target BTN_CONTINUAR_TIPO_C_CERTIFICADO = Target.the("Boton continuar certificado generado")
            .located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));
    public static Target VALIDACION_DATOS_RECIBO = Target.the("Validacion de informacion del nombre del cliente").
            located(By.xpath("//td[normalize-space()='DIEGO ALBERTO RIOS MAYORGA']"));
    public static Target BTN_SERVICIO = Target.the("Clic en el Boton servicio").
            located(By.id("v-pills-home-tab"));
    public static Target VALIDACION_SERVICIO = Target.the("Valida el tipo de servicio").
            located(By.xpath("//td[normalize-space()='01010101']"));
    public static Target BTN_VER = Target.the("Seleccionar el boton Ver").
            located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target BTN_SOPORTE = Target.the("Seleccionar el boton soporte").
            located(By.id("soportesT"));
    public static Target VERIFICAR_TITULO_VENTANA = Target.the("Verificar el titulo de la ventana").
            located(By.id("ModalTitulo"));
    public static Target BTN_CERRAR = Target.the("Seleccionar el boton cerrar").
            located(By.xpath("//button[normalize-space()='Cerrar']"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION = Target.the("Mensaje de validacion de finalizacion de flujo").
            located(By.xpath("//h4[normalize-space()='Soportes de la transacción']"));
}
