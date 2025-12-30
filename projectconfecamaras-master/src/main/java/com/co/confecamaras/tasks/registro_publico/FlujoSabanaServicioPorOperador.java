package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.SabanaServicioPorOperadorPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoSabanaServicioPorOperador implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_TIPO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_TIPO),
                Click.on(OPCION_SERVICIOS_VENDIDOS),
                Click.on(BOTON_GENERAR_SABANA),
                WaitUntil.the(BOTON_GENERAR_CSV,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_GENERAR_CSV)
        );
    }

    public static FlujoSabanaServicioPorOperador sabanaServicio(){
        return new FlujoSabanaServicioPorOperador();
    }
}
