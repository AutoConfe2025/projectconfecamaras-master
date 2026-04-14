package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class VolverPaginaAnterior implements Interaction {

    @Step("{0} vuelve a la página anterior")
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
        driver.navigate().back();
    }

    public static VolverPaginaAnterior ir() {
        return new VolverPaginaAnterior();
    }
}