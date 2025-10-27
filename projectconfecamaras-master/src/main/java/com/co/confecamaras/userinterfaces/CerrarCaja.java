package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CerrarCaja extends PageObject {

    public static By VALOR_RECAUDADO_INPUT = By.xpath("//div[@id=\"seccionCentral\"]//input[@id=\"txtValorCaja\"]");
    public static By GENERAR_BTN = By.xpath("//*[@id=\"RangoFecha\"]/div[2]/button[2]");

    public static Target VALIDACION_CIERRE_CAJA = Target.the("")
            .located(By.xpath("(//h2[normalize-space()='Caja Cerrada'])[1]"));
}
