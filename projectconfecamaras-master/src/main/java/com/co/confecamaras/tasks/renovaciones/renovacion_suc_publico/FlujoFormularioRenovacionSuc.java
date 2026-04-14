package com.co.confecamaras.tasks.renovaciones.renovacion_suc_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoFormularioRenovacionSuc implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String valorNuevo = actor.recall("valorNuevo");


        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("00001").from(LISTA_SELECCION_BARRIO),
                Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADOS),
                Enter.theValue(valorNuevo).into(CAMPO_VALOR_COMERCIAL_VINCULADOS),
                Click.on(CAMPO_PERSONAL_OCUPADO),
                Enter.theValue("100").into(CAMPO_PERSONAL_OCUPADO)
        );

        if (!LISTA_SELECION_TIPO_DE_LOCAL.resolveAllFor(actor).isEmpty()) {
            actor.attemptsTo(
                    Scroll.to(LISTA_SELECION_TIPO_DE_LOCAL),
                    Click.on(LISTA_SELECION_TIPO_DE_LOCAL),
                    Click.on(LISTA_SELECION_TIPO_DE_LOCAL_NO_PROPIO)
            );
        }

        actor.attemptsTo(
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION),
                WaitUntil.the(BOTON_PRIMER_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_PRIMER_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF)
        );
    }

    public static FlujoFormularioRenovacionSuc flujoFormularioUno(){
        return new FlujoFormularioRenovacionSuc();
    }
}
