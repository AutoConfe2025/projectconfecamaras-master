package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.devdos.MantenimientoUsuariosQuestion;
import com.co.confecamaras.questions.devdos.ResumenDiarioCajaQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import com.co.confecamaras.userinterfaces.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.MenuSistema.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.CRITERIO_INPUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoResumenCaja implements Task {

    public static Performable resumenCaja(){
        return instrumented(DoResumenCaja.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("Resumen Diario de Caja (SIREP)").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(ResumenCaja.GENERAR_RESUMEN_BTN),
                WaitUntil.the(ResumenCaja.DESCARGAR_RESUMEN_BTN, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(60).seconds());
        actor.should(seeThat(ResumenDiarioCajaQuestion.validacion()));
        actor.attemptsTo(
                Click.on(ResumenCaja.DESCARGAR_RESUMEN_BTN)
        );

    }

}