package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.VerificacionMultasVencidasPonalUI.*;

public class RevisaVerificacionMultasVencidasPonal implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        /*Boolean mensajeVerificacionMultasVencidasPonal = LBL_VERIFICACION_MULTAS_VENCIDAS_PONAL.resolveFor(actor).isVisible();
        return mensajeVerificacionMultasVencidasPonal;*/
        Boolean mensajeMultasVencidasPonal = LBL_VERIFICACION_MULTAS_DOS_VENCIDAS_PONAL.resolveFor(actor).isVisible();
        return mensajeMultasVencidasPonal;
    }

    public static RevisaVerificacionMultasVencidasPonal enConfecamaraSII(){
        return new RevisaVerificacionMultasVencidasPonal();
    }
}