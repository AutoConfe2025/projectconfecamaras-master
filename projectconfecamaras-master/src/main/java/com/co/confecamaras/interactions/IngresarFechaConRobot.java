package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarFechaConRobot implements Interaction {
    private final Target target;
    private final String fecha;

    public IngresarFechaConRobot(Target target, String fecha) {
        this.target = target;
        this.fecha = fecha;
    }

    public static IngresarFechaConRobot en(Target target, String fecha) {
        return instrumented(IngresarFechaConRobot.class, target, fecha);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebElement element = target.resolveFor(actor);
            element.click(); // Abrimos el calendario a propósito

            Robot robot = new Robot();
            robot.setAutoDelay(100);

            // 1. Borramos el contenido actual (por si acaso)
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);

            // 2. Escribimos la fecha caracter por caracter
            for (char c : fecha.toCharArray()) {
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                if (c == '-') keyCode = KeyEvent.VK_MINUS; // Corrección para el guion
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }

            // 3. LA CLAVE: Presionamos ESCAPE para cerrar el calendario físicamente
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);

            // 4. Presionamos TAB para saltar al siguiente campo
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        } catch (Exception e) {
            throw new RuntimeException("Error usando Robot para la fecha", e);
        }
    }
}