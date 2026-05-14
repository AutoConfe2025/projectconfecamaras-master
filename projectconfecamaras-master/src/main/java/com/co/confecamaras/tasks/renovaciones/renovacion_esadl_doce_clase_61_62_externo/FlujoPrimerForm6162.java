package com.co.confecamaras.tasks.renovaciones.renovacion_esadl_doce_clase_61_62_externo;

import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.LISTA_SELECION_AUTORIZACIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPrimerForm6162 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_FORMULARIO_1)
        );

        actor.attemptsTo(
                WaitUntil.the(LISTA_EMPRENDIMIENTO_SOCIAL, isPresent()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("N").from(LISTA_EMPRENDIMIENTO_SOCIAL),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(50).seconds()
        );

        if (LISTA_SELECION_AUTORIZACIONES.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                    SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES)
            );

        } else {
            System.out.println("la lista de seleccion no esta disponible");
        }

        actor.attemptsTo(
                WaitUntil.the(CAMPO_VALOR_ACTIVO_TOTAL, isPresent()).forNoMoreThan(50).seconds()
        );

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_ACTIVO_CORRIENTE, isPresent()).forNoMoreThan(60).seconds(),
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE),
                Scroll.to(CAMPO_PERSONAL_OCUPADO),
                Click.on(CAMPO_PERSONAL_OCUPADO),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );
    }

    public static FlujoPrimerForm6162 flujo6162(){
        return instrumented(FlujoPrimerForm6162.class);
    }
}
