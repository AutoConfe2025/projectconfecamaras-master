package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.control_calidad.Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

public class IngresoRegresoDigitacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_REGRESAR_A_DIGITACION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_REGRESAR_A_DIGITACION),
                WaitUntil.the(BOTON_CONTINUAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_CONTINUAR)
        );

        actor.should(
                seeThat("valida documento expediente",
                        ValidaComentarioPresente.tituloInformativo(), is(true))
        );
    }

    public static IngresoRegresoDigitacion regresoADigitacion(){
        return new IngresoRegresoDigitacion();
    }
}
