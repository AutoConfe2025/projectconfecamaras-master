package com.co.confecamaras.tasks.registro_publico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.registros_publicos.PageRues.*;

public class LlenaFormularioRue implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NUEVO_SERVICIO_RUES),
                Click.on(LISTA_TABLA),
                Click.on(OPCION_LISTA_TABLA),
                Click.on(CAMPO_SERVICIO_RUE),
                Enter.theValue("000000").into(CAMPO_SERVICIO_RUE),
                Click.on(CAMPO_NOMBRE),
                Enter.theValue("QA").into(CAMPO_NOMBRE),
                Click.on(LISTA_SELECCION_SERVICIO_CAMARA),
                Click.on(OPCION_LISTA_SELECCION_SERVICIO_CAMARA),
                Click.on(LISTA_TIPO_TRAMITE),
                Click.on(OPCION_LISTA_TIPO_TRAMITE),
                Click.on(LISTA_GRUPOS),
                Click.on(OPCION_LISTA_GRUPOS),
                Click.on(CONTROL_ESTADO_MATRICULA),
                Click.on(CAMPO_CONTROL_ORGANIZACIONES),
                Enter.theValue("01,03").into(CAMPO_CONTROL_ORGANIZACIONES),
                Click.on(CAMPO_CONTROL_CATEGORIAS),
                Enter.theValue("01").into(CAMPO_CONTROL_CATEGORIAS),
                Click.on(LISTA_CONTROL_PROPIETARIO),
                Click.on(OPCION_LISTA_CONTROL_PROPIETARIO),
                Click.on(BOTON_GRABAR_RUE),
                Click.on(BOTON_ACEPTAR_RUE),
                Click.on(BOTON_EDITAR),
                Click.on(BOTON_RETORNO),
                Click.on(BOTON_VENTA),
                Click.on(BOTON_GRABAR_RUE),
                Click.on(BOTON_ACEPTAR_RUE),
                Click.on(BOTON_ELIMINAR),
                Click.on(BOTON_SI_ELIMINAR)
        );
    }

    public static LlenaFormularioRue formularioRue(){
        return new LlenaFormularioRue();
    }
}
