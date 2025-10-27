package com.co.confecamaras.interactions.cerrarpestana;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class CloseCurrentWindow implements Interaction {
    public static CloseCurrentWindow now() {
        return new CloseCurrentWindow();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.close(); // Cierra la ventana actual.
    }
}
