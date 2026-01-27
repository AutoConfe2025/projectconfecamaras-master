package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class GenerarSoporteBloque implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL_CAMPO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL_CAMPO),
                Enter.theValue("20260101").into(CAMPO_FECHA_INICIAL_CAMPO),
                Click.on(CAMPO_FECHA_FINAL_CAMPO),
                Enter.theValue("20260101").into(CAMPO_FECHA_FINAL_CAMPO),
                Click.on(BTN_GENERAR_DATA_PICKER),
                AceptAlert.aceptar()
        );
    }

    public static GenerarSoporteBloque generarSoporteBloque(){
        return new GenerarSoporteBloque();
    }
}
