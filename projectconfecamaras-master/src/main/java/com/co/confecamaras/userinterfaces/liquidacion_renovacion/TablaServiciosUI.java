package com.co.confecamaras.userinterfaces.liquidacion_renovacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TablaServiciosUI {

    public static final Target FILAS_TABLA = Target.the("Filas de la tabla de servicios")
            .locatedBy("//table[contains(@class,'table-striped')]/tbody/tr");
}
