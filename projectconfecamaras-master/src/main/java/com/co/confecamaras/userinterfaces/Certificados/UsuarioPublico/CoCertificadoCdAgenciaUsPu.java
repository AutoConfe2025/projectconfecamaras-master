package com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CoCertificadoCdAgenciaUsPu {
    public static Target BTN_TRAMITES_CONSULTA_EXPEDIENTES = Target.the("Boton Trámites y Consultas de Expediente").
            located(By.cssSelector("div[id='accionesMenu'] div:nth-child(3) a"));
    public static Target TXT_NUMERO_MATRICULA = Target.the("Cuadro de texto Ingrese un número de matricula").
            located(By.id("filtro"));
    public static Target BTN_CONTINUAR_CONSULTA = Target.the("Boton continuar Consulta de expedientes").
            located(By.id("consulta"));
    public static Target BTN_CONSULTA_DETALLADA = Target.the("Boton consulta detallada del expediente").
            located(By.cssSelector(".btn.btn-sm.btn-outline-primary"));
    public static Target BTN_OPERACION_REG_MERCANTIL_PJ = Target.the("Boton Operaciones del registro mercantil / ESADL").
            located(By.xpath("(//div[@class='clearfix'])[14]"));
    public static Target BTN_SOLICITUD_CERTIFICADOS = Target.the("Boton Solicitud de Certificados").
            located(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"));
    public static Target BTN_CER_AUTOMATICO = Target.the("Boton C.AUTOMATICO").
            located(By.cssSelector("button[class='btn btn-primary bootbox-accept']"));
    public static Target TXT_CER_MATRICULA_EST = Target.the("Cuadro de texto Certificados de Existencia Esadl (Min.1):").
            located(By.id("certimat"));
    public static Target BTN_CONTINUAR_SOLICITUD_CERTIFICADO = Target.the("Boton Continuar Solicitud de certificados").
            located(By.id("generarLiquidacion"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_AGENCIA = Target.the("Mensaje de validacion de finalizacion de flujo").
            located(net.serenitybdd.core.annotations.findby.By.xpath("(//th[normalize-space()='Tipo C.'])[1]"));
}
