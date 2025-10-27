package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RelacionDeReversionesPage {

    public static Target BTN_EXTRAER_REVERSIONES = Target.the("Boton para extraer la info")
            .located(By.xpath("//a[text()='Extraer']"));

    public static Target BTN_DESCARGAR_REVERSIONES = Target.the("Boton para extraer la info")
            .located(By.xpath("//a[text()='Descargar archivo']"));
}
