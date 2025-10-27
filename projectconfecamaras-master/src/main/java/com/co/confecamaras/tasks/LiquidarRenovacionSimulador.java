package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.ESPERA_BARRA;
import static com.co.confecamaras.userinterfaces.LiquidarRenovacionSimuladorUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LiquidarRenovacionSimulador implements Task {

    private String idMatricula;
    private String idNuevosActivos;
    private String idNuevosActivosDos;
    private String idNumeroEmpleadosNivelNacional;

    public LiquidarRenovacionSimulador(String idMatricula, String idNuevosActivos, String idNuevosActivosDos,
                                       String idNumeroEmpleadosNivelNacional) {
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
        this.idNumeroEmpleadosNivelNacional = idNumeroEmpleadosNivelNacional;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                JavaScriptClick.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_LIQUIDACION_RENOVACION_SIMULADOR),
                JavaScriptClick.on(BTN_LIQUIDACION_RENOVACION_SIMULADOR),
                WaitInteractions.untilAppears(TXT_MATRICULA_SIMULADOR),
                Enter.theValue(idMatricula).into(TXT_MATRICULA_SIMULADOR),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SIMULADOR),
                Scroll.to(BTN_CONTINUAR_SIMULADOR).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SIMULADOR),
                WaitInteractions.untilAppears(BTN_SIMULAR_RENOVACION_SIMULADOR),
                Click.on(BTN_SIMULAR_RENOVACION_SIMULADOR),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SIMULADOR),
                Scroll.to(BTN_CONTINUAR_SIMULADOR).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SIMULADOR),
                WaitInteractions.untilDisappears(ESPERA_BARRA)
        );
        //*********************************** ACTIVOS *******************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SIMULADOR),
                Scroll.to(TXT_NUEVOS_ACTIVOS_SIMULADOR).andAlignToBottom(),
                Enter.theValue("30000000").into(TXT_NUEVOS_ACTIVOS_SIMULADOR),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SIMULADOR),
                Scroll.to(TXT_NUEVOS_ACTIVOS_DOS_SIMULADOR).andAlignToBottom(),
                Enter.theValue("30000000").into(TXT_NUEVOS_ACTIVOS_DOS_SIMULADOR),
                Scroll.to(TXT_NUMERO_EMPLEADOS_NIVEL_NACIONAL_SIMULADOR).andAlignToBottom(),
                Enter.theValue(idNumeroEmpleadosNivelNacional).into(TXT_NUMERO_EMPLEADOS_NIVEL_NACIONAL_SIMULADOR),
                Scroll.to(BTN_LIQUIDAR_SIMULADOR).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SIMULADOR),
                WaitInteractions.untilAppears(LBL_MENSAJE_LIQUIDAR_RENOVACION_SIMULADOR)
        );
    }

    public static LiquidarRenovacionSimulador enConfecamaraSII(String idMatricula, String idNuevosActivos, String idNuevosActivosDos,
                                                               String idNumeroEmpleadosNivelNacional){
        return instrumented(LiquidarRenovacionSimulador.class, idMatricula, idNuevosActivos, idNuevosActivosDos, idNumeroEmpleadosNivelNacional);
    }
}