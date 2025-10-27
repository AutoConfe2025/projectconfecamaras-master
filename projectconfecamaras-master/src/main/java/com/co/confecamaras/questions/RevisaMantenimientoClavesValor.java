package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MantenimientoClavesValorUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaMantenimientoClavesValor implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeClavesValor = LBL_MANTENIMIENTO_CLAVES_VALOR .resolveFor(actor).getText();
        return mensajeClavesValor.equals(CUENTA_PUBLICA_DOS);
    }

    public static RevisaMantenimientoClavesValor enConfecamaraSII() {
        return new RevisaMantenimientoClavesValor();
    }
}