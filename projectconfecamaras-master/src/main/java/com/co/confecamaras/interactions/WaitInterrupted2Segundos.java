package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted2Segundos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }
    public static WaitInterrupted2Segundos esperaConstante2() {
        return  new WaitInterrupted2Segundos();
    }
}
