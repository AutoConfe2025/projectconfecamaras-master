package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.Collections;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SignatureByCoordinates implements Interaction {

    private final int startX;
    private final int startY;

    public SignatureByCoordinates(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public static SignatureByCoordinates drawAt(int x, int y) {
        return new SignatureByCoordinates(x, y);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "mouse");

        Sequence sequence = new Sequence(mouse, 1);

        // Mover al punto inicial en coordenadas absolutas
        sequence.addAction(mouse.createPointerMove(
                Duration.ofMillis(0),
                PointerInput.Origin.viewport(),
                startX,
                startY
        ));

        // Click sostenido
        sequence.addAction(mouse.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Movimientos simulando firma
        sequence.addAction(mouse.createPointerMove(
                Duration.ofMillis(120),
                PointerInput.Origin.viewport(),
                startX + 40,
                startY + 20
        ));

        sequence.addAction(mouse.createPointerMove(
                Duration.ofMillis(120),
                PointerInput.Origin.viewport(),
                startX + 90,
                startY - 15
        ));

        sequence.addAction(mouse.createPointerMove(
                Duration.ofMillis(120),
                PointerInput.Origin.viewport(),
                startX + 140,
                startY + 25
        ));

        sequence.addAction(mouse.createPointerMove(
                Duration.ofMillis(120),
                PointerInput.Origin.viewport(),
                startX + 180,
                startY
        ));

        // Soltar
        sequence.addAction(mouse.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // EJECUCIÓN CORRECTA EN SERENITY
        RemoteWebDriver driver = (RemoteWebDriver) getDriver();
        driver.perform(Collections.singletonList(sequence));
    }
}
