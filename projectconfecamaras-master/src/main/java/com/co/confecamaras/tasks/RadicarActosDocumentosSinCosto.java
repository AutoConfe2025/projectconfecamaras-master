package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static com.co.confecamaras.userinterfaces.RadicarActosDocumentosSinCostoUI.*;

public class RadicarActosDocumentosSinCosto implements Task {

    private String selectConsultaPor;
    private String idMatricula;
    private String selectTipoDocumento;
    private String idNumeroDocumento;
    private String idFechaDocumento;
    private String idOrigenDocumento;
    private String selectMunicipio;
    private String idMotivoCorreccion;
    private String selectTipoIdentificacion;
    private String idNroIdentificacion;
    private String idPrimerNombre;
    private String idSegundoNombre;
    private String idPrimerApellido;
    private String idSegundoApellido;
    private String idDireccion;
    private String selectMunicipioDos;
    private String idEmail;
    private String idTelefonoFijo;
    private String idNroCelular;

    public RadicarActosDocumentosSinCosto(String selectConsultaPor, String idMatricula, String selectTipoDocumento,
                                          String idNumeroDocumento, String idFechaDocumento, String idOrigenDocumento,
                                          String selectMunicipio,String idMotivoCorreccion, String selectTipoIdentificacion,
                                          String idNroIdentificacion, String idPrimerNombre, String idSegundoNombre,
                                          String idPrimerApellido, String idSegundoApellido, String idDireccion, String selectMunicipioDos,
                                          String idEmail, String idTelefonoFijo, String idNroCelular) {
        this.selectConsultaPor = selectConsultaPor;
        this.idMatricula = idMatricula;
        this.selectTipoDocumento = selectTipoDocumento;
        this.idNumeroDocumento = idNumeroDocumento;
        this.idFechaDocumento = idFechaDocumento;
        this.idOrigenDocumento = idOrigenDocumento;
        this.selectMunicipio = selectMunicipio;
        this.idMotivoCorreccion = idMotivoCorreccion;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idNroIdentificacion = idNroIdentificacion;
        this.idPrimerNombre = idPrimerNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.idPrimerApellido = idPrimerApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.idDireccion = idDireccion;
        this.selectMunicipioDos = selectMunicipioDos;
        this.idEmail = idEmail;
        this.idTelefonoFijo = idTelefonoFijo;
        this.idNroCelular = idNroCelular;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted3Segundos.esperaConstante3(),
                //WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                //Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(SELECT_CONSULTA_POR_EXPEDIENTES),
                Scroll.to(SELECT_CONSULTA_POR_EXPEDIENTES).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                WaitInteractions.untilAppears(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Scroll.to(BTN_CONTINUAR_EXPEDIENTES).andAlignToBottom(),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_RADICAR_DOCUMENTOS_SIN_COSTO_EXPEDIENTES),
                Click.on(BTN_RADICAR_DOCUMENTOS_SIN_COSTO_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_PQR_REGISTRO_MERCANTIL_RADICAR_ACTOS),
                Click.on(BTN_PQR_REGISTRO_MERCANTIL_RADICAR_ACTOS),
                WaitInteractions.untilAppears(SELECT_TIPO_DOCUMENTO_RADICAR_ACTOS),
                SelectFromOptions.byVisibleText(selectTipoDocumento).from(SELECT_TIPO_DOCUMENTO_RADICAR_ACTOS),
                Enter.theValue(idNumeroDocumento).into(TXT_NUMERO_DOCUMENTO_RADICAR_ACTOS),
                Enter.theValue(idFechaDocumento).into(TXT_FECHA_DOCUMENTO_RADICAR_ACTOS),
                Enter.theValue(idOrigenDocumento).into(TXT_ORIGEN_DOCUMENTO_RADICAR_ACTOS),
                SelectFromOptions.byVisibleText(selectMunicipio).from(SELECT_MUNICIPIO_RADICAR_ACTOS),
                Click.on(BTN_SIGUIENTE_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_SIGUIENTE_UNO_RADICAR_ACTOS),
                Click.on(BTN_SIGUIENTE_UNO_RADICAR_ACTOS),
                DetallePQRSF.enConfecamaraSII(idMotivoCorreccion, selectTipoIdentificacion, idNroIdentificacion,
                        idPrimerNombre, idSegundoNombre, idPrimerApellido, idSegundoApellido, idDireccion, selectMunicipioDos,
                        idEmail, idTelefonoFijo, idNroCelular),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_CARGAR_SOPORTES_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_OK_RADICAR_ACTOS),
                Click.on(BTN_OK_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_VER_SOPORTE_RADICAR_ACTOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(BTN_VER_SOPORTE_RADICAR_ACTOS),
                Click.on(BTN_VER_SOPORTE_RADICAR_ACTOS),
                WaitInteractions.untilBeEnable(BTN_EXPANDIR),
                Click.on(BTN_EXPANDIR),
                WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_ACTOS),
                Click.on(BTN_CERRAR_RADICAR_ACTOS),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_BORRAR_SOPORTE_RADICAR_ACTOS),
                Click.on(BTN_BORRAR_SOPORTE_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_SI_RADICAR_ACTOS),
                Click.on(BTN_SI_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_ACTOS),
                Click.on(BTN_CERRAR_RADICAR_ACTOS),
                WaitInterrupted3Segundos.esperaConstante3(),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_CARGAR_SOPORTES_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_OK_RADICAR_ACTOS),
                Click.on(BTN_OK_RADICAR_ACTOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_RADICAR_TRAMITE_RADICAR_ACTOS),
                Scroll.to(BTN_RADICAR_TRAMITE_RADICAR_ACTOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_RADICAR_TRAMITE_RADICAR_ACTOS),



                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_SERVICIOS_RADICAR_ACTOS),
                JavaScriptClick.on(BTN_SERVICIOS_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_SOPORTES_RADICAR_ACTOS),
                Click.on(BTN_SOPORTES_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_VER_RADICAR_ACTOS),
                Click.on(BTN_VER_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_ACTOS),
                Click.on(BTN_CERRAR_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_VER_DOS_RADICAR_ACTOS),
                Click.on(BTN_VER_DOS_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_ACTOS),
                Click.on(BTN_CERRAR_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_VER_TRES_RADICAR_ACTOS),
                Click.on(BTN_VER_TRES_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_CERRAR_RADICAR_ACTOS),
                Click.on(BTN_CERRAR_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_RECIBO_IM7_RADICAR_ACTOS),
                Click.on(BTN_RECIBO_IM7_RADICAR_ACTOS)
        );
    }

    public static RadicarActosDocumentosSinCosto enConfecamaraSII(String selectConsultaPor, String idMatricula, String selectTipoDocumento,
                                                                  String idNumeroDocumento, String idFechaDocumento, String idOrigenDocumento,
                                                                  String selectMunicipio,String idMotivoCorreccion, String selectTipoIdentificacion,
                                                                  String idNroIdentificacion, String idPrimerNombre, String idSegundoNombre,
                                                                  String idPrimerApellido, String idSegundoApellido, String idDireccion, String selectMunicipioDos,
                                                                  String idEmail, String idTelefonoFijo, String idNroCelular){
        return Tasks.instrumented(RadicarActosDocumentosSinCosto.class, selectConsultaPor, idMatricula, selectTipoDocumento, idNumeroDocumento,
                idFechaDocumento, idOrigenDocumento, selectMunicipio, idMotivoCorreccion, selectTipoIdentificacion, idNroIdentificacion, idPrimerNombre,
                idSegundoNombre, idPrimerApellido, idSegundoApellido, idDireccion, selectMunicipioDos, idEmail, idTelefonoFijo, idNroCelular);
    }
}