package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsEvent implements Interaction {

    private final WebElement element;

    public JsEvent(WebElement element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript(
                "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
                element
        );
    }

    public static JsEvent dispatchChange(WebElement element) {
        return new JsEvent(element);
    }
}
