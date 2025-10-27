package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.CreacionMatriculaCivil;
import com.co.confecamaras.interactions.CreacionMatriculaComercial;
import com.co.confecamaras.interactions.CreacionMatriculaEsadl;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class CreacionManualMatriculas implements Task {

    private String selectOrganizacionComercial;
    private String selectCategoriaComercial;
    private String selectEstadoMatriculaRegistroComercial;
    private String idFechaMatriculaComercial;
    private String selectOrganizacionCivil;
    private String selectCategoriaCivil;
    private String selectEstadoMatriculaRegistroCivil;
    private String idFechaMatriculaCivil;
    private String selectOrganizacionEsadl;
    private String selectCategoriaEsadl;
    private String selectEstadoMatriculaRegistroEsadl;
    private String idFechaMatriculaEsadl;

    public CreacionManualMatriculas(String selectOrganizacionComercial, String selectCategoriaComercial, String selectEstadoMatriculaRegistroComercial,
                                    String idFechaMatriculaComercial, String selectOrganizacionCivil, String selectCategoriaCivil,
                                    String selectEstadoMatriculaRegistroCivil, String idFechaMatriculaCivil, String selectOrganizacionEsadl,
                                    String selectCategoriaEsadl, String selectEstadoMatriculaRegistroEsadl, String idFechaMatriculaEsadl) {
        this.selectOrganizacionComercial = selectOrganizacionComercial;
        this.selectCategoriaComercial = selectCategoriaComercial;
        this.selectEstadoMatriculaRegistroComercial = selectEstadoMatriculaRegistroComercial;
        this.idFechaMatriculaComercial = idFechaMatriculaComercial;
        this.selectOrganizacionCivil = selectOrganizacionCivil;
        this.selectCategoriaCivil = selectCategoriaCivil;
        this.selectEstadoMatriculaRegistroCivil = selectEstadoMatriculaRegistroCivil;
        this.idFechaMatriculaCivil = idFechaMatriculaCivil;
        this.selectOrganizacionEsadl = selectOrganizacionEsadl;
        this.selectCategoriaEsadl = selectCategoriaEsadl;
        this.selectEstadoMatriculaRegistroEsadl = selectEstadoMatriculaRegistroEsadl;
        this.idFechaMatriculaEsadl = idFechaMatriculaEsadl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_CREACION_MATRICULAS),
                Scroll.to(BTN_CREACION_MATRICULAS).andAlignToBottom(),
                JavaScriptClick.on(BTN_CREACION_MATRICULAS),
                Switch.toNewWindow(),
                CreacionMatriculaComercial.enConfecamaraSII(selectOrganizacionComercial, selectCategoriaComercial, selectEstadoMatriculaRegistroComercial,
                        idFechaMatriculaComercial),
                JavaScriptClick.on(BTN_CREACION_MATRICULAS),
                Switch.toNewWindow(),
                CreacionMatriculaCivil.enConfecamaraSII(selectOrganizacionCivil, selectCategoriaCivil, selectEstadoMatriculaRegistroCivil,
                        idFechaMatriculaCivil),
                JavaScriptClick.on(BTN_CREACION_MATRICULAS),
                Switch.toNewWindow(),
                CreacionMatriculaEsadl.enConfecamaraSII(selectOrganizacionEsadl, selectCategoriaEsadl, selectEstadoMatriculaRegistroEsadl,
                        idFechaMatriculaEsadl)
        );
    }

    public static CreacionManualMatriculas enConfecamaraSII(String selectOrganizacionComercial, String selectCategoriaComercial, String selectEstadoMatriculaRegistroComercial,
                                                            String idFechaMatriculaComercial, String selectOrganizacionCivil, String selectCategoriaCivil,
                                                            String selectEstadoMatriculaRegistroCivil, String idFechaMatriculaCivil, String selectOrganizacionEsadl,
                                                            String selectCategoriaEsadl, String selectEstadoMatriculaRegistroEsadl, String idFechaMatriculaEsadl){
        return instrumented(CreacionManualMatriculas.class, selectOrganizacionComercial, selectCategoriaComercial, selectEstadoMatriculaRegistroComercial,
                idFechaMatriculaComercial, selectOrganizacionCivil, selectCategoriaCivil, selectEstadoMatriculaRegistroCivil, idFechaMatriculaCivil,
                selectOrganizacionEsadl, selectCategoriaEsadl, selectEstadoMatriculaRegistroEsadl, idFechaMatriculaEsadl);
    }
}