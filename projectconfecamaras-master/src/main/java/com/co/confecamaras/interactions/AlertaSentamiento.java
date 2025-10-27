package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AlertaSentamiento implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
            Alert alert = getDriver().switchTo().alert(); // Cambia al contexto de la alerta
            alert.sendKeys("2"); // Envía texto a la alerta
            //alert.accept(); // Acepta la alerta
            Thread.sleep(9000);

        } catch (InterruptedException e) {
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }

    public static AlertaSentamiento digitarOpcion() {
        return new AlertaSentamiento();
    }
}
