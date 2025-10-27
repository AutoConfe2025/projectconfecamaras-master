package com.co.confecamaras.interactions.waitinteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted7Segundos  implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }

    public static WaitInterrupted7Segundos esperaConstante7(){
        return new WaitInterrupted7Segundos();
    }
}
