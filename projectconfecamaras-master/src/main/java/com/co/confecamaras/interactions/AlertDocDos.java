package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;


public class AlertDocDos implements Interaction  {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            toAlert(actor);
        } catch (AWTException f) {
            throw new RuntimeException(f);
        }
    }

    public void toAlert(Actor actor) throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }


    public static AlertDocDos enterAlert(){
        return new AlertDocDos();
    }

}
