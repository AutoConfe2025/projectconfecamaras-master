package com.co.confecamaras.tasks.certificados_automaticos.certificad_automatico_especiales;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.certificados_automaticos.AutomaticoExistenciaCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_TRAMITES_REGISTROMERCANTIL_ESADL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoCertificadoEspeciales implements Task {

    private final String Expediente;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (BOTON_MATRICULA.isVisibleFor(actor)) {
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
                    WaitUntil.the(BOTON_SOLICITAR_CERTIFICADO, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_SOLICITAR_CERTIFICADO),
                    WaitUntil.the(BOTON_CERTIFICADO_ESPECIALES, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CERTIFICADO_ESPECIALES),
                    SelectFromOptions.byValue("01.01").from(LISTA_TIPO_CERTIFICADO),
                    Click.on(CAMPO_EXPLIQUE_CERTIFICACION_NECESITA),
                    Enter.theValue("pruebas de automatizacion").into(CAMPO_EXPLIQUE_CERTIFICACION_NECESITA),
                    WaitUntil.the(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES),
                    Enter.theValue("2").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES),
                    Click.on(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    SwitchToNewWindow.switchToNewTab()
            );
        }

        if (BOTON_CONSULTA_MATRICULA_INSCRIPCION.isVisibleFor(actor)){
            actor.attemptsTo(
                    WaitUntil.the(BOTON_CONSULTA_MATRICULA_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CONSULTA_MATRICULA_INSCRIPCION),
                    WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_MATRICULA),
                    Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Enter.theValue(Expediente).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                    Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                    WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_MATRICULA_SELECCION),
                    WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                    WaitUntil.the(BOTON_SOLICITAR_CERTIFICADO, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_SOLICITAR_CERTIFICADO),
                    WaitUntil.the(BOTON_CERTIFICADO_ESPECIALES, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BOTON_CERTIFICADO_ESPECIALES),
                    SelectFromOptions.byValue("01.01").from(LISTA_TIPO_CERTIFICADO),
                    Click.on(CAMPO_EXPLIQUE_CERTIFICACION_NECESITA),
                    Enter.theValue("pruebas de automatizacion").into(CAMPO_EXPLIQUE_CERTIFICACION_NECESITA),
                    WaitUntil.the(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES),
                    Enter.theValue("2").into(CAMPO_INGRESO_CANTIDAD_CERTIFICADOS_ESPECIALES),
                    Click.on(BOTON_CONTINUAR_SOLICITUD_CERTIFICADO),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    SwitchToNewWindow.switchToNewTab()
            );
        }
    }

    public static FlujoCertificadoEspeciales certiEspeciales(String Expediente) {
        return instrumented(FlujoCertificadoEspeciales.class, Expediente);
    }
}
