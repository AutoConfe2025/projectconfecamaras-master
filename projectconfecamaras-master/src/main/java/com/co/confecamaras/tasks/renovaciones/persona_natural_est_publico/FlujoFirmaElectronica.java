package com.co.confecamaras.tasks.renovaciones.persona_natural_est_publico;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_RECIBIR_PAGO_TEXTO;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FlujoFirmaElectronica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitUntil.the(BOTON_FIRMA_ELECTRONICA, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(BOTON_FIRMA_ELECTRONICA),
                WaitUntil.the(VALIDA_PRIMER_PDF_FIRMA, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(VALIDA_PRIMER_PDF_FIRMA),
                WaitInterrupted5Segundos.esperaConstante5(),
                CloseSecondTab.now()
        );

        if (VALIDA_SEGUNDO_PDF_FIRMA.isVisibleFor(actor))
            actor.attemptsTo(
                    WaitUntil.the(VALIDA_SEGUNDO_PDF_FIRMA, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(VALIDA_SEGUNDO_PDF_FIRMA),
                    WaitInterrupted5Segundos.esperaConstante5(),
                    CloseSecondTab.now()
            );

        actor.attemptsTo(
                WaitUntil.the(BOTON_FIRMAR, isClickable()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_FIRMAR),
                WaitUntil.the(BOTON_ACEPTAR_FIRMADO_ELECTRONICO, isPresent()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_ACEPTAR_FIRMADO_ELECTRONICO),
                WaitUntil.the(BOTON_CONTINUAR_FIRMADO_ELECTRONICO_EXITOSO, isPresent()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_CONTINUAR_FIRMADO_ELECTRONICO_EXITOSO),
                WaitUntil.the(BOTON_RECIBIR_PAGO_TEXTO, isVisible()).forNoMoreThan(50).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_TEXTO),
                Click.on(BOTON_RECIBIR_PAGO_TEXTO)
        );
    }

    public static FlujoFirmaElectronica  FlujoFirma() {
        return new FlujoFirmaElectronica();
    }
}
