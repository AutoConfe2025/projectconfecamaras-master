package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirUrlSII implements Task {
    private final String url;

    public AbrirUrlSII(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = net.serenitybdd.core.Serenity.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open('about:blank','_blank');");

        var handles = driver.getWindowHandles();
        String nuevaPestania = handles.toArray()[handles.size() - 1].toString();
        driver.switchTo().window(nuevaPestania);

        driver.get(url);
    }

    public static AbrirUrlSII enLaUrl(String url) {
        return instrumented(AbrirUrlSII.class, url);
    }
}

