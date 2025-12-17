package com.co.confecamaras.tasks.maestros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.maestros.page.*;
import static com.co.confecamaras.utils.maestros.Constants.*;
import static com.co.confecamaras.utils.maestros.Constants.DESCRIPCION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EditarEliminar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //EDITAR
                Click.on(BOTON_EDITAR),
                Click.on(CAMPO_ID),
                Enter.keyValues(ID_1).into(CAMPO_ID),
                Click.on(CAMPO_GRUPO),
                WaitUntil.the(OPCION_SI_CAMPO_GRUPO, isPresent()).forNoMoreThan(2).seconds(),
                Click.on(OPCION_SI_CAMPO_GRUPO),
                Click.on(CAMPO_TITULO),
                Enter.theValue(TITULO).into(CAMPO_TITULO),
                Click.on(LISTA_AYUDA),
                Click.on(AYUDA_SELECCION),
                WaitUntil.the(CAMPO_DESCRIPCION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DESCRIPCION),
                Enter.keyValues(DESCRIPCION).into(CAMPO_DESCRIPCION),
                Click.on(BOTON_GRABAR),
                Click.on(BOTON_ACEPTAR_MENSAJE_INFORMATIVO),

                //ELIMINAR
                Click.on(BOTON_ELIMINAR)
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static EditarEliminar editarEliminar(){
        return new EditarEliminar();
    }
}
