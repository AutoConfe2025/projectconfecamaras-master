package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollHastaElFinal implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtenemos el driver desde las habilidades del actor
        var driver = BrowseTheWeb.as(actor).getDriver();
        var js = (JavascriptExecutor) driver;

        long ultimaAltura = 0;

        while (true) {
            long alturaActual = (long) js.executeScript("return document.body.scrollHeight");

            if (alturaActual == ultimaAltura) break;

            js.executeScript("window.scrollTo({top: document.body.scrollHeight, behavior: 'smooth'});");

            // Pausa moderna usando Java 21 / Duration
            esperar(Duration.ofMillis(800));

            ultimaAltura = alturaActual;
        }
    }

    public static ScrollHastaElFinal deLaPagina() {
        return instrumented(ScrollHastaElFinal.class);
    }

    private void esperar(Duration tiempo) {
        try {
            Thread.sleep(tiempo.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}