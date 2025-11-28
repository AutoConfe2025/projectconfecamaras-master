package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.recursos.Page.MENSAJE_INFORMATIVO;
import static com.co.confecamaras.userinterfaces.Bandejas.revision_desistimientos.page.*;
import static com.co.confecamaras.utils.bandejas.recursos_reposicion.Constants.MENSAJE_RESPUESTA_TELEFONICA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class IngresoTelefonica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_TELEFONICA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TELEFONICA),
                WaitUntil.the(CAMPO_HABLO_CON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_HABLO_CON),
                Enter.theValue("qa").into(CAMPO_HABLO_CON),
                WaitUntil.the(CAMPO_DETALLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DETALLE),
                Enter.theValue("qa").into(CAMPO_DETALLE),
                WaitUntil.the(CAMPO_DETALLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONFIRMAR),
                AceptAlert.aceptar()
        );

        actor.should(
                seeThat("Mensaje codigo de barras terminado",
                        of(MENSAJE_INFORMATIVO), containsString(MENSAJE_RESPUESTA_TELEFONICA))
        );
    }

    public static IngresoTelefonica telefonica() {
        return new IngresoTelefonica();
    }
}
