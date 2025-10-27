package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.*;

public class RevisaRenovacionMatriculaPNRenovada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalPN = MENSAJE_FINAL_PN_LBL.resolveFor(actor).isVisible();
        return mensajeFinalPN;
    }

    public static RevisaRenovacionMatriculaPNRenovada enConfecamarasSii(){
        return new RevisaRenovacionMatriculaPNRenovada();
    }
}