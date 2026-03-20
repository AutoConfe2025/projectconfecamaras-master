package com.co.confecamaras.tasks.renovaciones.renovacion_varios_anios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class PrimerFormularioVariosAnios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES)
        );

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.remember("valorUsar",valorCapturado);

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
                //2025
                Scroll.to(CAMPO_ACTIVO_CORRIENTE_2025),
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE_2025),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE_2025),
                Scroll.to(CAMPO_ACTIVO_CORRIENTE_2025),
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE_2025),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE_2025),
                Scroll.to(CAMPO_PERSONAL_OCUPADO_2025),
                Click.on(CAMPO_PERSONAL_OCUPADO_2025),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_2025),
                //2024
                Scroll.to(CAMPO_ACTIVO_CORRIENTE_2024),
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_CORRIENTE_2024),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_CORRIENTE_2024),
                Scroll.to(CAMPO_PERSONAL_OCUPADO_2024),
                Click.on(CAMPO_PERSONAL_OCUPADO_2024),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_2024),

                Scroll.to(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("E").from(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("N").from(LISTA_CUENTA_EMPLEADOS_ETNICOS),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION,isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );
    }

    public static PrimerFormularioVariosAnios flujoVarioAnios(){
        return new PrimerFormularioVariosAnios();
    }
}
