package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickRobusto implements Interaction {

    private final Target boton;
    private final Target elementoPostClick;

    public ClickRobusto(Target boton, Target elementoPostClick) {
        this.boton = boton;
        this.elementoPostClick = elementoPostClick;
    }

    public static ClickRobusto en(Target boton, Target elementoPostClick) {
        return Tasks.instrumented(ClickRobusto.class, boton, elementoPostClick);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        int intentos = 0;
        boolean clickeado = false;

        while (intentos < 3 && !clickeado) {
            try {
                // 🔁 SIEMPRE re-localiza el elemento
                boton.resolveFor(actor).waitUntilClickable().click();
                clickeado = true;

            } catch (StaleElementReferenceException e) {
                intentos++;
                System.out.println("⚠️ Reintentando click por stale... intento #" + intentos);
            }
        }

        if (!clickeado) {
            throw new RuntimeException("❌ No se pudo hacer click sin stale después de reintentos");
        }

        // 🔥 Esperar nuevo render (clave)
        wait.until(driver1 -> elementoPostClick.resolveFor(actor).isVisible());
    }
}