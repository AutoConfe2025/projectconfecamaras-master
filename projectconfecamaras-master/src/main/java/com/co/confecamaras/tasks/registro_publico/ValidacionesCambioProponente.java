package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.sikulli.SafeActions;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.General.OPCION_BANDEJA;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_CONTROL;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.CAMPO_INGRESO_BUSQUEDA_CONTROL;
import static com.co.confecamaras.userinterfaces.registros_publicos.PageCambioDomicilio.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionesCambioProponente implements Task {

    private final String bandeja;

    public ValidacionesCambioProponente(String bandeja) {
        this.bandeja = bandeja;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String clave = actor.recall("clave");

        actor.attemptsTo(
                AbrirUrlSII.enLaUrl("https://siifrontqa.confecamaras.co/"),

                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(OPCION_BANDEJA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_BANDEJA),
                SwitchToNewWindow.switchToNewTab(),
                Click.on(BOTON_RECUPERAR_TRAMITE),
                Enter.theValue(clave).into(CAMPO_INGRESO_COD_RECUPERACION),
                Click.on(BOTON_CONSULTAR),
                WaitUntil.the(BOTON_RADICAR_TRAMITE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RADICAR_TRAMITE),
                Click.on(BOTON_ACEPTAR_TRAMITE),
                WaitUntil.the(BOTON_SOPORTES,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SOPORTES),
                Click.on(BOTON_VER_SOPORTE)
        );
    }

    public static ValidacionesCambioProponente validacionesCambio(String bandeja) {
        return Instrumented.instanceOf(ValidacionesCambioProponente.class)
                .withProperties(bandeja);
    }
}
