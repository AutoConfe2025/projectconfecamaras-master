package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.InformeProductividadPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoInformeProductividad implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_FECHA_INI, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INI),
                Enter.theValue("01/12/2025").into(CAMPO_FECHA_INI),
                Click.on(CAMPO_FECHA_FIN),
                Enter.theValue("01/12/2025").into(CAMPO_FECHA_FIN),
                Click.on(LISTA_TIPO_INFORME),
                WaitUntil.the(OPCION_INFORME_PRODUCTIVIDAD_LISTA_TIPO_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_INFORME_PRODUCTIVIDAD_LISTA_TIPO_INFORME),
                Click.on(BTN_GENERAR)
        );

        actor.should(
                seeThat("se muestra el mensaje de exito", ValidaComentarioPresente.tituloInformativo(), is(true))

        );
    }

    public static FlujoInformeProductividad informeProductiidad(){
        return new FlujoInformeProductividad();
    }
}
