package com.co.confecamaras.userinterfaces.Bandejas.recursos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page {

    public static final Target BOTON_RESPONDER = Target.the("boton responder recurso")
            .located(By.xpath("//a[@data-original-title='Responder Recurso']"));

    public static final Target BOTON_ACTUALIZAR = Target.the("boton responder recurso")
            .located(By.xpath("(//button[@class='btn btn-primary btn-md'])[1]"));

    public static final Target MENSAJE_INFORMATIVO = Target.the("boton responder recurso")
            .located(By.xpath("(//p[@class='text-dark text-center'])[2]"));


}
