package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LiquidacionSolicitudMatriculaUI extends PageObject {

    public static final Target PROGRESO_ESPERA = Target.the("Progreso espera")
            .located(By.xpath("//div[@role=\"progressbar\"]"));

    public static final Target BTN_CERRAR_LIQUIDACION = Target.the("Boton cerrar")
            .located(By.xpath("(//*[contains(text(), 'Cerrar')])[1]"));


}
