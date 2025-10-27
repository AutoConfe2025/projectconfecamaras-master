package com.co.confecamaras.questions.consultasytransacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.consultasytransacciones.relacionesPage.TABLA_INFO;

public class RelacionesMatriculadosTablaEs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean tablaInformacion = TABLA_INFO.resolveFor(actor).isVisible();
        return  tablaInformacion;
    }

    public static RelacionesMatriculadosTablaEs visible(){
        return new RelacionesMatriculadosTablaEs();
    }
}
