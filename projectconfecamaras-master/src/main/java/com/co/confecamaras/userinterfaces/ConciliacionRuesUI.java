package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConciliacionRuesUI extends PageObject {

    public static final Target TXT_FECHA_CONCILIACION = Target.the("Escribir fecha")
            .located(By.id("_fecha"));

    public static final Target BTN_CONSULTAR_CONCILIACION = Target.the("Boton concultar")
            .located(By.xpath("//a[@onmouseover=\"Tip('Consultar RUES')\"]"));

    public static final Target BTN_EXCEL_RECEPTORA_CONCILIACION = Target.the("Boton excel receptora")
            .located(By.xpath("//a[text()='Excel Receptora']"));

    public static final Target BTN_EXCEL_RESPONSABLE_CONCILIACION = Target.the("Boton excel responsable")
            .located(By.xpath("//a[text()='Excel Responsable']"));

    public static final Target LBL_MENSAJE_FINAL_CONCILIACION_RUES = Target.the("Mensaje final conciliacion rues")
            .located(By.xpath("//strong[contains(text(), 'Total RUES: 140,200, Total Sistema Registro : 140,200, Diferencia : 0')]"));
}
