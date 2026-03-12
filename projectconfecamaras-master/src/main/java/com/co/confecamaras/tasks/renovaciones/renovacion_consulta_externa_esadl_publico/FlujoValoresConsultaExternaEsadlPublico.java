package com.co.confecamaras.tasks.renovaciones.renovacion_consulta_externa_esadl_publico;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_CONTINUAR_RENOVACION_1;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoValoresConsultaExternaEsadlPublico implements Task {

    private final String valor;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CONTINUAR_RENOVACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_RENOVACION),
                WaitUntil.the(BOTON_ACEPTAR_MENSAJE_IMPORTANTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACEPTAR_MENSAJE_IMPORTANTE),
                WaitUntil.the(CAMPO_NUEVO_VALOR_PERSONA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_PERSONA)
        );

        if (CAMPO_NUEVO_VALOR_ESTABLECIMIENTO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO)
            );
        }

        actor.attemptsTo(
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }

    public static FlujoValoresConsultaExternaEsadlPublico flujoValoresConsultaEsadl(String valor){
        return new FlujoValoresConsultaExternaEsadlPublico(valor);
    }
}

