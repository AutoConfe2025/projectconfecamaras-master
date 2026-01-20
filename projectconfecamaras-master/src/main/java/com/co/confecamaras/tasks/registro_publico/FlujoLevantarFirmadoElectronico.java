package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoLevantarFirmadoElectronico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_CODIGO_RECUPERACION,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_CODIGO_RECUPERACION),
                Enter.theValue("UBHZRX").into(CAMPO_CODIGO_RECUPERACION),
                Click.on(BOTON_CONSULTAR_BOTON)
        );
    }

    public static FlujoLevantarFirmadoElectronico levantarFirmadoElectronico(){
        return new FlujoLevantarFirmadoElectronico();
    }
}
