package com.co.confecamaras.interactions; // Asegúrate de que este sea el paquete correcto

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EjecutarJavaScript implements Interaction {

    private final String script;
    private final Target target;

    public EjecutarJavaScript(String script, Target target) {
        this.script = script;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el WebDriver de la habilidad BrowseTheWeb
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // Localiza el elemento para pasarlo al script
        WebElement elemento = target.resolveFor(actor);

        // Ejecuta el JavaScript
        ((JavascriptExecutor) driver).executeScript(script, elemento);
    }

    // *** LÍNEA CORREGIDA ***
    // Ahora devuelve la clase Builder, permitiendo encadenar .enElCampo()
    public static Builder conScript(String script) {
        return new Builder(script);
    }

    public static class Builder {
        private final String script;

        public Builder(String script) {
            this.script = script;
        }

        public Performable enElCampo(Target target) {
            return new EjecutarJavaScript(script, target);
        }
    }
}