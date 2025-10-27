package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorCCostoPage {

    public static Target BTN_INGRESO_C_COSTOS = Target.the("Boton pára ingresar al apartado de Ingresos por C.Costos")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target INPUT_COSTO_INI = Target.the("Input para ingresar costo incial")
            .located(By.id("_ccosini"));

    public static Target INPUT_COSTO_FINAL = Target.the("Input para ingresar ccosto final")
            .located(By.id("_ccosfin"));

    public static Target BTN_GENERAR_EXCEL_C_COSTOS = Target.the("Boton pára descargar excel")
            .located(By.xpath("//a[text()='Relación de movimientos por C.Costos']"));
}
