package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.RelacionDevolucionesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RelacionDevoluciones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INI,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INI),
                Enter.theValue("01/12/2025").into(CAMPO_FECHA_INI),
                Click.on(CAMPO_FECHA_FINAL),
                Enter.theValue("31/12/2025").into(CAMPO_FECHA_FINAL),
                Click.on(BTN_GENERAR_DEVOLUCION),
                Click.on(BTN_GENERAR_DEVOLUCION_ALERTA)

        );
    }

    public static RelacionDevoluciones Devoluciones(){
        return new RelacionDevoluciones();
    }
}
