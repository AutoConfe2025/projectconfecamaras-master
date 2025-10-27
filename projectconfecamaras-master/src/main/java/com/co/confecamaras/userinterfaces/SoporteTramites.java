package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SoporteTramites extends PageObject {

    public static By EDITAR_BTN = By.xpath("//a[@href=\"javascript:editar(1)\"]");
    public static By OBS_TXT = By.id("_obs");
    public static By GRABAR_BTN = By.xpath("//a[@href=\"javascript:grabar()\"]");
    public static Target VALIDATION_OBS = Target.the("")
            .located(By.id("_obs"));

}
