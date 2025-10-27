package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoClavesValorUI extends PageObject {

    public static final Target BTN_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES = Target.the("Boton cuenta publica cancelacion facturas")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[199]/td[5]"));

    public static final Target TXT_CUENTA_PUBLICA_CANCELACION_FACTURAS_MANTENIMIENTO_CLAVES = Target.the("Escribir cuenta publica cancelacion facturas")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[199]/td[5]/input"));

    public static final Target BTN_GRABAR_MANTENIMIENTO_CLAVES = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MANTENIMIENTO_CLAVES_VALOR = Target.the("Mensaje mantenimiento claves valor")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[199]/td[5]"));
}