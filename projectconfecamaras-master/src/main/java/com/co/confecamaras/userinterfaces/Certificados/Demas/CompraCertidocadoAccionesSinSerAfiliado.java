package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompraCertidocadoAccionesSinSerAfiliado {
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
    public static Target BTN_CONTINUAR = Target.the("Seleccionar el boton continuar").
            located(By.id("generarLiquidacion"));
    public static Target BTN_OK_VENTANA_INFORMACION = Target.the("Seleccionar el boton ok de la ventana de informacion").
            located(org.openqa.selenium.By.xpath("//button[normalize-space()='OK']"));
    public static Target VALIDACION_VENTANA_EMERGENTE_CERTIFICADO = Target.the("Se valida la ventana emergente del certificado").
            located(org.openqa.selenium.By.id("swal2-title"));
    public static Target BTN_DESCARGA_CERTIFICADO = Target.the("").
            located(org.openqa.selenium.By.xpath("//th[@scope='row']//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target BTN_CONTINUAR_TIPO_C = Target.the("Selecciona el boton continuar").
            located(org.openqa.selenium.By.xpath("//button[normalize-space()='Continuar']"));
    public static Target BTN_SOPORTES = Target.the("Seleccionar el boton soportes").
            located(org.openqa.selenium.By.id("soportesT"));
    public static Target BTN_VER_SOPORTE = Target.the("Selecionar clic en el boton ver soporte").
            located(org.openqa.selenium.By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target MENSAJE_VALIDACION_SOPORTES = Target.the("Mensaje de finalizacion del flujo").
            located(org.openqa.selenium.By.xpath("//h4[normalize-space()='Soportes de la transacción']"));
    public static Target MENSAJE_VALIDACION_PAGO_NO_PRESENCIAL = Target.the("").
            located(org.openqa.selenium.By.xpath("(//h5[normalize-space()='Ver documento'])[1]"));

    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
}
