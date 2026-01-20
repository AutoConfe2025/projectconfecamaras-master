package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetMunicipioPorJS implements Interaction {

    private final WebElement elemento;
    private final String valor;

    public SetMunicipioPorJS(WebElement elemento, String valor) {
        this.elemento = elemento;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor)
                BrowseTheWeb.as(actor).getDriver();

        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
                elemento, valor
        );
    }

    public static SetMunicipioPorJS conValor(WebElement elemento, String valor) {
        return instrumented(SetMunicipioPorJS.class, elemento, valor);
    }
}
