package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotCerrarPestanas {

    public static Performable toTab(){
        return new DriverTask(driver->{
            try {
                Robot robot = new Robot();
                robot.delay(500);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_2);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_2);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(800);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_W);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

}
