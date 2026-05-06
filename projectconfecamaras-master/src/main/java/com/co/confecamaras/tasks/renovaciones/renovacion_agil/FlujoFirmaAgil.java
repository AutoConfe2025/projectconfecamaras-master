package com.co.confecamaras.tasks.renovaciones.renovacion_agil;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoFirmaAgil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_PRIMER_PDF_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_PRIMER_PDF_AGIL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_PDF_AGIL),
                WaitUntil.the(BOTON_SEGUNDO_PDF_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_SEGUNDO_PDF_AGIL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_PDF_AGIL),
                WaitUntil.the(BOTON_SEGUNDO_PDF_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_FIRMAR),
                WaitUntil.the(BOTON_SEGUNDO_PDF_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_SI_ALERTA_FIRMAR),
                WaitUntil.the(BOTON_CERRAR_ALERTA_FIRMAR, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CERRAR_ALERTA_FIRMAR),
                WaitUntil.the(BOTON_PRIMER_PDF_AGIL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_PRIMER_PDF_AGIL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_PDF_AGIL),
                WaitUntil.the(BOGON_PAGAR, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOGON_PAGAR),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOGON_CONTINUAR_PAGO_NO_PRESENCIAL, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOGON_CONTINUAR_PAGO_NO_PRESENCIAL)
        );
    }

    public static FlujoFirmaAgil firmaAgil() {
        return instrumented(FlujoFirmaAgil.class);
    }
}
