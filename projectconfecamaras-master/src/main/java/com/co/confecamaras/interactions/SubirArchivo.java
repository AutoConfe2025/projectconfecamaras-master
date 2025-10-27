package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class SubirArchivo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_SUBIR_ARCHIVO_CAPTURAR_EVIDENCIA),
                Scroll.to(BTN_SUBIR_ARCHIVO_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_SUBIR_ARCHIVO_CAPTURAR_EVIDENCIA)
        );

        try {
            setClipboardData(FileUpload.subirArchivo().archivoComandos());
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static SubirArchivo enConfecamaraSII(){
        return instrumented(SubirArchivo.class);
    }
}