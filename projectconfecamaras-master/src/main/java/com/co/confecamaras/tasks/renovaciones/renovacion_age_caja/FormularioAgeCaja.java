package com.co.confecamaras.tasks.renovaciones.renovacion_age_caja;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FormularioAgeCaja implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String valorNuevo = actor.recall("valorNuevo");

        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADOS),
                Enter.theValue(valorNuevo).into(CAMPO_VALOR_COMERCIAL_VINCULADOS),
                Click.on(CAMPO_PERSONAL_OCUPADO),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION),
                WaitUntil.the(BOTON_PRIMER_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_PRIMER_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(BOTON_RECIBIR_PAGO_1, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_1),
                Click.on(BOTON_RECIBIR_PAGO_1),
                SwitchToNewWindow.switchToNewTab(),
                SelectFromOptions.byValue("1").from(LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO)
        );
    }

    public static FormularioAgeCaja renovacionAgeCaja(){
        return new FormularioAgeCaja();
    }
}
