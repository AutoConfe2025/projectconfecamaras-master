package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorOperadorPage {
    public static Target BTN_DESCARGAR_INFO_INGRESO_OPERADOR = Target.the("Select tipo oerador")
            .located(By.xpath("//a[text()='Relación de movimientos por Operador']"));
}
