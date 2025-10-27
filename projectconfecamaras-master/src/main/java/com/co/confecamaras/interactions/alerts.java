package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DriverTask;

public class alerts implements Task {

    public static Performable toAlert(){
        return new DriverTask(webDriver -> webDriver.switchTo().alert().accept());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
