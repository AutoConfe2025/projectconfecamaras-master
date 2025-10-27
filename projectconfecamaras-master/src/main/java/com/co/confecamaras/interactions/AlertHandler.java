package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandler implements Interaction {

    private final boolean accept;

    public AlertHandler(boolean accept) {
        this.accept = accept;
    }

    @Override
    @Subject("Manejo de alertas emergentes")
    public <T extends Actor> void performAs(T actor) {
        System.out.println("¡Manejo de alertas emergentes!");
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();

        if (accept) {
            alert.accept();  // Aceptar la alerta
        } else {
            alert.dismiss(); // Cancelar la alerta
        }
    }

    // Método estático para aceptar una alerta
    public static AlertHandler accept() {
        return new AlertHandler(true);
    }

    // Método estático para cancelar una alerta
    public static AlertHandler dismiss() {
        return new AlertHandler(false);
    }
}