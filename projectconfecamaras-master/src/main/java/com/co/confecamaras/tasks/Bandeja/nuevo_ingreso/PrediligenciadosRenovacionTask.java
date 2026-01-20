package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.EstadisticasYExtracciones.PrediligenciadosRenovacionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PrediligenciadosRenovacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BTN_PRECALCULAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_PRECALCULAR),
                WaitUntil.the(BTN_ABANDONAR, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_ABANDONAR),
                Click.on(BTN_ABANDONAR),
                WaitUntil.the(BTN_SELECCIONAR_INFORME, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_SELECCIONAR_INFORME),
                WaitUntil.the(BTN_REGRESAR, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(BTN_REGRESAR),
                Click.on(BTN_REGRESAR),
                WaitUntil.the(BTN_ADMINISTRAR_REPO, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_ADMINISTRAR_REPO),
                WaitSeconds.seconds(2),
                Click.on(BTN_ADMINISTRAR),
                WaitSeconds.seconds(2),
                Click.on(BTN_REGRESAR)

        );

        actor.attemptsTo(LogEvent.recordevent(Reportes.PASSED, "Finalizo correctamente Prediligenciados Renovacion"));
    }

    public static PrediligenciadosRenovacionTask estadisticasYextracciones() {
        return new PrediligenciadosRenovacionTask();
    }
}


