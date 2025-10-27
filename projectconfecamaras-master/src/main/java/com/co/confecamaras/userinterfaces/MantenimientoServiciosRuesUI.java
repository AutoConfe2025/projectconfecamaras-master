package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoServiciosRuesUI extends PageObject {

    public static final Target BTN_EDITAR_MANTENIMIENTO_SERVICIOS_RUES = Target.the("Boton editar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[8]/a/img"));

    public static final Target BTN_GRABAR_REGISTRO_MANTENIMIENTO_SERVICIOS_RUES = Target.the("Boton grabar registro")
            .located(By.xpath("//input[@onmouseover=\"Tip('Grabar registro')\"]"));

    public static final Target BTN_REGRESAR_MANTENIMIENTO_SERVICIOS_RUES = Target.the("Boton regresar")
            .located(By.xpath("//img[@onmouseover=\"Tip('Regresar')\"]"));

    public static final Target LBL_MANTENIMIENTO_SERVICIOS_RUES = Target.the("Mensaje mantenimiento servicios RUES")
            .located(By.xpath("//div[@id=\"barraOpcionesClara\"]/table/tbody/tr/td"));
}