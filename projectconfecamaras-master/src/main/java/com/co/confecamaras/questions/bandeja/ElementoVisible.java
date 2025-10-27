package com.co.confecamaras.questions.bandeja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ElementoVisible implements Question<Boolean> {
    private String xpath;

    public ElementoVisible(String xpath) {
        this.xpath = xpath;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(xpath).answeredBy(actor);
    }

    public static ElementoVisible enXPath(String xpath) {
        return new ElementoVisible(xpath);
    }
}
