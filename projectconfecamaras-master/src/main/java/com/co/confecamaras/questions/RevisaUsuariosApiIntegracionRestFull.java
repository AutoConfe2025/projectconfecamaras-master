package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.UsuariosApiIntegracionRestFullUI.*;

public class RevisaUsuariosApiIntegracionRestFull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeFinalUsuariosApi = LBL_MENSAJE_USUARIOS_API.resolveFor(actor).isVisible();
        return mensajeFinalUsuariosApi;
    }

    public static RevisaUsuariosApiIntegracionRestFull enConfecamaraSII(){
        return new RevisaUsuariosApiIntegracionRestFull();
    }
}