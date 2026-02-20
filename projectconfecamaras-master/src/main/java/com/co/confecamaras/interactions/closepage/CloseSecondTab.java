package com.co.confecamaras.interactions.closepage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseSecondTab implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        var driver = BrowseTheWeb.as(actor).getDriver();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        if (tabs.size() > 1) {

            // Cambiar a la segunda pestaña
            driver.switchTo().window(tabs.get(1));

            // Cerrar la segunda
            driver.close();

            // Volver a la primera
            driver.switchTo().window(tabs.get(0));
        }
    }

    public static Performable now() {
        return instrumented(CloseSecondTab.class);
    }
}
