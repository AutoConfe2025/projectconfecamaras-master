package com.co.confecamaras.interactions;

import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.*;
import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.BTN_OK_CREACION_MATRICULAS;

public class CreacionMatriculaCivil implements Interaction {

    private String selectOrganizacionCivil;
    private String selectCategoriaCivil;
    private String selectEstadoMatriculaRegistroCivil;
    private String idFechaMatriculaCivil;

    public CreacionMatriculaCivil(String selectOrganizacionCivil, String selectCategoriaCivil, String selectEstadoMatriculaRegistroCivil,
                                  String idFechaMatriculaCivil) {
        this.selectOrganizacionCivil = selectOrganizacionCivil;
        this.selectCategoriaCivil = selectCategoriaCivil;
        this.selectEstadoMatriculaRegistroCivil = selectEstadoMatriculaRegistroCivil;
        this.idFechaMatriculaCivil = idFechaMatriculaCivil;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CIVIL_CREACION_MATRICULAS),
                Click.on(BTN_CIVIL_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_CREACION_MATRICULAS),
                Click.on(BTN_CONTINUAR_CREACION_MATRICULAS),
                /*WaitInteractions.untilDisappears(ESPERA_BARRA),*/
                SelectFromOptions.byVisibleText(selectOrganizacionCivil).from(SELECT_ORGANIZACION_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectCategoriaCivil).from(SELECT_CATEGORIA_CREACION_MATRICULAS),
                Click.on(BTN_CREAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectEstadoMatriculaRegistroCivil).from(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                Enter.theValue(idFechaMatriculaCivil).into(TXT_FECHA_MATRICULA_CREACION_MATRICULAS),
                Scroll.to(BTN_GRABAR_CREACION_MATRICULAS).andAlignToBottom(),
                Click.on(BTN_GRABAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_OK_CREACION_MATRICULAS),
                Click.on(BTN_OK_CREACION_MATRICULAS),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInterrupted2Segundos.esperaConstante2()
        );
    }

    public static CreacionMatriculaCivil enConfecamaraSII(String selectOrganizacionCivil, String selectCategoriaCivil, String selectEstadoMatriculaRegistroCivil,
                                                          String idFechaMatriculaCivil){
        return new CreacionMatriculaCivil(selectOrganizacionCivil, selectCategoriaCivil, selectEstadoMatriculaRegistroCivil, idFechaMatriculaCivil);
    }
}