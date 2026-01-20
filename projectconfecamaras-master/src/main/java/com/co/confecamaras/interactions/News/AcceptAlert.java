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

public class AcceptAlert implements Interaction {

    private final String textoEnviar;

    // Constructor para solo aceptar
    public AcceptAlert() {
        this.textoEnviar = null;
    }

    // Constructor para enviar texto y aceptar
    public AcceptAlert(String textoEnviar) {
        this.textoEnviar = textoEnviar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String textoAlerta = alert.getText();
            Reportes.reportEvent(Reportes.INFO, "Texto de la alerta: " + textoAlerta);

            // Si hay texto para enviar (caso del Prompt), lo enviamos
            if (textoEnviar != null) {
                alert.sendKeys(textoEnviar);
                Reportes.reportEvent(Reportes.INFO, "Se envió el texto: " + textoEnviar);
            }

            alert.accept();
            Reportes.reportEvent(Reportes.INFO, "Se ha aceptado la alerta como se esperaba");
        } catch (Exception e) {
            Reportes.reportEvent(Reportes.WARNING, "No se encontró alerta para interactuar");
        }
    }

    public static AcceptAlert aceptar() {
        return new AcceptAlert();
    }

    // Nuevo método estático para enviar texto al prompt
    public static AcceptAlert conTexto(String texto) {
        return new AcceptAlert(texto);
    }
}