package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.general.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.registros_publicos.ExtraccionNoRenivadosSS1727Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoExtraccionNorenovadosSS1727 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_ANO_CORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_ANO_CORTE),
                Enter.theValue("2026").into(CAMPO_ANO_CORTE),
                Click.on(LISTA_AMBIENTE),
                Click.on(CAMPO_CORREO_ELECTRONICO),
                Enter.theValue("frojas@confecamaras.org.co").into(CAMPO_CORREO_ELECTRONICO),
                Click.on(LISTA_CAMARA),
                WaitUntil.the(OPCION_MANIZALES_LISTA_CAMARA,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_MANIZALES_LISTA_CAMARA),
                Click.on(BOTON_EXTRAER_BOTON),
                Click.on(BOTON_GENERAR_BOTON)
        );

        actor.should(
                seeThat("La tarjeta de comentarios es visible",
                        ValidaComentarioPresente.tarjetaCompleta(), is(true))
        );
    }
    public static FlujoExtraccionNorenovadosSS1727 ExtraccionSS1727(){
        return new FlujoExtraccionNorenovadosSS1727();
    }
}
