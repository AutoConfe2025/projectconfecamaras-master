package com.co.confecamaras.userinterfaces.clickopciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClickPrimeraOpcion {
    public static Target BTN_PRIMERA_OPCION = Target.the("Boton pára ingresar a la primera opcion que aparece en el buscador")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target BTN_SEGUNDA_OPCION = Target.the("Boton pára ingresar a la segunda opcion que aparece en el buscador")
            .located(By.xpath( "/html/body/div[1]/main/div[1]/span/ul/li[2]/a"));



}
