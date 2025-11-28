package com.co.confecamaras.interactions.cerrarpestana;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloseEmbeddedPdf implements Interaction {

    public static CloseEmbeddedPdf now() {
        return new CloseEmbeddedPdf();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        if (driver.findElements(By.tagName("embed")).size() > 0) {
            driver.navigate().back();
            return;
        }

        if (driver.getWindowHandles().size() > 1) {
            String main = driver.getWindowHandle();
            for (String win : driver.getWindowHandles()) {
                if (!win.equals(main)) {
                    driver.switchTo().window(win);
                    driver.close();
                }
            }
            driver.switchTo().window(main);
        }
    }
}
