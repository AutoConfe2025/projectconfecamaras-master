package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoMunicipiosDepartamentosUI extends PageObject {

    public static final Target BTN_UBICAR_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton ubicar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[7]/a"));

    public static final Target BTN_CERRAR_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton cerrar")
            .located(By.xpath("//div[@title='Close']"));

    public static final Target BTN_IR_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton I.R")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[9]/a"));

    public static final Target SELECT_EXENTO_MUNICIPIOS_DEPARTAMENTOS = Target.the("Seleccionar exento")
            .located(By.id("aplica"));

    public static final Target BTN_GRABAR_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton grabar")
            .located(By.xpath("//input[@onmouseover=\"Tip('Grabar')\"]"));

    public static final Target BTN_GRABAR_DOS_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton grabar dos")
            .located(By.xpath("//a[@onmouseover=\"Tip('Actualizar tabla de municipios')\"]"));

    public static final Target BTN_EXPORTAR_CSV_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton exportar csv")
            .located(By.xpath("//img[@onmouseover=\"Tip('Exportar CSV')\"]"));

    public static final Target BTN_EXPORTAR_XML_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton exportar xml")
            .located(By.xpath("//img[@onmouseover=\"Tip('Exportar XML')\"]"));

    public static final Target BTN_GENERAR_PDF_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton generar pdf")
            .located(By.xpath("//img[@onmouseover=\"Tip('Generar Pdf')\"]"));

    public static final Target LBL_MENSAJE_MUNICIPIOS_DEPARTAMENTOS = Target.the("Mensaje mantenimiento municipios departamentos")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Municipios (Relación) - ')]"));
}