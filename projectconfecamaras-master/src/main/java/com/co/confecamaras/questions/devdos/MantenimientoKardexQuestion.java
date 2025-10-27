package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.MantenimientoKardex;
import com.co.confecamaras.userinterfaces.MantenimientoTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoKardexQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean validacionKar = MantenimientoKardex.BTN_REGRESAR_KARDEX.resolveFor(actor).isVisible();
        return validacionKar;
    }

    public static MantenimientoKardexQuestion validacion(){
        return new MantenimientoKardexQuestion();
    }
}
