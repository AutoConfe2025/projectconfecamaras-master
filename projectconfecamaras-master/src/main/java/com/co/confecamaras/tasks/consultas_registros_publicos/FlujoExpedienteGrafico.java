package com.co.confecamaras.tasks.consultas_registros_publicos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.consultas_registros_publicos.Page.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoExpedienteGrafico implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_CODIGO_BARRAS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_CODIGO_BARRAS),
                Enter.theValue("750424").into(CAMPO_CODIGO_BARRAS),

                Click.on(BOTON_CONSULTAR_EXPEDIENTE_GRAFICO),
                Click.on(BOTON_VER_IMAGEN_1),
                WaitUntil.the(BOTON_CERRAR_SOPORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE),
                WaitUntil.the(BOTON_VOLVER_EXPEDIENTE_GRAFICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VOLVER_EXPEDIENTE_GRAFICO),


                WaitUntil.the(CAMPO_CODIGO_BARRAS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_CODIGO_BARRAS),
                Enter.theValue("750424").into(CAMPO_CODIGO_BARRAS),
                WaitUntil.the(LISTA_MOSTRAR_RECIBOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_MOSTRAR_RECIBOS),
                WaitUntil.the(OPCION_SI_MOSTRAR_RECIBOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SI_MOSTRAR_RECIBOS),
                Click.on(LISTA_MOSTRAR_SELLOS),
                WaitUntil.the(OPCION_SI_MOSTRAR_SELLOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SI_MOSTRAR_SELLOS),
                Click.on(LISTA_MOSTRAR_ELIMINADOS),
                WaitUntil.the(OPCION_SI_MOSTRAR_ELIMINADOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_SI_MOSTRAR_ELIMINADOS),

                Click.on(BOTON_CONSULTAR_EXPEDIENTE_GRAFICO),
                Click.on(BOTON_VER_IMAGEN_1),
                WaitUntil.the(BOTON_CERRAR_SOPORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE),
                WaitUntil.the(BOTON_VOLVER_EXPEDIENTE_GRAFICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VOLVER_EXPEDIENTE_GRAFICO),

                WaitUntil.the(CAMPO_FECHA_INICIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_FECHA_INICIAL),
                Clear.field(CAMPO_FECHA_INICIAL),
                Enter.theValue("01/11/2025").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FIN),
                Clear.field(CAMPO_FECHA_FIN),
                Enter.theValue("30/11/2025").into(CAMPO_FECHA_FIN),

                Click.on(BOTON_CONSULTAR_EXPEDIENTE_GRAFICO),
                Click.on(BOTON_VER_IMAGEN_1),
                WaitUntil.the(BOTON_CERRAR_SOPORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE),
                WaitUntil.the(BOTON_VOLVER_EXPEDIENTE_GRAFICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VOLVER_EXPEDIENTE_GRAFICO),

                WaitUntil.the(LISTA_OTROS_CRITERIOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_OTROS_CRITERIOS),
                WaitUntil.the(OPCION_RECIBO_OTRO_CRITERIO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_RECIBO_OTRO_CRITERIO),
                Click.on(CAMPO_RECIBO),
                Enter.theValue("S001156927").into(CAMPO_RECIBO),

                Click.on(BOTON_CONSULTAR_EXPEDIENTE_GRAFICO),
                Click.on(BOTON_VER_IMAGEN_1),
                WaitUntil.the(BOTON_CERRAR_SOPORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE),
                WaitUntil.the(BOTON_VOLVER_EXPEDIENTE_GRAFICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VOLVER_EXPEDIENTE_GRAFICO),

                WaitUntil.the(LISTA_OTROS_CRITERIOS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_OTROS_CRITERIOS),
                WaitUntil.the(OPCION_MATRICULA_OTRO_CRITERIO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_MATRICULA_OTRO_CRITERIO),
                Click.on(CAMPO_MATRICULA),
                Enter.theValue("198713").into(CAMPO_MATRICULA),

                Click.on(BOTON_CONSULTAR_EXPEDIENTE_GRAFICO),
                Click.on(BOTON_VER_IMAGEN_1),
                WaitUntil.the(BOTON_CERRAR_SOPORTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_SOPORTE),
                WaitUntil.the(BOTON_VOLVER_EXPEDIENTE_GRAFICO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_VOLVER_EXPEDIENTE_GRAFICO)
        );
    }

    public static FlujoExpedienteGrafico flujoExpedienteGrafico(){
        return new FlujoExpedienteGrafico();
    }
}
