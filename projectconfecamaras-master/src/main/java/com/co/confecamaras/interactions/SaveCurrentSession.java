package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;

public class SaveCurrentSession implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver currentDriver = getDriver();
        actor.remember("OLD_DRIVER", currentDriver);
    }

    public static SaveCurrentSession now() {
        return new SaveCurrentSession();
    }
}