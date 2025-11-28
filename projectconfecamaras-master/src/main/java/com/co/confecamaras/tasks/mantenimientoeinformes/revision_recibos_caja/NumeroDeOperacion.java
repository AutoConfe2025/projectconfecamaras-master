package com.co.confecamaras.tasks.mantenimientoeinformes.revision_recibos_caja;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.RevisionRecibosCaja.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class NumeroDeOperacion implements Task {

    private final String operacion;
    private final String identificacion;
    private final String fecha;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_NUMERO_DE_RECIBO),
                Enter.theValue(operacion).into(CAMPO_NUMERO_DE_RECIBO),
                Click.on(BOTON_CONSULTAR),
                WaitUntil.the(BOTON_EDITAR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_EDITAR),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),
                Clear.field(CAMPO_NUMERO_DE_RECIBO),
                WaitUntil.the(CAMPO_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_IDENTIFICACION),
                Enter.theValue(identificacion).into(CAMPO_IDENTIFICACION),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_REGRESAR),
                Clear.field(CAMPO_IDENTIFICACION),
                Click.on(CAMPO_FECHA),
                Enter.theValue(fecha).into(CAMPO_FECHA),
                Click.on(BOTON_CONSULTAR),
                Click.on(BOTON_EDITAR),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR)
        );
    }

    public static NumeroDeOperacion flujoRevisionRecibosCaja(String operacion, String identificacion, String fecha) {
        return new NumeroDeOperacion(operacion, identificacion, fecha);
    }
}
