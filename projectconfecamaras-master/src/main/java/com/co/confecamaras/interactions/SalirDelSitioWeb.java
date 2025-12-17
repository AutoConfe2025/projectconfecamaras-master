package com.co.confecamaras.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SalirDelSitioWeb implements Interaction {

    private final boolean salir; // true = SALIR, false = CANCELAR

    public SalirDelSitioWeb(boolean salir) {
        this.salir = salir;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebDriver driver = Serenity.getDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            Thread.sleep(500);

            js.executeScript("window.onbeforeunload = null;");
            System.out.println("⚡ Evento onbeforeunload eliminado");

            if (salir) {
                driver.navigate().refresh();
                System.out.println("🚪 Acción equivalente a 'Salir' ejecutada (refresh).");
            } else {
                System.out.println("❎ Se simuló 'Cancelar' (continuar en la página).");
            }

        } catch (Exception e) {
            throw new AssertionError("❌ No se pudo procesar el diálogo de salida: " + e.getMessage(), e);
        }
    }

    public static SalirDelSitioWeb salir() {
        return instrumented(SalirDelSitioWeb.class, true);
    }

    public static SalirDelSitioWeb cancelar() {
        return instrumented(SalirDelSitioWeb.class, false);
    }
}
