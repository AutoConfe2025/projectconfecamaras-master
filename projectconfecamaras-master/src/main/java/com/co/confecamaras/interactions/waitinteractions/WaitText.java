package com.co.confecamaras.interactions.waitinteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitText implements Interaction {

    private final Target text;

    public WaitText(Target text) {
        this.text = text;
    }

    public static WaitText textAppears(Target text) {
        return Tasks.instrumented(WaitText.class, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(text, isVisible())
        );
    }
}