package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.InformeSICPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoinformeSIC implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("01/12/2025").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FIN),
                Enter.theValue("29/12/2025").into(CAMPO_FECHA_FIN),
                Click.on(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue("frojas@confecamaras.org.co").into(CAMPO_CORREO_ELECTRONICO),
                Click.on(BTN_EXTRAER),
                Click.on(BTN_GENERAR)
        );

        actor.should(
                seeThat("mensaje informativo", ValidaComentarioPresente.tituloInformativo(), is(true))
        );
    }

    public static FlujoinformeSIC flujoSic(){
        return new FlujoinformeSIC();
    }
}
