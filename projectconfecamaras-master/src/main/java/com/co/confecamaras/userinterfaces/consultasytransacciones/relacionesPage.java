package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class relacionesPage {


    public static Target RELACIONES_MATRICULADOS_OPCION = Target.the("Boton pára ingresar a la consulta de relaciones matriculados")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target FECHA_INICIAL_MATRICULADOS = Target.the("Input para ingresar fecha inciial para consulatar relaciones de matriuclados")
            .located(By.id("fechaInicial"));

    public static Target FECHA_FINAL_MATRICULADOS = Target.the("Input para ingresar fecha final para consulatar relaciones de matriuclados")
            .located(By.id("fechaFinal"));

    public static Target BTN_CONTINUAR_CONSULTA_RELACIONES = Target.the("Boton para continuar con la consulta")
            .located(By.xpath("//button[@type='submit']"));

    public static Target BTN_IMPRIMIR = Target.the("Boton para continuar con la consulta")
            .located(By.xpath("//button[@class='btn btn-secondary buttons-print' and @aria-controls='resultados']"));

    public static Target TABLA_INFO = Target.the("Boton para continuar con la consulta")
            .located(By.id("collapseresultados"));
}
