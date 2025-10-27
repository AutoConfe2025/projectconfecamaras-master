package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RelacionesRebovadosPage {

    public static Target RELACIONES_RENOVADOS_OPCION = Target.the("Boton pára ingresar a la consulta de relaciones renovados")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
}
