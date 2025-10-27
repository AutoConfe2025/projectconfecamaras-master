package com.co.confecamaras.utils.News.gestion_archivos;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CargarArchivo implements Task {
    private final Target elemento_cargue;
    private final String ruta_archivo;

    public CargarArchivo(Target elemento_cargue, String ruta_archivo) {
        this.elemento_cargue = elemento_cargue;
        this.ruta_archivo = ruta_archivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(elemento_cargue));
        StringSelection stringSelection = new StringSelection(ruta_archivo);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        try {
            Robot robot = new Robot();
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
            Reportes.reportEvent(Reportes.INFO,"Se ha cargado el documento.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CargarArchivo cargar(Target elemento,String ruta_archivo){
        return new CargarArchivo(elemento,ruta_archivo);
    }
}
