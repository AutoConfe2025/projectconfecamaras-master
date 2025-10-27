package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSucursalUI.BTN_EXPANDIR;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionMatriculaActividadNoComercialComercial implements Task {

    private final String selectConsultaPor;
    private final String idMatricula;
    private final String idNuevosActivos;
    private final String idNumerosEmpleados;
    private final String selectEsEmprendimientoSocial;
    private final String selectAutorizaMensajesCorreo;
    private final String idFecha;
    private final String idActivoCorriente;
    private final String idPatrimonioNeto;
    private final String idIngresosActividadOrdinaria;
    private final String idCorreo;
    private final String idCelular;
    private final String selectTipoIdentificacion;
    private final String idIdentificacion;
    private final String idEmailConfirmacion;

    public RenovacionMatriculaActividadNoComercialComercial(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                                            String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                                            String selectAutorizaMensajesCorreo, String idFecha, String idActivoCorriente, String idPatrimonioNeto,
                                                            String idIngresosActividadOrdinaria, String idCorreo, String idCelular,
                                                            String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNumerosEmpleados = idNumerosEmpleados;
        this.selectEsEmprendimientoSocial = selectEsEmprendimientoSocial;
        this.selectAutorizaMensajesCorreo = selectAutorizaMensajesCorreo;
        this.idFecha = idFecha;
        this.idActivoCorriente = idActivoCorriente;
        this.idPatrimonioNeto = idPatrimonioNeto;
        this.idIngresosActividadOrdinaria = idIngresosActividadOrdinaria;
        this.idCorreo = idCorreo;
        this.idCelular = idCelular;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacion = idIdentificacion;
        this.idEmailConfirmacion = idEmailConfirmacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                Click.on(BTN_RENOVACION_MATRICULA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CONTINUAR_SOCIEDAD),
                Scroll.to(BTN_CONTINUAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_SOCIEDAD),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilBeEnable(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD)
        );
        if(actor.asksFor(ElementoElegible.para(RAD_BTN_NUEVOS_ACTIVOS_SOCIEDAD))){
            actor.attemptsTo(
                    Scroll.to(RAD_BTN_NUEVOS_ACTIVOS_SOCIEDAD).andAlignToBottom(),
                    WaitInteractions.untilBeEnable(RAD_BTN_NUEVOS_ACTIVOS_SOCIEDAD),
                    JavaScriptClick.on(RAD_BTN_NUEVOS_ACTIVOS_SOCIEDAD)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNumerosEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD),
                ModalLoader.modalLoader()
        );

        //********************* FORMULARIO ********************************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FORMULARIO_SOCIEDAD),
                Scroll.to(BTN_FORMULARIO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_SOCIEDAD),
                WaitInteractions.untilAppears(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                Scroll.to(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectEsEmprendimientoSocial).from(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                Scroll.to(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectAutorizaMensajesCorreo).from(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_FECHA_SOCIEDAD),
                Scroll.to(TXT_FECHA_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idFecha).into(TXT_FECHA_SOCIEDAD),
                WaitInteractions.untilAppears(RD_BTN_CIUU_SOCIEDAD),
                Click.on(RD_BTN_CIUU_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                Scroll.to(TXT_ACTIVO_CORRIENTE_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_PATRIMONIO_NETO_SOCIEDAD),
                Scroll.to(TXT_PATRIMONIO_NETO_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idPatrimonioNeto).into(TXT_PATRIMONIO_NETO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Scroll.to(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idIngresosActividadOrdinaria).into(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Scroll.to(PERSONAL_OCUPADO_TXT).andAlignToBottom(),
                Enter.theValue("1").into(PERSONAL_OCUPADO_TXT),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SOCIEDAD),
                Scroll.to(BTN_ALMACENAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(BTN_OK_SOCIEDAD_OK))) {
                int indexFila = i = 50;
                System.out.println("Boton confirmacion OK");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_OK_SOCIEDAD_OK),
                Click.on(BTN_OK_SOCIEDAD_OK),
                ModalLoader.modalLoader()
        );
        if(actor.asksFor(ElementoElegible.para(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD),
                    Scroll.to(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD).andAlignToBottom(),
                    SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SELECCIONAR_ARCHIVO_SOCIEDAD),
                    WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                    Click.on(BTN_CERRAR_SOCIEDAD)
            );
        }

        //********************* FIRMA MANUSCRITA ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_FIRMA_MANUSCRITA_SOCIEDAD),
                Scroll.to(BTN_FIRMA_MANUSCRITA_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FIRMA_MANUSCRITA_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_CORREO_ELECTRONICO_SOCIEDAD),
                Enter.theValue(idCorreo).into(TXT_CORREO_ELECTRONICO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_CELULAR_SOCIEDAD),
                Enter.theValue(idCelular).into(TXT_CELULAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_GENERAR_QR_SOCIEDAD),
                Click.on(BTN_GENERAR_QR_SOCIEDAD),
                ReadQrCode.inThePage(IMG_QR_SOCIEDAD),
                WaitConstant.esperaConstante(),
                SignatureAndQr.doFirmar(),
                WaitInteractions.untilAppears(BTN_GUARDAR_FIRMA_SOCIEDAD),
                Click.on(BTN_GUARDAR_FIRMA_SOCIEDAD),
                Switch.toTheOtherWindow(),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                Click.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_SI_SOCIEDAD),
                Click.on(BTN_SI_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_OBTENER_SOBRE_DIGITAL_SOCIEDAD),
                Scroll.to(BTN_OBTENER_SOBRE_DIGITAL_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_OBTENER_SOBRE_DIGITAL_SOCIEDAD),
                WaitInteractions.untilAppears(LBL_VER_DOCUMENTO_SOCIEDAD),
                Ensure.that(LBL_VER_DOCUMENTO_SOCIEDAD).hasText(VER_DOCUMENTO),
                WaitInteractions.untilBeEnable(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                WaitInteractions.untilBeEnable(BTN_CERRAR_SOCIEDAD),
                Click.on(BTN_CERRAR_SOCIEDAD)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SOCIEDAD),
                Scroll.to(BTN_RECIBIR_PAGO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SOCIEDAD),
                Switch.toWindowTitled("SISTEMA INTEGRADO DE INFORMACION VER. 1.0"),
//                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
//                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_SOPORTES_SOCIEDAD),
                JavaScriptClick.on(BTN_SOPORTES_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_RECIBO_CAJA_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                JavaScriptClick.on(BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_VER_RADICADO_DOS_SOCIEDAD),
                Scroll.to(BTN_VER_RADICADO_DOS_SOCIEDAD).andAlignToBottom(),
                JavaScriptClick.on(BTN_VER_RADICADO_DOS_SOCIEDAD)
        );
    }

    public static RenovacionMatriculaActividadNoComercialComercial enConfecamaraSII(String selectConsultaPor, String idMatricula, String idNuevosActivos, String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                                                                    String selectAutorizaMensajesCorreo, String idFecha, String idActivoCorriente, String idPatrimonioNeto,
                                                                                    String idIngresosActividadOrdinaria, String idCorreo, String idCelular,
                                                                                    String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RenovacionMatriculaActividadNoComercialComercial.class, selectConsultaPor, idMatricula, idNuevosActivos,
                idNumerosEmpleados,selectEsEmprendimientoSocial, selectAutorizaMensajesCorreo, idFecha, idActivoCorriente, idPatrimonioNeto,
                idIngresosActividadOrdinaria, idCorreo, idCelular, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}