package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MaestroDevolucionesUI.*;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroDevoluciones implements Task {

    private String selectTipoMotivo;
    private String selectTipoMotivoDos;

    public MaestroDevoluciones(String selectTipoMotivo, String selectTipoMotivoDos) {
        this.selectTipoMotivo = selectTipoMotivo;
        this.selectTipoMotivoDos = selectTipoMotivoDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               //WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                //ModalLoader.modalLoader(),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_MAESTRO_DEVOLUCIONES),
                Scroll.to(BTN_MAESTRO_DEVOLUCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_MAESTRO_DEVOLUCIONES),
                Switch.toNewWindow(),
                Switch.toFrame(0),
                WaitInteractions.untilAppears(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Click.on(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Switch.toParentFrame(),
                Switch.toFrame(1),
                SelectFromOptions.byVisibleText(selectTipoMotivo).from(SELECT_TIPO_MOTIVO_DEVOLUCIONES),
                Click.on(BTN_GRABAR_DEVOLUCIONES),
                Switch.toParentFrame(),
                Switch.toFrame(0),
                WaitInteractions.untilAppears(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Click.on(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Switch.toParentFrame(),
                Switch.toFrame(1),
                Ensure.that(SELECT_TIPO_MOTIVO_DEVOLUCIONES).text().contains(TIPO_MOTIVO),
                SelectFromOptions.byVisibleText(selectTipoMotivoDos).from(SELECT_TIPO_MOTIVO_DEVOLUCIONES),
                Click.on(BTN_GRABAR_DEVOLUCIONES),
                Switch.toParentFrame(),
                Switch.toFrame(0),
                WaitInteractions.untilAppears(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Click.on(BTN_EDITAR_MOTIVOS_DEVOLUCIONES),
                Switch.toParentFrame(),
                Switch.toFrame(1)
        );
    }

    public static MaestroDevoluciones enConfecamaraSII(String selectTipoMotivo, String selectTipoMotivoDos) {
        return instrumented(MaestroDevoluciones.class, selectTipoMotivo, selectTipoMotivoDos);
    }
}