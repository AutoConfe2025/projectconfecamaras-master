package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroVinculosUI extends PageObject {

    public static final Target BTN_EDITAR_DESCRIPCION_VINCULOS = Target.the("Boton editar descripcion")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]"));

    public static final Target TXT_EDITAR_DESCRIPCION_VINCULOS = Target.the("Escribir descripcion")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]/input"));

    public static final Target BTN_GRABAR_VINCULOS = Target.the("Boton grabar")
            .located(By.xpath("//a[@onmouseover=\"Tip('Grabar')\"]"));

    public static final Target LBL_MAESTRO_VINCULOS = Target.the("Mensaje maestro vinculos")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]"));
}