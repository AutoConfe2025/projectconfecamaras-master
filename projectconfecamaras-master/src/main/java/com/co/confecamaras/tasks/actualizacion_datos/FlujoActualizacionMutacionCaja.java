package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_TRAMITES_REGISTROMERCANTIL_ESADL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoActualizacionMutacionCaja implements Task {

    private final String matricula;

    @Override
    public <T extends Actor> void performAs(T actor) {
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
                WaitUntil.the(BOTON_ACTUALIZACION_DATOS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACTUALIZACION_DATOS),

                //flujo formulario

                WaitUntil.the(CAMPO_DIRECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_DIRECCION),
                Enter.theValue("qa").into(CAMPO_DIRECCION),
                Click.on(CAMPO_TELEFONO_1),
                Enter.theValue("6707475").into(CAMPO_TELEFONO_1),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3165376606").into(CAMPO_CELULAR),
                Scroll.to(BOTON_BUSQUEDA_CIIU_2).andAlignToTop(),
                Click.on(BOTON_BUSQUEDA_CIIU_2),
                WaitUntil.the(CAMPO_BUSQUEDA_CIIU_2, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_BUSQUEDA_CIIU_2),
                Enter.theValue("ordenadores").into(CAMPO_BUSQUEDA_CIIU_2),
                Click.on(BOTON_REALIZAR_BUSQUEDA_CIIU_2),
                WaitUntil.the(PRIMER_OPCION_BUSQUEDA_CIIU_2, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(PRIMER_OPCION_BUSQUEDA_CIIU_2),
                Click.on(BOTON_AGREGAR_CIIU_2),
                WaitUntil.the(BOTON_SI_AGREGAR_CIIU_2, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SI_AGREGAR_CIIU_2),
                WaitUntil.the(BOTON_LIQUIDAR_MUTACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_LIQUIDAR_MUTACION),
                WaitUntil.the(BOTON_VER_SOPORTE_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(BOTON_VER_SOPORTE_MUTACION),
                Click.on(BOTON_VER_SOPORTE_MUTACION),
                WaitUntil.the(BOTON_CERRAR_SOPORTE_MUTACION, isPresent()).forNoMoreThan(110).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE_MUTACION),
                WaitUntil.the(BOTON_RECIBIR_PAGO_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_MUTACION),
                Click.on(BOTON_RECIBIR_PAGO_MUTACION)
        );
    }
    public static FlujoActualizacionMutacionCaja FlujoMutacionCaja(String matricula){
        return instrumented(FlujoActualizacionMutacionCaja.class,matricula);
    }
}
