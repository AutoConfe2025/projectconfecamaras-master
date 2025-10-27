package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaestroCiiusPage {
    public static final Target MAESTRO_CIIUS = Target.the("Bton para seleccionar el aparatado Maestro CIIUS")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_EDITAR = Target.the("Bton para editar")
            .located(By.xpath("(//a[@data-original-title='Editar'])[1]"));


    public static final Target SELECT_RESTRICCION_PONAL = Target.the("Menu desplegable para seleccionar si tiene o no restriccion ponal")
            .located(By.id("_restriccionponal")); // S o N

    public static final Target SELECT_ACTIVIDAD_COMERCIAL = Target.the("Menu desplegable para seleccionar si tiene o no actividad comercial")
            .located(By.id("_actividadcomercial")); // SI O NO

    public static final Target BTN_GUARDAR = Target.the("Bton guardar info")
            .located(By.xpath("//button[text()='Grabar']"));

    public static final Target TEXTO_ACTIVIDAD_COMERCIAL = Target.the("Texto actividad comercial")
            .located(By.xpath("(//p[@style='text-align:center'])[2]"));
}
