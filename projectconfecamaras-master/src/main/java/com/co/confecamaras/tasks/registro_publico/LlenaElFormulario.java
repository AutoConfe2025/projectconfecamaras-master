package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LlenaElFormulario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_NUEVO_SERVICIO,isPresent()).forNoMoreThan(40).seconds(),
                Scroll.to(BOTON_NUEVO_SERVICIO),
                Click.on(BOTON_NUEVO_SERVICIO),
                Click.on(CAMPO_INPUT_SERVICIO),
                Enter.theValue("QQA1").into(CAMPO_INPUT_SERVICIO),
                Click.on(CAMPO_NOMBRE),
                Enter.theValue("QQA1").into(CAMPO_NOMBRE),
                Click.on(CAMPO_NOMBRE_CORTO),
                Enter.theValue("QA").into(CAMPO_NOMBRE_CORTO),
                SelectFromOptions.byValue("01").from(LISTA_RUTA),
                SelectFromOptions.byValue("activos").from(LISTA_BASE_CALCULO),
                SelectFromOptions.byValue("N").from(LISTA_APLICA_1429),
                SelectFromOptions.byValue("1").from(LISTA_CLASE_VALOR),
                SelectFromOptions.byValue("1").from(LISTA_TIPO_VALOR),
                Enter.theValue("001").into(CAMPO_CUANTIA),
                SelectFromOptions.byValue("0").from(LISTA_RECIBO_TARJETA),
                SelectFromOptions.byValue("N").from(LISTA_ES_IVA),
                SelectFromOptions.byValue("N").from(LISTA_MOSTRABLE_AL_CAJERO),
                SelectFromOptions.byValue("00").from(LISTA_GRUPO_VENTAS),
                SelectFromOptions.byValue("1").from(LISTA_INDICADOR_CUANTIA),
                SelectFromOptions.byValue("N").from(LISTA_PRIMA_COLOCACION_ACCIONES),
                SelectFromOptions.byValue("01").from(LISTA_CONCEPTO_DEPARTAMENTAL),
                Click.on(CAMPO_CENTRO_COSTOS_PRIVADO),
                Enter.theValue("QQA1").into(CAMPO_CENTRO_COSTOS_PRIVADO),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("27/11/2025").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FINAL),
                Enter.theValue("27/11/2025").into(CAMPO_FECHA_FINAL),
                Scroll.to(LISTA_FACTURABLE_ELECTRONICAMENTE),
                SelectFromOptions.byValue("NO").from(LISTA_FACTURABLE_ELECTRONICAMENTE),
                SelectFromOptions.byValue("01040400").from(LISTA_HOMOLOGACION_RUES),
                SelectFromOptions.byValue("01000000").from(LISTA_SERVICIO_GRAVADO_1),
                SelectFromOptions.byValue("01000000").from(LISTA_SERVICIO_DEPENDIENTE_1),

                Click.on(BOTON_GRABAR)
        );
    }

    public static LlenaElFormulario forumlarioAgregaServicio(){
        return new LlenaElFormulario();
    }
}
