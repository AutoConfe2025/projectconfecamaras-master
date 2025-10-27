package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class KillProcessPage {

    public static final Target BUSQUEDA_KILL_PROCESS = Target.the("Boton para singresar a Kill process")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target INPUT_BSUQUEDA = Target.the("Input para filtrar proceso")
            .located(By.xpath("//input[@aria-controls='tableprocess']")); //grep php

    public static final Target BTN_LIBERAR = Target.the("Boton para  DETENER PROCESO")
            .located(By.xpath("(//a[@data-original-title='liberar'])[2]"));

    public static final Target BTN_ACEPTAR_LIBERAR_PROCESO = Target.the("Boton para confirmar detencion de proceso")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target TABLAPROCESOS = Target.the("Tabla que muestra procesos en ejecucion")
            .located(By.xpath("//div[@class='dataTables_scroll']"));

}
