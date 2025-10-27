package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SolicitudesRegistro extends PageObject {

    public static final Target TXT_FECHA_INICIAL_SOLICITUDES = Target.the("Escribir la fecha inicial")
            .located(By.id("fechaInicial"));

    public static final Target TXT_FECHA_FINAL_SOLICITUDES = Target.the("Escribir la fecha final")
            .located(By.id("fechaFinal"));

    public static final Target BTN_CONTINUAR_SOLICITUDES = Target.the("Boton continuar")
            .located(By.xpath("//button[@class=\"btn btn-primary\"]"));

    public static final Target LBL_TABLA_SOLICITUDES= Target.the("Tabla solicitudes registro")
            .located(By.xpath("(//div[@class=\"table-responsive\"])[1]"));
}
