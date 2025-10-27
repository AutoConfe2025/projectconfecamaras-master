package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroRutasDigitacionUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaMaestroRutasDigitacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeMaestroRutasDigitacion = LBL_MAESTRO_RUTAS_DIGITACION.resolveFor(actor).containsText(PASO_UNO_FINAL);
        return mensajeMaestroRutasDigitacion;
    }

    public static RevisaMaestroRutasDigitacion enConfecamaraSII() {
        return new RevisaMaestroRutasDigitacion();
    }
}