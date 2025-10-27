package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.MaestroAlcaldiasCaeUI.*;

public class AdicionarRegistro implements Interaction {

    private String idPersonaResponsable;
    private String idCargoResponsable;
    private String selectTipoWs;
    private String idWs;
    private String idMetodo;
    private String selectCifrado;
    private String selectCumpleEstandar;
    private String selectRequiereAutenticacion;
    private String idUsuario;
    private String idContrasena;
    private String idEmail;
    private String idTelefonoFijo;
    private String idNroCelular;
    private String idTextoInformaCertificados;

    public AdicionarRegistro(String idPersonaResponsable, String idCargoResponsable, String selectTipoWs,
                             String idWs, String idMetodo, String selectCifrado, String selectCumpleEstandar,
                             String selectRequiereAutenticacion, String idUsuario, String idContrasena,
                             String idEmail, String idTelefonoFijo, String idNroCelular,
                             String idTextoInformaCertificados) {
        this.idPersonaResponsable = idPersonaResponsable;
        this.idCargoResponsable = idCargoResponsable;
        this.selectTipoWs = selectTipoWs;
        this.idWs = idWs;
        this.idMetodo = idMetodo;
        this.selectCifrado = selectCifrado;
        this.selectCumpleEstandar = selectCumpleEstandar;
        this.selectRequiereAutenticacion = selectRequiereAutenticacion;
        this.idUsuario = idUsuario;
        this.idContrasena = idContrasena;
        this.idEmail = idEmail;
        this.idTelefonoFijo = idTelefonoFijo;
        this.idNroCelular = idNroCelular;
        this.idTextoInformaCertificados = idTextoInformaCertificados;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitInteractions.untilAppears(BTN_VER_LISTA_ALCALDIAS_CAE),
                //Click.on(BTN_VER_LISTA_ALCALDIAS_CAE),
                //Switch.toFrame(0),
                //WaitInteractions.untilAppears(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE),
                //Scroll.to(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE).andAlignToBottom(),
                //Click.on(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE),
                WaitInteractions.untilAppears(TXT_PERSONA_RESPONSABLE_ALCALDIAS_CAE),
                Enter.theValue(idPersonaResponsable).into(TXT_PERSONA_RESPONSABLE_ALCALDIAS_CAE),
                Enter.theValue(idCargoResponsable).into(TXT_CARGO_RESPONSABLE_ALCALDIAS_CAE),
                SelectFromOptions.byVisibleText(selectTipoWs).from(SELECT_TIPO_WS_ALCALDIAS_CAE),
                Enter.theValue(idWs).into(TXT_WS_ALCALDIAS_CAE),
                Enter.theValue(idMetodo).into(TXT_METODO_ALCALDIAS_CAE),
                SelectFromOptions.byVisibleText(selectCifrado).from(SELECT_CIFRADO_ALCALDIAS_CAE),
                SelectFromOptions.byVisibleText(selectCumpleEstandar).from(SELECT_CUMPLE_ESTANDAR_ALCALDIAS_CAE),
                SelectFromOptions.byVisibleText(selectRequiereAutenticacion).from(SELECT_REQUIERE_AUTENTICACION_ALCALDIAS_CAE),
                Enter.theValue(idUsuario).into(TXT_USUARIO_ALCALDIAS_CAE),
                Enter.theValue(idContrasena).into(TXT_CONTRASENA_ALCALDIAS_CAE),
                Enter.theValue(idEmail).into(TXT_EMAIL_ALCALDIAS_CAE),
                Enter.theValue(idTelefonoFijo).into(TXT_TELEFONO_FIJO_ALCALDIAS_CAE),
                Enter.theValue(idNroCelular).into(TXT_NRO_CELULAR_ALCALDIAS_CAE),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(idTextoInformaCertificados).into(TXT_INFORMA_CERTIFICADOS_ALCALDIAS_CAE)//*/
        );
        actor.attemptsTo(
                //WaitInteractions.untilAppears(BTN_VER_LISTA_ALCALDIAS_CAE),
                Click.on(BTN_VER_LISTA_ALCALDIAS_CAE),
                Switch.toFrame(0),
                WaitInteractions.untilAppears(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE),
                Scroll.to(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE).andAlignToBottom(),
                Click.on(BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE)
        );
    }

    public static AdicionarRegistro enConfecamaraSII(String idPersonaResponsable, String idCargoResponsable, String selectTipoWs,
                                                     String idWs, String idMetodo, String selectCifrado, String selectCumpleEstandar,
                                                     String selectRequiereAutenticacion, String idUsuario, String idContrasena,
                                                     String idEmail, String idTelefonoFijo, String idNroCelular,
                                                     String idTextoInformaCertificados){
        return new AdicionarRegistro(idPersonaResponsable, idCargoResponsable, selectTipoWs, idWs, idMetodo, selectCifrado,
                selectCumpleEstandar, selectRequiereAutenticacion, idUsuario, idContrasena, idEmail, idTelefonoFijo,
                idNroCelular, idTextoInformaCertificados);
    }
}