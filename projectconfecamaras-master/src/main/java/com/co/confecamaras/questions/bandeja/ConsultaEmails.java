package com.co.confecamaras.questions.bandeja;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaEmails implements Question<Boolean> {

    private final Target targetAVerificar;

    public ConsultaEmails(Target targetAVerificar) {
        this.targetAVerificar = targetAVerificar;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(targetAVerificar).answeredBy(actor);
    }


    /**
     * Método de conveniencia para mejorar la legibilidad al usar la Question
     * en seeThat().
     *
     * @return Esta misma instancia de la Question.
     */
    public ConsultaEmails asksFor() {
        return this;
    }
    // ----------------------------

    public static ConsultaEmails paraElTarget(Target target) {
        return new ConsultaEmails(target);
    }
}