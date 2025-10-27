package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.GestionUsuariosExternosUI.*;

public class RevisaGestionUsuariosExternos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean mensajeFinalGestionUsuariosExternos = LBL_GESTION_USUARIOS_EXTERNOS.resolveFor(actor).isVisible();
        return mensajeFinalGestionUsuariosExternos;
    }

    public static RevisaGestionUsuariosExternos enConfecamaraSII(){
        return new RevisaGestionUsuariosExternos();
    }
}