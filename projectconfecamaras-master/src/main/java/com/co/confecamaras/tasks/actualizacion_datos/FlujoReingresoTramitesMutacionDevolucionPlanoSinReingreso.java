package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoPnEstCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
@AllArgsConstructor
public class FlujoReingresoTramitesMutacionDevolucionPlanoSinReingreso implements Task {

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
                WaitUntil.the(ALERTA_ACTUALIZACION_DATOS_BOTON_OK, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(ALERTA_ACTUALIZACION_DATOS_BOTON_OK),

                //formulario
                WaitUntil.the(CAMPO_DIRECCION, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(CAMPO_DIRECCION),
                Enter.theValue("Calle 20 12 71 - qa").into(CAMPO_DIRECCION),
                Click.on(CAMPO_TELEFONO_1),
                Enter.theValue("6707475").into(CAMPO_TELEFONO_1),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3165376606").into(CAMPO_CELULAR),
                SelectFromOptions.byValue("ciiutamanoempresarial_1").from(LISTA_CIIU_GENERO_MRAYOR_INGRESO),
                WaitUntil.the(BOTON_LIQUIDAR_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_LIQUIDAR_MUTACION),
                WaitUntil.the(BOTON_CARGAR_SOPORTE_MUTACION, isPresent()).forNoMoreThan(110).seconds(),
                Click.on(BOTON_CARGAR_SOPORTE_MUTACION)
        );

        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(rutaArchivo1).into(CAMPO_INGRESO_RUTA_PDF),
                Click.on(CAMPO_OBSERVACIONES),
                Enter.theValue("QA").into(CAMPO_OBSERVACIONES),
                Enter.theValue("QA").into(CAMPO_ENTIDAD_PERSONA_QUE_EXPIDE),
                Click.on(BOTON_CARGAR_DOCUMENTO_MUTACION),
                WaitUntil.the(BOTON_RECIBIR_PAGO_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(BOTON_RECIBIR_PAGO_MUTACION),
                Click.on(BOTON_RECIBIR_PAGO_MUTACION)
        );
    }

    public static FlujoReingresoTramitesMutacionDevolucionPlanoSinReingreso RevolucionPlanoSinReingreso(String matricula){
        return instrumented(FlujoReingresoTramitesMutacionDevolucionPlanoSinReingreso.class,matricula);
    }
}
