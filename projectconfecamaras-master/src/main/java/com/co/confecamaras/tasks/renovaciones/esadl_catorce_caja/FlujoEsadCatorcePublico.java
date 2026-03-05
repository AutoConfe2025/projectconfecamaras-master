package com.co.confecamaras.tasks.renovaciones.esadl_catorce_caja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPjEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPjEstCajaPage.CAMPO_GITANOS_EMPLEADOS;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_PRIMER_PDF;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoEsadCatorcePublico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(50).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(50).seconds(),
                Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES)
        );

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.attemptsTo(
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

    public static FlujoEsadCatorcePublico flujoEsadlCatocePublico(){
        return new FlujoEsadCatorcePublico();
    }
}
