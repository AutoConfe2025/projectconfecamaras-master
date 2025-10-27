package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RecibosCaja extends PageObject {

    public static By NUMERO_RECIBO_INPUT = By.id("nrecibo");
    public static By NUMERO_OPERACION_INPUT = By.id("noperacion");
    public static By IDENTIFICACION_INPUT = By.id("identificacion");
    public static By CONTINUAR_BTN = By.xpath("//div[@class='card-footer text-center']//button");
    public static By RECIBO_CAJA_VALIDATION = By.xpath("//table[@id=\"resultados\"]");
    public static Target SS = Target.the("")
            .located(By.xpath("//table[@id=\"resultados\"]"));

}