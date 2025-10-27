package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa {
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
    public static Target BTN_CUPO_AFILIADO = Target.the("Seleccionar el boton Cupo de afiliado").
            located(By.id("liquidacionAfiliacionCliente"));
    public static Target TXT_CLAVE_AFILIADO = Target.the("Digitar la clave de afiliado").
            located(By.id("claveafiliado"));
    public static Target BTN_APLICAR = Target.the("Seleccionar el boton aplicar").
            located(By.id("pagarCargoAfiliados"));
    public static Target BTN_SI = Target.the("Seleccionar el botn si de confirmacion de compra con el cupo de afiliado").
            located(By.xpath("//button[normalize-space()='Si']"));
    public  static Target MENSAJE_VALIDACION_CLAVE_NO_CORRESPONDE = Target.the("mensaje de validacion de clave no corresponde").
            located(By.xpath("(//div[@class='bootbox-body'])[1]"));
}
