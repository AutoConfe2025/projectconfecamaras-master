package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogosBannersUI extends PageObject {

    public static final Target BTN_SELECCIONAR_ARCHIVO_LOGOS_BANNERS = Target.the("Boton seleccionar archivo")
            .located(By.xpath("//input[@name='_firmacartulinast']"));

    public static final Target BTN_CARGAR_LOGOS_BANNERS = Target.the("Boton cargar")
            .located(By.xpath("(//input[@onmouseover=\"Tip('Cargar logos, banners, cartulinas y firmas')\"])[2]"));

    public static final Target LBL_LOGOS_BANNERS = Target.the("Imagen logos y banners")
            .located(By.id("_firmacartulinas"));
}