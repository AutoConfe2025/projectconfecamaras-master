package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoCommonXXUI extends PageObject {

    public static final Target BTN_GRABAR_MANTENIMIENTO_COMMONXX = Target.the("Boton grabar")
            .located(By.xpath("//input[@value='Grabar']"));

    public static final Target LBL_MANTENIMIENTO_COMMONXX = Target.the("Mensaje mantenimiento commonxx")
            .located(By.id("frameSecundarioCentral"));
}