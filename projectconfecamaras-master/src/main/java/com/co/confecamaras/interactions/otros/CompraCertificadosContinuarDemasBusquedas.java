package com.co.confecamaras.interactions.otros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertificadosContinuarDemasBusquedas.*;

public class CompraCertificadosContinuarDemasBusquedas implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_B),
                Click.on(BTN_CERTIFICADO_AUTOMATICO),
                Scroll.to(TXT_CANTIDAD_CERTIFICADOS_DE_MATRICULA),
                Enter.theValue("1").into(TXT_CANTIDAD_CERTIFICADOS_DE_MATRICULA),
                Click.on(BTN_CONTINUAR_SOLICITUD)
        );
    }
    public static CompraCertificadosContinuarDemasBusquedas enConfecamaras() {
        return Tasks.instrumented(CompraCertificadosContinuarDemasBusquedas.class);
    }
}
