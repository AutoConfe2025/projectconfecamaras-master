package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.DesafiliacionMasivaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DesafiliacionMasiva implements Task {

    private final String idDesafiliacion;

    public DesafiliacionMasiva(String idDesafiliacion) {
        this.idDesafiliacion = idDesafiliacion;
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
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                Scroll.to(BTN_PROCESOS_SIPREF_GOBERNABILIDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_PROCESOS_SIPREF_GOBERNABILIDAD),
                WaitInteractions.untilAppears(BTN_DESAFILIACION_MASIVA),
                Scroll.to(BTN_DESAFILIACION_MASIVA).andAlignToBottom(),
                JavaScriptClick.on(BTN_DESAFILIACION_MASIVA),
                Switch.toNewWindow()
        );
        if(actor.asksFor(ElementoElegible.para(TXTO_DESAFILIACION_MASIVA))){
            actor.attemptsTo(
                    Ensure.that(TXTO_DESAFILIACION_MASIVA).text().isEqualTo("Aún no se ha cumplido el plazo para ejecutar la desafiliación masiva, imposible ejecutar el proceso. Este se puede ejeuctar pasado el 2025-03-31")
            );
        }else {
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_SELECCIONAR_DM),
                    Click.on(BTN_SELECCIONAR_DM),
                    WaitInteractions.untilAppears(BTN_DESAFILIAR_DM),
                    DoubleClick.on(BTN_DESAFILIAR_DM),
                    WaitInteractions.untilAppears(BTN_APLICAR_DM),
                    Click.on(BTN_APLICAR_DM),
                    Clear.field(TXT_APLICAR_DM),
                    Enter.theValue(idDesafiliacion).into(TXT_APLICAR_DM),
                    WaitInteractions.untilAppears(BTN_APLICAR_DOS_DM),
                    Click.on(BTN_APLICAR_DOS_DM),
                    Clear.field(TXT_APLICAR_DOS_DM),
                    Enter.theValue(idDesafiliacion).into(TXT_APLICAR_DOS_DM),
                    WaitInteractions.untilAppears(BTN_APLICAR_DESAFILIACION_DM),
                    Click.on(BTN_APLICAR_DESAFILIACION_DM),
                    toAlert()
                    //WaitInteractions.untilAppears(BTN_EXTACCION_EXCEL_DM),
                    //Click.on(BTN_EXTACCION_EXCEL_DM),
                    //WaitInteractions.untilDisappears(ESPERA_DM),
            );
        }
    }

    public static DesafiliacionMasiva enConfecamaraSII(String idDesafiliacion) {
        return instrumented(DesafiliacionMasiva.class, idDesafiliacion);
    }
}