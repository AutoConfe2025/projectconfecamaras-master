package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.ESPERA;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionMatriculaActividadNoComercial implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String idNuevosActivos;
    private final String idNuevosActivosDos;
    private final String idNroEmpleados;

    public RenovacionMatriculaActividadNoComercial(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                   String idNuevosActivosDos, String idNroEmpleados) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
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
        );

        //********************* NUEVOS ACTIVOS ************************************************/

        if(actor.asksFor(ElementoElegible.para(BTN_OK_DOS_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_OK_DOS_SOCIEDAD),
                    Click.on(BTN_OK_DOS_SOCIEDAD),
                    WaitInteractions.untilAppears(BTN_OK_SOCIEDAD),
                    Click.on(BTN_OK_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD)
        );
        if(actor.asksFor(ElementoElegible.para(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNroEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD),
                WaitInteractions.untilAppears(LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_ACTIVIDAD_NO_COMERCIAL),
                Scroll.to(LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_ACTIVIDAD_NO_COMERCIAL).andAlignToBottom()
        );
    }

    public static RenovacionMatriculaActividadNoComercial enConfecamarasSII(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                                            String idNuevosActivosDos, String idNroEmpleados) {
        return instrumented(RenovacionMatriculaActividadNoComercial.class, selectConsultaPor, idMatricula, idNuevosActivos, idNuevosActivosDos, idNroEmpleados);
    }
}