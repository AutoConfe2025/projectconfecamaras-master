package com.co.confecamaras.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ExecuteJS implements Interaction {

    private final String script;

    public ExecuteJS(String script) {
        this.script = script;
    }

    public static ExecuteJS with(String script) {
        return Tasks.instrumented(ExecuteJS.class, script);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(script);
    }
}
