package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExtraccionExperianNuevoUI extends PageObject {

    public static final Target TXT_FECHA_INICIAL_EEN = Target.the("Escribir fecha inicial")
            .located(By.id("_fecini"));

    public static final Target TXT_FECHA_FINAL_EEN = Target.the("Escribir fecha final")
            .located(By.id("_fecfin"));

    public static final Target BTN_EXTRAER_EEN = Target.the("Boton extraer")
            .located(By.xpath("//a[@onmouseover=\"Tip('Extraer')\"]"));

    public static final Target BTN_EXPERIAN_DATA_UNO_EEN = Target.the("Boton experian data uno")
            .located(By.xpath("//a[text()='20-Experian-Data01-20230101-20230115']"));

    public static final Target BTN_EXPERIAN_DATA_DOS_EEN = Target.the("Boton experian data dos")
            .located(By.xpath("//a[text()='20-Experian-Data02-20230101-20230115']"));

    public static final Target BTN_EXPERIAN_DATA_TRES_EEN = Target.the("Boton experian data tres")
            .located(By.xpath("//a[text()='20-Experian-Data03-20230101-20230115']"));

    public static final Target LBL_MENSAJE_FINAL_EEN = Target.the("Mensaje final extraccion experian nuevo")
            .located(By.xpath("//a[text()='20-Experian-Data03-20230101-20230115']"));
}