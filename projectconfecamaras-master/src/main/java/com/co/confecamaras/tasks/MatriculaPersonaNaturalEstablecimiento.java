package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioSolicitudMatricula;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MatriculaPersonaNaturalEstablecimiento implements Task {

    private String idNombreCompleto;
    private String idTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idDomicilio;
    private String idTamanoEmpresa;
    private String idValorActivos;
    private String idNumeroEmpleados;
    private String idBotonBeneficiario;
    private String idNombreEstablecimiento;
    private String idValorActivosDos;
    private String idDomicilioEstablecimiento;

    public MatriculaPersonaNaturalEstablecimiento(String idNombreCompleto, String idTipoIdentificacion, String idNumeroIdentificacion,
                                                  String idDomicilio, String idTamanoEmpresa, String idValorActivos, String idNumeroEmpleados,
                                                  String idBotonBeneficiario, String idNombreEstablecimiento, String idValorActivosDos,
                                                  String idDomicilioEstablecimiento) {
        this.idNombreCompleto = idNombreCompleto;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idDomicilio = idDomicilio;
        this.idTamanoEmpresa = idTamanoEmpresa;
        this.idValorActivos = idValorActivos;
        this.idNumeroEmpleados = idNumeroEmpleados;
        this.idBotonBeneficiario = idBotonBeneficiario;
        this.idNombreEstablecimiento = idNombreEstablecimiento;
        this.idValorActivosDos = idValorActivosDos;
        this.idDomicilioEstablecimiento = idDomicilioEstablecimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_TRAMITES_REGISTROS_PUBLICOS),
                Click.on(BTN_TRAMITES_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                Click.on(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(BTN_CONTINUAR_MATRICULA),
                Click.on(BTN_MATRICULA_PERSONA_NATURAL_CON_ESTABLECIMIENTO_DE_COMERCIO),
                FormularioSolicitudMatricula.enConfecamaraSII(TXT_NOMBRE_COMPLETO_RAZON_SOCIAL_MATRICULA, idNombreCompleto, SELECT_TIPO_IDENTIFICACION_MATRICULA, idTipoIdentificacion,
                        TXT_TIPO_IDENTIFICACION_MATRICULA, idNumeroIdentificacion, SELECT_DOMICILIO_MATRICULA, idDomicilio, SELECT_TAMANO_EMPRESA_MATRICULA, idTamanoEmpresa,
                        TXT_VALOR_ACTIVOS_MATRICULA, idValorActivos, TXT_NUMERO_EMPLEADOS_MATRICULA, idNumeroEmpleados, SELECT_BTN_BENEFICIARIO_MATRICULA, idBotonBeneficiario,
                        TXT_NOMBRE_ESTABLECIMIENTO_MATRICULA, idNombreEstablecimiento, TXT_VALORES_ACTIVOS_DOS_MATRICULA, idValorActivosDos, SELECT_DOMICILIO_ESTABLECIMIENTO_MATRICULA,
                        idDomicilioEstablecimiento),
                Click.on(BTN_LIQUIDAR_MATRICULA)
        );
    }

    public static MatriculaPersonaNaturalEstablecimiento enConfecamaraSII(String idNombreCompleto, String idTipoIdentificacion, String idNumeroIdentificacion,
                                                                          String idDomicilio, String idTamanoEmpresa, String idValorActivos, String idNumeroEmpleados,
                                                                          String idBotonBeneficiario, String idNombreEstablecimiento, String idValorActivosDos,
                                                                          String idDomicilioEstablecimiento){
        return instrumented(MatriculaPersonaNaturalEstablecimiento.class, idNombreCompleto, idTipoIdentificacion, idNumeroIdentificacion,
                idDomicilio, idTamanoEmpresa, idValorActivos, idNumeroEmpleados, idBotonBeneficiario, idNombreEstablecimiento, idValorActivosDos,
                idDomicilioEstablecimiento);
    }
}