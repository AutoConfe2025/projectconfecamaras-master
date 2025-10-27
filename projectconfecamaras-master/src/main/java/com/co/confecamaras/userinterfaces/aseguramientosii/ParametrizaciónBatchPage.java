package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ParametrizaciónBatchPage {

    public static final Target PROCESOS_BATCH = Target.the("BTN para ingresar al apartado de las ip habilitadas")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    //Cambiar pestaña

    public static final Target BTN_EDITAR_PROCESO_BATCH = Target.the("BTN para editar proceso batch")
            .located(By.cssSelector("#gridbox > div.objbox > table > tbody > tr:nth-child(2) > td:nth-child(11) > a > img"));

    public static final Target BTN_GRABAR_PROCESO = Target.the("BTN para grabar el proceso")
            .located(By.xpath("//input[@value='Grabar']"));

    public static final Target TABLA_PROCESOS_BATCH = Target.the("BTN para grabar el proceso")
            .located(By.id("gridbox"));
}
