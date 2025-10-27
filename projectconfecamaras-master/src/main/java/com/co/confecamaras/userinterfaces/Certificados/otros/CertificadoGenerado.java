package com.co.confecamaras.userinterfaces.Certificados.otros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CertificadoGenerado {
    public static Target BTN_OK_VENTANA_INFORMACION = Target.the("Seleccionar el boton ok de la ventana de informacion").
            located(By.xpath("//button[normalize-space()='OK']"));
    public static Target VALIDACION_VENTANA_EMERGENTE_CERTIFICADO = Target.the("Se valida la ventana emergente del certificado").
            located(By.id("swal2-title"));
    public static Target BTN_DESCARGA_CERTIFICADO = Target.the("").
            located(By.xpath("//th[@scope='row']//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target BTN_CONTINUAR_TIPO_C = Target.the("Selecciona el boton continuar").
            located(By.xpath("//button[normalize-space()='Continuar']"));
    public static Target BTN_SOPORTES = Target.the("Seleccionar el boton soportes").
            located(By.id("soportesT"));
    public static Target MENSAJE_VALIDACION_SOPORTES = Target.the("Mensaje de finalizacion del flujo").
            located(By.xpath("//h4[normalize-space()='Soportes de la transacción']"));
    public static Target BTN_VER_SOPORTE = Target.the("Selecionar clic en el boton ver soporte").
            located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));
    public static Target BTN_CERRAR = Target.the("Boton cerrar ver documento").
            located(By.cssSelector(".btn.btn-info"));
    public static Target BTN_VER = Target.the("Boton ver PDF").
            located(By.cssSelector(".btn.btn-primary"));
}
