package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RecibirPagoUI.BTN_POP_UP_ATENCION_CERRAR;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionMatriculaPJEstadoInactivo implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String idNuevosActivos;
    private final String idNuevosActivosDos;
    private final String idNuevosActivosTres;
    private final String idNuevosActivosCuatro;
    private final String idNuevosActivosCinco;
    private final String idNuevosActivosSeis;
    private final String idNroEmpleados;

    public RenovacionMatriculaPJEstadoInactivo(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                               String idNuevosActivosDos, String idNuevosActivosTres,
                                               String idNuevosActivosCuatro, String idNuevosActivosCinco,
                                               String idNuevosActivosSeis, String idNroEmpleados) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
        this.idNuevosActivosTres = idNuevosActivosTres;
        this.idNuevosActivosCuatro = idNuevosActivosCuatro;
        this.idNuevosActivosCinco = idNuevosActivosCinco;
        this.idNuevosActivosSeis = idNuevosActivosSeis;
        this.idNroEmpleados = idNroEmpleados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                Click.on(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOCIEDAD),
                Scroll.to(BTN_CONTINUAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SOCIEDAD),
                ModalLoader.modalLoader()
                //WaitInteractions.untilAppears(BTN_OK_SOCIEDAD),
                //Click.on(BTN_OK_SOCIEDAD)
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_TRES_SOCIEDAD),
                Enter.theValue(idNuevosActivosTres).into(TXT_NUEVOS_ACTIVOS_TRES_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_CINCO_SOCIEDAD),
                Enter.theValue(idNuevosActivosCinco).into(TXT_NUEVOS_ACTIVOS_CINCO_SOCIEDAD)

        );
        if(actor.asksFor(ElementoElegible.para(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Enter.theValue(idNuevosActivosDos).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_CUATRO_SOCIEDAD),
                    Enter.theValue(idNuevosActivosCuatro).into(TXT_NUEVOS_ACTIVOS_CUATRO_SOCIEDAD),
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SEIS_SOCIEDAD),
                    Enter.theValue(idNuevosActivosSeis).into(TXT_NUEVOS_ACTIVOS_SEIS_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNroEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD),
                WaitInteractions.untilAppears(LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_PN_ESTADO_INACTIVO),
                Scroll.to(LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_PN_ESTADO_INACTIVO).andAlignToBottom()
        );
    }

    public static RenovacionMatriculaPJEstadoInactivo enConfecamarasSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                                        String idNuevosActivosDos, String idNuevosActivosTres,
                                                                        String idNuevosActivosCuatro, String idNuevosActivosCinco,
                                                                        String idNuevosActivosSeis, String idNroEmpleados) {
        return instrumented(RenovacionMatriculaPJEstadoInactivo.class, selectConsultaPor, idMatricula, idNuevosActivos, idNuevosActivosDos,
                idNuevosActivosTres, idNuevosActivosCuatro, idNuevosActivosCinco, idNuevosActivosSeis, idNroEmpleados);
    }
}