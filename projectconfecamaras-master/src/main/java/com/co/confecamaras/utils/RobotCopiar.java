package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotCopiar {

    public static Performable toText(){
        return new DriverTask(driver->{

            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(500);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }
}