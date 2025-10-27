package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumidoDeImpuestoPage {
    public static Target SELECT_FORMATO = Target.the("Select tipo oerador")
            .located(By.id("_tipoinforme"));
}
