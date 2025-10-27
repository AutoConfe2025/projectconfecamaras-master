package com.co.confecamaras.interactions.cambiarpestana;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchToWindow implements Interaction {
    private final int windowIndex;

    public SwitchToWindow(int windowIndex) {
        this.windowIndex = windowIndex;
    }

    public static SwitchToWindow at(int index) {
        return new SwitchToWindow(index);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(windowIndex));
    }
}


