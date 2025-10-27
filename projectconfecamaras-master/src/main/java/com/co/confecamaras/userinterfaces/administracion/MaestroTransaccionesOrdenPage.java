package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaestroTransaccionesOrdenPage {

    public static final Target MAESTRO_TRANSACCIONES_ORDEN = Target.the("Bton para seleccionar el aparatado Maestro Transacciones - orden\n")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_EDITAR = Target.the("Bton para Editar")
            .located(By.xpath("(//a[@data-original-title='Editar'])[1]"));

    public static final Target INPUT_TITULO = Target.the("Input para  agregar  un titulo")
            .located(By.id("titulo"));

    public static final Target BTN_GUARDAR = Target.the("Bton para guardar info")
            .located(By.xpath("//button[text()='Grabar']"));

    public static final Target TEXTO_NOMBRE = Target.the("Bton para guardar info")
            .located(By.xpath("(//p[@style='text-align:left'])[2]"));

}
