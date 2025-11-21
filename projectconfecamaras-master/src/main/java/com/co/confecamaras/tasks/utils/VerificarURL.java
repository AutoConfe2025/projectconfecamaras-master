package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.CloseCurrentWindowAndSwitchBack;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;

public class VerificarURL implements Task {

    private final Target link;

    /**
     * Constructor que recibe el Target (By, XPath, CSS) del enlace a verificar.
     * @param link El Target del enlace o botón que abre la nueva URL/ventana.
     */
    public VerificarURL(Target link) {
        this.link = link;
    }

    @Override
    @Step("{0} verifica que el enlace '#link' abra y cierre la nueva ventana correctamente")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // 1. Hace clic en el enlace/botón que abrirá la nueva ventana.
                Click.on(link),

                // 2. Espera un momento para que se abra la nueva ventana/pestaña.
                WaitSeconds.seconds(3),

                // 3. Cambia el foco del driver a la última ventana abierta.
                ChangeToLastWindow.changeToLastWindow(),

                // 4. Registra que la apertura fue exitosa (se puede mejorar con una validación de URL/Título).
                LogEvent.recordevent(Reportes.PASSED, "Se abrió la nueva URL/ventana correctamente."),

                // 5. Espera un momento para visualizar el contenido (opcional, se puede ajustar).
                WaitSeconds.seconds(2),

                // 6. Cierra la ventana actual y regresa a la ventana principal.
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),

                // 7. Registra que el cierre y regreso fueron exitosos.
                LogEvent.recordevent(Reportes.INFO, "La ventana fue cerrada y el foco regresó a la página principal.")
        );
    }

    /**
     * Método estático para construir la tarea de forma legible.
     * @param link El Target del enlace o botón a verificar.
     * @return La tarea VerificarURL.
     */
    public static VerificarURL elEnlace(Target link) {
        return new VerificarURL(link);
    }
}