package com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificado_libros_matriculas;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.certificados_automaticos.CompraRapidaCertificadoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
@AllArgsConstructor
public class FlujoHastaPagoCompraRapidaLibrosMatriculas implements Task {

    private final String Expediente;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MATRICULA_COMPRA_RAPIDA_CERTIFICADO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_COMPRA_RAPIDA_CERTIFICADO),
                Click.on(CAMPO_INGRESO_MATRICULA_COMPRA_RAPIDA),
                Enter.theValue(Expediente).into(CAMPO_INGRESO_MATRICULA_COMPRA_RAPIDA),
                Click.on(BOTON_REALIZAR_BUSQUEDA_MATRICULA_COMPRA_RAPIDA),
                WaitUntil.the(BOTON_SELECCIONAR_COMPRA_RAPIDA, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_SELECCIONAR_COMPRA_RAPIDA),
                Click.on(BOTON_AÑADIR_PRIMERA_CARD_SELECCION),
                Click.on(BOTON_AÑADIR_TERCERA_CARD_SELECCION),
                Click.on(BOTON_PAGAR_COMPRA_RAPIDA),
                WaitUntil.the(CAMPO_INGRESO_CORREO_ELECTRONICO, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(CAMPO_INGRESO_CORREO_ELECTRONICO),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CAMPO_INGRESO_CORREO_ELECTRONICO),
                Click.on(BOTON_OK_CAMPO_INGRESO_CORREO_ELECTRONICO),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );
    }
    public static FlujoHastaPagoCompraRapidaLibrosMatriculas FlujoRapidoLibrosMatriculas(String Expediente){
        return instrumented(FlujoHastaPagoCompraRapidaLibrosMatriculas.class, Expediente);
    }
}
