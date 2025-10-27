package com.co.confecamaras.interactions.News;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitSeconds implements Interaction {
    private final int seconds;
    public WaitSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
    /**
     * Hace una espera de los segundos indicados
     *
     * @param seconds
     * @return
     * @author: Isaac Gomez
     */
    public static WaitSeconds seconds(int seconds) {
        return Tasks.instrumented(WaitSeconds.class, seconds);
    }

}
