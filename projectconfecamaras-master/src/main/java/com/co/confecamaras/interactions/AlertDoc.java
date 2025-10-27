package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;


public class AlertDoc implements Interaction  {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            toAlert(actor);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public void toAlert(Actor actor) throws AWTException {
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
    }


    public static AlertDoc enterAlert(){
        return new AlertDoc();
    }

}
