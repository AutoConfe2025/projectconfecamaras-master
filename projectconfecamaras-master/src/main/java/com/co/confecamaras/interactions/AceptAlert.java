package com.co.confecamaras.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptAlert implements Interaction {

    private final boolean aceptar; // true = aceptar, false = cancelar

    public AceptAlert(boolean aceptar) {
        this.aceptar = aceptar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = Serenity.getDriver();

        try {
            Thread.sleep(1000);

            Alert alerta = driver.switchTo().alert();
            System.out.println("⚠️ Texto de la alerta: " + alerta.getText());

            if (aceptar) {
                alerta.accept();
                System.out.println("✅ Se hizo clic en 'Aceptar'.");
            } else {
                alerta.dismiss();
                System.out.println("❎ Se hizo clic en 'Cancelar'.");
            }

        } catch (Exception e) {
            throw new AssertionError("❌ No se encontró la alerta del navegador: " + e.getMessage(), e);
        }
    }

    public static AceptAlert aceptar() {
        return instrumented(AceptAlert.class, true);
    }

    public static AceptAlert cancelar() {
        return instrumented(AceptAlert.class, false);
    }
}
