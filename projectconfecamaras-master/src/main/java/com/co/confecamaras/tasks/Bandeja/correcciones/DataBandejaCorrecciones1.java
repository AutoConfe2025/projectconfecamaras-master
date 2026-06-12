package com.co.confecamaras.tasks.Bandeja.correcciones;

import com.co.confecamaras.interactions.IngresarFechaActual;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.BOTON_RADICAR_TRAMITE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class DataBandejaCorrecciones1 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String rutaArchivo1 = System.getProperty("user.dir")
                + "/src/test/resources/pdfs/20-Formulario-Establecimiento--15025.pdf";

        actor.attemptsTo(
                Click.on(CAMPO_INGRESO_DATO_BUSQUEDA),
                Enter.theValue("64472").into(CAMPO_INGRESO_DATO_BUSQUEDA),
                Click.on(BOTON_CONSULTAR_DATO_BUSQUEDA),
                WaitUntil.the(BOTON_MATRICULA_SELECCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_MATRICULA_SELECCION),
                WaitUntil.the(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_TRAMITES_REGISTROMERCANTIL_ESADL),
                WaitUntil.the(BOTON_PRODUCTO_NO_CONFORME, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_PRODUCTO_NO_CONFORME),
                WaitUntil.the(BOTON_REG_MERCANTIL_ERROR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REG_MERCANTIL_ERROR),
                WaitUntil.the(BOTON_REG_MERCANTIL_ERROR, isPresent()).forNoMoreThan(10).seconds(),

                //formulario datos del radicado
                WaitUntil.the(TIPO_DOCUMENTO_DATOS_RADICADO, isPresent()).forNoMoreThan(120).seconds(),
                SelectFromOptions.byValue("01").from(TIPO_DOCUMENTO_DATOS_RADICADO),
                IngresarFechaActual.enElCampo(FECHA_DOCUMENTO_DATOS_RADICADO),
                Click.on(BOTON_SIGUIENTE_DATOS_RADICADO),
                WaitUntil.the(BOTON_SIGUIENTE_DATOS_RADICADO_1, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_SIGUIENTE_DATOS_RADICADO_1),

                //motivo de la correccion
                Enter.theValue("QA").into(CAMPO_DESCRIPCION_MOTIVO_DE_CORRECCION),
                SelectFromOptions.byValue("01").from(LISTA_TIPO_ERROR),
                WaitUntil.the(LISTA_TIPO_ERROR_2, isPresent()).forNoMoreThan(3).seconds(),
                SelectFromOptions.byValue("01").from(LISTA_TIPO_ERROR_2),
                WaitUntil.the(LISTA_TIPO_ERROR_3, isPresent()).forNoMoreThan(3).seconds(),
                SelectFromOptions.byValue("01").from(LISTA_TIPO_ERROR_3),
                SelectFromOptions.byValue("1").from(LISTA_DOCUMENTO_SOLICITA_CORRECCION),
                Enter.theValue("123456789").into(CAMPO_NUMERO_SOLICITA_CORRECCION),
                Enter.theValue("qa").into(CAMPO_PRIMER_NOMBRE_SOLICITA_CORRECCION),
                Enter.theValue("qa").into(CAMPO_PRIMER_APELLIDO_SOLICITA_CORRECCION),
                Enter.theValue("CALLE 123").into(CAMPO_DIRECCION_SOLICITA_CORRECCION),
                SelectFromOptions.byValue("17001").from(LISTA_MUNICIPIO_SOLICITA_CORRECCION),
                Click.on(BOTON_SIGUIENTE_MOTIVO_CORRECCION),

                //soporte del tramite
                WaitUntil.the(CAMPO_INGRESO_SOPORTE, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(rutaArchivo1).into(CAMPO_INGRESO_SOPORTE),
                WaitUntil.the(BOTON_ACEPTAR_ANEXO_CARGADO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ACEPTAR_ANEXO_CARGADO),
                WaitUntil.the(BOTON_RADICAR_TRAMITE, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_RADICAR_TRAMITE),
                WaitInterrupted3Segundos.esperaConstante3()
        );
    }

    public static DataBandejaCorrecciones1 CrearDataCorrecciones1(){
        return instrumented(DataBandejaCorrecciones1.class);
    }
}
