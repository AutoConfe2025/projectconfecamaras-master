package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.AnulacionRecibosCajaUI.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;

public class AnulacionRecibosCaja implements Task {

    private final String idRecibo;
    private final String selectMotivos;
    private final String idObsevacionesAnulacion;

    public AnulacionRecibosCaja(String idRecibo, String selectMotivos, String idObsevacionesAnulacion) {
        this.idRecibo = idRecibo;
        this.selectMotivos = selectMotivos;
        this.idObsevacionesAnulacion = idObsevacionesAnulacion;
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_ANULACION_RECIBOS_CAJA),
                Scroll.to(BTN_ANULACION_RECIBOS_CAJA).andAlignToBottom(),
                Click.on(BTN_ANULACION_RECIBOS_CAJA),
                Switch.toNewWindow(),
                Enter.theValue(idRecibo).into(TXT_NUMERO_RECIBO_ANULACION),
                WaitInteractions.untilAppears(BTN_RECUPERAR_RECIBO_UNO_ANULACION),
                Click.on(BTN_RECUPERAR_RECIBO_UNO_ANULACION),
                WaitInteractions.untilAppears(SELECT_MOTIVO_ANULACION),
                SelectFromOptions.byVisibleText(selectMotivos).from(SELECT_MOTIVO_ANULACION),
                Enter.theValue(idObsevacionesAnulacion).into(TXT_OBSERVACIONES_ANULACION_ANULACION),
                Click.on(BTN_RECUPERAR_RECIBO_DOS_ANULACION),
                toAlert(),
                WaitInteractions.untilAppears(BTN_REVERSION_NORMAL_ANULACION),
                Scroll.to(BTN_REVERSION_NORMAL_ANULACION).andAlignToBottom(),
                Click.on(BTN_REVERSION_NORMAL_ANULACION),
                toAlert()
        );
    }

    public static AnulacionRecibosCaja enConfecamaraSII(String idRecibo, String selectMotivos, String idObsevacionesAnulacion){
        return Tasks.instrumented(AnulacionRecibosCaja.class, idRecibo, selectMotivos, idObsevacionesAnulacion);
    }
}