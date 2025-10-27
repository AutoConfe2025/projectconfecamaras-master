package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresosReciboUI extends PageObject {

    public static final Target TXT_FECHA_INICIAL_IR = Target.the("Escribir fecha inicial")
            .located(By.id("_fecini"));

    public static final Target TXT_FECHA_FINAL_IR = Target.the("Escribir fecha final")
            .located(By.id("_fecfin"));

    public static final Target BTN_GENERAR_IR = Target.the("Boton generar")
            .located(By.xpath("//a[@onmouseover=\"Tip('Generar')\"]"));

    public static final Target BTN_RELACION_MOVIMIENTOS_RECIBO_IR = Target.the("Boton relacion de movimientos por recibo")
            .located(By.xpath("//a[text()='Relación de movimientos por recibo']"));

    public static final Target LBL_INGRESOS_RECIBO = Target.the("Mensaje final ingresos recibo")
            .located(By.xpath("//a[text()='Relación de movimientos por recibo']"));
}