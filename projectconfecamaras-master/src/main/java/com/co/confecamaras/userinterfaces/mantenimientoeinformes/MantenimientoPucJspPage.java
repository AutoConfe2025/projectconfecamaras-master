package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MantenimientoPucJspPage {

    public static Target BTN_MANTENIMIENTO_PUC = Target.the("Boton pára ingresar al apartado de Mantenimineto puc jsp")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));


    public static Target TABLA_MANTENIMIENTO = Target.the("Boton pára ingresar al apartado de Mantenimineto puc jsp")
            .located(By.xpath("//div[@class='objbox']"));
}
