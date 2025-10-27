package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;


public class SignatureAndQr implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        firmar();
    }

    public static SignatureAndQr doFirmar() {
        return new SignatureAndQr();
    }

    public void firmar(){
        Actions builder = new Actions(getWebdriverManager().getCurrentDriver());
        WebElement canvasElement = getWebdriverManager().getCurrentDriver().findElement(By.xpath("//form[@id=\"formularioFirmaManuscrita\"]//canvas"));

        Action signature = builder.moveToElement(canvasElement,20,-50)
                .clickAndHold()
                .moveByOffset(50, 50)
                .moveByOffset(80,-50)
                .moveByOffset(100,50)
                .release(canvasElement)
                .build();
        signature.perform();
    }

}