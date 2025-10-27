package com.co.confecamaras.questions.mantenimientoeinformes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.RelacionDeReversionesPage.BTN_DESCARGAR_REVERSIONES;

public class EnlaceDescargarArchivoEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean btn = BTN_DESCARGAR_REVERSIONES.resolveFor(actor).isVisible();
        return btn;
    }

    public static EnlaceDescargarArchivoEs visible(){
        return new EnlaceDescargarArchivoEs();
    }
}
