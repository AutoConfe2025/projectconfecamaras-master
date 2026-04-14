package com.co.confecamaras.tasks.revision_sipref_inscripciones;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

import static com.co.confecamaras.userinterfaces.revision_sipref_inscripciones.Page.CAMPO_FECHA;

@AllArgsConstructor
public class IngresaFecha implements Task {

    private final String fecha;

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = ThucydidesWebDriverSupport.getDriver();

        actor.attemptsTo(
                Click.on(CAMPO_FECHA)
        );

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input'));" +
                        "arguments[0].dispatchEvent(new Event('change'));" +
                        "arguments[0].blur();",
                CAMPO_FECHA.resolveFor(actor),
                fecha
        );
    }

    public static IngresaFecha ingresarFecha(String fecha){
        return new IngresaFecha(fecha);
    }
}