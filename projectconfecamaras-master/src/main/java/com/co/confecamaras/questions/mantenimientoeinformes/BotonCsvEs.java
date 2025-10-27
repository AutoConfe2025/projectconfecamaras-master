package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.IngresoPorServicioTipoDeVentaPage.BTN_DESCARGAR_CSV_SERV;

public class BotonCsvEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean btn =  BTN_DESCARGAR_CSV_SERV.resolveFor(actor).isVisible();
        return btn;
    }

    public static BotonCsvEs visible(){
        return new BotonCsvEs();
    }
}
