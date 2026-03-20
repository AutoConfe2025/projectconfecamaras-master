package com.co.confecamaras.tasks.renovaciones.renovaciones_suc_consulta_externa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoValoresSucConsultaExterna implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BOTON_CONTINUAR_RENOVACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_RENOVACION),
                WaitUntil.the(BOTON_ACEPTAR_MENSAJE_IMPORTANTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACEPTAR_MENSAJE_IMPORTANTE)
        );

        String valorCapturado = Attribute.of(CAMPO_NUEVO_VALOR_PERSONA)
                .named("value")
                .answeredBy(actor);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUEVO_VALOR_PERSONA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA),
                Enter.theValue(valorCapturado).into(CAMPO_NUEVO_VALOR_PERSONA)
        );

        actor.remember("valorNuevo", valorCapturado);

        actor.attemptsTo(
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }

    public static FlujoValoresSucConsultaExterna flujoValoresSucCE() {
        return new FlujoValoresSucConsultaExterna();
    }
}
