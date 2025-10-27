package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoBarriosUI extends PageObject {

    public static final Target SELECT_MUNICIPIO_MANTENIMIENTO_BARRIOS = Target.the("Seleccionar municipio")
            .located(By.id("_municipio"));

    public static final Target BTN_GRABAR_MANTENIMIENTO_BARRIOS = Target.the("Boton grabar")
            .located(By.xpath("//a[@onmouseover=\"Tip('Grabar barrios')\"]"));

    public static final Target LBL_MANTENIMIENTO_BARRIOS = Target.the("Mensaje mantenimiento barrios")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Barrios por Municipio - ')]"));
}