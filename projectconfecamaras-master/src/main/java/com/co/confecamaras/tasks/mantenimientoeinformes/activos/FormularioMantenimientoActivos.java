package com.co.confecamaras.tasks.mantenimientoeinformes.activos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.Activos.*;

public class FormularioMantenimientoActivos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (BOTON_MOSTRAR_RELACION.resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                    Click.on(BOTON_MOSTRAR_RELACION)
            );
        }

        if (BOTON_ELIMINAR.resolveFor(actor).isPresent()) {
            actor.attemptsTo(
                    Click.on(BOTON_ELIMINAR)
            );
        }

        actor.attemptsTo(
                Click.on(BOTON_NUEVO_REGISTRO),
                Click.on(CAMPO_ID_ACTIVO),
                Enter.theValue("01").into(CAMPO_ID_ACTIVO),
                Click.on(LISTA_ESTADO),
                Click.on(OPCION_ESTADO_ACTIVADO),
                Click.on(LISTA_FONDO),
                Click.on(OPCION_FONDO_PUBLICO),
                Click.on(CAMPO_DETALLE),
                Enter.theValue("qa").into(CAMPO_DETALLE),
                Click.on(CAMPO_FECHA_DE_COMPRA),
                Enter.theValue("20250101").into(CAMPO_FECHA_DE_COMPRA),
                Click.on(LISTA_CENTRO_DE_COSTOS),
                Click.on(OPCION_ADMINISTRATIVA_FINANCIERA),
                Click.on(LISTA_AREA_DE_TRABAJO),
                Click.on(OPCION_PRESIDENCIA),
                Click.on(CAMPO_MANTENIDO_VENTA),
                Enter.theValue("s").into(CAMPO_MANTENIDO_VENTA),
                Click.on(BOTON_GRABAR_PLANILLA)
        );
    }

    public static FormularioMantenimientoActivos llenaFormulario() {
        return new FormularioMantenimientoActivos();
    }
}
