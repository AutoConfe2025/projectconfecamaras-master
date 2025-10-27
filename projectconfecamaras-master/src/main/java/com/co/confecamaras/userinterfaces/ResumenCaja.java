package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ResumenCaja extends PageObject {

    public static By FECHA_INICIAL_INPUT = By.id("_fecini");
    public static By FECHA_FINAL_INPUT = By.id("_fecfin");
    public static By GENERAR_RESUMEN_BTN = By.xpath("//*[@id=\"frameSecundarioCentral\"]/center/center/table/tbody/tr/td/a");
    public static By DESCARGAR_RESUMEN_BTN = By.xpath("//*[@id=\"frameSecundarioCentral\"]/center/table/tbody/tr/td/div/table/tbody/tr/td/div/h2/a");
    public static Target VALIDACION_RESUMEN = Target.the("")
            .located(By.xpath("//*[@id=\"frameSecundarioCentral\"]/center/table/tbody/tr/td/div/table/tbody/tr/td/div/h2/a"));

    public static By PDF_VAL = By.xpath("//pdf-viewer[@id=\"viewer\"]");
}
