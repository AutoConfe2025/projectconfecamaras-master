package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReportesEE extends PageObject {

    public static final Target TXT_NIT_EE = Target.the("Escribir el nit")
            .located(By.id("nit"));

    public static final Target BTN_CONSULTAR_EE = Target.the("Boton consultar")
            .located(By.xpath("//button[@class=\"btn btn-primary\"]"));

    public static final Target BTN_XML_EE = Target.the("Boton XML")
            .located(By.xpath("(//button[contains(text(), 'XML')])[1]"));

    public static final Target LBL_MENSAJE_XML = Target.the("Mesaje detalle XML")
            .located(By.xpath("//*[contains(text(), ' Detalle del XML')]"));
}
