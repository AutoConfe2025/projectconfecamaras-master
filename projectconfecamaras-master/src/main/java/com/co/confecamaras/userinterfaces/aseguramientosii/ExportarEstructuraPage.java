package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExportarEstructuraPage {

    public static final Target EXPORTAR_ESTRUCTURA = Target.the("BTN para ingresar al apartado de Exportar estructura")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static final Target DESCARGAR_ESTRUCTUIRA = Target.the("Enlace para descargar el enlace")
            .located(By.xpath("//a[text()='Descargar estructura - Estructura detallada']"));


}
