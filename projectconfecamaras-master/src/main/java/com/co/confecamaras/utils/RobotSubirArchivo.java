package com.co.confecamaras.utils;

import com.co.confecamaras.interactions.FileUpload;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.co.confecamaras.interactions.SubirArchivo.setClipboardData;

public class RobotSubirArchivo {

    public static Performable toFile(){
        return new DriverTask(driver->{

            try {
                setClipboardData(FileUpload.subirArchivo().archivoComandos());
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_V);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_V);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(2000);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }
}