package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.InfoemesPorServicios.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaInformServicios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LISTA_SELECCION_USUARIO),
                WaitUntil.the(CAMPO_INGRESO_BUSQUEDA,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_INGRESO_BUSQUEDA),
                Enter.theValue("CAJAQA").into(CAMPO_INGRESO_BUSQUEDA),
                WaitUntil.the(SELECCION_OPCION_0,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(SELECCION_OPCION_0),
                Click.on(BOTON_CONSULTAR_INFORME_RESUMIDO),
                WaitUntil.the(OPCION_SI_CAMPO_IMPORTANTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SI_CAMPO_IMPORTANTE),
                WaitUntil.the(BOTON_CERRAR,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR)
        );
    }

    public static ValidaInformServicios validaInforme(){
        return new ValidaInformServicios();
    }
}
