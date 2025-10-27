package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.ModulosApiIntegracionRestFullUI.*;

public class RevisaModulosAprIntegracionRestFull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalModulosApi = LBL_MENSAJE_MODULOS_API.resolveFor(actor).isVisible();
        return mensajeFinalModulosApi;
    }

    public static RevisaModulosAprIntegracionRestFull enConfecamaraSII(){
        return new RevisaModulosAprIntegracionRestFull();
    }
}