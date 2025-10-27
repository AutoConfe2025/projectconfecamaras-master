package com.co.confecamaras.utils;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotCerrarVentanaEmergente implements Interaction {

    public RobotCerrarVentanaEmergente() throws AWTException {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2()
        );

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_F4);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static RobotCerrarVentanaEmergente cerrar(){
        return Tasks.instrumented(RobotCerrarVentanaEmergente.class);
    }
}
