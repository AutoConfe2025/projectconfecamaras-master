package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.MantenimientoPucJspPage.TABLA_MANTENIMIENTO;

public class TablaMantenimientoEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tabla = TABLA_MANTENIMIENTO.resolveFor(actor).isVisible();
        return tabla;
    }

    public static TablaMantenimientoEs visible(){
        return new TablaMantenimientoEs();
    }
}
