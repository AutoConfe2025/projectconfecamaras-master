package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraCertidocadoUsarioPublicoOpcionCertificadoCupoAfiliado {

    public static Target BTN_CERTIFICADOS = Target.the("Clic en el boton Certificados").
            located(By.xpath("//div[@id='accionesMenu']//div[@class='card-body']//div[2]//a[1]"));
    public static Target TXT_MATRICULA = Target.the("Cuadro de texto de la matricula").
            located(By.id("matricula"));
    public static Target BTN_CONTINUAR = Target.the("Boton ").
            located(By.id("consultaCertificadosB"));
    public static Target BTN_CERTIFICADO = Target.the("Selecconar el boton cerfifidado automatico").
            located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[1]"));
    public static Target TXT_CANTIDAD_CERTIFICADOS = Target.the("Cuadro de texto de la cantidad de certificados").
            located(By.id("certimat"));
    public static Target BTN_CUPO_AFILIADO = Target.the("Clic boton cupo afiliado").
            located(By.id("liquidacionAfiliacionCliente"));
    public static Target TXT_CAVE_AFILIADO = Target.the("Cuadro de texto clave afiliado").
            located(By.id("claveafiliado"));
    public static Target BTN_APLICAR = Target.the("Boton aplicar en ventana Solicitud Virtual de Certificados").
            located(By.id("pagarCargoAfiliados"));
    public static Target BTN_SI = Target.the("Boton SI en Seguro de comprar este certificado con cargo al cupo del afiliado?").
            located(By.xpath("//button[normalize-space()='Si']"));
    public static Target BTN_DESCARGAR_CERTIFICADOS_TIPO_C = Target.the("Boton descargar Certificado generado").
            located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[2]"));
    public static Target BTN_CONTINUAR_CERTIFICADO_GENERADO = Target.the("Boton continuar certificado generado").
            located(By.xpath("//button[normalize-space()='Continuar']"));
    public static Target BTN_SOPORTE = Target.the("").
            located(By.id("soportesT"));
    public static Target BTN_VER_RECIBO_CAJA = Target.the("Boton ver recibo de caja").
            located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[1]"));
    public static Target BTN_CERRAR = Target.the("").
            located(By.xpath("(//button[normalize-space()='Cerrar'])[1]"));
    public static Target MENSAJE_VALIDACION_SOPORTE_DE_TRANSACCION = Target.the("").
            located(By.xpath("(//h4[normalize-space()='Soportes de la transacción'])[1]"));
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
    //public static Target XXXXXXXXX = Target.the("").located(By);
}
