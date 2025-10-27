package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.SUBIR_PDF;

public class SubirLeySinAsentamiento  implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SUBIR_PDF),
                //Scroll.to(SUBIR_PDF).andAlignToBottom(),
                Click.on(SUBIR_PDF)
        );

        try {
            SubirArchivo.setClipboardData(FileUpload.subirArchivo().archivoComandos());
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_ALT);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static SubirLeySinAsentamiento subirAnexo(){
        return Tasks.instrumented(SubirLeySinAsentamiento.class);
    }
}
