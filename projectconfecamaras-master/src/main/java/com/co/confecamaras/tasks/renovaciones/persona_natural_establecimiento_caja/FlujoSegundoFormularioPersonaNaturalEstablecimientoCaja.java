package com.co.confecamaras.tasks.renovaciones.persona_natural_establecimiento_caja;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_ACEPTAR_MENSAJE_IMPORTANTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String ValorBaja = actor.recall("valorNuevo");

        actor.attemptsTo(
                WaitUntil.the(BOTON_FORMULARIO_2, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FORMULARIO_2),
                Scroll.to(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Click.on(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Enter.theValue(ValorBaja).into(CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO),
                Click.on(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Clear.field(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Enter.theValue("10").into(CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM),
                Scroll.to(BOTON_ALAMCENAR),
                Click.on(BOTON_ALAMCENAR),
                WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_MENSAJE_INFORMACION)
        );

        if (BOTON_MENSAJE_INFORMACION.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MENSAJE_INFORMACION, isPresent()).forNoMoreThan(20).seconds(),
                    Click.on(BOTON_MENSAJE_INFORMACION)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BOTON_PRIMER_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_PRIMER_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF),
                WaitUntil.the(BOTON_SEGUNDO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CONTENEDOR_PDF),
                WaitUntil.the(BOTON_SEGUNDO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_SEGUNDO_PDF),
                WaitUntil.the(CUADRO_GENERADO_PDF, isPresent()).forNoMoreThan(20).seconds(),
                Click.on(CUADRO_GENERADO_PDF),
                Click.on(BOTON_CERRAR_PDF)
        );

        if (CERRAR_ALERTA_CAJERO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(CERRAR_ALERTA_CAJERO)
            );
        }

        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                Click.on(BOTON_INSERTAR_PDF_1),
                Enter.theValue(rutaArchivo1).into(CAMPO_INGRESO_RUTA_PDF),
                Click.on(BOTON_CARGAR_DOCUMENTO),
                WaitInterrupted5Segundos.esperaConstante5()
        );

        actor.attemptsTo(
                WaitUntil.the(BOTON_RECIBIR_PAGO_TEXTO_2, isPresent()).forNoMoreThan(20).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_TEXTO_2),
                Click.on(BOTON_RECIBIR_PAGO_TEXTO_2),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja SegundoFormulario() {
        return new FlujoSegundoFormularioPersonaNaturalEstablecimientoCaja();
    }
}
