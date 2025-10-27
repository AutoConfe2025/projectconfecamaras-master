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
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CrudProponente.BTN_MODAL_OK;
import static net.serenitybdd.screenplay.Tasks.*;

public class BloqueCuatroInscripcionProponente implements Task {

    private final String clasificaciones;

    public BloqueCuatroInscripcionProponente(String clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_BLOQUE_CUATRO),
                WaitUntil.the(CrudProponente.BLOQUE_CUATRO_BTN, WebElementStateMatchers.isPresent()).forNoMoreThan(60).seconds(),
                Scroll.to(CrudProponente.BLOQUE_CUATRO_BTN).andAlignToBottom(),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(CrudProponente.BLOQUE_CUATRO_BTN),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(CrudProponente.CLASIFICACIONES_INPUT),
                Enter.theValue(clasificaciones).into(CrudProponente.CLASIFICACIONES_INPUT),
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_RESULTS),
                Click.on(CrudProponente.ENTER_CLICK_RESULT),
                JavaScriptClick.on(CrudProponente.GRABAR_BLOQUECUATRO_BTN),
                ModalLoader.modalLoader(),
                WaitSeconds.seconds(5),
                WaitInteractions.untilBeEnable(BTN_MODAL_OK),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitSeconds.seconds(5)
        );
    }

    public static BloqueCuatroInscripcionProponente enConfecamarasSII(String clasificaciones) {
        return instrumented(BloqueCuatroInscripcionProponente.class, clasificaciones);
    }
}