package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.DetalleCajaAnalisisPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.Matchers.is;

public class FlujoDetalleParaAnalisisCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LISTA_OPERADOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_OPERADOR),
                WaitUntil.the(OPCION_CAJAQA_LISTA_OPERADOR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CAJAQA_LISTA_OPERADOR),
                Click.on(CAMPO_FECHA_INICIAL_ANALISIS),
                Enter.theValue("01/12/2025").into(CAMPO_FECHA_INICIAL_ANALISIS),
                Click.on(CAMPO_FECHA_FIN_ANALISIS),
                Enter.theValue("02/12/2025").into(CAMPO_FECHA_FIN_ANALISIS),
                Click.on(LISTA_TIPOS_INFORME),
                WaitUntil.the(OPCION_SERVICIO_LISTA_TIPOS_INFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SERVICIO_LISTA_TIPOS_INFORME),
                Click.on(LISTA_TIPOS_SALIDA),
                WaitUntil.the(OPCION_PDF_LISTA_TIPOS_SALIDA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_PDF_LISTA_TIPOS_SALIDA),
                Click.on(CAMPO_EMAIL_CONTROL),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_EMAIL_CONTROL),
                Click.on(LISTA_AMBIENTE),
                WaitUntil.the(OPCION_DEFAULT_LISTA_AMBIENTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_DEFAULT_LISTA_AMBIENTE),
                Click.on(BTN_GENERAR),
                WaitUntil.the(BTN_GENERAR_ALERTA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BTN_GENERAR_ALERTA)
        );

        actor.should(
                seeThat("mensaje de confirmacion esta presente",
                        ValidaComentarioPresente.tituloInformativo(), is(true))
        );
    }

    public static FlujoDetalleParaAnalisisCaja analisisCajaDetalle() {
        return new FlujoDetalleParaAnalisisCaja();
    }
}
