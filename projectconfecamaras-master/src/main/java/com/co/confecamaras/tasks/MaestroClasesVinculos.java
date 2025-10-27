package com.co.confecamaras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.*;

public class MaestroClasesVinculos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static MaestroClasesVinculos enConfecamaraSII(){
        return instrumented(MaestroClasesVinculos.class);
    }
}