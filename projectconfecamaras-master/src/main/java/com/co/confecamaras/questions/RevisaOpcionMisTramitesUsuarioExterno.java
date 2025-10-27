package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.OpcionMisTramitesUsuarioExternoUI.*;

public class RevisaOpcionMisTramitesUsuarioExterno implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_OPCION_MIS_TRAMITES_UE.resolveFor(actor).isVisible();
    }

    public static RevisaOpcionMisTramitesUsuarioExterno enConfecamaraSII(){
        return new RevisaOpcionMisTramitesUsuarioExterno();
    }
}