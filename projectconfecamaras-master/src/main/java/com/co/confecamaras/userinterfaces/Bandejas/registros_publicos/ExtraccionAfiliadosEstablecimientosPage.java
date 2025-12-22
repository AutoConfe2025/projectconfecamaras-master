package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ExtraccionAfiliadosEstablecimientosPage {

    public static final Target BOTON_GENERAR = Target.the("Boton Generar")
            .located(By.xpath("//*[@id='page-top']/div[2]/div/div/div[6]/div/div[2]/div/a/button[normalize-space(text())='Generar']"));
    public static final Target BOTON_GENERAR_REPORTE = Target.the("Boton Generar de la sección secundaria")
            .located(By.xpath("//*[@id='page-top']/div[8]/div/div/div[2]/button[2][normalize-space(text())='Generar']"));
}
