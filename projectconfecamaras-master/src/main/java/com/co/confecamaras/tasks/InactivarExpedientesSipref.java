package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.InactivarExpedientesSiprefUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class InactivarExpedientesSipref implements Task {

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                Scroll.to(BTN_PROCESOS_SIPREF_GOBERNABILIDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                WaitInteractions.untilAppears(BTN_INACTIVAR_EXPEDIENTES_SIPREF),
                Scroll.to(BTN_INACTIVAR_EXPEDIENTES_SIPREF).andAlignToBottom(),
                JavaScriptClick.on(BTN_INACTIVAR_EXPEDIENTES_SIPREF),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_INACTIVAR_SIPREF),
                Click.on(BTN_INACTIVAR_SIPREF),
                WaitInteractions.untilAppears(BTN_CONTINUAR_EJECUTAR_PROCESO),
                //toAlert()
                Click.on(BTN_CONTINUAR_EJECUTAR_PROCESO)
        );
    }

    public static InactivarExpedientesSipref enConfecamaraSII(){
        return instrumented(InactivarExpedientesSipref.class);
    }
}