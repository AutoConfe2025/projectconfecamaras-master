package com.co.confecamaras.tasks.actualizacion_datos;

import com.co.confecamaras.interactions.IngresarFechaActual;
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

import static com.co.confecamaras.userinterfaces.actualizacion_datos.ActualizacionMutacionCajaPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FujoPnEstPublicoPage.BOTON_CONSULTA_MATRICULA_INSCRIPCION;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_TRAMITES_REGISTROMERCANTIL_ESADL;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoReingresoTramiteReformaProcedeReingresoDocumento implements Task {

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
                WaitUntil.the(BOTON_INSCRIPCIONES_DE_DOCUMENTOS, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_INSCRIPCIONES_DE_DOCUMENTOS),
                WaitInterrupted2Segundos.esperaConstante2(),
                SwitchToNewWindow.switchToNewTab(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION),
                WaitUntil.the(BOTON_REFORMAS_CAPITAL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REFORMAS_CAPITAL),
                WaitUntil.the(BOTON_CONTINUAR_AUMENTO_DE_CAPITAL_SUSCRITO_PRIMA, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CONTINUAR_AUMENTO_DE_CAPITAL_SUSCRITO_PRIMA),
                WaitUntil.the(CAMPO_FECHA_DOCUMENTO, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(CAMPO_FECHA_DOCUMENTO).andAlignToTop(),
                IngresarFechaActual.enElCampo(CAMPO_FECHA_DOCUMENTO),
                WaitUntil.the(CAMPO_INGRESO_TEXTO_OBSERVACIONES, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(CAMPO_INGRESO_TEXTO_OBSERVACIONES).andAlignToTop(),
                Enter.theValue("Prueba automatizada").into(CAMPO_INGRESO_TEXTO_OBSERVACIONES),
                WaitUntil.the(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION).andAlignToTop(),
                Click.on(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION),
                WaitUntil.the(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION).andAlignToTop(),
                Click.on(BOTON_CONTINUAR_ESCANEO_DIGITALIZACION),
                WaitUntil.the(BOTON_CARGA_SOPORTE, isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_CARGA_SOPORTE),
                Click.on(BOTON_CARGA_SOPORTE)
        );

        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(CAMPO_INGRESO_PDF, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(rutaArchivo1).into(CAMPO_INGRESO_PDF),
                Enter.theValue("Prueba automatizada").into(CAMPO_OBSERVACIONES_DESCRIPCION),
                SelectFromOptions.byValue("90.01.015").from(LISTA_TIPO_DOCUMENTO_ASOCIADO),
                Enter.theValue("01").into(CAMPO_DE_INGRESO_NO_DOC),
                IngresarFechaActual.enElCampo(CAMPO_DE_INGRESO_FECHA_DOC),
                Enter.theValue("Prueba automatizada").into(CAMPO_DE_INGRESO_ORIGEN_DOC),
                Click.on(BOTON_CARGAR_DOCUMENTO),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(BOTON_RECIBIR_PAGO_DOCUMENTO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RECIBIR_PAGO_DOCUMENTO)
        );
    }

    public static FlujoReingresoTramiteReformaProcedeReingresoDocumento FlujoHastaPagoReingresoDocumento(String matricula){
        return instrumented(FlujoReingresoTramiteReformaProcedeReingresoDocumento.class,matricula);
    }
}
