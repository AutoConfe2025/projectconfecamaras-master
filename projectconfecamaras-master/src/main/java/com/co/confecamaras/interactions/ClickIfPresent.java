package com.co.confecamaras.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ClickIfPresent implements Task {

    private final Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (target.resolveFor(actor).isPresent()) {
            actor.attemptsTo(Click.on(target));
        }
    }

    public static ClickIfPresent on(Target target) {
        return instrumented(ClickIfPresent.class, target);
    }
}
