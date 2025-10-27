package com.co.confecamaras.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.annotations.Step;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchToNewWindow implements Interaction {

    public SwitchToNewWindow(){}

    @Step("{0} Switching to new Window")public <T extends Actor> void performAs(T actor) {
        String currentWindow = getDriver().getWindowHandle();
        Set<String> allWindows = getDriver().getWindowHandles();
        for(String window : allWindows){
            if(!window.contentEquals(currentWindow)){
                getDriver().switchTo().window(window);
                break;
            }
        }
    }

    public static SwitchToNewWindow switchToNewTab(){
        return Instrumented.instanceOf(SwitchToNewWindow.class).withProperties();
    }
}