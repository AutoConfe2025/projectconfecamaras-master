package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuSistema extends PageObject {

    // ----- DataEstudioInscripcionDocumentosProponentes ------ //



    // ---- Side Bar ---- //

    public static Target BTN_MENU_LATERAL = Target.the("Boton ingresar modulo de registro")
            .located(By.cssSelector(".rounded.expMenu"));

    public static Target TXT_BUSQUEDA_INPUT = Target.the("Cuadro de texto busqueda menu lateral").
            located(By.id("sidebar-search"));

    public static By BUSQUEDA_INPUT = By.id("sidebar-search");

    public static Target BUSQUEDA_INPUT_1 = Target.the("Cuadro de texto Matricula").
                located(By.id("sidebar-search"));

    public static By SELECCIONAR_OPT = By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a");

    public static final Target ESPERA = Target.the("Espera")
            .located(By.xpath("//div[@class=\"loaderOnload\"]"));

    public static By SELECCIONAR_DOS_OPT = By.xpath("//*[@id=\"resultados-search-div\"]/ul/li[2]/a");

    // ---- Main ---- //

    public static By CONSULTA_SLC = By.id("selectS");
    public static By CRITERIO_INPUT = By.id("criterio");
    public static By CONTINUAR_BTN = By.xpath("//div[@class='card-footer text-center']//button[1]");

}
