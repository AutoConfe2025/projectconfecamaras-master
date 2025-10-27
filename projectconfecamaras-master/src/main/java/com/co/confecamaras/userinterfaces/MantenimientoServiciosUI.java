package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoServiciosUI extends PageObject {

    public static final Target BTN_EDITAR_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar")
            //.located(By.xpath("//*[@id=\"tableservices\"]/tbody/tr[3]/td[12]/p/small/a[1]"));
    .located(By.xpath("//a[@href=\"javascript:editar('MDEwMDAwMDA=');\"]//*[name()='svg']"));

    public static final Target BTN_GRABAR_MANTENIMIENTO_SERVICIOS = Target.the("Boton grabar")
            .located(By.id("submit"));

    public static final Target TXT_NOMBRE_CORTO = Target.the("Boton grabar")
            .located(By.id("_descripcioncorta"));

    public static final Target BTN_NIIF_MANTENIMIENTO_SERVICIOS = Target.the("Boton NIIF")
            //.located(By.xpath("//*[@id=\"tableservices\"]/tbody/tr[4]/td[12]/p/small/a[3]"));
    .located(By.xpath("(//*[name()='svg'][@role='img'])[11]"));

    public static final Target ESPERA_MODAL_MANTENIMIENTO_SERVICIOS = Target.the("Espera modal")
            .located(By.xpath("//div[@id=\"modalpdf_body\" and @class=\"modal-body\"]"));

    public static final Target BTN_GRABAR_DOS_MANTENIMIENTO_SERVICIOS = Target.the("Boton grabar dos")
            .located(By.xpath("//*[@id=\"modalpdf_body\"]/div/div/div[6]/div/a/button"));

    public static final Target BTN_GRABAR_TRES_MANTENIMIENTO_SERVICIOS = Target.the("Boton grabar tres")
            .located(By.xpath("//*[@id=\"modalpdf_body\"]/div/div/div[7]/div/a/button"));

    public static final Target BTN_EDITAR_CONTADO_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Contado")
            .located(By.xpath("//div[@id=\"ZZZ_fpcontado\"]/p/small/a"));

    public static final Target BTN_EDITAR_CREDITO_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Credito")
            .located(By.xpath("//div[@id=\"ZZZ_fpcredito\"]/p/small/a"));

    public static final Target BTN_EDITAR_CHEQUE_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Cheque")
            .located(By.xpath("//div[@id=\"ZZZ_fpcheque\"]/p/small/a"));

    public static final Target BTN_EDITAR_TDEBITO_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar TDedito")
            .located(By.xpath("//div[@id=\"ZZZ_fptdebito\"]/p/small/a"));

    public static final Target BTN_EDITAR_TCREDITO_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar TCredito")
            .located(By.xpath("//div[@id=\"ZZZ_fptcredito\"]/p/small/a"));

    public static final Target BTN_EDITAR_DEVOL_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Devolucion")
            .located(By.xpath("//div[@id=\"ZZZ_fpdevolucion\"]/p/small/a"));

    public static final Target BTN_EDITAR_RUES_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Rues")
            .located(By.xpath("//div[@id=\"ZZZ_fprues\"]/p/small/a"));

    public static final Target BTN_EDITAR_PRES_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Pres")
            .located(By.xpath("//div[@id=\"ZZZ_fppres\"]/p/small/a"));

    public static final Target BTN_EDITAR_OTROS_MANTENIMIENTO_SERVICIOS = Target.the("Boton editar Otros")
            .located(By.xpath("//div[@id=\"ZZZ_fpotros\"]/p/small/a"));

    public static final Target BTN_DUPLICAR_PARAMETRIZACION_MANTENIMIENTO_SERVICIOS = Target.the("Boton duplicar parametrizacion")
            .located(By.xpath("//button[text()='Duplicar parametrización']"));

    public static final Target SELECT_DUPLICAR_DESDE_MANTENIMIENTO_SERVICIOS = Target.the("Seleccionar duplicar desde")
            .located(By.id("xservicioorigen"));

    public static final Target BTN_DUPLICAR_MANTENIMIENTO_SERVICIOS = Target.the("Boton duplicar")
            .located(By.xpath("//*[@id=\"modalpdf_body\"]/div/div/div[3]/div/a/button"));

    public static final Target BTN_REGRESAR_MANTENIMIENTO_SERVICIOS = Target.the("Boton regresar")
            .located(By.xpath("//button[text()='Regresar']"));

    public static final Target LBL_MANTENIMIENTO_SERVICIOS = Target.the("Mensaje mantenimiento opciones")
            .located(By.id("_grupo"));
}