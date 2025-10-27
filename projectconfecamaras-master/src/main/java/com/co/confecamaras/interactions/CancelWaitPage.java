package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class CancelWaitPage implements Interaction {

    public static CancelWaitPage cancel() {
        return new CancelWaitPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        cancelPage();
    }

    public void cancelPage(){
        //JavascriptExecutor js = (JavascriptExecutor) getWebdriverManager().getCurrentDriver();
        //js.executeScript("return window.stop");

        getWebdriverManager().getCurrentDriver().findElement(By.className("modal-backdrop fade")).sendKeys("Keys.ESCAPE");
    }
}
