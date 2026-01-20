package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class EnterRobot implements Interaction {

    public static EnterRobot ahora() {
        return Tasks.instrumented(EnterRobot.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Robot robot = new Robot();
            Thread.sleep(1000); // espera recomendada

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            throw new RuntimeException("Error al presionar ENTER con Robot", e);
        }
    }
}
