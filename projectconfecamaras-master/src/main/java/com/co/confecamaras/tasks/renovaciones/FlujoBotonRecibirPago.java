package com.co.confecamaras.tasks.renovaciones;

import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_RECIBIR_PAGO_TEXTO_2;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoBotonRecibirPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_RECIBIR_PAGO_TEXTO_2,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RECIBIR_PAGO_TEXTO_2),
                SwitchToWindow.at(1)
        );
    }

    public static FlujoBotonRecibirPago flujoSoloBotonRecibirPago(){
        return instrumented(FlujoBotonRecibirPago.class);
    }
}
