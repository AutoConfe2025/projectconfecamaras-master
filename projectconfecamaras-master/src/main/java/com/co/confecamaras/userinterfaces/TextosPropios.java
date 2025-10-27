package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TextosPropios extends PageObject {

    public static Target VALIDACION_CAMPO = Target.the("")
            .located(By.xpath("(//div[@id=\"campo\"])[2]"));
    public static By CREAR_NUEVO_BTN = By.xpath("(//a)[1]");
    public static By EDITAR_TEXT_BTN = By.xpath("(//a)[2]");
    public static By BORRAR_TEXT_BTN = By.xpath("(//a)[3]");
    public static By GRABAR_BTN = By.xpath("//input[@value=\"Grabar\"]");
    public static By ID_TEXTO_INPUT = By.id("_idtexto");
    public static By CONTENIDO_TEXT = By.id("_texto");

}
