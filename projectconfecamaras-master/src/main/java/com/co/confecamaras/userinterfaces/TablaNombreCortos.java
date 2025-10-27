package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TablaNombreCortos extends PageObject {

    public static By OPC_SLC = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]");
    public static By GRABAR_BTN = By.xpath("//a[normalize-space()='Grabar']");
    public static Target VALIDACION_TNC = Target.the("")
            .located(By.id("gridbox"));

}
