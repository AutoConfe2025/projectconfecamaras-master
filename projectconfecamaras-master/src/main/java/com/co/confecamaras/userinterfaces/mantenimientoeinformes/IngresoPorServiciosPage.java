package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorServiciosPage {


    public static Target BTN_INGRESO_SERVICIO = Target.the("Boton pára ingresar al apartado de ingreso por servicio")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
    public static Target GENERAR_EXCEL_POR_SERVICIO = Target.the("Boton para generar excel")
            .located(By.xpath("//a[text()='Relación de movimientos por servicio']"));
}
