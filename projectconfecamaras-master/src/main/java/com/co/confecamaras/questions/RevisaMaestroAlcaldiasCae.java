package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroAlcaldiasCaeUI.*;

public class RevisaMaestroAlcaldiasCae implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinalMaestroAlcaldiasCae = LBL_MAESTRO_ALCALDIAS_CAE.resolveFor(actor).isVisible();
        return mensajeFinalMaestroAlcaldiasCae;
    }

    public static RevisaMaestroAlcaldiasCae enConfecamaraSII(){
        return new RevisaMaestroAlcaldiasCae();
    }
}