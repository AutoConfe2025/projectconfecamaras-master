package com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja;

import com.co.confecamaras.interactions.ClickIfPresent;
import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RecibirPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CAMPO_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_IDENTIFICACION),
                Clear.field(CAMPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_IDENTIFICACION),
                WaitUntil.the(BOTON_VERIFICAR_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_VERIFICAR_IDENTIFICACION),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION),
                Scroll.to(CAMPO_CELULAR_VERIFICACION),
                Click.on(CAMPO_CELULAR_VERIFICACION),
                Clear.field(CAMPO_CELULAR_VERIFICACION),
                Enter.theValue("3165376606").into(CAMPO_CELULAR_VERIFICACION),
                Scroll.to(CAMPO_CORREO_VERIFICACION),
                Click.on(CAMPO_CORREO_VERIFICACION),
                Clear.field(CAMPO_CORREO_VERIFICACION),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CORREO_VERIFICACION),
                Click.on(CAMPO_CORREO_VERIFICACION_CONFIRMACION),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_CORREO_VERIFICACION_CONFIRMACION),
                Scroll.to(BOTON_GENERAR_RECIBO),
                Click.on(BOTON_GENERAR_RECIBO),
                WaitUntil.the(BOTON_CONTINUAR_GENERAR_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_GENERAR_RECIBO),
                WaitUntil.the(TEXTO_RESUMEN_TRANSACCION, isPresent()).forNoMoreThan(120).seconds(),
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

    public static RecibirPago flujoRecibePago() {
        return new RecibirPago();
    }
}
