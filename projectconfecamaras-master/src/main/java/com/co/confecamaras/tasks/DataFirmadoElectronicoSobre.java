package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.FirmadoUI.*;
import static net.serenitybdd.screenplay.Tasks.*;
import static com.co.confecamaras.models.VariableFirmadoElectronicoSobre.*;

public class DataFirmadoElectronicoSobre implements Task {

    private final String idMatricula;
    private final String idCelular;

    public DataFirmadoElectronicoSobre(String idMatricula, String idCelular) {
        this.idMatricula = idMatricula;
        this.idCelular = idCelular;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_TRAMITES_CONSULTAS_EXPEDIENTE_FIRMADO),
                Click.on(BTN_TRAMITES_CONSULTAS_EXPEDIENTE_FIRMADO),
                WaitInteractions.untilAppears(TXT_MATRICULA_FIRMADO),
                Enter.theValue(idMatricula).into(TXT_MATRICULA_FIRMADO),
                WaitInteractions.untilAppears(BTN_CONSULTAR_FIRMADO),
                Scroll.to(BTN_CONSULTAR_FIRMADO),
                Click.on(BTN_CONSULTAR_FIRMADO),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_DISPONIBLES_FIRMADO),
                Click.on(BTN_ACCIONES_DISPONIBLES_FIRMADO),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_ESADL_FIRMADO),

                Click.on(BTN_OPERACIONES_MERCANTIL_ESADL_FIRMADO),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_DATOS_MUTACION_FIRMADO),

                Click.on(BTN_ACTUALIZACION_DATOS_MUTACION_FIRMADO),
                WaitInteractions.untilAppears(CHK_BOX_UBICACION_COMERCIAL_FIRMADO),

                Click.on(CHK_BOX_UBICACION_COMERCIAL_FIRMADO),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_CONTINUAR_FIRMADO),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONTINUAR_FIRMADO),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(TXT_CELULAR_FIRMADO),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue(idCelular).into(TXT_CELULAR_FIRMADO),

                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_FIRMADO),
                WaitInterrupted3Segundos.esperaConstante3(),
                Scroll.to(BTN_CONTINUAR_DOS_FIRMADO).andAlignToBottom(),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONTINUAR_DOS_FIRMADO),
                WaitConstant.esperaConstante()
        );
        String numRecuperacion = LBL_NUM_RECUPERACION_FIRMADO.resolveFor(actor).getText();
        System.out.println(numRecuperacion);
        setNumRecuperacion(numRecuperacion);
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_HOME_FIRMADO),
                Click.on(BTN_HOME_FIRMADO)
        );
    }

    public static DataFirmadoElectronicoSobre enConfecamaraSII(String idMatricula, String idCelular) {
        return instrumented(DataFirmadoElectronicoSobre.class, idMatricula, idCelular);
    }
}