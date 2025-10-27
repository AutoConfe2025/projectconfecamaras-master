package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidacionDatos implements Interaction {

    WebDriver driver;
    String capt;

    @Override
    public <T extends Actor> void performAs(T actor) {
        validacionDatos();
    }

    public void validacionDatos(){
        WebElement libro = driver.findElement(By.id("libro"));
        capt = libro.getText();
        System.out.println(capt);
    }

    public static ValidacionDatos captura() {
        return new ValidacionDatos();
    }

}