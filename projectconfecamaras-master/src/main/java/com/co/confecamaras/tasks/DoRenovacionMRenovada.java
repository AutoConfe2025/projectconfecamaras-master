package com.co.confecamaras.tasks;


import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RenovacionPNRenov;
import com.co.confecamaras.userinterfaces.RenovacionPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.PERSONAL_OCUPADO_TXT;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.*;

public class DoRenovacionMRenovada implements Task {

    private final String consulta;
    private final String num;
    private final String activosUno;
    private final String activosDos;
    private final String numEmpleados;
    private final String activosCorrientes;
    private final String patrimonioNeto;
    private final String actividadOrdinaria;
    private final String identificacion;
    private final String correo;

    public DoRenovacionMRenovada(String consulta, String num, String activosUno, String activosDos, String numEmpleados,
                                 String activosCorrientes, String patrimonioNeto, String actividadOrdinaria,
                                 String identificacion, String correo) {
        this.consulta = consulta;
        this.num = num;
        this.activosUno = activosUno;
        this.activosDos = activosDos;
        this.numEmpleados = numEmpleados;
        this.activosCorrientes = activosCorrientes;
        this.patrimonioNeto = patrimonioNeto;
        this.actividadOrdinaria = actividadOrdinaria;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public static DoRenovacionMRenovada enConfecamaras(String consulta, String num, String activosUno, String activosDos, String numEmpleados,
                                                       String activosCorrientes, String patrimonioNeto, String actividadOrdinaria,
                                                       String identificacion, String correo){
        return Tasks.instrumented(DoRenovacionMRenovada.class, consulta, num, activosUno, activosDos,
                numEmpleados, activosCorrientes, patrimonioNeto, actividadOrdinaria, identificacion, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Enter.theValue(consulta).into(MenuSistema.CONSULTA_SLC),
                Enter.theValue(num).into(MenuSistema.CRITERIO_INPUT),
                Click.on(MenuSistema.CONTINUAR_BTN),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RenovacionPersona.ACCIONES_BTN),
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RenovacionPersona.OPERACIONES_MERCANTIL_BTN),
                WaitInteractions.untilAppears(RenovacionPersona.RENOVAR_MATRICULA_BTN),
                JavaScriptClick.on(RenovacionPersona.RENOVAR_MATRICULA_BTN),
                WaitMilliseconds.milliseconds(100),
                JavaScriptClick.on(RenovacionPersona.CONTINUAR_DOS_BTN),
                ModalLoader.modalLoader(),
                //WaitUntil.the(RenovacionPNRenov.OK_BTN, WebElementStateMatchers.isPresent()).forNoMoreThan(60).seconds(),
                //JavaScriptClick.on(RenovacionPNRenov.OK_BTN),
                //WaitConstant.esperaConstante(),
                WaitSeconds.seconds(5)
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                JavaScriptClick.on(RENOVAR_SI_BTN),
                WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Clear.field(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(activosUno).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD)
//                WaitInteractions.untilAppears(RENOVAR_SI_DOS_BTN),
//                JavaScriptClick.on(RENOVAR_SI_DOS_BTN),
//                JavaScriptClick.on(RENOVAR_SI_DOS_BTN),
        );
        if(actor.asksFor(ElementoElegible.para(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Clear.field(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Enter.theValue(activosDos).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                    Scroll.to(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD).andAlignToBottom()
            );
        }
        actor.attemptsTo(
                Enter.theValue(numEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO PERSONA JURIDICA ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(FORMULARIO_UNO_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(FORMULARIO_UNO_BTN),
                JavaScriptClick.on(FORMULARIO_UNO_BTN),
                WaitInteractions.untilAppears(ACTIVOS_CORRIENTE_TXT),
                Scroll.to(ACTIVOS_CORRIENTE_TXT).andAlignToBottom(),
                Enter.theValue(activosCorrientes).into(ACTIVOS_CORRIENTE_TXT),
                Scroll.to(PATRIMONIO_NETO_TXT).andAlignToBottom(),
                Enter.theValue(patrimonioNeto).into(PATRIMONIO_NETO_TXT),
                Scroll.to(ACTIVIDAD_ORDINARIA_TXT).andAlignToBottom(),
                Enter.theValue(actividadOrdinaria).into(ACTIVIDAD_ORDINARIA_TXT),
                Scroll.to(PERSONAL_OCUPADO_TXT),
                Enter.theValue("3").into(PERSONAL_OCUPADO_TXT),
                WaitInteractions.untilAppears(ALMACENAR_BTN),
                Scroll.to(ALMACENAR_BTN).andAlignToBottom(),
                JavaScriptClick.on(ALMACENAR_BTN),
                WaitInteractions.untilAppears(OK_DOS_BTN),
                JavaScriptClick.on(OK_DOS_BTN)
        );

        actor.attemptsTo(
//                WaitInterrupted2Segundos.esperaConstante2(),
//                WaitInteractions.untilAppears(FORMULARIO_DOS_BTN),
//                JavaScriptClick.on(FORMULARIO_DOS_BTN),
//                WaitInteractions.untilAppears(ALMACENAR_BTN),
//                Scroll.to(ALMACENAR_BTN).andAlignToBottom(),
//                JavaScriptClick.on(ALMACENAR_BTN),
//                WaitInteractions.untilAppears(OK_DOS_BTN),
//                JavaScriptClick.on(OK_DOS_BTN),
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Scroll.to(RECIBIR_PAGO_BTN).andAlignToBottom(),
                WaitInteractions.untilBeEnable(RECIBIR_PAGO_BTN),
                JavaScriptClick.on(RECIBIR_PAGO_BTN),
                Switch.toNewWindow(),
                PagoUsuarioCaja.pagoUsuarioCaja()
//                WaitInteractions.untilAppears(IDENTIFICACION_TXT),
//                Enter.theValue(identificacion).into(IDENTIFICACION_TXT),
//                Click.on(VERIFICAR_IDENTIFICACION_BTN),
//                Scroll.to(CORREO_TXT).andAlignToBottom(),
//                Enter.theValue(correo).into(CORREO_TXT),
//                Scroll.to(GENERAR_RECIBO_BTN).andAlignToBottom(),
//                Click.on(GENERAR_RECIBO_BTN),
//                WaitInteractions.untilAppears(CONTINUAR_BTN),
//                Click.on(CONTINUAR_BTN),
//                Switch.toTheOtherWindow()
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(CERRAR_BTN),
                JavaScriptClick.on(CERRAR_BTN),
                WaitInteractions.untilAppears(SOPORTES_BTN),
                JavaScriptClick.on(SOPORTES_BTN),
                WaitInteractions.untilAppears(VER_FORMULARIO_BTN),
                JavaScriptClick.on(VER_FORMULARIO_BTN),
                WaitInteractions.untilAppears(CERRAR_BTN),
                JavaScriptClick.on(CERRAR_BTN),
                WaitInteractions.untilAppears(VER_RADICADO_BTN),
                Scroll.to(VER_RADICADO_BTN).andAlignToBottom(),
                JavaScriptClick.on(VER_RADICADO_BTN)
        );
    }
}
