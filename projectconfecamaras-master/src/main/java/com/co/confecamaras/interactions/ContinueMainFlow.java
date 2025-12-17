package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueMainFlow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Continuando flujo principal (Serenity).");
    }

    public static ContinueMainFlow now() {
        return instrumented(ContinueMainFlow.class);
    }
}
