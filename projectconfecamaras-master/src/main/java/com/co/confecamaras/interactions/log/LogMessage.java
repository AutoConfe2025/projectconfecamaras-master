package com.co.confecamaras.interactions.log;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;  // Cambiado a Interaction
//import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogMessage implements Interaction {  // Implementa Interaction en lugar de Task

    private final String message;

    LogMessage(String message) {  // Constructor ahora privado
        this.message = message;
    }

    public static LogMessage withText(String message) {
        return instrumented(LogMessage.class, message);
    }

    @Step("{0} logs message: '#message'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("LOG: " + message);
    }
}