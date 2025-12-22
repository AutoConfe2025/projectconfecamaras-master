package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.core.Serenity.getDriver;

public class PressEsc implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        new Actions(getDriver())
                .sendKeys(Keys.ESCAPE)
                .perform();
    }

    public static PressEsc toCloseModal() {
        return new PressEsc();
    }
}
