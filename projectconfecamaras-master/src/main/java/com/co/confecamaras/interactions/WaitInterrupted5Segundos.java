package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitInterrupted5Segundos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }
    public static WaitInterrupted5Segundos esperaConstante5() {
        return  new WaitInterrupted5Segundos();
    }
}
