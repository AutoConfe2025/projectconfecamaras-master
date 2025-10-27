package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.OpcionMisTramitesUsuarioExternoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionMisTramitesUsuarioExterno implements Task {

    private final String idMatricula;
    private final String idTelefono;

    public OpcionMisTramitesUsuarioExterno(String idMatricula, String idTelefono) {
        this.idMatricula = idMatricula;
        this.idTelefono = idTelefono;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitInteractions.untilDisappears(ESPERA),
                /*WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),*/
                WaitInteractions.untilAppears(BTN_TRAMITES_CONSULTAS_EXPEDIENTE_MIS_TRAMITES_UE),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_TRAMITES_CONSULTAS_EXPEDIENTE_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(TXT_MATRICULA_MIS_TRAMITES_UE),
                Enter.theValue(idMatricula).into(TXT_MATRICULA_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_CONSULTAR_MIS_TRAMITES_UE),
                Click.on(BTN_CONSULTAR_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES_UE),
                Click.on(BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_ESADL_MIS_TRAMITES_UE),
                Click.on(BTN_OPERACIONES_MERCANTIL_ESADL_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_DATOS_MIS_TRAMITES_UE),
                Click.on(BTN_ACTUALIZACION_DATOS_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(CHK_BOX_UBICACION_COMERCIAL_MIS_TRAMITES_UE),
                Click.on(CHK_BOX_UBICACION_COMERCIAL_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_MIS_TRAMITES_UE),
                Click.on(BTN_CONTINUAR_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(TXT_TELEFONO_MIS_TRAMITES_UE),
                Enter.theValue(idTelefono).into(TXT_TELEFONO_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_MIS_TRAMITES_UE),
                Scroll.to(BTN_CONTINUAR_DOS_MIS_TRAMITES_UE).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DOS_MIS_TRAMITES_UE),
                WaitConstantTwo.esperaConstante(),
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitInteractions.untilAppears(BTN_VOLVER_MIS_TRAMITES_UE),
                Scroll.to(BTN_VOLVER_MIS_TRAMITES_UE).andAlignToBottom(),
                JavaScriptClick.on(BTN_VOLVER_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_MIS_TRAMITES_UE),
                Click.on(BTN_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_BUSCAR_MIS_TRAMITES_UE),
                Click.on(BTN_BUSCAR_MIS_TRAMITES_UE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRAMITE_UE),
                Click.on(BTN_CONTINUAR_TRAMITE_UE),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_MIS_TRAMITES_UE),
                Scroll.to(BTN_CONTINUAR_TRES_MIS_TRAMITES_UE).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_TRES_MIS_TRAMITES_UE),
                WaitConstant.esperaConstante(),
                WaitInteractions.untilAppears(LBL_OPCION_MIS_TRAMITES_UE),
                Scroll.to(LBL_OPCION_MIS_TRAMITES_UE).andAlignToBottom()
        );
        //try {Thread.sleep(10000);} catch (InterruptedException e){throw new RuntimeException(e);}
    }

    public static OpcionMisTramitesUsuarioExterno enConfecamaraSII(String idMatricula, String idTelefono){
        return instrumented(OpcionMisTramitesUsuarioExterno.class, idMatricula, idTelefono);
    }
}