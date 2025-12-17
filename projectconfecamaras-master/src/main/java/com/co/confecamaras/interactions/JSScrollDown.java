 package com.co.confecamaras.interactions;
 import net.serenitybdd.screenplay.Actor;
 import net.serenitybdd.screenplay.Interaction;
 import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
 import net.serenitybdd.screenplay.targets.Target;
 import org.openqa.selenium.JavascriptExecutor;

public class JSScrollDown implements Interaction {

    private final Target target;

    public JSScrollDown(Target target) {
        this.target = target;
    }

    public static JSScrollDown on(Target target) {
        return new JSScrollDown(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String script = "arguments[0].scrollTop += 500;";

        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript(script, target.resolveFor(actor));
    }
}