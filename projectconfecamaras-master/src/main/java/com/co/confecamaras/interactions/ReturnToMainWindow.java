package com.co.confecamaras.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class ReturnToMainWindow implements Interaction {

    public ReturnToMainWindow() {}

    @Override
    @Step("{0} returns to the main browser window")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String mainWindow = actor.recall("mainWindowHandle");

        if (mainWindow != null) {
            driver.switchTo().window(mainWindow);
        }
    }

    public static ReturnToMainWindow now(){
        return Instrumented.instanceOf(ReturnToMainWindow.class).newInstance();
    }
}
