package com.co.confecamaras.userinterfaces.Certificados.UsuarioPublico;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CoCertificadoCrPpUsPu {
    public static Target BTN_CERTIFICADOS_RUP = Target.the("Boton certificados Home").
            located(By.cssSelector("div[id='accionesMenu'] div[class='card-body'] div:nth-child(2) a:nth-child(1)"));
    public static Target TXT_PROPONENTE_RUP = Target.the("Cuadro de texto Matricula").
            located(By.id("proponente"));
    public static Target BTN_CONSULTAR_RUP = Target.the("Boton consultar Matricula").
            located(By.id("consultaCertificadosB"));
    public static Target BTN_CERTIFICADO_AUTOMATICO_IMEDIATO = Target.the("Boton certificado de la columna de acciones").
            located(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]"));
    public static Target TXT_CERTIFICADO_RUP = Target.the("cuadro de texto Certificados de Existencia Esadl (Min.1):").
            located(By.id("certimat"));
    public static Target BTN_CONTINUAR_SOLICITUD_CERTIFIACDO_RUP = Target.the("Boton continuar ventana  Solicitud de certificados").
            located(By.id("generarLiquidacion"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION_RUP = Target.the("Mensaje de validacion de finalizacion de flujo").
            located(net.serenitybdd.core.annotations.findby.By.xpath("(//th[normalize-space()='Tipo C.'])[1]"));
}
