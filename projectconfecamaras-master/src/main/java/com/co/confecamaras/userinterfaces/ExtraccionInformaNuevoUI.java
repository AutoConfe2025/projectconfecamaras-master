package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExtraccionInformaNuevoUI extends PageObject {

    public static final Target TXT_FECHA_INICIAL_EIN = Target.the("Escribir fecha inicial")
            .located(By.id("_fecini"));

    public static final Target TXT_FECHA_FINAL_EIN = Target.the("Escribir fecha final")
            .located(By.id("_fecfin"));

    public static final Target TXT_FORMATO_AJUSTADO_EIN = Target.the("Escribir formato ajustado")
            .located(By.id("_ajustado"));

    public static final Target TXT_TELEFONOS_60X_EIN = Target.the("Escribir telefonos 60X")
            .located(By.id("_ajustadotel"));

    public static final Target BTN_EXTRAER_EIN = Target.the("Boton extraer")
            .located(By.xpath("//a[@onmouseover=\"Tip('Extraer')\"]"));

    public static final Target BTN_EXPERIAN_DATA_UNO_EIN = Target.the("Boton experian data uno")
            .located(By.xpath("//a[text()='20-Informa-Data01-20230101-20230102']"));

    public static final Target BTN_EXPERIAN_DATA_DOS_EIN = Target.the("Boton experian data dos")
            .located(By.xpath("//a[text()='20-Informa-Data02-20230101-20230102']"));

    public static final Target BTN_EXPERIAN_DATA_TRES_EIN = Target.the("Boton experian data tres")
            .located(By.xpath("//a[text()='20-Informa-Data03-20230101-20230102']"));

    public static final Target BTN_EXPERIAN_DATA_CUATRO_EIN = Target.the("Boton experian data cuatro")
            .located(By.xpath("//a[text()='20-Informa-Data04-20230101-20230102']"));

    public static final Target LBL_MENSAJE_FINAL_EIN = Target.the("Boton experian data cuatro")
            .located(By.xpath("//a[text()='20-Informa-Data01-20230101-20230102']"));
}