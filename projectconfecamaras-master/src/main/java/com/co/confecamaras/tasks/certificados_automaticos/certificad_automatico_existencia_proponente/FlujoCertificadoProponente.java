package com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_existencia_proponente;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.certificados_automaticos.AutomaticoExistenciaCajaPage.*;
import static com.co.confecamaras.userinterfaces.certificados_automaticos.AutomaticoExistenciaCajaPage.BOTON_CONTINUAR_SOLICITUD_CERTIFICADO;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_TRAMITES_REGISTROMERCANTIL_ESADL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
@AllArgsConstructor
public class FlujoCertificadoProponente implements Task {

    private final String Expediente;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA),
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                Enter.theValue(Expediente).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_SELECCION),
                WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                WaitUntil.the(BOTON_SOLICITAR_CERTIFICADO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SOLICITAR_CERTIFICADO),
                WaitUntil.the(BOTON_CERTIFICADO_AUTOMATICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERTIFICADO_AUTOMATICO),
                WaitUntil.the(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS),
                Enter.theValue("1").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS),
                Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_PROPONENTE),
                Enter.theValue("1").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_PROPONENTE),
                Scroll.to(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO).andAlignToTop(),
                Click.on(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static FlujoCertificadoProponente flujoCertificadoProponente(String Expediente){
        return instrumented(FlujoCertificadoProponente.class, Expediente);
    }
}
