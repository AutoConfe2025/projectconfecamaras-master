package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;

public class FormularioSolicitudMatriculaPersonaNatural implements Interaction {

    private String idNombreCompleto;
    private String selectTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String selectDomicilio;
    private String selectTamanoEmpresa;
    private String idValorActivosTres;
    private String idNumeroEmpleados;

    public FormularioSolicitudMatriculaPersonaNatural(String idNombreCompleto, String selectTipoIdentificacion, String idNumeroIdentificacion,
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
                WaitInteractions.untilAppears(TXT_NOMBRE_COMPLETO_RAZON_SOCIAL_MATRICULA),
                Enter.theValue(idNombreCompleto).into(TXT_NOMBRE_COMPLETO_RAZON_SOCIAL_MATRICULA),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_DOS_MATRICULA),
                Enter.theValue(idNumeroIdentificacion).into(TXT_TIPO_IDENTIFICACION_MATRICULA),
                SelectFromOptions.byVisibleText(selectDomicilio).from(SELECT_DOMICILIO_DOS_MATRICULA),
                SelectFromOptions.byVisibleText(selectTamanoEmpresa).from(SELECT_TAMANO_EMPRESA_DOS_MATRICULA),
                Enter.theValue(idValorActivosTres).into(TXT_VALOR_ACTIVOS_MATRICULA),
                Enter.theValue(idNumeroEmpleados).into(TXT_NUMERO_EMPLEADOS_MATRICULA),
                Scroll.to(BTN_NO_SOY_BENEFICIARIO_MATRICULA).andAlignToBottom(),
                Click.on(BTN_NO_SOY_BENEFICIARIO_MATRICULA)
        );
    }

    public static FormularioSolicitudMatriculaPersonaNatural enConfecamaraSII(String idNombreCompleto, String selectTipoIdentificacion, String idNumeroIdentificacion,
                                                                              String selectDomicilio, String selectTamanoEmpresa, String idValorActivosTres,
                                                                              String idNumeroEmpleados){
        return new FormularioSolicitudMatriculaPersonaNatural(idNombreCompleto, selectTipoIdentificacion, idNumeroIdentificacion, selectDomicilio, selectTamanoEmpresa,
                idValorActivosTres, idNumeroEmpleados);
    }
}