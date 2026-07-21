package com.co.confecamaras.tasks.renovaciones.esadl_catorce_caja;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlujoSoloIngresoPagoElectronico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO),
                Scroll.to(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO)
        );
    }
    public static FlujoSoloIngresoPagoElectronico SoloIngresoPago(){
        return instrumented(FlujoSoloIngresoPagoElectronico.class);
    }
}

