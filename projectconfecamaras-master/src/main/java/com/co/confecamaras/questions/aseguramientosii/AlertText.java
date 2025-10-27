package com.co.confecamaras.questions.aseguramientosii;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertText  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public static AlertText es(){
        return new AlertText();
    }
}
