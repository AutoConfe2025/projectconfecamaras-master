package com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SegundoFormularioVariosAnios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String valor = actor.recall("valorUsar");
        if (BOTON_FORMULARIO_2.isVisibleFor(actor)){
            actor.attemptsTo(
                    WaitUntil.the(BOTON_FORMULARIO_2, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_FORMULARIO_2),

                    //2026
                    Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                    Click.on(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                    Enter.theValue(valor).into(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                    Click.on(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                    Clear.field(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                    Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),

                    //2025
                    Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2025),
                    Click.on(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2025),
                    Enter.theValue(valor).into(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2025),
                    Click.on(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2025),
                    Clear.field(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2025),
                    Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2025),

                    //2024
                    Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2024),
//                Click.on(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2024),
//                Enter.theValue(valor).into(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2024),
                    Click.on(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2024),
                    Clear.field(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2024),
                    Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2024),


                    Scroll.to(BOTON_ALAMCENAR),
                    Click.on(BOTON_ALAMCENAR)

            );
        }

        if (BOTON_MENSAJE_INFORMACION.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                    Click.on(BOTON_MENSAJE_INFORMACION)
            );
        }

        if (BOTON_MENSAJE_INFORMACION.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                    Click.on(BOTON_MENSAJE_INFORMACION)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BOTON_RECIBIR_PAGO_TEXTO_2, isPresent()).forNoMoreThan(50).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_TEXTO_2),
                Click.on(BOTON_RECIBIR_PAGO_TEXTO_2),
                SwitchToNewWindow.switchToNewTab()
        );

        if (CERRAR_ALERTA_CAJERO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(CERRAR_ALERTA_CAJERO)
            );
        }
    }

    public static SegundoFormularioVariosAnios formularioDosVariosAnios() {
        return new SegundoFormularioVariosAnios();
    }
}
