package com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificados_especiales_si;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.certificados_automaticos.CompraRapidaCertificadoEspecialesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoCertificadosEspecialesSi implements Task {

    private final String Expediente;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_INICIAL_SI, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_INICIAL_SI),
                Click.on(BOTON_CONTINUAR_SI),
                WaitUntil.the(BOTON_MATRICULA_CERTIFICADO_ESPECIALES, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_CERTIFICADO_ESPECIALES),
                Click.on(CAMPO_MATRICULA_CERTIFICADO_ESPECIALES),
                Enter.theValue(Expediente).into(CAMPO_MATRICULA_CERTIFICADO_ESPECIALES),
                Click.on(BOTON_BUSCAR_MATRICULA_CERTIFICADO_ESPECIALES),
                WaitUntil.the(BOTON_SELECCIONAR_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SELECCIONAR_MATRICULA),
                WaitUntil.the(LISTA_SELECCION_TIPO_CERTIFICADO_ESPECIAL, isPresent()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byValue("01.11").from(LISTA_SELECCION_TIPO_CERTIFICADO_ESPECIAL),
                Click.on(CAMPO_INGRESO_EXPLICACION_CERTIFICADO),
                Enter.theValue("Pruebas Automatizadas").into(CAMPO_INGRESO_EXPLICACION_CERTIFICADO),
                Scroll.to(BOTON_SOLICITAR_CERTIFICADO_ESPECIAL).andAlignToTop(),
                Click.on(BOTON_SOLICITAR_CERTIFICADO_ESPECIAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );
    }
    public static FlujoCertificadosEspecialesSi FlujoEspecialSI(String Expediente){
        return instrumented(FlujoCertificadosEspecialesSi.class,Expediente);
    }
}
