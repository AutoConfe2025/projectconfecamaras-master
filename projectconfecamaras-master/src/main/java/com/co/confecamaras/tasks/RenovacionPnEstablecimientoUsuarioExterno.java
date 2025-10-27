package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionPnEstablecimientoUsuarioExterno implements Task {

    private final String idMatricula;
    private final String idNuevosActivos;
    private final String idNuevosActivosDos;
    private final String idNumeroEmpleados;

    public RenovacionPnEstablecimientoUsuarioExterno(String idMatricula, String idNuevosActivos, String idNuevosActivosDos,
                                                     String idNumeroEmpleados) {
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNuevosActivosDos = idNuevosActivosDos;
        this.idNumeroEmpleados = idNumeroEmpleados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_RENOVAR_MATRICULA_MERCANTIL_USUARIO_EXTERNO),
                Click.on(BTN_RENOVAR_MATRICULA_MERCANTIL_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_NUMERO_MATRICULA_MERCANTIL_USUARIO_EXTERNO),
                Enter.theValue(idMatricula).into(TXT_NUMERO_MATRICULA_MERCANTIL_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_CONTINUAR_USUARIO_EXTERNO),
                Scroll.to(BTN_CONTINUAR_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNO),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_USUARIO_EXTERNO),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_USUARIO_EXTERNO),
                Scroll.to(TXT_NUEVOS_ACTIVOS_DOS_USUARIO_EXTERNO).andAlignToBottom(),
                Enter.theValue(idNuevosActivosDos).into(TXT_NUEVOS_ACTIVOS_DOS_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_USUARIO_EXTERNO),
                Scroll.to(TXT_NUMERO_EMPLEADOS_USUARIO_EXTERNO).andAlignToBottom(),
                Enter.theValue(idNumeroEmpleados).into(TXT_NUMERO_EMPLEADOS_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO **************************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_FORMULARIO_USUARIO_EXTERNO),
                Scroll.to(BTN_FORMULARIO_USUARIO_EXTERNO).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_USUARIO_EXTERNO)
        );
    }

    public static RenovacionPnEstablecimientoUsuarioExterno enConfecamaraSII(String idMatricula, String idNuevosActivos, String idNuevosActivosDos,
                                                                             String idNumeroEmpleados){
        return instrumented(RenovacionPnEstablecimientoUsuarioExterno.class, idMatricula, idNuevosActivos, idNuevosActivosDos, idNumeroEmpleados);
    }
}