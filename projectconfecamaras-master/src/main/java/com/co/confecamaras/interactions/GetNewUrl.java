package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class GetNewUrl implements Interaction {

    public static String newUrl;
    public static String urlWeb;

    public static GetNewUrl url() {
        return new GetNewUrl();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        urlEstatico();
        urlIframe();
    }

    public void urlEstatico(){
        String url = getWebdriverManager().getCurrentDriver().getCurrentUrl();
        urlWeb = url;
    }

    public void urlIframe(){
        WebElement ss = getWebdriverManager().getCurrentDriver().findElement(By.xpath("(//iframe[contains(@src,'https')])[1]"));
        newUrl = ss.getAttribute("src");
    }
}
