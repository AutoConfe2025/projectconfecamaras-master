package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_GRABAR_AREF;
import static com.co.confecamaras.userinterfaces.general.GeneralPage.BOTON_REGRESAR_AREF;
import static com.co.confecamaras.userinterfaces.registros_publicos.RevisionKardexPrepagosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoRevisionKardexPrepagos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_LIBRO_KARDEX, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_LIBRO_KARDEX),
                Click.on(BOTON_CREAR),
                WaitUntil.the(CAMPO_TIPO_MOVIMIENTO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_TIPO_MOVIMIENTO),
                Enter.theValue("-").into(CAMPO_TIPO_MOVIMIENTO),
                Click.on(CAMPO_CONCEPTO),
                Enter.theValue("Descontar").into(CAMPO_CONCEPTO),
                Click.on(CAMPO_VALOR),
                Enter.theValue("2000").into(CAMPO_VALOR),
                Click.on(BOTON_GRABAR_AREF),
                AceptAlert.aceptar(),
                Click.on(BOTON_REGRESAR_AREF)
        );
    }

    public static final FlujoRevisionKardexPrepagos revisionKardexPrepago() {
        return new FlujoRevisionKardexPrepagos();
    }
}
