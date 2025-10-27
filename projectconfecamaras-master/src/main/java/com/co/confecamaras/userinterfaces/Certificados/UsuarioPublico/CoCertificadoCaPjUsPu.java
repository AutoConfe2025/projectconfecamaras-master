package com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CoCertificadoCaPjUsPu {
    public static Target BTN_TRAMITES_CONSULTA_EXPEDIENTES_CA = Target.the("Boton Trámites y Consultas de Expediente").
            located(By.cssSelector("div[id='accionesMenu'] div:nth-child(3) a"));
    public static Target TXT_NUMERO_MATRICULA_CA = Target.the("Cuadro de texto Ingrese un número de matricula").
            located(By.id("filtro"));
    public static Target BTN_CONTINUAR_CONSULTA_CA = Target.the("Boton continuar Consulta de expedientes").
            located(By.id("consulta"));
    public static Target BTN_ACCIONES_PJ = Target.the("Boton acciones en Consulta de expedientes").
            located(By.cssSelector(".btn.btn-sm.btn-outline-info.offset-1"));
    public static Target BTN_OPCION_MERCANTIL_PJ = Target.the("Boton Opcion mecantil ESADL").
            located(By.xpath("//*[@id=\"modalAuxiliar\"]/div/div/div[2]/div[1]/div[2]/div/div[1]"));
    public static Target BTN_SOLICITAR_CERTIFICADO_CA = Target.the("Boton solicitar certificado en acciones del expediente").
            located(By.xpath("//*[@id=\"G3\"]/div/div[2]/a"));
    public static Target BTN_CERTIFICADO_AUTOMATICO_ACCIONES = Target.the("Boton C.Automatico en Solicitud de certificados").
            located(By.xpath("/html/body/div[3]/div/div/div[2]/button[1]"));
    public static Target TXT_CERTIFICADO = Target.the("Cuadro de texto certificados de libros").
            located(By.id("certimat"));
    public static Target BTN_CONTINUAR_SOLICITUD_CERTIFICADO_ESADL = Target.the("Boton continuar solucitud certificado").
            located(By.id("generarLiquidacion"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_CONSULTA_DETALLADA_PJ = Target.the("Mensaje de validacion de finalizacion de flujo").
            located(net.serenitybdd.core.annotations.findby.By.xpath("(//th[normalize-space()='Tipo C.'])[1]"));
    // public static Target XXXX = Target.the("").located(By.);
}
