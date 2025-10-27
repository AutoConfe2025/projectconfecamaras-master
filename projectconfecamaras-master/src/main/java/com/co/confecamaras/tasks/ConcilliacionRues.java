package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ConciliacionRuesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConcilliacionRues implements Task {

    private final String idFecha;

    public ConcilliacionRues(String idFecha) {
        this.idFecha = idFecha;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_INTEGRACION_ERP_RUES_CFE),
                Scroll.to(BTN_INTEGRACION_ERP_RUES_CFE).andAlignToBottom(),
                JavaScriptClick.on(BTN_INTEGRACION_ERP_RUES_CFE),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_INFORMES),
                Scroll.to(BTN_MANTENIMIENTO_INFORMES).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_INFORMES),
                WaitInteractions.untilAppears(BTN_CONCILIACION_RUES),
                Scroll.to(BTN_CONCILIACION_RUES).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONCILIACION_RUES),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_FECHA_CONCILIACION),
                Enter.theValue(idFecha).into(TXT_FECHA_CONCILIACION),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONSULTAR_CONCILIACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EXCEL_RECEPTORA_CONCILIACION),
                Scroll.to(BTN_EXCEL_RECEPTORA_CONCILIACION).andAlignToBottom(),
                Click.on(BTN_EXCEL_RECEPTORA_CONCILIACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EXCEL_RESPONSABLE_CONCILIACION),
                Scroll.to(BTN_EXCEL_RESPONSABLE_CONCILIACION).andAlignToBottom(),
                Click.on(BTN_EXCEL_RESPONSABLE_CONCILIACION),
                toAlert()
        );
    }

    public static ConcilliacionRues enConfecamaraSII(String idFecha){
        return instrumented(ConcilliacionRues.class, idFecha);
    }
}
