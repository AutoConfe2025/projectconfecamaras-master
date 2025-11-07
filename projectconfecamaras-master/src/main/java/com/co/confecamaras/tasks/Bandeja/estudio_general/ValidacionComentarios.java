package com.co.confecamaras.tasks.Bandeja.estudio_general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionComentarios implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_COMENTARIOS),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(TARJETA_COMENTARIOS, isVisible()).forNoMoreThan(30).seconds()
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaComentarioPresente.ahora(), is(true))
        );
    }

    public static ValidacionComentarios validaComentarios() {
        return Tasks.instrumented(ValidacionComentarios.class);
    }
}
