package com.co.confecamaras.tasks.renovaciones.esadl_catorce_caja;

import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPjEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.codeborne.selenide.Condition.readonly;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoEsadCatorcePublico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted5Segundos.esperaConstante5(),
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(BOTON_FORMULARIO_1)
        );
        actor.attemptsTo(
                WaitUntil.the(LISTA_EMPRENDIMIENTO_SOCIAL, isPresent()).forNoMoreThan(50).seconds(),
                SelectFromOptions.byValue("N").from(LISTA_EMPRENDIMIENTO_SOCIAL),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(50).seconds()
        );

        if (LISTA_SELECION_AUTORIZACIONES.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                    SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES)
            );

        } else {
            System.out.println("la lista de seleccion no esta disponible");
        }

        if (CAMPO_NIT_DATOS_IDENTIFICACION.resolveFor(actor).isVisible()
                && CAMPO_NIT_DATOS_IDENTIFICACION.resolveFor(actor).isEnabled() && readonly == null) {

            actor.attemptsTo(
                    Scroll.to(CAMPO_NIT_DATOS_IDENTIFICACION),
                    Click.on(CAMPO_NIT_DATOS_IDENTIFICACION),
                    Enter.theValue("8100047502").into(CAMPO_NIT_DATOS_IDENTIFICACION),
                    SelectFromOptions.byValue("10").from(LISTA_NIT_DATOS_IDENTIFICACION)
            );

        } else {
            System.out.println("El campo NIT no está disponible para ingreso");
        }


        if (LISTA_SELECION_TIPO_DE_LOCAL.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Scroll.to(LISTA_SELECION_TIPO_DE_LOCAL),
                    Click.on(LISTA_SELECION_TIPO_DE_LOCAL),
                    Click.on(LISTA_SELECION_TIPO_DE_LOCAL_NO_PROPIO)
            );

        } else {
            System.out.println("la lista de seleccion de local no esta disponible");
        }

        actor.attemptsTo(
                WaitUntil.the(CAMPO_VALOR_ACTIVO_TOTAL, isPresent()).forNoMoreThan(50).seconds()
        );

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_ACTIVO_CORRIENTE, isPresent()).forNoMoreThan(60).seconds(),
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE),
                Scroll.to(CAMPO_PERSONAL_OCUPADO),
                Click.on(CAMPO_PERSONAL_OCUPADO),
                Enter.theValue("100").into(CAMPO_PERSONAL_OCUPADO),
                SelectFromOptions.byValue("S").from(LISTA_PERTENECE_GRUPO_ETNICO_PJ),
                Enter.theValue("1").into(CAMPO_ROM_GITANOS_PJ),
                SelectFromOptions.byValue("S").from(LISTA_ETNICOS_SI_ADMINISTRATIVOS),
                Scroll.to(CAMPO_GITANOS_EMPLEADOS),
                Enter.theValue("1").into(CAMPO_GITANOS_EMPLEADOS),
                SelectFromOptions.byValue("S").from(LISTA_PERSONAL_OCUPADO_ADMINISTRATIVO),
                Enter.theValue("1").into(CAMPO_PERSONAL_OCUPADO_ADMINISTRATIVO),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );
    }

    public static FlujoEsadCatorcePublico flujoEsadlCatocePublico() {
        return new FlujoEsadCatorcePublico();
    }
}
