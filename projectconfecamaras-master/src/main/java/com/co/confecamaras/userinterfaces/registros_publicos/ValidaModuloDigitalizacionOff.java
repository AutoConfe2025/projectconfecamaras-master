package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.PageNuevaDigitalizacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaModuloDigitalizacionOff implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_NUEVA_CONSULTA,isPresent()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_NUEVA_CONSULTA),
                Scroll.to(BOTON_LIMPIAR),
                Click.on(BOTON_LIMPIAR),
                Click.on(CAMPO_RECIBO),
                Enter.theValue("S001118794").into(CAMPO_RECIBO),
                Scroll.to(BOTON_CONSULTAR),
                Click.on(BOTON_CONSULTAR),
                WaitUntil.the(BOTON_NUEVA_CONSULTA,isPresent()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_NUEVA_CONSULTA),
                Scroll.to(BOTON_LIMPIAR),
                Click.on(BOTON_LIMPIAR),
                Click.on(CAMPO_NOMBRE),
                Enter.theValue("ALBERTO RIOS MAYORGA").into(CAMPO_NOMBRE),
                Scroll.to(BOTON_CONSULTAR),
                Click.on(BOTON_CONSULTAR),
                WaitUntil.the(BOTON_NUEVA_CONSULTA,isPresent()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_NUEVA_CONSULTA),
                Scroll.to(BOTON_LIMPIAR),
                Click.on(BOTON_LIMPIAR),
                Click.on(CAMPO_IDENTIFICADOR),
                Enter.theValue("10081977").into(CAMPO_IDENTIFICADOR),
                Scroll.to(BOTON_CONSULTAR),
                Click.on(BOTON_CONSULTAR)
        );
    }

    public static ValidaModuloDigitalizacionOff validacionesModuloDigitalizacionOff(){
        return new ValidaModuloDigitalizacionOff();
    }
}
