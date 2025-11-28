package com.co.confecamaras.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class SetInputDate implements Interaction {

    private final Target campo;
    private final String fecha;



    public static SetInputDate with(Target campo, String fecha) {
        return new SetInputDate(campo, fecha);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement element = campo.resolveFor(actor);

        JavascriptExecutor js = (JavascriptExecutor)
                BrowseTheWeb.as(actor).getDriver();

        js.executeScript("arguments[0].value = arguments[1];", element, fecha);

        js.executeScript(
                "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
                element
        );
    }
}
