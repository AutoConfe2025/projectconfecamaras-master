package com.co.confecamaras.tasks.certificados_automaticos.certificado_existencia_caja;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.certificados_automaticos.AutomaticoExistenciaCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_CERRAR_PDF;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoDePagoCertificado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        //Flujo generar recibo de pago
        actor.attemptsTo(
                WaitUntil.the(LISTA_DE_SELECCION_TIPO_IDENTIFICACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(LISTA_DE_SELECCION_TIPO_IDENTIFICACION).andAlignToTop(),
                SelectFromOptions.byValue("1").from(LISTA_DE_SELECCION_TIPO_IDENTIFICACION),
                Click.on(CAMPO_TIPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_TIPO_IDENTIFICACION),
                Scroll.to(BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR).andAlignToTop(),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR)
        );

        String correo = Attribute.of(CAMPO_CORREO).named("value").answeredBy(actor);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_CONFIRMAR_CORREO, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(CAMPO_CONFIRMAR_CORREO).andAlignToTop(),
                Click.on(CAMPO_CONFIRMAR_CORREO),
                Enter.theValue(correo).into(CAMPO_CONFIRMAR_CORREO),
                Scroll.to(BOTON_GENERAR_RECIBO_CLIENTE_2).andAlignToTop(),
                Click.on(BOTON_GENERAR_RECIBO_CLIENTE_2),
                WaitUntil.the(BOTON_CONTINUAR_RECIBO_PAGO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBO_PAGO)
        );

        if (BOTON_DESCARGAR_RECIBO_GENERADO.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Scroll.to(BOTON_DESCARGAR_RECIBO_GENERADO),
                    Click.on(BOTON_DESCARGAR_RECIBO_GENERADO)
            );
        }
        //Flujo de validacion de pago

        actor.attemptsTo(
                CloseSecondTab.now(),
                WaitUntil.the(OPCION_SOPORTES, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(OPCION_SERVICIOS),
                WaitUntil.the(OPCION_SOPORTES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SOPORTES),
                WaitUntil.the(OPCION_SOPORTES_VER_1, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(OPCION_SOPORTES_VER_1)
        );
    }

    public static FlujoDePagoCertificado flujoPago() {
        return instrumented(FlujoDePagoCertificado.class);
    }
}
