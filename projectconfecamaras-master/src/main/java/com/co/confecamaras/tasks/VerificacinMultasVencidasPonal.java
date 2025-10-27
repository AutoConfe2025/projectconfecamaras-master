package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.ESPERA_BARRA;
import static com.co.confecamaras.userinterfaces.VerificacionMultasVencidasPonalUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class VerificacinMultasVencidasPonal implements Task {

    private String idTipoIdentificacion;
    private String idIdentificacion;

    public VerificacinMultasVencidasPonal(String idTipoIdentificacion, String idIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                Scroll.to(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS),
                WaitInteractions.untilAppears(BTN_VERIFICACION_MULTAS_VENCIDAS_PONAL),
                Scroll.to(BTN_VERIFICACION_MULTAS_VENCIDAS_PONAL).andAlignToBottom(),
                JavaScriptClick.on(BTN_VERIFICACION_MULTAS_VENCIDAS_PONAL),
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_VERIFICACION_MULTAS),
                SelectFromOptions.byVisibleText(idTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_VERIFICACION_MULTAS),
                Enter.theValue(idIdentificacion).into(TXT_IDENTIFICACION_VERIFICACION_MULTAS),
                Click.on(BTN_CONTINUAR_VERIFICACION_MULTAS),
                WaitInteractions.untilDisappears(ESPERA_BARRA)
        );
    }

    public static VerificacinMultasVencidasPonal enConfecamaraSII(String idTipoIdentificacion, String idIdentificacion){
        return instrumented(VerificacinMultasVencidasPonal.class, idTipoIdentificacion, idIdentificacion);
    }
}