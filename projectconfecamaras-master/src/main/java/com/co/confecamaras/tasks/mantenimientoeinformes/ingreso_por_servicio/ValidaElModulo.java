package com.co.confecamaras.tasks.mantenimientoeinformes.ingreso_por_servicio;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.RevisionPorServicio.*;

public class ValidaElModulo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_FECHA_INICIAL),
                Clear.field(CAMPO_FECHA_INICIAL),
                Enter.theValue("2025-11-01").into(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_INICIAL),
                Click.on(CAMPO_FECHA_FINAL),
                Clear.field(CAMPO_FECHA_FINAL),
                Enter.theValue("2025-11-01").into(CAMPO_FECHA_FINAL),
                Click.on(CAMPO_FECHA_FINAL),
                Click.on(CAMPO_TIPO_DETALLE),
                Enter.theValue("R").into(CAMPO_TIPO_DETALLE),
                Click.on(BOTON_CONSULTAR),
                AceptAlert.aceptar(),
                Click.on(RELACION_MOVIENTO_POR_SERVICIOS),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_DESCARGA)
        );
    }

    public static ValidaElModulo IngresoPorServicio(){
        return new ValidaElModulo();
    }
}
