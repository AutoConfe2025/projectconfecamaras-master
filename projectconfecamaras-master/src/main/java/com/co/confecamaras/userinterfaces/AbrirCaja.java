package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AbrirCaja extends PageObject {

    public static By OPERADOR_SLC = By.id("operador");
    public static By ABRIR_CAJA_BTN = By.id("abrirCierre");

    public static Target VALIDACION_APERTURA_CAJA = Target.the("")
            .located(By.xpath("//div[text()='Se ha realizado la apertura de Caja']"));
}