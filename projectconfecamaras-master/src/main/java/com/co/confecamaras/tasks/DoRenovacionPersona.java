package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.RenovacionPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.co.confecamaras.userinterfaces.MenuSistema.CRITERIO_INPUT;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.userinterfaces.RenovacionPersona.*;
import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRenovacionPersona implements Task {

    private final String consulta;
    private final String matricula;
    private final String activosUno;
    private final String activosDos;
    private final String numEmpleados;
    private final String selectEsEmprendimientoSocial;
    private final String autoriza;
    private final String activosP;
    private final String patrimonio;
    private final String actividadOrdinaria;
    private final String identificacion;
    private final String email;

    public DoRenovacionPersona(String consulta, String matricula, String activosUno, String activosDos, String numEmpleados,
                               String selectEsEmprendimientoSocial, String autoriza, String activosP, String patrimonio,
                               String actividadOrdinaria, String identificacion, String email){
        this.consulta = consulta;
        this.matricula = matricula;
        this.activosUno = activosUno;
        this.activosDos = activosDos;
        this.numEmpleados = numEmpleados;
        this.selectEsEmprendimientoSocial = selectEsEmprendimientoSocial;
        this.autoriza = autoriza;
        this.activosP = activosP;
        this.patrimonio = patrimonio;
        this.actividadOrdinaria = actividadOrdinaria;
        this.identificacion = identificacion;
        this.email = email;
    }

    public static Performable renovacionPersona(String consulta, String matricula, String activosUno, String activosDos, String numEmpleados,
                                                String selectEsEmprendimientoSocial, String autoriza, String activosP, String patrimonio,
                                                String actividadOrdinaria, String identificacion, String email){
        return instrumented(DoRenovacionPersona.class, consulta, matricula, activosUno, activosDos, numEmpleados,
                selectEsEmprendimientoSocial, autoriza, activosP, patrimonio, actividadOrdinaria, identificacion,
                email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Scroll.to(RenovacionPersona.CONSULTA_SLC),
                SelectFromOptions.byVisibleText(consulta).from(RenovacionPersona.CONSULTA_SLC),
                Enter.theValue(matricula).into(RenovacionPersona.INFO_INPUT),
                Click.on(RenovacionPersona.CONTINUAR_BTN),
                JavaScriptClick.on(RenovacionPersona.ACCIONES_BTN),
                JavaScriptClick.on(RenovacionPersona.OPERACIONES_MERCANTIL_BTN),
                JavaScriptClick.on(RenovacionPersona.RENOVAR_MATRICULA_BTN),
                JavaScriptClick.on(RenovacionPersona.CONTINUAR_DOS_BTN),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitUntil.the(TXT_NUEVOS_ACTIVOS_SOCIEDAD, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Clear.field(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue("30000000").into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Scroll.to(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                Clear.field(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                Enter.theValue("30000000").into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                Clear.field(RenovacionPersona.NUMERO_EMPLEADOS_INPUT),
                Enter.theValue(numEmpleados).into(RenovacionPersona.NUMERO_EMPLEADOS_INPUT),
                WaitInteractions.untilBeEnable(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO ***********************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                JavaScriptClick.on(RenovacionPersona.FORMULARIO_UNO_BTN),
                WaitInteractions.untilAppears(RenovacionPersona.SELECT_ES_EMPRENDIMIENTO_SOCIAL),
                Scroll.to(RenovacionPersona.SELECT_ES_EMPRENDIMIENTO_SOCIAL).andAlignToBottom(),
                SelectFromOptions.byVisibleText("SI").from(RenovacionPersona.SELECT_ES_EMPRENDIMIENTO_SOCIAL),
                /*
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_CATEGORIA_PDH),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_CATEGORIA_ADS),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_CATEGORIA_RPD),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_CATEGORIA_OOEP),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_CATEGORIA_OTR),
                Enter.theValue("Prueba Automatizada QA En qué categoria desarrolla").into(SELECT_EMPRENDIMIENTO_CATEGORIA_OTROS),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PRUIS),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PPRRRE),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_MRCCA),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PCIRNARP),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PHVCA),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PD),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_PEP),
                JavaScriptClick.on(SELECT_EMPRENDIMIENTO_BENEFICIA_OTR),
                Enter.theValue("Prueba Automatizada QA Que población se beneficia").into(SELECT_EMPRENDIMIENTO_BENEFICIA_OTROS),*/
                //SelectFromOptions.byVisibleText(autoriza).from(RenovacionPersona.AUTORIZA_SLC),
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO),
                SelectFromOptions.byVisibleText("NO").from(SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(TXT_PERSONAL_OCUPADO_SOCIEDAD),
                Enter.theValue("100").into(TXT_PERSONAL_OCUPADO_SOCIEDAD),
                Enter.theValue("30000000").into(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                Enter.theValue("30000000").into(TXT_PATRIMONIO_NETO_SOCIEDAD),
                Enter.theValue("30000000").into(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                JavaScriptClick.on(RenovacionPersona.ALMACENAR_BTN),
                WaitUntil.the(CrudProponente.MODAL_OK_BTN, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN)
        );

        //********************* FORMULARIO ESTABLECIMIENTO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(FORMULARIO_DOS_BTN),
                Scroll.to(RenovacionPersona.FORMULARIO_DOS_BTN).andAlignToBottom(),
                JavaScriptClick.on(RenovacionPersona.FORMULARIO_DOS_BTN),
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue("30000000").into(TXT_ACTIVO_VINCULADO_EST),
                WaitInteractions.untilBeEnable(ALMACENAR_BTN),
                JavaScriptClick.on(RenovacionPersona.ALMACENAR_BTN),
                WaitUntil.the(CrudProponente.MODAL_OK_BTN, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                Scroll.to(RenovacionPersona.RECIBIR_PAGO_BTN),
                JavaScriptClick.on(RenovacionPersona.RECIBIR_PAGO_BTN),
                Switch.toNewWindow(),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                JavaScriptClick.on(RenovacionPersona.CERRAR_MODAL_BTN),
                WaitInterrupted5Segundos.esperaConstante5(),
                JavaScriptClick.on(RenovacionPersona.SERVICIOS_BTN),
                JavaScriptClick.on(RenovacionPersona.SOPORTES_BTN),
                JavaScriptClick.on(RenovacionPersona.VER_BTN)
        );
    }
}
