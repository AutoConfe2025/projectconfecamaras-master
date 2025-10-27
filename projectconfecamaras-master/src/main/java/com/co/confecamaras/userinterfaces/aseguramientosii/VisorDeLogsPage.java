package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VisorDeLogsPage {

    public static final Target VISOR_DE_LOGS = Target.the("BTN para ingresar al apartado de las ip habilitadas")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
    //Cambiar de pestaña

    public static final Target SELECT_TIPO_LOG = Target.the("BTN seleccionar el tipo de log")
            .located(By.id("_log")); //Value 0

    public static final Target BTN_VER_LOGS = Target.the("BTN para ver logs")
            .located(By.xpath("//button[@type='button' and text()='Ver']"));

    public static final Target TABLA_LOG_SELECCIONADO = Target.the("Tabla que muestra los logs")
            .located(By.xpath("(//div[@class='card fat' and  @style='visibility:visible'])[3]"));
}
