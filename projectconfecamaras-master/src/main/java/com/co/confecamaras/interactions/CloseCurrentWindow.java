package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseCurrentWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = net.serenitybdd.screenplay.abilities.BrowseTheWeb.as(actor).getDriver();

        // Cierra la ventana actual
        driver.close();

        System.out.println("Ventana actual cerrada.");
    }

    public static CloseCurrentWindow now() {
        return instrumented(CloseCurrentWindow.class);
    }
}