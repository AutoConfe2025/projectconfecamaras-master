package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConciliacionRuesPage {

    public static Target BTN_CONCILIACION_RUES = Target.the("Boton pára ingresar al apartado de conciliacion RUES")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target INPUT_FECHA_CONCILIACION = Target.the("Input para ingrear fecha")
            .located(By.id("_fecha"));

    public static Target BTN_CONSULTAR_CONCILIACION = Target.the("Boton pára consultar")
            .located(By.xpath("//a[text()='Consultar']"));

    public static Target TABLA_CONCILIACIONES = Target.the("TABLA DE CONCILIACIONES")
            .located(By.id("gridRec"));


}
