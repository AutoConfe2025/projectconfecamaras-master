package com.co.confecamaras.tasks.renovaciones.renovacion_agil;

import com.co.confecamaras.interactions.IngresarFechaActual;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.FECHA_DOCUMENTO_DATOS_RADICADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class PrimerFormularioAgil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_DILIGENCIAR_FORMULARIO_1, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_DILIGENCIAR_FORMULARIO_1),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitUntil.the(LISTA_AUTORIZACION_MENSAJES,isPresent()).forNoMoreThan(120).seconds()
        );


        actor.attemptsTo(
//                Scroll.to(CAMPO_FECHA_CIIU2),
//                IngresarFechaActual.enElCampo(CAMPO_FECHA_CIIU2),
                Scroll.to(LISTA_AUTORIZACION_MENSAJES),
                SelectFromOptions.byValue("N").from(LISTA_AUTORIZACION_MENSAJES),
                Scroll.to(CAMPO_ACTIVO_TOTAL),
                Click.on(CAMPO_ACTIVO_TOTAL)
        );

        String valorCapturado = Attribute.of(VALOR_ACTIVO_TOTAL).named("value").answeredBy(actor);

        actor.attemptsTo(
                Enter.theValue(valorCapturado).into(CAMPO_ACTIVO_TOTAL),
                Click.on(CAMPO_PASIVO_TOTAL),
                Enter.theValue(valorCapturado).into(CAMPO_PASIVO_TOTAL),
                Scroll.to(CAMPO_PERSONAL_OCUPADO_AGIL).andAlignToTop(),
                Click.on(CAMPO_PERSONAL_OCUPADO_AGIL),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_AGIL),
                Scroll.to(LISTA_GRUPO_ETNICO_AGIL).andAlignToTop(),
                SelectFromOptions.byValue("S").from(LISTA_GRUPO_ETNICO_AGIL),
                SelectFromOptions.byValue("S").from(LISTA_AUTORIZACION_USO_INFO),
                SelectFromOptions.byValue("ROM/GITANOS").from(LISTA_GRUPO_ETNICO),
                Enter.theValue("QA").into(CAMPO_NOMBRE_COMUNIDAD_INDIGENA),
                SelectFromOptions.byValue("S").from(LISTA_SI_CUENTA_EMPLEADOS_ETNICO),
                Clear.field(CAMPO_GITANOS_CANTIDAD),
                Enter.theValue("1").into(CAMPO_GITANOS_CANTIDAD),
                Clear.field(CAMPO_RAZIAL_CANTIDAD),
                Enter.theValue("01").into(CAMPO_RAZIAL_CANTIDAD),
                Clear.field(CAMPO_PALENQUEROS_CANTIDAD),
                Enter.theValue("01").into(CAMPO_PALENQUEROS_CANTIDAD),
                Clear.field(CAMPO_NEGROS_CANTIDAD),
                Enter.theValue("01").into(CAMPO_NEGROS_CANTIDAD),
                Clear.field(CAMPO_AFRO_CANTIDAD),
                Enter.theValue("01").into(CAMPO_AFRO_CANTIDAD),
                Clear.field(CAMPO_INDIGENAS_CANTIDAD),
                Enter.theValue("01").into(CAMPO_INDIGENAS_CANTIDAD),
                Clear.field(CAMPO_INDIGENAS_CUAL_CANTIDAD),
                Enter.theValue("QA").into(CAMPO_INDIGENAS_CUAL_CANTIDAD),
                Scroll.to(BOTON_GRABAR_FORM).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORM)
        );

        actor.remember("valorCapturado",valorCapturado);
    }

    public static PrimerFormularioAgil primerFormAgil(){
        return instrumented(PrimerFormularioAgil.class);
    }
}
