package com.co.confecamaras.questions.devdos;

import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MantenimientoUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MantenimientoUsuariosQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Boolean valMantUsuarios = MantenimientoUsuarios.VAL_MANT_USUARIOS.resolveFor(actor).isVisible();
        return valMantUsuarios;
    }

    public static MantenimientoUsuariosQuestion validacion(){
        return new MantenimientoUsuariosQuestion();
    }
}
