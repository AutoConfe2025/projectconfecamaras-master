package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraCertificadosContinuarDemasBusquedas {
    public static Target BTN_CONTINUAR_B = Target.the("Clic boton continuar").
            located(By.id("consultaCertificadosB"));
    public static Target BTN_CERTIFICADO_AUTOMATICO = Target.the("Selecconar el boton cerfifidado automatico").
            located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[1]"));
    public static Target TXT_CANTIDAD_CERTIFICADOS_DE_MATRICULA = Target.the("Cuadro de texto de la cantidad de certificados").
            located(By.id("certimat"));
    public static Target BTN_CONTINUAR_SOLICITUD = Target.the("Clic boton continuar solicitud de certifidado").
            located(By.id("generarLiquidacion"));
}
