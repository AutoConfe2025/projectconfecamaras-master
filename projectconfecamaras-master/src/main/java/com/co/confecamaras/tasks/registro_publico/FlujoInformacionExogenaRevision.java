package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoInformacionExogenaRevision implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INICIAL_DD_MM_AAAA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL_DD_MM_AAAA),
                Enter.theValue("01/01/2026").into(CAMPO_FECHA_INICIAL_DD_MM_AAAA),
                Click.on(CAMPO_FECHA_FINAL_DD_MM_AAAA),
                Enter.theValue("14/01/2026").into(CAMPO_FECHA_FINAL_DD_MM_AAAA),
                Click.on(CAMPO_CORREO_ELECTRONICO_CONTROL),
                Enter.theValue("frojas@confecamaras.org.co").into(CAMPO_CORREO_ELECTRONICO_CONTROL),
                Click.on(BOTON_GENERAR_BOTON),
                Click.on(BOTON_GENERAR_BOTON_ALERTA)
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaComentarioPresente.tarjetaCompleta(), is(true))
        );
    }

    public static FlujoInformacionExogenaRevision informacionExogena(){
        return new FlujoInformacionExogenaRevision();
    }
}
