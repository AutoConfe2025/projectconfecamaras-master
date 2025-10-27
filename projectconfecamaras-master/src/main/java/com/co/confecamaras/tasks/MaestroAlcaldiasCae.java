package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MaestroAlcaldiasCaeUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroAlcaldiasCae implements Task {

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

    public MaestroAlcaldiasCae(String idPersonaResponsable, String idCargoResponsable, String selectTipoWs,
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

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitInteractions.untilDisappears(ESPERA),
                ModalLoader.modalLoader(),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO),
                Scroll.to(BTN_MODULO_REGISTRO).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_MAESTRO_ALCALDIAS_CAE),
                Scroll.to(BTN_MAESTRO_ALCALDIAS_CAE).andAlignToBottom(),
                JavaScriptClick.on(BTN_MAESTRO_ALCALDIAS_CAE),
                Switch.toNewWindow(),/*
                WaitInteractions.untilAppears(BTN_EDITAR_ALCALDIAS_CAE),
                Click.on(BTN_EDITAR_ALCALDIAS_CAE),
                WaitInteractions.untilAppears(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                Click.on(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                toAlert(),
                WaitInteractions.untilAppears(BTN_BORRAR_ALCALDIAS_CAE),
                Click.on(BTN_BORRAR_ALCALDIAS_CAE),*/
                WaitInteractions.untilAppears(BTN_ADICIONAR_REGISTRO_ALCALDIAS_CAE),
                Click.on(BTN_ADICIONAR_REGISTRO_ALCALDIAS_CAE),
                WaitInterrupted3Segundos.esperaConstante3(),
                AdicionarRegistro.enConfecamaraSII(idPersonaResponsable, idCargoResponsable, selectTipoWs, idWs,
                        idMetodo, selectCifrado, selectCumpleEstandar, selectRequiereAutenticacion, idUsuario,
                        idContrasena, idEmail, idTelefonoFijo, idNroCelular, idTextoInformaCertificados),
                Scroll.to(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                Click.on(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                toAlert()
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_EDITAR_ALCALDIAS_CAE),
                Click.on(BTN_EDITAR_ALCALDIAS_CAE),
                WaitInteractions.untilAppears(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                Click.on(BTN_GRABAR_REGISTRO_ALCALDIAS_CAE),
                toAlert(),
                WaitInteractions.untilAppears(BTN_BORRAR_ALCALDIAS_CAE),
                Click.on(BTN_BORRAR_ALCALDIAS_CAE)
        );
    }

    public static MaestroAlcaldiasCae enConfecamaraSII(String idPersonaResponsable, String idCargoResponsable, String selectTipoWs,
                                                       String idWs, String idMetodo, String selectCifrado, String selectCumpleEstandar,
                                                       String selectRequiereAutenticacion, String idUsuario, String idContrasena,
                                                       String idEmail, String idTelefonoFijo, String idNroCelular,
                                                       String idTextoInformaCertificados){
        return instrumented(MaestroAlcaldiasCae.class, idPersonaResponsable, idCargoResponsable, selectTipoWs, idWs, idMetodo, selectCifrado,
                selectCumpleEstandar, selectRequiereAutenticacion, idUsuario, idContrasena, idEmail, idTelefonoFijo,
                idNroCelular, idTextoInformaCertificados);
    }
}