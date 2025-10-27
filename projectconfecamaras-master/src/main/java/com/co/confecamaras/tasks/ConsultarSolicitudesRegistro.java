package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.SolicitudesRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarSolicitudesRegistro implements Task {

    private String idFechaInicial;
    private String idFechaFinal;

    public ConsultarSolicitudesRegistro(String idFechaInicial, String idFechaFinal) {
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_SOLICITUD_REGISTRO),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(TXT_FECHA_INICIAL_SOLICITUDES),
                Enter.theValue(idFechaInicial).into(TXT_FECHA_INICIAL_SOLICITUDES),
                Enter.theValue(idFechaFinal).into(TXT_FECHA_FINAL_SOLICITUDES),
                Click.on(BTN_CONTINUAR_SOLICITUDES),
                WaitInterrupted3Segundos.esperaConstante3()
        );
    }

    public static ConsultarSolicitudesRegistro enConfecamaraSII(String idFechaInicial, String idFechaFinal) {
        return instrumented(ConsultarSolicitudesRegistro.class, idFechaInicial, idFechaFinal);
    }
}