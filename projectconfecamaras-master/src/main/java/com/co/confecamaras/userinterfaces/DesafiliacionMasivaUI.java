package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DesafiliacionMasivaUI extends PageObject {

    public static final Target BTN_SELECCIONAR_DM = Target.the("Boton seleccionar")
            .located(By.xpath("//a[@onmouseover=\"Tip('Seleccionar')\"]"));

    public static final Target TXTO_DESAFILIACION_MASIVA = Target.the("Boton seleccionar")
            .located(By.xpath("(//h2[contains(text(),'Aún no se ha cumplido el plazo para ejecutar la de')])[1]"));

    public static final Target BTN_EXTACCION_EXCEL_DM = Target.the("Boton extraccion a excel")
            .located(By.xpath("//a[@onmouseover=\"Tip('Extracción a excel')\"]"));

    public static final Target ESPERA_DM = Target.the("Espera")
            .located(By.xpath("//p[text()='Espere...']"));

    public static final Target BTN_DESAFILIAR_DM = Target.the("Boton desafiliar")
            .located(By.xpath("//div[text()='Desaf']"));

    public static final Target BTN_APLICAR_DM = Target.the("Boton aplicar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[14]"));

    public static final Target TXT_APLICAR_DM = Target.the("Escribir aplicar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[14]/input"));

    public static final Target BTN_APLICAR_DOS_DM = Target.the("Boton aplicar dos")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[3]/td[14]"));

    public static final Target TXT_APLICAR_DOS_DM = Target.the("Escribir aplicar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[3]/td[14]/input"));

    public static final Target BTN_APLICAR_DESAFILIACION_DM = Target.the("Boton aplicar desafiliacion")
            .located(By.xpath("//a[@onmouseover=\"Tip('Aplicar desafiliación')\"]"));
}