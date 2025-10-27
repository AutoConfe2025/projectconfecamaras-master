package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.awt.*;
import java.awt.event.KeyEvent;


public class RobotCambioPestana1 {

    public static Performable toTab(){
        return new DriverTask(driver->{

            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(300);
                robot.keyPress(KeyEvent.VK_3);
                robot.delay(300);
                robot.keyRelease(KeyEvent.VK_3);
                robot.delay(300);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(3000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(300);
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(300);
                robot.keyRelease(KeyEvent.VK_W);
                robot.delay(300);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(300);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }
}
