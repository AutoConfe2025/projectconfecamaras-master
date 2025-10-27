package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotCerrarPestana {

    public static Performable toCloseTab(){
        return new DriverTask(driver->{

            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(2000);
                robot.keyRelease(KeyEvent.VK_W);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }
}