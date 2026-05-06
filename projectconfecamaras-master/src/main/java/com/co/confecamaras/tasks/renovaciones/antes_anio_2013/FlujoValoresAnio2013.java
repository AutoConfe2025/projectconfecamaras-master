package com.co.confecamaras.tasks.renovaciones.antes_anio_2013;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoVariosAnio2013Page.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_ACEPTAR_MENSAJE_IMPORTANTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoValoresAnio2013 implements Task {

    private final String matricula;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
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
                WaitUntil.the(BOTON_DESMARCAR_TODAS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_DESMARCAR_TODAS),
                Click.on(BOTON_DUPLICAR_ARCHIVOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(PRIMER_CHECK_RENOVAR),
                Click.on(SEGUNDO_CHECK_RENOVAR),
                Click.on(TERCER_CHECK_RENOVAR),
                Click.on(CUARTO_CHECK_RENOVAR),
                Click.on(QUINTO_CHECK_RENOVAR),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(BOTON_CONTINUAR_RENOVACION_1),
                Click.on(BOTON_CONTINUAR_RENOVACION_1)
        );
    }
    public static FlujoValoresAnio2013 FlujoValoresAnio2013(String matricula){
        return instrumented(FlujoValoresAnio2013.class, matricula);
    }
}
