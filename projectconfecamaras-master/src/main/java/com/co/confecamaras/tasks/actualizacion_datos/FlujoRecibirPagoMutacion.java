package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.OPCION_SOPORTES_VER_1;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoRecibirPagoMutacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab(),
                WaitUntil.the(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE),
                WaitUntil.the(LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("1").from(LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO),
                Click.on(CAMPO_TIPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_TIPO_IDENTIFICACION),
                WaitUntil.the(BOTON_VERIFICAR_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_VERIFICAR_IDENTIFICACION),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION)
        );

        String correo = Attribute.of(CAMPO_CORREO).named("value").answeredBy(actor);

        actor.attemptsTo(
                WaitUntil.the(CAMPO_CONFIRMAR_CORREO, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(CAMPO_CONFIRMAR_CORREO).andAlignToTop(),
                Click.on(CAMPO_CONFIRMAR_CORREO),
                Enter.theValue(correo).into(CAMPO_CONFIRMAR_CORREO),
                Scroll.to(BOTON_DUPLICAR_DATOS_CLIENTE).andAlignToTop(),
                Click.on(BOTON_DUPLICAR_DATOS_CLIENTE),
                Scroll.to(BOTON_GENERAR_RECIBO_CLIENTE).andAlignToTop(),
                Click.on(BOTON_GENERAR_RECIBO_CLIENTE),
                WaitUntil.the(BOTON_CONTINUAR_RECIBO_PAGO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBO_PAGO),
                SwitchToNewWindow.switchToNewTab()
        );

        //flujo de validacion de pagos
        actor.attemptsTo(
                WaitInterrupted3Segundos.esperaConstante3(),
                CloseSecondTab.now(),
                WaitUntil.the(OPCION_SERVICIOS, isPresent()).forNoMoreThan(120).seconds(),
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

    public static FlujoRecibirPagoMutacion recibePagoMutacion(){
        return instrumented(FlujoRecibirPagoMutacion.class);
    }
}
