package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileRobotUpload implements Interaction {

    private final String filePath;

    public FileRobotUpload(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(2000);

            StringSelection selection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(3000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static FileRobotUpload withPath(String filePath) {
        return new FileRobotUpload(filePath);
    }
}
