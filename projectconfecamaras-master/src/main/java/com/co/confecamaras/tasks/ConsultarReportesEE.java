package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ReportesEE.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarReportesEE implements Task {

    private String idNit;

    public ConsultarReportesEE(String idNit) {
        this.idNit = idNit;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_REPORTES_EE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(idNit).into(TXT_NIT_EE),
                Click.on(BTN_CONSULTAR_EE),
                WaitInteractions.untilAppears(BTN_XML_EE),
                Click.on(BTN_XML_EE)
        );
    }
    public static ConsultarReportesEE enConfecamaraSII(String idNit){
        return instrumented(ConsultarReportesEE.class, idNit);
    }
}
