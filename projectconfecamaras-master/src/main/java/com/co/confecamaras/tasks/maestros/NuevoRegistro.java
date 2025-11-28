package com.co.confecamaras.tasks.maestros;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.SELECCION_OPCION_GENERAL;
import static com.co.confecamaras.userinterfaces.maestros.page.*;
import static com.co.confecamaras.utils.maestros.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class NuevoRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NUEVO_MAESTRO),
                Click.on(CAMPO_ID),
                Enter.keyValues(ID).into(CAMPO_ID),
                Click.on(CAMPO_GRUPO),
                Enter.theValue(GRUPO).into(CAMPO_GRUPO),
                Click.on(CAMPO_TITULO),
                Enter.theValue(TITULO).into(CAMPO_TITULO),
                Click.on(LISTA_AYUDA),
                Click.on(AYUDA_SELECCION)
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitUntil.the(CAMPO_DESCRIPCION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DESCRIPCION),
                Enter.keyValues(DESCRIPCION).into(CAMPO_DESCRIPCION),
                Click.on(BOTON_GRABAR)
        );
    }

    public static NuevoRegistro NuevoRegistro() {
        return new NuevoRegistro();
    }
}
