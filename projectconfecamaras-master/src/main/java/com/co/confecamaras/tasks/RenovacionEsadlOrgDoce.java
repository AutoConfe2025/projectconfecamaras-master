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
import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.CARGAR_ANEXO;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionEsadlOrgDoce implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String idNuevosActivos;
    private String idNumerosEmpleados;
    private String selectEsEmprendimientoSocial;
    private String selectAutorizaMensajesCorreo;
    private String idActivoCorriente;
    private String idPatrimonioNeto;
    private String idIngresosActividadOrdinaria;
    private String idCorreo;
    private String idCelular;
    private String selectTipoIdentificacion;
    private String idIdentificacion;
    private String idEmailConfirmacion;

    public RenovacionEsadlOrgDoce(String selectConsultaPor, String idMatricula, String idNuevosActivos,
                                  String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                  String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                  String idIngresosActividadOrdinaria, String idCorreo, String idCelular,
                                  String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.idNuevosActivos = idNuevosActivos;
        this.idNumerosEmpleados = idNumerosEmpleados;
        this.selectEsEmprendimientoSocial = selectEsEmprendimientoSocial;
        this.selectAutorizaMensajesCorreo = selectAutorizaMensajesCorreo;
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
                WaitInteractions.untilBeEnable(SELECT_CONSULTA_POR_EXPEDIENTES),
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
                Click.on(BTN_CONTINUAR_SOCIEDAD)
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilBeEnable(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                Enter.theValue(idNuevosActivos).into(TXT_NUEVOS_ACTIVOS_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                Scroll.to(TXT_NUMERO_EMPLEADOS_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idNumerosEmpleados).into(TXT_NUMERO_EMPLEADOS_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_LIQUIDAR_SOCIEDAD)
        );

        //********************* FORMULARIO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_FORMULARIO_SOCIEDAD),
                Scroll.to(BTN_FORMULARIO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FORMULARIO_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                Scroll.to(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectEsEmprendimientoSocial).from(SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD),
                WaitInteractions.untilAppears(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                Scroll.to(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectAutorizaMensajesCorreo).from(SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD),
                WaitInteractions.untilAppears(RBTN_MAYOR_INGRESO),
                Click.on(RBTN_MAYOR_INGRESO),
                WaitInteractions.untilAppears(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                Scroll.to(TXT_ACTIVO_CORRIENTE_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idActivoCorriente).into(TXT_ACTIVO_CORRIENTE_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_PATRIMONIO_NETO_SOCIEDAD),
                Scroll.to(TXT_PATRIMONIO_NETO_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idPatrimonioNeto).into(TXT_PATRIMONIO_NETO_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Scroll.to(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD).andAlignToBottom(),
                Enter.theValue(idIngresosActividadOrdinaria).into(TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD),
                Enter.theValue("100").into(PERSONAL_OCUPADO_TXT),
                WaitInteractions.untilAppears(BTN_ALMACENAR_SOCIEDAD),
                Scroll.to(BTN_ALMACENAR_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_ALMACENAR_SOCIEDAD)
        );
        for (int i = 0; i <= 50; i++) {
            if (actor.asksFor(ElementoElegible.para(BTN_OK_DATOS_ALMACENADOS))) {
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i + 1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_OK_DATOS_ALMACENADOS),
                Click.on(BTN_OK_DATOS_ALMACENADOS),
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
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_FIRMA_MANUSCRITA_SOCIEDAD),
                Scroll.to(BTN_FIRMA_MANUSCRITA_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_FIRMA_MANUSCRITA_SOCIEDAD),
                WaitInteractions.untilAppears(TXT_NOMBRE_APELLIDO_FIRMANTE),
                Enter.theValue("ALAN RIOS MARIN").into(TXT_NOMBRE_APELLIDO_FIRMANTE),
                WaitInteractions.untilAppears(TXT_CORREO_ELECTRONICO_SOCIEDAD),
                Enter.theValue(idCorreo).into(TXT_CORREO_ELECTRONICO_SOCIEDAD),
                WaitInteractions.untilAppears(MENUDES_CEDULA_EXTRANJERIA),
                SelectFromOptions.byVisibleText("Cédula de extranjería").from(MENUDES_CEDULA_EXTRANJERIA),
                WaitInteractions.untilAppears(TXT_CELULAR_SOCIEDAD),
                Enter.theValue("1026265085").into(TXT_IDENTIFICACION),
                WaitInteractions.untilAppears(TXT_CELULAR_SOCIEDAD),
                Enter.theValue(idCelular).into(TXT_CELULAR_SOCIEDAD),
                WaitInteractions.untilAppears(BTN_GENERAR_QR_SOCIEDAD),
                Click.on(BTN_GENERAR_QR_SOCIEDAD),
                ReadQrCode.inThePage(IMG_QR_SOCIEDAD),
                WaitSeconds.seconds(5),
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
                WaitInteractions.untilAppears(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                Click.on(BTN_CERRAR_SOCIEDAD)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_SOCIEDAD),
                Scroll.to(BTN_RECIBIR_PAGO_SOCIEDAD).andAlignToBottom(),
                Click.on(BTN_RECIBIR_PAGO_SOCIEDAD),
                Switch.toWindowTitled("SISTEMA INTEGRADO DE INFORMACION VER. 1.0"),
                /*WaitInteractions.untilAppears(BTN_CERRAR_SOCIEDAD),
                JavaScriptClick.on(BTN_CERRAR_SOCIEDAD),*/
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

    public static RenovacionEsadlOrgDoce enConfecamaraSII(String selectConsultaPor, String idMatricula, String idNuevosActivos, String idNumerosEmpleados, String selectEsEmprendimientoSocial,
                                                          String selectAutorizaMensajesCorreo, String idActivoCorriente, String idPatrimonioNeto,
                                                          String idIngresosActividadOrdinaria, String idCorreo, String idCelular,
                                                          String selectTipoIdentificacion, String idIdentificacion, String idEmailConfirmacion){
        return instrumented(RenovacionEsadlOrgDoce.class, selectConsultaPor, idMatricula, idNuevosActivos,
                idNumerosEmpleados,selectEsEmprendimientoSocial, selectAutorizaMensajesCorreo, idActivoCorriente, idPatrimonioNeto,
                idIngresosActividadOrdinaria, idCorreo, idCelular, selectTipoIdentificacion, idIdentificacion, idEmailConfirmacion);
    }
}