package com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_matricula;

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
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_TRAMITES_REGISTROMERCANTIL_ESADL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoCertificadoAutomaticoMatriculaCaja implements Task {

    private final String Expediente;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (BOTON_MATRICULA.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_MATRICULA),
                    Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Enter.theValue(Expediente).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                    WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_MATRICULA_SELECCION),
                    WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                    WaitUntil.the(BOTON_SOLICITAR_CERTIFICADO, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_SOLICITAR_CERTIFICADO),
                    WaitUntil.the(BOTON_CERTIFICADO_AUTOMATICO, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_CERTIFICADO_AUTOMATICO),
                    WaitUntil.the(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA),
                    Enter.theValue("1").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA),
                    Click.on(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    SwitchToNewWindow.switchToNewTab()
            );
        }

        if (BOTON_CONSULTA_MATRICULA_INSCRIPCION.resolveFor(actor).isVisible()) {

            actor.attemptsTo(
                    WaitUntil.the(BOTON_CONSULTA_MATRICULA_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CONSULTA_MATRICULA_INSCRIPCION),
                    WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_MATRICULA),
                    Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Enter.theValue(Expediente).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                    WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_MATRICULA_SELECCION),
                    WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                    WaitUntil.the(BOTON_SOLICITAR_CERTIFICADO, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_SOLICITAR_CERTIFICADO),
                    WaitUntil.the(BOTON_CERTIFICADO_AUTOMATICO, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(BOTON_CERTIFICADO_AUTOMATICO),
                    WaitUntil.the(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA, isPresent()).forNoMoreThan(120).seconds(),
                    Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA),
                    Enter.theValue("1").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_MATRICULA),
                    Click.on(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    SwitchToNewWindow.switchToNewTab()
            );
        }
    }

    public static FlujoCertificadoAutomaticoMatriculaCaja CertiMatricula(String Expediente) {
        return instrumented(FlujoCertificadoAutomaticoMatriculaCaja.class, Expediente);
    }
}
