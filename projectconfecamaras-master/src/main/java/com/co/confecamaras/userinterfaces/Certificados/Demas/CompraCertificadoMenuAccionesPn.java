package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompraCertificadoMenuAccionesPn {
    public static Target BTN_TRAMITES_Y_CONSULTAS_DEL_EXPEDIENTE = Target.the("Selecciona el boton de tramites y consultas del expediente").
            located(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[3]/a[1]/div[2]"));
    public static Target TXT_BUSQUEDA = Target.the("Ingresar en el cuadro de texto la matricula").
            located(By.id("filtro"));
    public static Target BTN_CONSULTAR = Target.the("Boton Consultar en la pantalla de busqueda de expediente").
            located(By.id("consulta"));
    public static Target BTN_ACCIONES = Target.the("Boton Acciones").
            located(By.xpath("(//a[@class='btn btn-sm btn-outline-primary offset-1'])[1]"));
    public static Target BTN_OPERACION_MERCANTIL = Target.the("En el menu acciones seleccionar la opcion Operacion Mercantil").
            located(By.xpath("(//div[@class='card-header h6 cursorPointer'])[2]"));
    public static Target BTN_SOLICITAR_CERTIFICADOS = Target.the("Del menu operacion mercantil seleccionar la opcion solicitar certificados").
            located(By.xpath("//a[@data-fn='escogerTipoSolicitud']"));
    public static Target BTN_C_AUTOMATICO = Target.the("Boton C Automatico").
            located(By.xpath("//button[normalize-space()='C. Automáticos']"));
    public static Target TXT_CANTIDAD_CERTIFICADOS = Target.the("Ingresar cantidad de certificados").
            located(By.id("certimat"));
    public static Target BTN_CONTINUAR = Target.the("Seleccionar el boton Continuar").
            located(By.id("generarLiquidacion"));
    public static Target BTN_OK = Target.the("Boton Ok del popad posterior a regresar de la pasarela de pago").
            located(By.xpath("//button[normalize-space()='OK']"));
    public static Target BTN_DESCARGA_CERTIFICADO = Target.the("Boton correspondiente a descarga del formulario").
            located(By.xpath("//body[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/th[1]"));
    public static Target BTN_CONTINUAR_TIPO_C = Target.the("Cierra la ventana del certificado generado").
            located(By.xpath("//button[normalize-space()='Continuar']"));
    public static Target BTN_SOPORTE = Target.the("Seleccionar el boton de soporte").
            located(By.id("soportesT"));
    public static Target BTN_VER = Target.the("Seleccionar el botn ver").
            located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target VAL_TITULO_VER_DOCUMENTO = Target.the("Popad corespondiente a ver documento").
            located(By.xpath("(//h5[normalize-space()='Ver documento'])[1]"));
    public static Target BTN_CERRAR_X = Target.the("Cerrar el popad del certificado").
            located(By.xpath("//button[@aria-label='Cerrar']"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION = Target.the("Mensaje de validacion de finalizacion de flujo").
            located(By.xpath("//h4[normalize-space()='Soportes de la transacción']"));

}
