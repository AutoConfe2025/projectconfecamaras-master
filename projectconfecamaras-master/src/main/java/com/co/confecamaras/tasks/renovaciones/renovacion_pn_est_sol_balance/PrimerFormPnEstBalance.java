package com.co.confecamaras.tasks.renovaciones.renovacion_pn_est_sol_balance;

import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_MENSAJE_INFORMACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class PrimerFormPnEstBalance implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_1, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(BOTON_FORMULARIO_1),
                WaitUntil.the(LISTA_SELECION_AUTORIZACIONES, isPresent()).forNoMoreThan(40).seconds(),
                Scroll.to(LISTA_SELECION_AUTORIZACIONES),
                SelectFromOptions.byValue("NO").from(LISTA_SELECION_AUTORIZACIONES)
        );

        if (actor.asksFor(ElementoElegible.para(BUTTON_CIIU_MAYOR_INGRESO))) {
            actor.attemptsTo(
                    Scroll.to(BUTTON_CIIU_MAYOR_INGRESO).andAlignToBottom(),
                    Click.on(BUTTON_CIIU_MAYOR_INGRESO),
                    SelectFromOptions.byValue("10").from(LISTA_SELECCION_DIAN)
            );
        }

        String valorCapturado = Attribute.of(CAMPO_VALOR_ACTIVO_TOTAL)
                .named("value")
                .answeredBy(actor);

        actor.remember("valorCapturadoValores", valorCapturado);

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
                Scroll.to(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("E").from(LISTA_PERTENECE_GRUPO_ETNICO),
                SelectFromOptions.byValue("N").from(LISTA_CUENTA_EMPLEADOS_ETNICOS_1),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );
    }

    public static PrimerFormPnEstBalance primerForm(){
        return instrumented(PrimerFormPnEstBalance.class);
    }
}
