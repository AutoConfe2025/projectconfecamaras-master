package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoSedesBiometriaUI extends PageObject {

    public static final Target BTN_ID_COD_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Boton IdCod")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[1]"));

    public static final Target TXT_ID_COD_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Escribir IdCod")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[1]/input"));

    public static final Target BTN_DESCRIPCION_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Boton descripcion")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[2]"));

    public static final Target TXT_DESCRIPCION_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Escribir descripcion")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[2]/input"));

    public static final Target BTN_GRABAR_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MANTENIMIENTO_SEDES_BIOMETRIA = Target.the("Mensaje mantenimiento sedes biometria")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Sedes Biometria- ')]"));
}