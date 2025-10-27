package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorServiciosPage.GENERAR_EXCEL_POR_SERVICIO;

public class BotonGenerarInfoServicioEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean boton =  GENERAR_EXCEL_POR_SERVICIO.resolveFor(actor).isVisible();
        return boton;
    }

    public static BotonGenerarInfoServicioEs visible(){
        return new BotonGenerarInfoServicioEs();
    }
}
