package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterTheValueNTimes implements Interaction {

    private final Target target;
    private final int times;
    private static final String TEXT = "pruebas AUT_QA,pruebas AUT_QA,pruebas AUT_QA,pruebas AUT_QA,pruebas AUT_QA,pruebas AUT_QA,pruebas AUT_QA";

    public EnterTheValueNTimes(Target target, int times) {
        this.target = target;
        this.times = times;
    }

    public static EnterTheValueNTimes into(Target target, int times) {
        return Tasks.instrumented(EnterTheValueNTimes.class, target, times);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < times; i++) {
            actor.attemptsTo(
                    Enter.theValue(TEXT).into(target)
            );
        }
    }
}
