package com.co.confecamaras.tasks.registro_publico;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.PageNuevaDigitalizacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class BusquedaCodigoBarras implements Task {

    private final String codigo;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_CODIGO_BARRAS,isPresent()).forNoMoreThan(60).seconds(),
                Click.on(CAMPO_CODIGO_BARRAS),
                Enter.theValue(codigo).into(CAMPO_CODIGO_BARRAS),
                Scroll.to(BOTON_CONSULTAR),
                Click.on(BOTON_CONSULTAR)
        );
    }

    public static BusquedaCodigoBarras consultaCodigo(String codigo){
        return new BusquedaCodigoBarras(codigo);
    }
}
