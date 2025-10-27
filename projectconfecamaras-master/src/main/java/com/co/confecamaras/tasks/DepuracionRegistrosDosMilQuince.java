package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.DepuracionRegistrosDosMilQuinceUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DepuracionRegistrosDosMilQuince implements Task {

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                Scroll.to(BTN_PROCESOS_SIPREF_GOBERNABILIDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                WaitInteractions.untilAppears(BTN_DEPURACION_REGISTROS),
                Scroll.to(BTN_DEPURACION_REGISTROS).andAlignToBottom(),
                JavaScriptClick.on(BTN_DEPURACION_REGISTROS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_NO_INCLUIR_DEPURACION),
                Click.on(BTN_NO_INCLUIR_DEPURACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_SIGUIENTE_DEPURACION),
                Scroll.to(BTN_SIGUIENTE_DEPURACION).andAlignToBottom(),
                Click.on(BTN_SIGUIENTE_DEPURACION),
                WaitInteractions.untilAppears(BTN_NO_INCLUIR_DEPURACION),
                Click.on(BTN_NO_INCLUIR_DEPURACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EXCEL_DEPURACION),
                Scroll.to(BTN_EXCEL_DEPURACION).andAlignToBottom(),
                Click.on(BTN_EXCEL_DEPURACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EXCEL_EXCLUIDOS_DEPURACION),
                Scroll.to(BTN_EXCEL_EXCLUIDOS_DEPURACION).andAlignToBottom(),
                Click.on(BTN_EXCEL_EXCLUIDOS_DEPURACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_INICIO_DEPURACION),
                Scroll.to(BTN_INICIO_DEPURACION).andAlignToBottom(),
                Click.on(BTN_INICIO_DEPURACION)
        );
    }

    public static DepuracionRegistrosDosMilQuince enConfecamaraSII() {
        return instrumented(DepuracionRegistrosDosMilQuince.class);
    }
}