package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.GestionUsuariosExternosUI.*;
import static com.co.confecamaras.userinterfaces.GestionUsuariosExternosUI.BTN_REGRESAR_USUARIO_EXTERNOS;

public class ConsultaUsuariosExternos implements Interaction {

    private String selectEstadoUsuarios;
    private String selectEstadoUsuariosDos;
    private String idApellido;
    private String idIdentificacionUsuario;
    private String idEmail;
    private String idCelular;

    public ConsultaUsuariosExternos(String selectEstadoUsuarios, String selectEstadoUsuariosDos, String idApellido,
                                    String idIdentificacionUsuario, String idEmail, String idCelular) {
        this.selectEstadoUsuarios = selectEstadoUsuarios;
        this.selectEstadoUsuariosDos = selectEstadoUsuariosDos;
        this.idApellido = idApellido;
        this.idIdentificacionUsuario = idIdentificacionUsuario;
        this.idEmail = idEmail;
        this.idCelular = idCelular;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuarios).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuariosDos).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                Click.on(BTN_REGRESAR_USUARIO_EXTERNOS)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_NOMBRE_APELLIDO_USUARIO_EXTERNOS),
                Enter.theValue(idApellido).into(TXT_NOMBRE_APELLIDO_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                Click.on(BTN_REGRESAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_LIMPIAR_USUARIO_EXTERNOS),
                Click.on(BTN_LIMPIAR_USUARIO_EXTERNOS)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuarios).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuariosDos).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                WaitInteractions.untilBeEnable(TXT_IDENTIFICACION_USUARIO_EXTERNOS),
                Enter.theValue(idIdentificacionUsuario).into(TXT_IDENTIFICACION_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                Click.on(BTN_REGRESAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_LIMPIAR_USUARIO_EXTERNOS),
                Click.on(BTN_LIMPIAR_USUARIO_EXTERNOS)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuarios).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuariosDos).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                WaitInteractions.untilBeEnable(TXT_EMAIL_USUARIO_EXTERNOS),
                Enter.theValue(idEmail).into(TXT_EMAIL_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                Click.on(BTN_REGRESAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_LIMPIAR_USUARIO_EXTERNOS),
                Click.on(BTN_LIMPIAR_USUARIO_EXTERNOS)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuarios).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                SelectFromOptions.byVisibleText(selectEstadoUsuariosDos).from(SELECT_ESTADOS_USUARIO_EXTERNOS),
                WaitInteractions.untilBeEnable(TXT_CELULAR_USUARIO_EXTERNOS),
                Enter.theValue(idCelular).into(TXT_CELULAR_USUARIO_EXTERNOS),
                Click.on(BTN_CONTINUAR_USUARIO_EXTERNOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilAppears(BTN_REGRESAR_USUARIO_EXTERNOS),
                Click.on(BTN_REGRESAR_USUARIO_EXTERNOS),
                WaitInteractions.untilAppears(BTN_LIMPIAR_USUARIO_EXTERNOS),
                Click.on(BTN_LIMPIAR_USUARIO_EXTERNOS)
        );
    }

    public static ConsultaUsuariosExternos enConfecamaraSII(String selectEstadoUsuarios, String selectEstadoUsuariosDos, String idApellido,
                                                            String idIdentificacionUsuario, String idEmail, String idCelular){
        return new ConsultaUsuariosExternos(selectEstadoUsuarios, selectEstadoUsuariosDos, idApellido, idIdentificacionUsuario,
                idEmail, idCelular);
    }
}