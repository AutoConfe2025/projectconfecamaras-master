package com.co.confecamaras.questions.administracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.confecamaras.userinterfaces.administracion.MttoMatriculaAlcaldiaPage.INPUT_NOMBRE_RAZON_SOCIAL;

public class ValorInputAlcaldiaEsta implements Question<Boolean> {

    private final Target input;

    public ValorInputAlcaldiaEsta(Target input) {
        this.input = input;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String value =  input.resolveFor(actor).getValue();
        return value.isEmpty();
    }

    public static ValorInputAlcaldiaEsta vacio(Target input){
        return new ValorInputAlcaldiaEsta(input);
    }
}
