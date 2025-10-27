package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ModulosApiIntegracionRestFullUI extends PageObject {

    public static final Target BTN_ACTIVO_MODULOS_API = Target.the("Boton activo")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[79]/td[4]"));

    public static final Target TXT_ACTIVO_MODULOS_API = Target.the("Escribir activo")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[79]/td[4]/input"));

    public static final Target BTN_GRABAR_MODULOS_API = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MENSAJE_MODULOS_API = Target.the("Mesaje modulos api")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Modulos API (Relación) - ')]"));
}