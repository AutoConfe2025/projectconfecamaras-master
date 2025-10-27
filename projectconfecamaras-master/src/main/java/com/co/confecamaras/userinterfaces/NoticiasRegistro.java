package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NoticiasRegistro extends PageObject  {

    public static By FECHA_INICIO_INPUT = By.id("fechaInicial");
    public static By FECHA_FINAL_INPUT = By.id("fechaFinal");
    public static By LIBRO_SLC = By.id("idLibro");
    public static By CONTINUAR_BTN = By.xpath("//div[@class=\"card-footer text-center\"]//button");
    public static By SELLO_BTN = By.xpath("(//table[@id=\"resultados\"]//td//a[@href=\"javascript:void(0);\"])[1]");
    public static By SI_BTN = By.xpath("//div[@class=\"modal-footer\"]//button[text()='Si']");

    public static final Target LBL_NOTICIAS_REGISTROS = Target.the("Mensaje noticias registros")
            .located(By.id("ModalTitulo"));
}