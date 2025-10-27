package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted3Segundos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }
    public static WaitInterrupted3Segundos esperaConstante3() {
        return  new WaitInterrupted3Segundos();
    }
}
