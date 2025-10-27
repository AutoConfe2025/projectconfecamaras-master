package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted10Segundos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }
    public static WaitInterrupted10Segundos esperaConstante10() {
        return  new WaitInterrupted10Segundos();
    }
}
