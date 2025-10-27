package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroDevolucionesUI extends PageObject {

    public static final Target BTN_EDITAR_MOTIVOS_DEVOLUCIONES = Target.the("Boton editar motivos")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[3]/td[7]/a"));

    public static final Target SELECT_TIPO_MOTIVO_DEVOLUCIONES = Target.the("Seleccionar tipo motivo")
            .located(By.id("_idtipo"));

    public static final Target BTN_GRABAR_DEVOLUCIONES = Target.the("Boton grabar")
            .located(By.xpath("//input[@value='Grabar']"));

    public static final Target LBL_MAESTRO_DEVOLUCIONES = Target.the("Mensaje final maestro devoluciones")
            .located(By.id("_idtipo"));
}