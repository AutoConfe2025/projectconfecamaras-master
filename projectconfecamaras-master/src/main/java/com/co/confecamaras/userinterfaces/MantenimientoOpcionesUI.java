package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoOpcionesUI extends PageObject {

    public static final Target BTN_EDITAR_MANTENIMIENTO_OPCIONES = Target.the("Boton editar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[11]/a/img"));

    public static final Target BTN_GRABAR_REGISTRO_MANTENIMIENTO_OPCIONES = Target.the("Boton grabar registro")
            .located(By.xpath("//input[@type=\"image\" and @onmouseover=\"Tip('Grabar registro')\"]"));

    public static final Target LBL_REGISTRO_ACTUALIZADO_MANTENIMIENTO_OPCIONES = Target.the("Mensaje registro actualizado")
            .located(By.id("errtxt"));

    public static final Target BTN_REGRESAR_MANTENIMIENTO_OPCIONES = Target.the("Boton regresar")
            .located(By.xpath("//img[@onmouseover=\"Tip('Regresar')\"]"));

    public static final Target BTN_INACTIVAR_MANTENIMIENTO_OPCIONES = Target.the("Boton inactivar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[13]/a/img"));

    public static final Target BTN_ACTIVAR_MANTENIMIENTO_OPCIONES = Target.the("Boton activar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[13]/a/img"));

    public static final Target BTN_OCULTAR_MOVILES_OPCIONES = Target.the("Boton ocultar moviles")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[14]/a/img"));

    public static final Target BTN_MOSTRAR_MOVILES_OPCIONES = Target.the("Boton mostrar moviles")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[14]/a/img"));

    public static final Target BTN_OCULTAR_BOOTSTRAP_OPCIONES = Target.the("Boton ocultar bootstrap")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[15]/a/img"));

    public static final Target BTN_MOSTRAR_BOOTSTRAP_OPCIONES = Target.the("Boton mostrar bootstrap")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[15]/a/img"));

    public static final Target BTN_OCULTAR_SII2_OPCIONES = Target.the("Boton ocultar Sii2")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[16]/a/img"));

    public static final Target BTN_MOSTRAR_SII2_OPCIONES = Target.the("Boton mostrar Sii2")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[16]/a/img"));

    public static final Target LBL_MANTENIMIENTO_OPCIONES = Target.the("Mensaje mantenimiento opciones")
            .located(By.xpath("//*[@id=\"barraOpcionesClara\"]/table/tbody/tr/td"));
}