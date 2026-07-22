package com.co.confecamaras.tasks.certificados_automaticos.compra_rapida_certificados_especiales_no;

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
public class FlujoCertificadosEspecialesNo implements Task {

    private final String Expediente;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_INICIAL_NO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_INICIAL_NO),
                Click.on(BOTON_CONTINUAR_SI),
                WaitUntil.the(CAMPO_NOMBRES_RAZON_SOCIAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NOMBRES_RAZON_SOCIAL),
                Enter.theValue("SOCIEDAD ROJAS Y GARCIA S.A.S").into(CAMPO_NOMBRES_RAZON_SOCIAL),
                Click.on(CAMPO_IDENTIFICACION_CERTIFICACIONES_ESPECIALES),
                Enter.theValue("8000243942").into(CAMPO_IDENTIFICACION_CERTIFICACIONES_ESPECIALES),
                SelectFromOptions.byValue("01.15").from(LISTA_SELECCION_TIPO_CERTIFICADO),
                Click.on(CAMPO_CANTIDAD_CERTIFICACIONES_ESPECIALES),
                Enter.theValue("3").into(CAMPO_CANTIDAD_CERTIFICACIONES_ESPECIALES),
                Click.on(CAMPO_INGRESO_EXPLICACION_CERTIFICADO),
                Enter.theValue("Pruebas Automatizadas").into(CAMPO_INGRESO_EXPLICACION_CERTIFICADO),
                Scroll.to(BOTON_SOLICITAR_CERTIFICADO_ESPECIAL).andAlignToTop(),
                Click.on(BOTON_SOLICITAR_CERTIFICADO_ESPECIAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static FlujoCertificadosEspecialesNo CertificadoEspecialNO(String Expediente){
        return instrumented(FlujoCertificadosEspecialesNo.class,Expediente);
    }
}
