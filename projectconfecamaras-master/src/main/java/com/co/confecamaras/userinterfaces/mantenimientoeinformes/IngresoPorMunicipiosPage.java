package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPorMunicipiosPage {
    public static Target BTN_DESCARGAR_GENERACION = Target.the("Select tipo oerador")
            .located(By.xpath("//a[text()='Relación de movimientos por Municipio']"));
}
