package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BusquedaInicial {

    public static final Target BOTON_BUSQUEDA_HEADER = Target.the("CRT + K").
            located(By.xpath("//*[@id='accionHome']/button"));

    public static final Target INPUT_BUSCAR = Target.the("buscar reingresados").
            located(By.xpath("//*[@id='searchInput']"));
    public static final Target BOTON_LUPA = Target.the("Boton lupa").
            located(By.xpath("//*[contains(@id, '_content')]/div[1]/span"));

    public static Target elementoBuscadoDinamico(String textoElemento) {

        return Target.the("Elemento con texto: " + textoElemento)
                .located(By.xpath(
                        "//*[contains(@id, '_content')]/div[2]/div/div/div/div/span[2][contains(text(), '" + textoElemento + "')]"
                ));
    }

}
