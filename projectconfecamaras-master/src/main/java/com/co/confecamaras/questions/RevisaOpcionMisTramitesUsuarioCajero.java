package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.OpcionMisTramitesUsuarioCajeroUI.*;

public class RevisaOpcionMisTramitesUsuarioCajero implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_OPCION_MIS_TRAMITES_USUARIO_CAJERO.resolveFor(actor).isEnabled();
    }

    public static RevisaOpcionMisTramitesUsuarioCajero enConfecamaraSII(){
        return new RevisaOpcionMisTramitesUsuarioCajero();
    }
}