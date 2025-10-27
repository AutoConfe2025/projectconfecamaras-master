package com.co.confecamaras.interactions;

import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CreacionManualMatriculasUI.*;

public class CreacionMatriculaComercial implements Interaction {

    private String selectOrganizacionComercial;
    private String selectCategoriaComercial;
    private String selectEstadoMatriculaRegistroComercial;
    private String idFechaMatriculaComercial;

    public CreacionMatriculaComercial(String selectOrganizacionComercial, String selectCategoriaComercial, String selectEstadoMatriculaRegistroComercial,
                                      String idFechaMatriculaComercial) {
        this.selectOrganizacionComercial = selectOrganizacionComercial;
        this.selectCategoriaComercial = selectCategoriaComercial;
        this.selectEstadoMatriculaRegistroComercial = selectEstadoMatriculaRegistroComercial;
        this.idFechaMatriculaComercial = idFechaMatriculaComercial;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_COMERCIAL_CREACION_MATRICULAS),
                Click.on(BTN_COMERCIAL_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_CREACION_MATRICULAS),
                Click.on(BTN_CONTINUAR_CREACION_MATRICULAS),
                /*WaitInteractions.untilDisappears(ESPERA_BARRA),*/
                SelectFromOptions.byVisibleText(selectOrganizacionComercial).from(SELECT_ORGANIZACION_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectCategoriaComercial).from(SELECT_CATEGORIA_CREACION_MATRICULAS),
                Click.on(BTN_CREAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                SelectFromOptions.byVisibleText(selectEstadoMatriculaRegistroComercial).from(SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS),
                Enter.theValue(idFechaMatriculaComercial).into(TXT_FECHA_MATRICULA_CREACION_MATRICULAS),
                Scroll.to(BTN_GRABAR_CREACION_MATRICULAS).andAlignToBottom(),
                Click.on(BTN_GRABAR_CREACION_MATRICULAS),
                WaitInteractions.untilAppears(BTN_OK_CREACION_MATRICULAS),
                Click.on(BTN_OK_CREACION_MATRICULAS),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitInterrupted2Segundos.esperaConstante2()
        );
    }

    public static CreacionMatriculaComercial enConfecamaraSII(String selectOrganizacionComercial, String selectCategoriaComercial, String selectEstadoMatriculaRegistroComercial,
                                                              String idFechaMatriculaComercial){
        return new CreacionMatriculaComercial(selectOrganizacionComercial, selectCategoriaComercial, selectEstadoMatriculaRegistroComercial,
                idFechaMatriculaComercial);
    }
}