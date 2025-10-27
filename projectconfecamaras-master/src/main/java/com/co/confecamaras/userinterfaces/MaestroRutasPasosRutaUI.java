package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroRutasPasosRutaUI extends PageObject {

    public static final Target BTN_FIN_EST_PASOS_RUTA = Target.the("Boton Fin.Est")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]"));

    public static final Target TXT_FIN_EST_PASOS_RUTA = Target.the("Escribir Fin.Est")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]/input"));

    public static final Target BTN_GRABAR_PASOS_RUTA = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MAESTRO_RUTAS_PASOS_RUTA = Target.the("Mensaje final maestro ruta pasos ruta")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]"));
}