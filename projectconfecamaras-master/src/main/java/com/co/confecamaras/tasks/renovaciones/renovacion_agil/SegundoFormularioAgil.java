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

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilEsadlPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.LISTA_AUTORIZA_INFORMACION;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.LISTA_PERTENECE_GRUPO_ETNICO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SegundoFormularioAgil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String Valor = actor.recall("valorCapturado");
        String ValorActivos = actor.recall("valorActivos");

        actor.attemptsTo(
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitUntil.the(BOTON_DILIGENCIAR_FORMULARIO_1, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_DILIGENCIAR_FORMULARIO_1),
                WaitUntil.the(LISTA_AUTORIZACION_MENSAJES, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(LISTA_AUTORIZACION_MENSAJES),
                SelectFromOptions.byValue("N").from(LISTA_AUTORIZACION_MENSAJES),
                Scroll.to(CAMPO_INGRESO_VALOR_ACTIVO_TOTAL).andAlignToBottom(),
                Enter.theValue(ValorActivos).into(CAMPO_INGRESO_VALOR_ACTIVO_TOTAL),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_AGIL),
                Scroll.to(LISTA_PERTENECE_GRUPO_ETNICO).andAlignToBottom(),
                SelectFromOptions.byValue("N").from(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("N").from(LISTA_AUTORIZA_INFORMACION),
                SelectFromOptions.byValue("N").from(LISTA_PERTENECE_GRUPOS_ETNICOS),
                Scroll.to(CAMPO_INGRESO_VALOR_PASIVO_TOTAL),
                Click.on(CAMPO_INGRESO_VALOR_PASIVO_TOTAL),
                Enter.theValue(ValorActivos).into(CAMPO_INGRESO_VALOR_PASIVO_TOTAL),
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

    public static SegundoFormularioAgil segunFormAgil() {
        return instrumented(SegundoFormularioAgil.class);
    }
}

