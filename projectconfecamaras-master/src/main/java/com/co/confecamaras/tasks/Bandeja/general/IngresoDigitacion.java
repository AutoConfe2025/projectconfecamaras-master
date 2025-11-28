package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.cerrarpestana.CloseEmbeddedPdf;
import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.control_calidad.Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

public class IngresoDigitacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_VER_DIGITACION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_VER_DIGITACION)
        );

        actor.should(
                seeThat("se ingreso al modulo de forma correcta",
                        ValidaComentarioPresente.validaDigitacion(), is(true))
        );

        actor.attemptsTo(
                WaitUntil.the(DIGITAR_FORMULARIO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DIGITAR_FORMULARIO)
        );

        actor.should(
                seeThat("se ingreso al modulo de forma correcta",
                        ValidaComentarioPresente.validaTituloDigitacion(), is(true))
        );

        actor.attemptsTo(
                WaitUntil.the(BOTON_VOLVER_DIGITACION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_VOLVER_DIGITACION),
                WaitUntil.the(BOTON_REVISAR_CERTIFICADO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_REVISAR_CERTIFICADO),
                WaitInterrupted5Segundos.esperaConstante5(),
                CloseEmbeddedPdf.now(),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_ACTUALIZAR_RUES, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_ACTUALIZAR_RUES),
                WaitUntil.the(BOTON_ACTUALIZAR_RUES_2, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_ACTUALIZAR_RUES_2)

        );
        actor.should(
                seeThat("Titulo mensaje informativo actualizar v2",
                        ValidaComentarioPresente.tituloInformativo(), is(true))
        );

        actor.should(
                seeThat("valida documento expediente",
                        ValidaComentarioPresente.validaExpedienteNo(), is(true))
        );

        actor.attemptsTo(
                WaitUntil.the(BOTON_VOLVER_A_DIGITACION, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_VOLVER_A_DIGITACION),
                Click.on(BOTON_VOLVER_A_DIGITACION),
                WaitUntil.the(BOTON_FINALIZAR_DIGITACION, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(BOTON_FINALIZAR_DIGITACION),
                Click.on(BOTON_FINALIZAR_DIGITACION)
        );

        actor.should(
                seeThat("finalizacion digitacion",
                        ValidaComentarioPresente.tituloInformativo(), is(true))
        );
    }

    public static IngresoDigitacion Digitacion() {
        return new IngresoDigitacion();
    }
}
