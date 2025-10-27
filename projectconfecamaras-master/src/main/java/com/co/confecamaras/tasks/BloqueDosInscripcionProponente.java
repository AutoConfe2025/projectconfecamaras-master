package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.*;

public class BloqueDosInscripcionProponente implements Task {

    private final String autorizo;

    public BloqueDosInscripcionProponente(String autorizo) {
        this.autorizo = autorizo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_BLOQUE_DOS),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(CrudProponente.BLOQUE_DOS_BTN),
                WaitUntil.the(CrudProponente.AUTORIZO_ENVIO_SLT, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                SelectFromOptions.byVisibleText(autorizo).from(CrudProponente.AUTORIZO_ENVIO_SLT),
                JavaScriptClick.on(CrudProponente.GRABAR_UBICACION_BTN),
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL),
                ModalLoader.modalLoader(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.MODAL_OK_BTN),
                WaitSeconds.seconds(5)
        );
    }

    public static BloqueDosInscripcionProponente enConfecamarasSII(String autorizo) {
        return instrumented(BloqueDosInscripcionProponente.class, autorizo);
    }
}