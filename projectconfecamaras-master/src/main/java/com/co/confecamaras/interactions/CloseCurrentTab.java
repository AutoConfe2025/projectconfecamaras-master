package com.co.confecamaras.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class CloseCurrentTab implements Interaction {

    public CloseCurrentTab() {}

    @Override
    @Step("{0} closes the current browser tab")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        String current = driver.getWindowHandle();

        // Cerrar la pestaña actual
        driver.close();

        // Cambiar a la pestaña anterior si existe
        for (String window : windows) {
            if (!window.equals(current)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public static CloseCurrentTab now(){
        return Instrumented.instanceOf(CloseCurrentTab.class).newInstance();
    }
}
