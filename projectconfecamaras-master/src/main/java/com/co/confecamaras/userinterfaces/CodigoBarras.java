package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CodigoBarras extends PageObject {

    public static By NUM_CODIGO_BARRA_INPUT = By.id("_codigobarras");
    public static By CONTINUAR_BTN = By.xpath("//div[@id=\"frameSecundarioCentral\"]//input[@value=\"Continuar\"]");
    public static By ASIGNAR_USUARIO_SLC = By.xpath("//*[@id=\"_usuarioasignar\"]/option[2]"); //By.name("_usuarioasignar"); //By.id("_usuarioasignar");
    public static By ESTADO_APLICAR_SLC = By.xpath("//*[@id=\"_estadoasignar\"]/option[2]"); //By.id("_estadoasignar");
    public static By TIPO_SLC =  By.xpath("//*[@id=\"_tipoanotacion\"]/option[2]");   //By.id("_tipoanotacion");
    public static By OBSERVACIONES_TXT = By.id("_anotacion");
    public static By APLICAR_BTN = By.xpath("//div[@id=\"frameSecundarioCentral\"]//input[@value=\"Aplicar\"]");

    public static Target VALIDACION_COD = Target.the("")
            .located(By.id("frameSecundarioCentral"));


}