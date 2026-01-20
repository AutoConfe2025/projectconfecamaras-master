package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_CONSULTAR_AREF;
import static com.co.confecamaras.userinterfaces.registros_publicos.SimulacionPagElectronicoPage.CAMPO_NUMERO_LUQUIDACION;
import static com.co.confecamaras.userinterfaces.registros_publicos.SimulacionPagElectronicoPage.CAMPO_NUMERO_RECUPERACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoSimulacionPagosElectronicos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_RECUPERACION,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUMERO_RECUPERACION),
                Enter.theValue("2219884").into(CAMPO_NUMERO_RECUPERACION),
                Click.on(CAMPO_NUMERO_LUQUIDACION),
                Enter.theValue("NJQP7S").into(CAMPO_NUMERO_LUQUIDACION),
                Click.on(BOTON_CONSULTAR_AREF)
        );
    }

    public static FlujoSimulacionPagosElectronicos simulacionPagoElectronico(){
        return new FlujoSimulacionPagosElectronicos();
    }
}
