package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.core.Serenity.getDriver;

public class ClickOnCoordinates implements Interaction {

    private final int x;
    private final int y;

    public ClickOnCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new Actions(getDriver())
                .moveByOffset(x, y)
                .click()
                .perform();

        new Actions(getDriver())
                .moveByOffset(-x, -y)
                .perform();
    }

    public static ClickOnCoordinates at(int x, int y) {
        return new ClickOnCoordinates(x, y);
    }
}
