package com.co.confecamaras.tasks.Bandeja.estudio_general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estado_general.Pagina_Princial.*;
import static com.co.confecamaras.utils.estudio_general.constant.MENSAJE_COMENTARIO;
import static com.co.confecamaras.utils.estudio_general.constant.TEXTO_PRUEBA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class ValidarIngresoNuevoComentario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_COMENTARIOS),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(LISTA_TIPO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(LISTA_TIPO),
                Click.on(SELECCION_OPCION_PRUEBAS),
                Click.on(CUADRO_AGREGAR_COMENTARIO),
                Enter.theValue(TEXTO_PRUEBA).into(CUADRO_AGREGAR_COMENTARIO),
                Click.on(BOTON_GRABAR)
        );


        actor.should(
                seeThat("El mensaje de confirmación es correcto",
                        of(MENSAJE_GRABACION_COMENTARIO), containsString(MENSAJE_COMENTARIO))
        );
    }

    public static ValidarIngresoNuevoComentario validaMensaje() {
        return new ValidarIngresoNuevoComentario();
    }

}
