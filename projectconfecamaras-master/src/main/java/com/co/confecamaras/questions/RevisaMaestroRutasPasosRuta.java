package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.MaestroRutasPasosRutaUI.*;
import static com.co.confecamaras.utils.Constantes.*;

public class RevisaMaestroRutasPasosRuta implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeMaestroRutaPasosRuta = LBL_MAESTRO_RUTAS_PASOS_RUTA.resolveFor(actor).getText();
        return mensajeMaestroRutaPasosRuta.contains(FINESTDOS);
    }

    public static RevisaMaestroRutasPasosRuta enConfecamaraSII() {
        return new RevisaMaestroRutasPasosRuta();
    }
}