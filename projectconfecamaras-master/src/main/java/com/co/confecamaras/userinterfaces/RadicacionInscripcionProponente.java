package com.co.confecamaras.userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RadicacionInscripcionProponente extends PageObject {

    public static By MATRICULA_INPUT = By.id("matricula");
    public static By CONTINUAR_BTN = By.xpath("(//button)[3]");
    public static By ACCIONES_BTN = By.xpath("//*[@id=\"tablaConsultaExpedientes\"]/tbody/tr[1]/td[1]/a");


}
