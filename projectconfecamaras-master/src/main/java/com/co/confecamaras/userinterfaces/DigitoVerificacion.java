package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DigitoVerificacion extends PageObject {

    public static By CEDULA_NIT_INPUT = By.id("Nidentificacion");
    public static By AGREGAR_BTN = By.xpath("//div[@class='input-group campos row']//a[@href='javascript:validarCalcular();']");
    public static By CALCULAR_BTN = By.id("calcular");
    public static By CEDULA_NIT_DOS_INPUT = By.id("Nidentificacion2");

    public static Target VALIDACION_COD = Target.the("")
            .located(By.id("Nverificacion2"));

}
