package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotRecargarPestana {

    public static Performable toCloseTab(){
        return new DriverTask(driver->{

            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_R);
                robot.delay(200);
                robot.keyRelease(KeyEvent.VK_R);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }
}
