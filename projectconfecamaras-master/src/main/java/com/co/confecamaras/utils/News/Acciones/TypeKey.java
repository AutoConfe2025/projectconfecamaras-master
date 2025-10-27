package com.co.confecamaras.utils.News.Acciones;


import java.awt.*;
import java.awt.event.KeyEvent;

public class TypeKey {
    private static Robot robot;

    public static final String ENTER = "ENTER";
    public static final String TAB = "TAB";

    public static void EnterKey(String key) {
        try {
            robot = new Robot();
            switch (key.toUpperCase()) {
                case "ENTER":
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    break;
                case "TAB":
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
