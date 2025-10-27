package com.co.confecamaras.interactions.waitinteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted10Segundos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            System.out.println(" Inicio el tiempo");
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }
    public static WaitInterrupted10Segundos esperaConstante10() {
        return  new WaitInterrupted10Segundos();
    }
}
