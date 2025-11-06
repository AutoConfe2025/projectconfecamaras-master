package com.co.confecamaras.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchToNewWindow implements Interaction {

    public SwitchToNewWindow(){}

    @Step("{0} waiting and switching to the most recently opened window")
    public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();

        for (int i = 0; i < 10; i++) {
            if (getDriver().getWindowHandles().size() > 1) break;
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }

        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        String lastWindow = windows.get(windows.size() - 1);

        if (!currentWindow.equals(lastWindow)) {
            getDriver().switchTo().window(lastWindow);
        }
    }

    public static SwitchToNewWindow switchToNewTab(){
        return Instrumented.instanceOf(SwitchToNewWindow.class).withProperties();
    }
}