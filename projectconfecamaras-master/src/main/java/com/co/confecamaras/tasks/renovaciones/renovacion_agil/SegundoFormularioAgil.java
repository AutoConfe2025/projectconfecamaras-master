package com.co.confecamaras.tasks.renovaciones.renovacion_agil;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SegundoFormularioAgil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String Valor = actor.recall("valorCapturado");

        actor.attemptsTo(
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitUntil.the(BOTON_DILIGENCIAR_FORMULARIO_1, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_DILIGENCIAR_FORMULARIO_1),
                WaitUntil.the(LISTA_AUTORIZACION_MENSAJES, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(LISTA_AUTORIZACION_MENSAJES),
                SelectFromOptions.byValue("N").from(LISTA_AUTORIZACION_MENSAJES),
                Scroll.to(CAMPO_VALOR_COMERCIAL_AGIL),
                Click.on(CAMPO_VALOR_COMERCIAL_AGIL),
                Enter.theValue(Valor).into(CAMPO_VALOR_COMERCIAL_AGIL),
                Scroll.to(BOTON_GRABAR_FORM),
                Click.on(BOTON_GRABAR_FORM),
                WaitUntil.the(BOTON_LIQUIDACION_TRAMITE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_LIQUIDACION_TRAMITE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_LIQUIDACION_TRAMITE),
                WaitUntil.the(BOTON_CONTINUAR_LIQUIDACION_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_LIQUIDACION_AGIL),
                WaitUntil.the(BOTON_OK_ALERTA, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_OK_ALERTA)
        );
    }

    public static SegundoFormularioAgil segunFormAgil(){
        return instrumented(SegundoFormularioAgil.class);
    }
}
