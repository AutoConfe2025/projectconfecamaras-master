package com.co.confecamaras.tasks.renovaciones.cancelacion_proponente;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoCancelacionProponentePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.BOTON_CERRAR_PDF;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FlujoPagoCancelacionProponente implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_IMPRIMIR_FORM_CANCELACION_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_IMPRIMIR_FORM_CANCELACION_PROPONENTE),
                WaitInterrupted3Segundos.esperaConstante3(),
                Scroll.to(BOTON_CERRAR_PDF_FORMULARIO).andAlignToTop(),
                Click.on(BOTON_CERRAR_PDF_FORMULARIO),
                WaitUntil.the(BOTON_RECIBIR_PAGO_CANCELACION_PROPONENTE, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_RECIBIR_PAGO_CANCELACION_PROPONENTE),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );

        //flujo recibir pago
        actor.attemptsTo(
                WaitUntil.the(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE),
                WaitUntil.the(LISTA_DE_SELECCION_TIPO_IDENTIFICACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(LISTA_DE_SELECCION_TIPO_IDENTIFICACION).andAlignToTop(),
                SelectFromOptions.byValue("1").from(LISTA_DE_SELECCION_TIPO_IDENTIFICACION),
                Click.on(CAMPO_TIPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_TIPO_IDENTIFICACION),
                Scroll.to(BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR).andAlignToTop(),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR),
                WaitUntil.the(CAMPO_CONFIRMAR_CORREO, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(CAMPO_CONFIRMAR_CORREO).andAlignToTop(),
                Click.on(CAMPO_CONFIRMAR_CORREO),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CONFIRMAR_CORREO),
                Scroll.to(BOTON_DUPLICAR_DATOS_CLIENTE).andAlignToTop(),
                Click.on(BOTON_DUPLICAR_DATOS_CLIENTE),
                Scroll.to(BOTON_GENERAR_RECIBO_CLIENTE).andAlignToTop(),
                Click.on(BOTON_GENERAR_RECIBO_CLIENTE),
                WaitUntil.the(BOTON_CONTINUAR_RECIBO_PAGO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBO_PAGO),
                WaitUntil.the(TEXTO_FINAL_PAGO, isPresent()).forNoMoreThan(120).seconds()
        );

        //validar pago
        actor.attemptsTo(
                CloseSecondTab.now(),
                WaitUntil.the(OPCION_SOPORTES, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(OPCION_SERVICIOS),
                WaitUntil.the(OPCION_SOPORTES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SOPORTES),
                WaitUntil.the(OPCION_SOPORTES_VER_1, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(OPCION_SOPORTES_VER_1),
                WaitUntil.the(BOTON_CERRAR_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(OPCION_SOPORTES_VER_2, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(OPCION_SOPORTES_VER_2),
                WaitUntil.the(BOTON_CERRAR_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(OPCION_SOPORTES_VER_3, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(OPCION_SOPORTES_VER_3),
                WaitUntil.the(BOTON_CERRAR_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_CERRAR_PDF)
        );
    }
    public static FlujoPagoCancelacionProponente FlujoCancelacionPro(){
        return instrumented(FlujoPagoCancelacionProponente.class);
    }
}
