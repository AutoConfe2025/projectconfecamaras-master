package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroRutasDigitacionUI extends PageObject {

    public static final Target BTN_EDITAR_PASOS_DIGITACION = Target.the("Boton editar pasos")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]/a"));

    public static final Target SELECT_PASO_UNO_DIGITACION = Target.the("Seleccionar paso 1")
            .located(By.id("_p01"));

    public static final Target BTN_GRABAR_DIGITACION = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target LBL_MAESTRO_RUTAS_DIGITACION = Target.the("Mensaje final maestro rutas digitacion")
            .located(By.id("_p01"));
}