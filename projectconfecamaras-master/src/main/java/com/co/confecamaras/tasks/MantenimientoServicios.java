package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MantenimientoServiciosUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MantenimientoServicios implements Task {

    private String idDuplicarDesde;

    public MantenimientoServicios(String idDuplicarDesde) {
        this.idDuplicarDesde = idDuplicarDesde;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_SERVICIOS),
                Scroll.to(BTN_SERVICIOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_SERVICIOS),
                Switch.toNewWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BTN_EDITAR_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilBeEnable(TXT_NOMBRE_CORTO),
                Clear.field(TXT_NOMBRE_CORTO),
                Enter.theValue("QA-AUTO").into(TXT_NOMBRE_CORTO),
                Scroll.to(BTN_GRABAR_MANTENIMIENTO_SERVICIOS).andAlignToBottom(),
                Click.on(BTN_GRABAR_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_NIIF_MANTENIMIENTO_SERVICIOS),
                Scroll.to(BTN_EDITAR_CONTADO_MANTENIMIENTO_SERVICIOS).andAlignToBottom(),
                Click.on(BTN_EDITAR_CONTADO_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_CREDITO_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilBeEnable(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_CHEQUE_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_TDEBITO_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_TCREDITO_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_DEVOL_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_RUES_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_PRES_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_EDITAR_OTROS_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilAppears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                JavaScriptClick.on(BTN_GRABAR_TRES_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_DUPLICAR_PARAMETRIZACION_MANTENIMIENTO_SERVICIOS),
                SelectFromOptions.byVisibleText(idDuplicarDesde).from(SELECT_DUPLICAR_DESDE_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_DUPLICAR_MANTENIMIENTO_SERVICIOS),
                WaitInteractions.untilDisappears(ESPERA_MODAL_MANTENIMIENTO_SERVICIOS),
                Click.on(BTN_REGRESAR_MANTENIMIENTO_SERVICIOS)
        );
    }

    public static MantenimientoServicios enConfecamaraSII(String idDuplicarDesde){
        return instrumented(MantenimientoServicios.class, idDuplicarDesde);
    }
}