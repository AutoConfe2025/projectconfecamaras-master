package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SegmentosIpPage {

    public static final Target SEGMENTOS_IP = Target.the("BTN para ingresar al apartado de las ip habilitadas")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));
    //Cambiar de pestaña

    public static final Target GRABAR_SEGMENTO = Target.the("BTN para grabar ip")
            .located(By.xpath("//a[text()='Grabar']"));

}
