package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.registros_publicos.ValidaRegistrosPublicos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionLibrosActosPage.BOTON_GENERAR_FLOTANTE;
import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionProponentesPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoExtraccionProponentes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_ESTADOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_ESTADOS),
                Click.on(OPCION_ACTIVOS),
                Click.on(LISTA_INCLUIR_HABILIDADES),
                Click.on(OPCION_NO_INCLUIR_HABILIDADES),
                Click.on(CAMPO_EMAIL_CONTROL),
                Enter.theValue("frojas@confecamaras.org.co").into(CAMPO_EMAIL_CONTROL),
                Click.on(BOTON_GENERAR_EXTRACCION),
                Click.on(BOTON_GENERAR_FLOTANTE)
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaRegistrosPublicos.generacionextraccionProponentes(), is(true))
        );


    }

    public static FlujoExtraccionProponentes  extraccionProponentes(){
        return new FlujoExtraccionProponentes();
    }
}
