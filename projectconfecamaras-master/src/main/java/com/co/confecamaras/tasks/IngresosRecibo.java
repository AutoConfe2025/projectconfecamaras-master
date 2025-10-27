package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.time.Duration;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.IngresosReciboUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class IngresosRecibo implements Task {

    private String idFechaInicial;
    private String idFechaFinal;

    public IngresosRecibo(String idFechaInicial, String idFechaFinal) {
        this.idFechaInicial = idFechaInicial;
        this.idFechaFinal = idFechaFinal;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_INTEGRACION_ERP_RUES_CFE),
                Scroll.to(BTN_INTEGRACION_ERP_RUES_CFE).andAlignToBottom(),
                JavaScriptClick.on(BTN_INTEGRACION_ERP_RUES_CFE),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_INFORMES),
                Scroll.to(BTN_MANTENIMIENTO_INFORMES).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_INFORMES),
                WaitInteractions.untilAppears(BTN_INGRESOS_RECIBO),
                Scroll.to(BTN_INGRESOS_RECIBO).andAlignToBottom(),
                JavaScriptClick.on(BTN_INGRESOS_RECIBO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(TXT_FECHA_INICIAL_IR),
                Enter.theValue(idFechaInicial).into(TXT_FECHA_INICIAL_IR),
                Enter.theValue(idFechaFinal).into(TXT_FECHA_FINAL_IR),
                Click.on(BTN_GENERAR_IR),
                toAlert(),
                WaitInteractions.untilAppears(BTN_RELACION_MOVIMIENTOS_RECIBO_IR),
                Click.on(BTN_RELACION_MOVIMIENTOS_RECIBO_IR)
        );
    }

    public static IngresosRecibo enConfecamaraSII(String idFechaInicial, String idFechaFinal){
        return instrumented(IngresosRecibo.class, idFechaInicial, idFechaFinal);
    }
}