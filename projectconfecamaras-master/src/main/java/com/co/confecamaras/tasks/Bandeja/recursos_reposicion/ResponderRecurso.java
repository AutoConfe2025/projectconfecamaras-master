package com.co.confecamaras.tasks.Bandeja.recursos_reposicion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.recursos.Page.*;
import static com.co.confecamaras.utils.bandejas.recursos_reposicion.Constants.MENSAJE_RESPUESTA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

@AllArgsConstructor
public class ResponderRecurso implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_RESPONDER, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RESPONDER),
                Click.on(BOTON_ACTUALIZAR)
        );

        actor.should(
                seeThat("Mensaje codigo de barras terminado",
                        of(MENSAJE_INFORMATIVO), containsString(MENSAJE_RESPUESTA))
        );

    }

    public static ResponderRecurso Responde() {
        return new ResponderRecurso();

    }
}
