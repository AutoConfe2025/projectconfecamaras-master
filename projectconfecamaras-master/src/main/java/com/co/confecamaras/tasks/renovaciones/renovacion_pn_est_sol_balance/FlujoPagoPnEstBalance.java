package com.co.confecamaras.tasks.renovaciones.renovacion_pn_est_sol_balance;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoActualizarProponentePage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilEsadlPage.CAMPO_INGRESO_IDENTIFICACION_CLIENTE;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPagoPnEstBalance implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (BOTON_CERRAR_BAJA_ACTIVO_ALERTA.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_CERRAR_BAJA_ACTIVO_ALERTA, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CERRAR_BAJA_ACTIVO_ALERTA)
            );
        }

        if (BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CERRAR_BAJA_ACTIVO_ALERTA_1)
            );
        }

        actor.attemptsTo(
                SelectFromOptions.byValue("1").from(LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO),
                Enter.theValue("1026265083").into(CAMPO_INGRESO_IDENTIFICACION_CLIENTE),
                PressKey.press(TypeKey.TAB),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR),
                WaitUntil.the(CAMPO_CONFIRMAR_CORREO, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(CAMPO_CONFIRMAR_CORREO).andAlignToTop(),
                Click.on(CAMPO_CONFIRMAR_CORREO),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CONFIRMAR_CORREO),
                Scroll.to(BOTON_GENERAR_RECIBO_CLIENTE).andAlignToTop(),
                Click.on(BOTON_GENERAR_RECIBO_CLIENTE),
                WaitUntil.the(BOTON_CONTINUAR_RECIBO_PAGO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_CONTINUAR_RECIBO_PAGO),
                WaitUntil.the(TEXTO_FINAL_PAGO, isPresent()).forNoMoreThan(120).seconds()

        );
        //validar pago
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitInterrupted3Segundos.esperaConstante3(),
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

    public static FlujoPagoPnEstBalance FlujoPagos(){
        return instrumented(FlujoPagoPnEstBalance.class);
    }
}
