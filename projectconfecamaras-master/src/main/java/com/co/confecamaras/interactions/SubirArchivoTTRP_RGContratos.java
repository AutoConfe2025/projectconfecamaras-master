package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static com.co.confecamaras.userinterfaces.Bandejas.ReingresoGenericoDeTramitesPage.INP_CARGA_ARCHIVO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubirArchivoTTRP_RGContratos implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INP_CARGA_ARCHIVO),
                Scroll.to(INP_CARGA_ARCHIVO).andAlignToBottom(),
                MoveMouse.to(INP_CARGA_ARCHIVO).andThen(Actions::click)
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

    public static SubirArchivoTTRP_RGContratos enConfecamaraSII(){
        return instrumented(SubirArchivoTTRP_RGContratos.class);
    }
}