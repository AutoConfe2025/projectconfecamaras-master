package com.co.confecamaras.questions.aseguramientosii;

import com.github.javafaker.Bool;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.aseguramientosii.ExportarEstructuraPage.DESCARGAR_ESTRUCTUIRA;

public class EnlaceDescargaEs  implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean Enlace = DESCARGAR_ESTRUCTUIRA.resolveFor(actor).isVisible();
        return Enlace;
    }

    public static  EnlaceDescargaEs visible(){
        return new EnlaceDescargaEs();
    }
}
