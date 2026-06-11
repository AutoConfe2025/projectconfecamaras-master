package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.CloseSecondTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted5Segundos;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoActualizacionMutacionPublico implements Task {

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
                WaitInterrupted2Segundos.esperaConstante2(),

                //formulario
                WaitUntil.the(CAMPO_DIRECCION, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(CAMPO_DIRECCION),
                Enter.theValue("Calle 20 12 71 - qa").into(CAMPO_DIRECCION),
                Click.on(CAMPO_TELEFONO_1),
                Enter.theValue("6707475").into(CAMPO_TELEFONO_1),
                Click.on(CAMPO_CELULAR),
                Enter.theValue("3165376606").into(CAMPO_CELULAR),
                Click.on(CAMPO_CORREO),
                Enter.theValue("alanrios@confecamaras.org.co").into(CAMPO_CORREO),
                Scroll.to(CAMPO_CORREO_NOTIFICACION_JUDICIAL).andAlignToTop(),
                Click.on(CAMPO_CORREO_NOTIFICACION_JUDICIAL),
                Enter.theValue("alanrios@confecamaras.org.co").into(CAMPO_CORREO_NOTIFICACION_JUDICIAL),

                Scroll.to(BOTON_BUSQUEDA_CIIU_2).andAlignToTop(),
                Click.on(BOTON_BUSQUEDA_CIIU_2),
                WaitUntil.the(CAMPO_BUSQUEDA_CIIU_2, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(CAMPO_BUSQUEDA_CIIU_2),
                Enter.theValue("ordenadores").into(CAMPO_BUSQUEDA_CIIU_2),
                Click.on(BOTON_REALIZAR_BUSQUEDA_CIIU_2),
                WaitUntil.the(PRIMER_OPCION_BUSQUEDA_CIIU_2, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(PRIMER_OPCION_BUSQUEDA_CIIU_2),
                Click.on(BOTON_AGREGAR_CIIU_2),
                WaitUntil.the(BOTON_SI_AGREGAR_CIIU_2, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_SI_AGREGAR_CIIU_2),
                WaitUntil.the(LISTA_CIIU_GENERO_MRAYOR_INGRESO, isPresent()).forNoMoreThan(120).seconds(),
                SelectFromOptions.byValue("ciiutamanoempresarial_2").from(LISTA_CIIU_GENERO_MRAYOR_INGRESO),
                WaitUntil.the(BOTON_LIQUIDAR_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_LIQUIDAR_MUTACION),
                WaitUntil.the(BOTON_VER_SOPORTE_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Scroll.to(BOTON_VER_SOPORTE_MUTACION),
                Click.on(BOTON_VER_SOPORTE_MUTACION),
                WaitUntil.the(BOTON_CERRAR_SOPORTE_MUTACION, isPresent()).forNoMoreThan(110).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE_MUTACION),
                WaitUntil.the(BOTON_FIRMA_ELECTRONICA_MUTACION, isPresent()).forNoMoreThan(120).seconds(),
                Click.on(BOTON_FIRMA_ELECTRONICA_MUTACION),
                WaitUntil.the(VALIDA_PRIMER_PDF_FIRMA, isPresent()).forNoMoreThan(140).seconds(),
                Click.on(VALIDA_PRIMER_PDF_FIRMA),
                WaitInterrupted5Segundos.esperaConstante5(),
                CloseSecondTab.now(),
                WaitUntil.the(BOTON_FIRMAR, isClickable()).forNoMoreThan(150).seconds(),
                Click.on(BOTON_FIRMAR),
                WaitUntil.the(BOTON_ACEPTAR_FIRMADO_ELECTRONICO, isPresent()).forNoMoreThan(150).seconds(),
                Click.on(BOTON_ACEPTAR_FIRMADO_ELECTRONICO),
                WaitUntil.the(BOTON_CONTINUAR_FIRMADO_ELECTRONICO_EXITOSO, isPresent()).forNoMoreThan(150).seconds(),
                Click.on(BOTON_CONTINUAR_FIRMADO_ELECTRONICO_EXITOSO),
                WaitUntil.the(BOTON_SOBRE_DIGITAL, isPresent()).forNoMoreThan(150).seconds(),
                Click.on(BOTON_SOBRE_DIGITAL),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(BOTON_CERRAR_SOPORTE_MUTACION),
                WaitUntil.the(BOTON_PAGAR_MUTACION, isPresent()).forNoMoreThan(150).seconds(),
                Click.on(BOTON_PAGAR_MUTACION),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static FlujoActualizacionMutacionPublico flujomutacionPublico(String matricula){
        return instrumented(FlujoActualizacionMutacionPublico.class, matricula);
    }
}
