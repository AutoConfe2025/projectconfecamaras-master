package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorCuentaPage {

    public static Target BTN_INGRESO_CUENTA = Target.the("Boton pára ingresar al apartado de ingreso por cuenta")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target INPUT_CUENTA_INICIAL = Target.the("Input para ingresar ccuenta inicial")
            .located(By.id("_cuentaini"));

    public static Target INNPUT_CUENTA_FINAL = Target.the("Input para ingresar ccuenta final")
            .located(By.id("_cuentafin"));

    public static Target INPUT_FECHA_INICIAL = Target.the("Input para ingresar fecha inicial")
            .located(By.id("_fecini"));

    public static Target INPUT_FECHA_FINAL = Target.the("Input para ingresar fecha final")
            .located(By.id("_fecfin"));

    public static Target BTN_CONSULTAR_INGRESO = Target.the("Boton para consultar ingreso")
            .located(By.xpath("//a[text()='Generar']"));

    public static Target GENERAR_EXCEL = Target.the("Boton para generar excel")
            .located(By.xpath("//a[text()='Relación de movimientos por cuenta']"));

}
