package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExtraccionMatriculadosPage {

    public static final Target BUSQUEDA_EXTRACCION_MATRICULADOS = Target.the("Boton para singresar a extraccion matriculados")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_GENERAR_DATA = Target.the("Boton para GENERAR DATA")
            .located(By.xpath("//button[text()='Generar']"));

    public static final Target BTN_ACEPTAR_GENERAR = Target.the("Boton para confirmar la generacion de data")
            .located(By.xpath("//button[text()='Generar' and @data-bb-handler='confirm']"));

}
