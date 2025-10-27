package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.RadicarDepositoEstadosFinancierosUI.*;

public class RevisaRadicarDepositosEstadosFinancieros implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_DOCUMENTO_FINAL_RADICAR_DEPOSITO.resolveFor(actor).isVisible();
    }

    public static RevisaRadicarDepositosEstadosFinancieros enConfecamaraSII(){
        return new RevisaRadicarDepositosEstadosFinancieros();
    }
}