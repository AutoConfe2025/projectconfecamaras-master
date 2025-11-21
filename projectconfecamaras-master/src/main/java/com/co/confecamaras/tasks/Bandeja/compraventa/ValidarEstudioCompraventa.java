package com.co.confecamaras.tasks.Bandeja.compraventa;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.Pagina_Princial.*;
import static com.co.confecamaras.utils.estudio_general.constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

@AllArgsConstructor
public class ValidarEstudioCompraventa implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ESTUDIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ESTUDIO),
                WaitUntil.the(OPCION_INSCRIBIR_ACTOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_INSCRIBIR_ACTOS),
                WaitUntil.the(BOTON_CONFIRMAR_, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR_),  Click.on(BOTON_CERRAR_MENSAJE),
                WaitUntil.the(OPCION_TERMINAR_INSCRIPCION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_TERMINAR_INSCRIPCION),
                WaitUntil.the(BOTON_CONFIRMAR_, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR_),
                WaitUntil.the(MENSAJE_INSCRIPCION_TERMINADA, isVisible()).forNoMoreThan(10).seconds()
        );

        actor.should(
                seeThat("Mensaje codigo de barras terminado",
                        of(MENSAJE_INSCRIPCION_TERMINADA), containsString(MENSAJE_INSCRIPCION_FINALIZADA))
        );

        actor.attemptsTo(
                Click.on(BOTON_CERRAR_MENSAJE),
                Click.on(OPCION_REGRESAR_BANDEJA)


        );


    }

    public static ValidarEstudioCompraventa ValidoEstudio(){
        return new ValidarEstudioCompraventa();

    }
}
