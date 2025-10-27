package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventarioScriptsPage {

    public static final Target INVENTARIO_SCRIPTS = Target.the("Boton para ingresar al apartado de inventario scripts")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
    //Cambiar pestaña

    public static final Target TABLA_SCRIPTS = Target.the("Tabla que muestra los scripts")
            .located(By.id("gridbox"));
}
