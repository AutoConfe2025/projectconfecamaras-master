package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.SubirArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class CapturaEvidenciaSoloPersonaNatural implements Task {

    private String idNombresClienteRazonSocial;
    private String idPrimerNombre;
    private String idSegundoNombre;
    private String idPrimerApellido;
    private String idSegundoApellido;
    private String idDireccionComercial;
    private String selectMunicipioComercial;
    private String idTelefonofijo;
    private String idNroCelular;
    private String idEmail;
    private String idConfirmacionEmail;
    private String idFechaExpedicion;

    public CapturaEvidenciaSoloPersonaNatural(String idNombresClienteRazonSocial, String idPrimerNombre,
                                              String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                                              String idDireccionComercial, String selectMunicipioComercial, String idTelefonofijo,
                                              String idNroCelular, String idEmail, String idConfirmacionEmail,
                                              String idFechaExpedicion) {
        this.idNombresClienteRazonSocial = idNombresClienteRazonSocial;
        this.idPrimerNombre = idPrimerNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.idPrimerApellido = idPrimerApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.idDireccionComercial = idDireccionComercial;
        this.selectMunicipioComercial = selectMunicipioComercial;
        this.idTelefonofijo = idTelefonofijo;
        this.idNroCelular = idNroCelular;
        this.idEmail = idEmail;
        this.idConfirmacionEmail = idConfirmacionEmail;
        this.idFechaExpedicion = idFechaExpedicion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idNombresClienteRazonSocial).into(TXT_NOMBRE_CLIENTE_RAZON_SOCIAL_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA),
                Enter.theValue(idPrimerNombre).into(TXT_PRIMER_NOMBRE_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA),
                Enter.theValue(idSegundoNombre).into(TXT_SEGUNDO_NOMBRE_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA),
                Enter.theValue(idPrimerApellido).into(TXT_PRIMER_APELLIDO_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA),
                Enter.theValue(idSegundoApellido).into(TXT_SEGUNDO_APELLIDO_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idDireccionComercial).into(TXT_DIRECCION_COMERCIAL_CAPTURAR_EVIDENCIA),
                SelectFromOptions.byVisibleText(selectMunicipioComercial).from(SELECT_MUNICIPIO_COMERCIAL_DOS_CAPTURAR_EVIDENCIA),
                Click.on(BTN_DUPLICAR_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_FIJO_CAPTURAR_EVIDENCIA),
                Enter.theValue(idTelefonofijo).into(TXT_FIJO_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_CELULAR_CAPTURAR_EVIDENCIA),
                Enter.theValue(idNroCelular).into(TXT_CELULAR_CAPTURAR_EVIDENCIA),
                Clear.field(TXT_EMAIL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idEmail).into(TXT_EMAIL_CAPTURAR_EVIDENCIA),
                Scroll.to(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                Clear.field(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Enter.theValue(idConfirmacionEmail).into(TXT_CONFIRMACION_EMAIL_CAPTURAR_EVIDENCIA),
                Scroll.to(BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                Click.on(BTN_DUPLICAR_DOS_CAPTURAR_EVIDENCIA),
                Scroll.to(TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA).andAlignToBottom(),
                Enter.theValue(idFechaExpedicion).into(TXT_FECHA_EXPEDICION_CAPTURAR_EVIDENCIA),
                SubirArchivo.enConfecamaraSII(),
                Click.on(BTN_GENERAR_RECIBO_CAPTURAR_EVIDENCIA),
                Click.on(BTN_CONTINUAR_CAPTURAR_EVIDENCIA)
        );
    }

    public static CapturaEvidenciaSoloPersonaNatural enConfecamaraSII(String idNombresClienteRazonSocial, String idPrimerNombre,
                                                                      String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                                                                      String idDireccionComercial, String selectMunicipioComercial, String idTelefonofijo,
                                                                      String idNroCelular, String idEmail, String idConfirmacionEmail,
                                                                      String idFechaExpedicion){
        return instrumented(CapturaEvidenciaSoloPersonaNatural.class, idNombresClienteRazonSocial, idPrimerNombre, idSegundoNombre, idPrimerApellido, idSegundoApellido,
                idDireccionComercial, selectMunicipioComercial, idTelefonofijo, idNroCelular, idEmail, idConfirmacionEmail,
                idFechaExpedicion);
    }
}