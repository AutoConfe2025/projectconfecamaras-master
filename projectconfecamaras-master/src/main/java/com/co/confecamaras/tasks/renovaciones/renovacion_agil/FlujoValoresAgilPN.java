package com.co.confecamaras.tasks.renovaciones.renovacion_agil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoValoresAgilPN implements Task {

    private final String valor = "20.000.0000";
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUEVO_VALOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR),
                Enter.theValue(valor).into(CAMPO_NUEVO_EDITABLE)
        );

        if (CAMPO_NUEVO_VALOR.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(CAMPO_NUEVO_VALOR, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CAMPO_NUEVO_VALOR),
                    SendKeys.of(valor).into(CAMPO_NUEVO_EDITABLE)
            );
        }

        actor.attemptsTo(
                Scroll.to(BOTON_LIQUIDAR),
                Click.on(BOTON_LIQUIDAR)
        );

        actor.remember("valorActivos",valor);
    }

    public static FlujoValoresAgilPN FlujoValores(){
        return instrumented(FlujoValoresAgilPN.class);
    }
}
