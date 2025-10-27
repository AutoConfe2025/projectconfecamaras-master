package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.UsuariosApiIntegracionRestFullUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class UsuariosApiIntegracionRestFull implements Task {

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().dismiss());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitInteractions.untilAppears(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitInteractions.untilAppears(BTN_USUARIOS_API_INTEGRACION_REST_FULL),
                Scroll.to(BTN_USUARIOS_API_INTEGRACION_REST_FULL).andAlignToBottom(),
                JavaScriptClick.on(BTN_USUARIOS_API_INTEGRACION_REST_FULL),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_EDITAR_USUARIOS_API),
                Click.on(BTN_EDITAR_USUARIOS_API),
                WaitInteractions.untilAppears(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API),
                Scroll.to(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API).andAlignToBottom(),
                Click.on(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API),
                Click.on(BTN_GRABAR_REGISTRO_USUARIOS_API),
                WaitInteractions.untilAppears(BTN_BORRAR_USUARIOS_API),
                Click.on(BTN_BORRAR_USUARIOS_API),
                toAlert(),
                WaitInteractions.untilAppears(BTN_EDITAR_USUARIOS_API),
                Click.on(BTN_EDITAR_USUARIOS_API),
                WaitInteractions.untilAppears(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API),
                Scroll.to(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API).andAlignToBottom(),
                Click.on(CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API),
                Click.on(BTN_GRABAR_REGISTRO_USUARIOS_API)
        );
    }

    public static UsuariosApiIntegracionRestFull enConfecamaraSII() {
        return instrumented(UsuariosApiIntegracionRestFull.class);
    }
}