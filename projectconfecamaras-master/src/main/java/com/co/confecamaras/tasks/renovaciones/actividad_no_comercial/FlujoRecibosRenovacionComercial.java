package com.co.confecamaras.tasks.renovaciones.actividad_no_comercial;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoRecibosRenovacionComercial implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_RECIBIR_PAGO, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO),
                Click.on(BOTON_RECIBIR_PAGO),
                SwitchToNewWindow.switchToNewTab(),
                SelectFromOptions.byValue("1").from(LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO),

                WaitUntil.the(CAMPO_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_IDENTIFICACION),
                Clear.field(CAMPO_IDENTIFICACION),
                Enter.theValue("1026265083").into(CAMPO_IDENTIFICACION),
                WaitUntil.the(BOTON_VERIFICAR_IDENTIFICACION, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_VERIFICAR_IDENTIFICACION),
                Click.on(BOTON_VERIFICAR_IDENTIFICACION),

                WaitUntil.the(CAMPO_NOMBRE_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NOMBRE_RECIBO),
                Clear.field(CAMPO_NOMBRE_RECIBO),
                Enter.theValue("DIEGO").into(CAMPO_NOMBRE_RECIBO),
                WaitUntil.the(CAMPO_SEGUNDO_NOMBRE_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_SEGUNDO_NOMBRE_RECIBO),
                Clear.field(CAMPO_SEGUNDO_NOMBRE_RECIBO),
                Enter.theValue("ALBERTO").into(CAMPO_SEGUNDO_NOMBRE_RECIBO),
                WaitUntil.the(CAMPO_PRIMER_APELLIDO_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_PRIMER_APELLIDO_RECIBO),
                Clear.field(CAMPO_PRIMER_APELLIDO_RECIBO),
                Enter.theValue("RIOS").into(CAMPO_PRIMER_APELLIDO_RECIBO),
                WaitUntil.the(CAMPO_SEGUNDO_APELLIDO_RECIBO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_SEGUNDO_APELLIDO_RECIBO),
                Clear.field(CAMPO_SEGUNDO_APELLIDO_RECIBO),
                Enter.theValue("MAYORGA").into(CAMPO_SEGUNDO_APELLIDO_RECIBO),

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
                Click.on(CAMPO_DIRECCION_COMERCIAL),
                Enter.theValue("CL 123 - 123- 24").into(CAMPO_DIRECCION_COMERCIAL),
                Click.on(CAMPO_CODIGO_POSTAL),
                Enter.theValue("1111111").into(CAMPO_CODIGO_POSTAL),
                Scroll.to(BOTON_DUPLICAR),
                Click.on(BOTON_DUPLICAR),
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

    public static FlujoRecibosRenovacionComercial flujoRecibePago() {
        return new FlujoRecibosRenovacionComercial();
    }
}