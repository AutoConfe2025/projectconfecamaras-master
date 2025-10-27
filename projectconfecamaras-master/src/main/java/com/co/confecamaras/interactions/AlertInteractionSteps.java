package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AlertInteractionSteps implements Interaction {

    private String numero;

    public AlertInteractionSteps(String numero) {
        this.numero = numero;
    }

    public static AlertInteractionSteps conElNumero(String numero) {
        return new AlertInteractionSteps(numero);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Robot robot = new Robot();
            robot.delay(1000); // Pequeña pausa para asegurarse de que el foco esté en la alerta

            // Simular la digitación del número ingresado
            for (char c : numero.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}