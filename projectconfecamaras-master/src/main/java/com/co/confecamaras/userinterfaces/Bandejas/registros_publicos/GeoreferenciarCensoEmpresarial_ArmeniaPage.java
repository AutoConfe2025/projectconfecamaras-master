package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GeoreferenciarCensoEmpresarial_ArmeniaPage {

    public static final Target SELECT_TABLA_CENSO = Target.the("Selector Tabla Censo")
            .located(By.id("_tablacenso"));
    public static final Target SELECT_MUNICIPIO = Target.the("Selector de Municipio")
            .located(By.id("_municipio"));
    public static final Target SELECT_ACTIVIDAD = Target.the("Selector de Actividad")
            .located(By.id("_actividad"));
    public static final Target BOTON_GENERAR = Target.the("Botón Generar")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/center/table/tbody/tr/td/div/center/table/tbody/tr/td/a"));
}
