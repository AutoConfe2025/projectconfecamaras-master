package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CancelAlert implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            Reportes.reportEvent(Reportes.INFO, alert.getText());
            alert.dismiss();
            Reportes.reportEvent(Reportes.INFO,"Se ha cancelado la alerta como se esparaba");
        }catch (Exception e){}
    }
    /**
     * Cerrara la alerta del navegador si esta aparece.<br>
     * Por lo contrario no realizara ninguna excepción si esta no aparece
     *
     * @return
     * @author: Isaac Gomez
     */
    public static CancelAlert dismiss(){
        return  new CancelAlert();
    }
}
