package com.co.confecamaras.tasks.Bandeja.general;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_GRABACION_COMENTARIO;
import static com.co.confecamaras.userinterfaces.Bandejas.tramites_reingresados.page.*;
import static com.co.confecamaras.utils.estudio_general.constant.MENSAJE_COMENTARIO;
import static com.co.confecamaras.utils.estudio_general.constant.MENSAJE_FINALIZAR_ESCANEO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class FinalizarEscaneoDigitalizacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_FINALIZAR),
                Click.on(BOTON_CONTINUAR),
                Click.on(LISTA_USUARIO),
                Click.on(OPCION_CAJAQA),
                Click.on(BOTON_ASIGNAR)
        );

        actor.should(
                seeThat("El mensaje de finalizacion de escaneo",
                        of(MENSAJE_GRABACION_COMENTARIO), containsString(MENSAJE_FINALIZAR_ESCANEO))
        );
    }

    public static FinalizarEscaneoDigitalizacion escaneoFinalizar(){
        return new FinalizarEscaneoDigitalizacion();
    }
}
