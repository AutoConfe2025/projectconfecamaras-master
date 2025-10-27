package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.VinculosMatriculasRuesUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class VinculosMatriculasRues implements Task {

    private String selectTipoDocumento;
    private String idNumeroIdentificacion;

    public VinculosMatriculasRues(String selectTipoDocumento, String idNumeroIdentificacion) {
        this.selectTipoDocumento = selectTipoDocumento;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Scroll.to(BTN_CONSULTAS_TRANSACCIONES).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_NACIONALES),
                Scroll.to(BTN_CONSULTAS_REGISTROS_NACIONALES).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONSULTAS_REGISTROS_NACIONALES),
                WaitInteractions.untilAppears(BTN_VINCULOS_MATRICULAS_RUES),
                Scroll.to(BTN_VINCULOS_MATRICULAS_RUES).andAlignToBottom(),
                JavaScriptClick.on(BTN_VINCULOS_MATRICULAS_RUES),
                WaitInteractions.untilAppears(SELECT_TIPO_DOCUMENTOS_VINCULOS_RUES),
                SelectFromOptions.byVisibleText(selectTipoDocumento).from(SELECT_TIPO_DOCUMENTOS_VINCULOS_RUES),
                WaitInteractions.untilAppears(TXT_NUMERO_IDENTIFICACION_VINCULOS_RUES),
                Enter.theValue(idNumeroIdentificacion).into(TXT_NUMERO_IDENTIFICACION_VINCULOS_RUES),
                Click.on(BTN_CONTINUAR_VINCULOS_RUES),
                WaitInteractions.untilAppears(BTN_CAMARA_COMERCIO_MANIZALES_VINCULOS_RUES),
                Click.on(BTN_CAMARA_COMERCIO_MANIZALES_VINCULOS_RUES)
        );
    }

    public static VinculosMatriculasRues enConfecamaraSII(String selectTipoDocumento, String idNumeroIdentificacion){
        return instrumented(VinculosMatriculasRues.class, selectTipoDocumento, idNumeroIdentificacion);
    }
}