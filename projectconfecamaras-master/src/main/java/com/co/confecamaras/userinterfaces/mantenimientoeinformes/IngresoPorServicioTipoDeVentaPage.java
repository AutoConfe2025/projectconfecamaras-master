package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorServicioTipoDeVentaPage {

    public static Target BTN_INGRESO_SERVICIO_TIPO_VENTA = Target.the("Boton pára ingresar al apartado de ingreso por servicio tipo venta")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target BTN_DESCARGAR_CSV_SERV = Target.the("Boton pára descragar la data")
            .located(By.xpath("//a[text()='Descargar CSV']"));

}
