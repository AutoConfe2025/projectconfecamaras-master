package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.administracion.SistemaExternosPage.TABLA_SISTEMAS;

public class TablaSsietmasEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaSistema = TABLA_SISTEMAS.resolveFor(actor).isVisible();
        return tablaSistema;
    }

    public static TablaSsietmasEs visible(){
        return new TablaSsietmasEs();
    }
}
