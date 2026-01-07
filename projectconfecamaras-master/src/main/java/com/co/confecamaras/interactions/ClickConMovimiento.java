package com.co.confecamaras.interactions.News; // Ejemplo de paquete

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickConMovimiento implements Interaction {

    private final Target target;

    public ClickConMovimiento(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // 1. Resolver el elemento a partir del Target
        org.openqa.selenium.WebElement elemento = target.resolveFor(actor);

        // 2. Crear la secuencia de acciones: Moverse al elemento y hacer clic
        new Actions(driver)
                .moveToElement(elemento) // Mueve el cursor al centro del elemento
                .click()                 // Realiza la acción de clic
                .perform();              // Ejecuta la secuencia
    }

    public static Performable enElElemento(Target target) {
        return Tasks.instrumented(ClickConMovimiento.class, target);
    }
}