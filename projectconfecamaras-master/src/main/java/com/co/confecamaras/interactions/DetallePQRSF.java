package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.RadicarActosDocumentosSinCostoUI.*;

public class DetallePQRSF implements Interaction {

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

    public DetallePQRSF(String idMotivoCorreccion, String selectTipoIdentificacion, String idNroIdentificacion,
                        String idPrimerNombre, String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                        String idDireccion, String selectMunicipioDos, String idEmail, String idTelefonoFijo,
                        String idNroCelular) {
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
                WaitInteractions.untilAppears(TXT_MOTIVO_CORRECCION_RADICAR_ACTOS),
                Enter.theValue(idMotivoCorreccion).into(TXT_MOTIVO_CORRECCION_RADICAR_ACTOS),
                Scroll.to(BTN_SIGUIENTE_TRES_RADICAR_ACTOS).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectTipoIdentificacion).from(SELECT_TIPO_IDENTIFICACION_RADICAR_ACTOS),
                Enter.theValue(idNroIdentificacion).into(TXT_NRO_IDENTIFICACION_RADICAR_ACTOS),
                Enter.theValue(idPrimerNombre).into(TXT_PRIMER_NOMBRE_RADICAR_ACTOS),
                Enter.theValue(idSegundoNombre).into(TXT_SEGUNDO_NOMBRE_RADICAR_ACTOS),
                Enter.theValue(idPrimerApellido).into(TXT_PRIMER_APELLIDO_RADICAR_ACTOS),
                Enter.theValue(idSegundoApellido).into(TXT_SEGUNDO_APELLIDO_RADICAR_ACTOS),
                Enter.theValue(idDireccion).into(TXT_DIRECCION_RADICAR_ACTOS),
                SelectFromOptions.byVisibleText(selectMunicipioDos).from(SELECT_MUNICIPIO_DOS_RADICAR_ACTOS),
                Enter.theValue(idEmail).into(TXT_EMAIL_RADICAR_ACTOS ),
                Enter.theValue(idTelefonoFijo).into(TXT_TELEFONO_FIJO_RADICAR_ACTOS),
                Enter.theValue(idNroCelular).into(TXT_NRO_CELULAR_RADICAR_ACTOS),
                WaitInteractions.untilAppears(BTN_SIGUIENTE_DOS_RADICAR_ACTOS),
                Click.on(BTN_SIGUIENTE_DOS_RADICAR_ACTOS)
        );
    }

    public static DetallePQRSF enConfecamaraSII(String idMotivoCorreccion, String selectTipoIdentificacion, String idNroIdentificacion,
                                                String idPrimerNombre, String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                                                String idDireccion, String selectMunicipioDos, String idEmail, String idTelefonoFijo,
                                                String idNroCelular){
        return new DetallePQRSF(idMotivoCorreccion, selectTipoIdentificacion, idNroIdentificacion, idPrimerNombre, idSegundoNombre, idPrimerApellido,
                idSegundoApellido, idDireccion, selectMunicipioDos, idEmail, idTelefonoFijo, idNroCelular);
    }
}