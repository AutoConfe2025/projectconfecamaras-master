package com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl;

import com.co.confecamaras.interactions.WaitInterrupted10Segundos;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilEsadlPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class FlujoHastaPago implements Task {

    private final String valor;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EDITAR_NUEVO_VALOR_BOTON),
                Click.on(CAMPO_EDITABLE_NUEVO_VALOR_BOTON),
                Enter.theValue(valor).into(CAMPO_EDITABLE_NUEVO_VALOR_BOTON)
        );

        if (EDITAR_NUEVO_VALOR_BOTON_ESTABLECIMIENTO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(EDITAR_NUEVO_VALOR_BOTON_ESTABLECIMIENTO),
                    Click.on(CAMPO_EDITABLE_NUEVO_VALOR_BOTON),
                    Enter.theValue(valor).into(CAMPO_EDITABLE_NUEVO_VALOR_BOTON)
            );
        }

        actor.attemptsTo(
                Click.on(CAMPO_NUMERO_DE_PERSONAL),
                Enter.theValue("30").into(CAMPO_NUMERO_DE_PERSONAL),
                Click.on(BOTON_LIQUIDAR_ESADL_AGIL),
                WaitUntil.the(BOTON_DILIGENCIAR_ESADL_AGIL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DILIGENCIAR_ESADL_AGIL),
                WaitUntil.the(LISTA_EMPRENDIMIENTO_SOCIAL, isPresent()).forNoMoreThan(240).seconds()
        );

        if (LISTA_EMPRENDIMIENTO_SOCIAL.isVisibleFor(actor)) {
            actor.attemptsTo(
                    SelectFromOptions.byValue("N").from(LISTA_EMPRENDIMIENTO_SOCIAL)
            );
        }

        actor.attemptsTo(
                // FLUJO DE FIRMA
                Click.on(CAMPO_INGRESO_VALOR_ACTIVO_TOTAL),
                Enter.theValue(valor).into(CAMPO_INGRESO_VALOR_ACTIVO_TOTAL),
                Click.on(CAMPO_INGRESO_VALOR_PASIVO_TOTAL),
                Enter.theValue(valor).into(CAMPO_INGRESO_VALOR_PASIVO_TOTAL),
                Scroll.to(CAMPO_INGRESO_VALOR_ACTIVIDAD_ORDINARIA).andAlignToTop(),
                Click.on(CAMPO_INGRESO_VALOR_ACTIVIDAD_ORDINARIA),
                Enter.theValue(valor).into(CAMPO_INGRESO_VALOR_ACTIVIDAD_ORDINARIA),
                SelectFromOptions.byValue("N").from(LISTA_PARTICIPACION_GRUPOS_ETNICOS),
                SelectFromOptions.byValue("N").from(LISTA_PERTENECE_GRUPOS_ETNICOS),
                SelectFromOptions.byValue("N").from(LISTA_PARTICIPACION_GRUPOS_ETNICOS_ADMINISTRATIVOS),
                Scroll.to(BOTON_GRABAR_FORMLARIO_ESADL).andAlignToTop(),
                Click.on(BOTON_GRABAR_FORMLARIO_ESADL),
                WaitInterrupted10Segundos.esperaConstante10()
        );

//        if (BOTON_DILIGENCIAR_ESADL_AGIL.resolveFor(actor)
//                .withTimeoutOf(Duration.ofSeconds(120))
//                .waitUntilVisible()
//                .isVisible()) {
//
//            actor.attemptsTo(
//                    Click.on(BOTON_DILIGENCIAR_ESADL_AGIL),
//                    WaitUntil.the(LISTA_AUTORIZA_MENSAJES, isPresent()).forNoMoreThan(240).seconds(),
//                    SelectFromOptions.byValue("N").from(LISTA_AUTORIZA_MENSAJES),
//                    Scroll.to(CAMPO_INGRESO_VALOR_ACTIVOS_VINCULADOS).andAlignToTop(),
//                    Click.on(CAMPO_INGRESO_VALOR_ACTIVOS_VINCULADOS),
//                    Enter.theValue(valor).into(CAMPO_INGRESO_VALOR_ACTIVOS_VINCULADOS),
//                    Scroll.to(BOTON_GRABAR_FORMLARIO_ESADL).andAlignToTop(),
//                    Click.on(BOTON_GRABAR_FORMLARIO_ESADL)
//            );
//        }

        actor.attemptsTo(
                WaitUntil.the(BOTON_LIQUIDACION_DEL_TRAMITE, isPresent()).forNoMoreThan(100).seconds(),
                Click.on(BOTON_LIQUIDACION_DEL_TRAMITE),
                WaitUntil.the(BOTON_CERRAR_LIQUIDACION_DEL_TRAMITE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_LIQUIDACION_DEL_TRAMITE),
                Click.on(BOTON_LIQUIDAR_ESADL_AGIL),
                WaitUntil.the(BOTON_OK_FORMLARIO_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_OK_FORMLARIO_ESADL),
                WaitUntil.the(BOTON_ABRIR_PDF_DE_FIRMA, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ABRIR_PDF_DE_FIRMA),
                WaitUntil.the(BOTON_CERRAR_PDF_DE_FIRMA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_PDF_DE_FIRMA),
                WaitUntil.the(BOTON_FIRMAR_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FIRMAR_ESADL),
                WaitUntil.the(BOTON_SI_FIRMAR_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_FIRMAR_ESADL),
                WaitUntil.the(BOTON_CERRAR_SI_FIRMAR_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SI_FIRMAR_ESADL),
                WaitUntil.the(BOTON_ABRIR_PDF_DE_VISUALIZAR, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_ABRIR_PDF_DE_VISUALIZAR),
                WaitUntil.the(BOTON_CERRAR_PDF_DE_FIRMA, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CERRAR_PDF_DE_FIRMA),
                WaitUntil.the(BOTON_PAGAR_ESADL_AGIL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_PAGAR_ESADL_AGIL)
        );
    }

    public static FlujoHastaPago hastaPago(String valor) {
        return instrumented(FlujoHastaPago.class, valor);
    }
}
