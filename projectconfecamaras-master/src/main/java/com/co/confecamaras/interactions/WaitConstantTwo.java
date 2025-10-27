package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitConstantTwo implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        espera();
    }

    public void espera() {
        try {
            Thread.sleep(2000);
        }  catch (InterruptedException e) {
            System.out.println("Wait not");
            throw new RuntimeException(e);
        }
    }

    public static WaitConstantTwo esperaConstante() {
        return new WaitConstantTwo();
    }

}
