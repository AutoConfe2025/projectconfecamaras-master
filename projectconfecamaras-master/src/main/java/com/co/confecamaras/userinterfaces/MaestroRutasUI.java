package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroRutasUI extends PageObject {

    public static final Target BTN_GRABAR_RUTAS = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MAESTRO_RUTAS = Target.the("Mensaje maestro rutas")
            .located(By.xpath("//td[contains(text(), 'Mantenimiento Maestro Rutas de Registro - ')]"));
}