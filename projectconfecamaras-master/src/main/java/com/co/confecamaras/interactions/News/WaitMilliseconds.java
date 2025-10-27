package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitMilliseconds implements Interaction {
    private final int milliseconds;

    public WaitMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(milliseconds);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Hace una espera de los milisegundos indicados
     *
     * @param milliseconds
     * @return
     * @author: Isaac Gomez
     */
    public static WaitMilliseconds milliseconds(int milliseconds) {
        return Tasks.instrumented(WaitMilliseconds.class, milliseconds);
    }
}
