package com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_2, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_2),
                Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Click.on(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Enter.theValue("21.000.000").into(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Click.on(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Clear.field(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION),
                WaitUntil.the(BOTON_PRIMER_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_PRIMER_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(BOTON_SEGUNDO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CONTENEDOR_PDF),
                WaitUntil.the(BOTON_SEGUNDO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_SEGUNDO_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(BOTON_RECIBIR_PAGO, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO),
                Click.on(BOTON_RECIBIR_PAGO),
                SwitchToNewWindow.switchToNewTab()
        );

        if (ALERTA_CAJERO.resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                    Click.on(CERRAR_ALERTA_CAJERO)
            );
        } else{
            actor.attemptsTo(
                    Click.on(BOTON_ACEPTAR_ALERTA)
            );

        }
    }

    public static FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja SegundoFormulario() {
        return new FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja();
    }
}
