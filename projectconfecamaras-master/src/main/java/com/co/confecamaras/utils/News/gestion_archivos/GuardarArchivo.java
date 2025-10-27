package com.co.confecamaras.utils.News.gestion_archivos;

import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GuardarArchivo implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        Path ruta = Paths.get(BaseEvidencias.RUTA_EVIDENCIAS);
        ruta = ruta.resolve("documento_" + new SimpleDateFormat("dd-mm-yyyy_HH-mm-ss").format(new Date()));
        String ruta_final = ruta.toAbsolutePath().toString();
        setClipboardData(ruta_final);
    }

    public static GuardarArchivo guardar() {
        return Tasks.instrumented(GuardarArchivo.class);
    }

    private static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        BaseEvidencias.RUTA_DESCARGA = data;
        try {
            Robot robot = new Robot();
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
            Reportes.reportEvent(Reportes.INFO,"Se ha guardado el documento.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
