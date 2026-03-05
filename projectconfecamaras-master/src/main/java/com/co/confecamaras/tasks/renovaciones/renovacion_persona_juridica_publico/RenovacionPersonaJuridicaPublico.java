package com.co.confecamaras.tasks.renovaciones.renovacion_persona_juridica_publico;

import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.BTN_FINALIZAR;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_CONTINUAR_RENOVACION_1;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


@AllArgsConstructor
public class RenovacionPersonaJuridicaPublico implements Task {

    private final String valor;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String matricula = actor.recall("matriculaPnEstablecimiento");

        System.out.println("Matrícula usada en flujo: " + matricula);


        actor.attemptsTo(
                WaitUntil.the(BOTON_CONSULTA_MATRICULA_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONSULTA_MATRICULA_INSCRIPCION),
                WaitUntil.the(BOTON_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA),
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                Enter.theValue(matricula).into(CAMPO_INGRESO_DATO_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_SELECCION),
                WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                WaitUntil.the(BOTON_RENOVAR_MATRICULA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RENOVAR_MATRICULA),
                WaitUntil.the(BOTON_CONTINUAR_RENOVACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_RENOVACION),
                WaitUntil.the(BOTON_ACEPTAR_MENSAJE_IMPORTANTE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACEPTAR_MENSAJE_IMPORTANTE),
                WaitUntil.the(CAMPO_NUEVO_VALOR_PERSONA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUEVO_VALOR_PERSONA),
                Enter.theValue(valor).into(CAMPO_NUEVO_VALOR_PERSONA)
        );

        if (CAMPO_NUEVO_VALOR_ESTABLECIMIENTO.isVisibleFor(actor)) {
            actor.attemptsTo(
                    WaitUntil.the(CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO, isPresent()).forNoMoreThan(10).seconds(),
                    Click.on(CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO)
            );
        }

        actor.attemptsTo(
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }

    public static RenovacionPersonaJuridicaPublico renovacionPJPublico(String valor) {
        return new RenovacionPersonaJuridicaPublico(valor);
    }
}


