package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.GestionUsuariosExternosUI.*;

public class AgregarUsuarioConsultaUsuariosExternos implements Interaction {

    private String selectTipoIdentificacion;
    private String idIdentificacionDos;
    private String idEmailDos;
    private String idNroMovil;
    private String idPrimerNombre;
    private String idSegundoNombre;
    private String idPrimerApellido;
    private String idSegundoApellido;
    private String idDireccion;
    private String selectMunicipio;

    public AgregarUsuarioConsultaUsuariosExternos(String selectTipoIdentificacion, String idIdentificacionDos, String idEmailDos,
                                                  String idNroMovil, String idPrimerNombre, String idSegundoNombre,
                                                  String idPrimerApellido, String idSegundoApellido, String idDireccion,
                                                  String selectMunicipio) {
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacionDos = idIdentificacionDos;
        this.idEmailDos = idEmailDos;
        this.idNroMovil = idNroMovil;
        this.idPrimerNombre = idPrimerNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.idPrimerApellido = idPrimerApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.idDireccion = idDireccion;
        this.selectMunicipio = selectMunicipio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_AGREGAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_AGREGAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText("CÉDULA DE EXTRANJERÍA").from(SELECT_TIPO_IDENTIFICACION_USUARIO_EXTERNOS),
                //SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION_DOS_USUARIO_EXTERNOS),
                Enter.theValue(idIdentificacionDos).into(TXT_IDENTIFICACION_DOS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_EMAIL_DOS_USUARIO_EXTERNOS),
                Enter.theValue(idEmailDos).into(TXT_EMAIL_DOS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_NRO_MOVIL_USUARIO_EXTERNOS),
                Enter.theValue(idNroMovil).into(TXT_NRO_MOVIL_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_PRIMER_NOMBRE_USUARIO_EXTERNOS),
                Enter.theValue(idPrimerNombre).into(TXT_PRIMER_NOMBRE_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_SEGUNDO_NOMBRE_USUARIO_EXTERNOS),
                Enter.theValue(idSegundoNombre).into(TXT_SEGUNDO_NOMBRE_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_PRIMER_APELLIDO_USUARIO_EXTERNOS),
                Enter.theValue(idPrimerApellido).into(TXT_PRIMER_APELLIDO_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_SEGUNDO_APELLIDO_USUARIO_EXTERNOS),
                Enter.theValue(idSegundoApellido).into(TXT_SEGUNDO_APELLIDO_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(TXT_DIRECCION_USUARIO_EXTERNOS),
                Enter.theValue(idDireccion).into(TXT_DIRECCION_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(SELECT_MUNICIPIO_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectMunicipio).from(SELECT_MUNICIPIO_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_FOTO_USUARIO_USUARIO_EXTERNOS),
                Scroll.to(BTN_FOTO_USUARIO_USUARIO_EXTERNOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_FOTO_USUARIO_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_FOTO_DOCUMENTO_IDENTIDAD_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_FOTO_DOCUMENTO_IDENTIDAD_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_FOTO_FORMATO_SUSCRIPCION_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_FOTO_FORMATO_SUSCRIPCION_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_SUBIR_ARCHIVO_USUARIO_EXTERNOS),
                Scroll.to(BTN_SUBIR_ARCHIVO_USUARIO_EXTERNOS).andAlignToBottom(),
                SendKeys.of(FileUpload.subirArchivo().archivoComandos()).into(BTN_SUBIR_ARCHIVO_USUARIO_EXTERNOS),
                Scroll.to(BTN_CONTINUAR_USUARIO_EXTERNOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS_2),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS_2),//////////////*
                WaitInteractions.untilAppears(BTN_EDITAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_EDITAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_REGRESAR_DOS_USUARIO_EXTERNOS),
                Scroll.to(BTN_REGRESAR_DOS_USUARIO_EXTERNOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGRESAR_DOS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_ACTIVAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_ACTIVAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_SI_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_SI_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_EMAIL_SMS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_SMS_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_SMS_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_VER_IMAGENES_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_VER_IMAGENES_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_CERRAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_CERRAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_ELIMINAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_ELIMINAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_SI_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_SI_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                JavaScriptClick.on(BTN_REGRESAR_USUARIO_EXTERNOS)//*/
        );
    }

    public static AgregarUsuarioConsultaUsuariosExternos enConfecamaraSII(String selectTipoIdentificacion, String idIdentificacionDos, String idEmailDos,
                                                                          String idNroMovil, String idPrimerNombre, String idSegundoNombre,
                                                                          String idPrimerApellido, String idSegundoApellido, String idDireccion,
                                                                          String selectMunicipio){
        return new AgregarUsuarioConsultaUsuariosExternos(selectTipoIdentificacion, idIdentificacionDos, idEmailDos, idNroMovil, idPrimerNombre, idSegundoNombre,
                idPrimerApellido, idSegundoApellido, idDireccion, selectMunicipio);
    }
}