package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AccionesAministradorServicios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_NIIF,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NIIF),
                Click.on(BOTON_EDITAR_NIIF),
                Click.on(LISTA_DEBITO),
                Click.on(OPCION_ACTIVOLISTA_DEBITO),
                Click.on(LISTA_CREDITO),
                Click.on(OPCION_ACTIVO_LISTA_CREDITO),
                Click.on(BOTON_GRABAR),
                Click.on(BOTON_ACEPTAR),
                WaitUntil.the(BOTON_REGRESAR,isPresent()).forNoMoreThan(10).seconds(),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),
                WaitUntil.the(BOTON_NIIF,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NIIF),
                Scroll.to(BOTON_BORRAR_OPERADORES),
                Click.on(BOTON_BORRAR_OPERADORES),
                Click.on(BOTON_SI_BORRAR_OPERADORES),
                Click.on(BOTON_ACEPTAR),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),
                WaitUntil.the(BOTON_NIIF,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NIIF),
                Scroll.to(BOTON_BORRAR_OPERADORES),
                Click.on(BOTON_BORRAR_OPERADORES),
                Click.on(BOTON_SI_BORRAR_OPERADORES),
                Click.on(BOTON_ACEPTAR),
                Scroll.to(BOTON_REGRESAR),
                Click.on(BOTON_REGRESAR),

                WaitUntil.the(BOTON_EDITAR_ACCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_EDITAR_ACCION),
                WaitUntil.the(LISTA_CERTIFICADO_ASOCIADO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_CERTIFICADO_ASOCIADO),
                Click.on(OPCION_CERESADL_LISTA_CERTIFICADO_ASOCIADO),
                //GRABA FORMULARIO DE NUEVO
                Enter.theValue("0").into(CAMPO_INPUT_GEN),
                Click.on(CAMPO_INPUT_GEN),
                Enter.theValue("QQA2").into(CAMPO_INPUT_GEN),
                Click.on(CAMPO_INPUT_GEN),
                Enter.theValue("QA2").into(CAMPO_INPUT_GEN),
                Click.on(LISTA_RUTA),
                Click.on(OPCION_01_RUTA),
                Click.on(LISTA_BASE_CALCULO),
                Click.on(OPCION_ACTIVOS_BASE_CALCULO),
                Click.on(LISTA_APLICA_1429),
                Click.on(OPCION_LISTA_APLICA_1429),
                Click.on(LISTA_CLASE_VALOR),
                Click.on(OPICION_FIJO_LISTA_CLASE_VALOR),
                Click.on(LISTA_TIPO_VALOR),
                Click.on(OPCION_PUBLICO_LISTA_TIPO_VALOR),
                Click.on(LISTA_RECIBO_TARJETA),
                Click.on(OPCION_NO_LISTA_RECIBO_TARJETA),
                Click.on(LISTA_ES_IVA),
                Click.on(OPCION_NO_LISTA_ES_IVA),
                Click.on(LISTA_MOSTRABLE_AL_CAJERO),
                Click.on(OPCION_NO_LISTA_MOSTRABLE_AL_CAJERO),
                Click.on(LISTA_GRUPO_VENTAS),
                Click.on(OPCION_NO_LISTA_GRUPO_VENTAS),
                Click.on(LISTA_INDICADOR_CUANTIA),
                Click.on(OPCION_LISTA_INDICADOR_CUANTIA),
                Click.on(LISTA_INDICADOR_CUANTIA),
                Click.on(LISTA_PRIMA_COLOCACION_ACCIONES),
                Click.on(OPCION_LISTA_PRIMA_COLOCACION_ACCIONES),
                Click.on(LISTA_CONCEPTO_DEPARTAMENTAL),
                Click.on(OPCION_LISTA_CONCEPTO_DEPARTAMENTAL),
                Click.on(CAMPO_INPUT_GEN),
                Enter.theValue("QQA2").into(CAMPO_INPUT_GEN),
                Click.on(CAMPO_CENTRO_COSTOS_PRIVADO),
                Enter.theValue("QQA2").into(CAMPO_CENTRO_COSTOS_PRIVADO),
                Click.on(CAMPO_FECHA_INICIAL),
                Enter.theValue("27/11/2025").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FINAL),
                Enter.theValue("27/11/2025").into(CAMPO_FECHA_FINAL),
                Click.on(LISTA_FACTURABLE_ELECTRONICAMENTE),
                Click.on(OPCION_LISTA_FACTURABLE_ELECTRONICAMENTE),
                Click.on(LISTA_HOMOLOGACION_RUES),
                Click.on(OPCION_LISTA_HOMOLOGACION_RUES),
                Click.on(LISTA_SERVICIO_GRAVADO_1),
                Click.on(OPCION_LISTA_SERVICIO_GRAVADO_1),
                Click.on(LISTA_SERVICIO_DEPENDIENTE_1),
                Click.on(OPCION_LISTA_SERVICIO_DEPENDIENTE_1),


                Scroll.to(BOTON_GRABAR),
                Click.on(BOTON_GRABAR),
                Click.on(BOTON_ACEPTAR),
                WaitUntil.the(BOTON_ELIMINAR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ELIMINAR),
                Click.on(BOTON_ACEPTAR)
        );
    }

    public static AccionesAministradorServicios AccionesAdminSer(){
        return new AccionesAministradorServicios();
    }
}
