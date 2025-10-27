package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvaluarVariablesSessionPage {

    public static final Target EVALUAR_VARIABLES = Target.the("BTN para ingresar al apartado de las ip habilitadas")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
    public static final Target VARIABLES_SESION = Target.the("Pagina que muestra las variables")
            .located(By.xpath("//body[text()='generales']"));
}
