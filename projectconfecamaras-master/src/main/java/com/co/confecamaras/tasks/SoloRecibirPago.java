package com.co.confecamaras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_RECIBIR_PAGO_TEXTO_2;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SoloRecibirPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (BOTON_RECIBIR_PAGO_TEXTO_2.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_RECIBIR_PAGO_TEXTO_2, isVisible()).forNoMoreThan(50).seconds(),
                    Scroll.to(BOTON_RECIBIR_PAGO_TEXTO_2),
                    Click.on(BOTON_RECIBIR_PAGO_TEXTO_2),
                    Switch.toNewWindow()
            );
        }
    }

    public static SoloRecibirPago soloRecibePago(){
        return instrumented(SoloRecibirPago.class);
    }
}
