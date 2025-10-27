package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioSolicitudMatriculaPersonaNatural;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.LiquidacionSolicitudMatriculaUI.*;
import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MatriculaSoloPersona implements Task {

    private String idNombreCompleto;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String selectDomicilio;
    private String selectTamanoEmpresa;
    private String idValorActivosTres;
    private String idNumeroEmpleados;

    public MatriculaSoloPersona(String idNombreCompleto, String selectTipoIdentificacion, String idNumeroIdentificacion,
                                String selectDomicilio, String selectTamanoEmpresa, String idValorActivosTres,
                                String idNumeroEmpleados) {
        this.idNombreCompleto = idNombreCompleto;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.selectDomicilio = selectDomicilio;
        this.selectTamanoEmpresa = selectTamanoEmpresa;
        this.idValorActivosTres = idValorActivosTres;
        this.idNumeroEmpleados = idNumeroEmpleados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                JavaScriptClick.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_TRAMITES_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_TRAMITES_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                JavaScriptClick.on(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                Switch.toNewWindow(),
                Click.on(BTN_CONTINUAR_MATRICULA),
                WaitInteractions.untilAppears(BTN_MATRICULA_PERSONA_NATURAL_SIN_ESTABLECIMIENTO),
                Click.on(BTN_MATRICULA_PERSONA_NATURAL_SIN_ESTABLECIMIENTO),
                FormularioSolicitudMatriculaPersonaNatural.enConfecamaraSII(idNombreCompleto, selectTipoIdentificacion,
                        idNumeroIdentificacion, selectDomicilio, selectTamanoEmpresa, idValorActivosTres,
                        idNumeroEmpleados),
                Click.on(BTN_LIQUIDAR_MATRICULA)
        );
    }

    public static MatriculaSoloPersona enConfecamaraSII(String idNombreCompleto, String selectTipoIdentificacion, String idNumeroIdentificacion,
                                                        String selectDomicilio, String selectTamanoEmpresa, String idValorActivosTres,
                                                        String idNumeroEmpleados){
        return instrumented(MatriculaSoloPersona.class, idNombreCompleto, selectTipoIdentificacion, idNumeroIdentificacion, selectDomicilio,
                selectTamanoEmpresa, idValorActivosTres, idNumeroEmpleados);
    }
}