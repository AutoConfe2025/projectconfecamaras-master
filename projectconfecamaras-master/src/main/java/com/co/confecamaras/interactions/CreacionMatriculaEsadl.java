package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.*;
import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.BTN_OK_CREACION_MATRICULAS;

public class CreacionMatriculaEsadl implements Interaction {

    private String selectOrganizacionEsadl;
    private String selectCategoriaEsadl;
    private String selectEstadoMatriculaRegistroEsadl;
    private String idFechaMatriculaEsadl;

    public CreacionMatriculaEsadl(String selectOrganizacionEsadl, String selectCategoriaEsadl, String selectEstadoMatriculaRegistroEsadl,
                                  String idFechaMatriculaEsadl) {
        this.selectOrganizacionEsadl = selectOrganizacionEsadl;
        this.selectCategoriaEsadl = selectCategoriaEsadl;
        this.selectEstadoMatriculaRegistroEsadl = selectEstadoMatriculaRegistroEsadl;
        this.idFechaMatriculaEsadl = idFechaMatriculaEsadl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_ESADL_CREACION_MATRICULAS),
                Click.on(BTN_ESADL_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_CREACION_MATRICULAS),
                Click.on(BTN_CONTINUAR_CREACION_MATRICULAS),
                /*WaitInteractions.untilDisappears(ESPERA_BARRA),*/
                SelectFromOptions.byVisibleText(selectOrganizacionEsadl).from(SELECT_ORGANIZACION_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectCategoriaEsadl).from(SELECT_CATEGORIA_CREACION_MATRICULAS),
                Click.on(BTN_CREAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectEstadoMatriculaRegistroEsadl).from(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                Enter.theValue(idFechaMatriculaEsadl).into(TXT_FECHA_MATRICULA_CREACION_MATRICULAS),
                Scroll.to(BTN_GRABAR_CREACION_MATRICULAS).andAlignToBottom(),
                Click.on(BTN_GRABAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_OK_CREACION_MATRICULAS),
                Click.on(BTN_OK_CREACION_MATRICULAS)
        );
    }

    public static CreacionMatriculaEsadl enConfecamaraSII(String selectOrganizacionEsadl, String selectCategoriaEsadl, String selectEstadoMatriculaRegistroEsadl,
                                                          String idFechaMatriculaEsadl){
        return new CreacionMatriculaEsadl(selectOrganizacionEsadl, selectCategoriaEsadl, selectEstadoMatriculaRegistroEsadl,
                idFechaMatriculaEsadl);
    }
}