package com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja;

import com.co.confecamaras.interactions.IngresarFechaActual;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES),
                Click.on(CAMPO_FECHA_INICIO_ACTIVIDAD_SEGUNDARIA),
                IngresarFechaActual.enElCampo(CAMPO_FECHA_INICIO_ACTIVIDAD_SEGUNDARIA)
        );

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.attemptsTo(
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE),
                Scroll.to(CAMPO_PERSONAL_OCUPADO),
                Click.on(CAMPO_PERSONAL_OCUPADO),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO),
                Scroll.to(CAMPO_CANTIDAD_MUJERES_OCUPADAS),
                Click.on(CAMPO_CANTIDAD_MUJERES_OCUPADAS),
                Clear.field(CAMPO_CANTIDAD_MUJERES_OCUPADAS),
                Enter.theValue("1").into(CAMPO_CANTIDAD_MUJERES_OCUPADAS),
                SelectFromOptions.byValue("S").from(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("S").from(LISTA_AUTORIZA_INFORMACION),
                SelectFromOptions.byValue("INDIGENA").from(LISTA_GRUPO_ETNICO),
                Click.on(CAMPO_NOMBRE_GRUPO_ETNICO),
                Enter.theValue("QA").into(CAMPO_NOMBRE_GRUPO_ETNICO),
                SelectFromOptions.byValue("S").from(LISTA_CUENTA_EMPLEADOS_ETNICOS),
                Scroll.to(CAMPO_GITANOS),
                Click.on(CAMPO_GITANOS),
                Enter.theValue("1").into(CAMPO_GITANOS),
                Click.on(CAMPO_RAZIAL),
                Enter.theValue("2").into(CAMPO_RAZIAL),
                Click.on(CAMPO_PALENQUES),
                Enter.theValue("1").into(CAMPO_PALENQUES),
                Scroll.to(CAMPO_NEGROS),
                Click.on(CAMPO_NEGROS),
                Enter.theValue("1").into(CAMPO_NEGROS),
                Click.on(CAMPO_AFRODECENDIENTES),
                Enter.theValue("1").into(CAMPO_AFRODECENDIENTES),
                Click.on(CAMPO_INDIGENAS),
                Enter.theValue("2").into(CAMPO_INDIGENAS),
                Click.on(CAMPO_CUAL),
                Enter.theValue("QA").into(CAMPO_CUAL),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );

        if (BOTON_MENSAJE_INFORMACION.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                    Click.on(BOTON_MENSAJE_INFORMACION)
            );
        }

        actor.attemptsTo(
                WaitUntil.the(BOTON_RECIBIR_PAGO_1, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_1),
                Click.on(BOTON_RECIBIR_PAGO_1),
                SwitchToNewWindow.switchToNewTab()
        );

        if(CERRAR_ALERTA_CAJERO.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(CERRAR_ALERTA_CAJERO)
            );
        }
    }

    public static FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja FlujoNaturalCaja() {
        return new FlujoPrimerFormularioPersonaNaturalEstablecimientoCaja();
    }
}
