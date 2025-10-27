package com.co.confecamaras.questions.Elementos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoElegible implements Question<Boolean> {
    private Target element;

    public ElementoElegible(Target element){
         this.element = element;
     }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(element).answeredBy(actor);
    }

    public static  ElementoElegible para(Target elemento){
        return new ElementoElegible(elemento);
    }

}
