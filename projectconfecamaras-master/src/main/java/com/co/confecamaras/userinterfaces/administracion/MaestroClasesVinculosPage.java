package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaestroClasesVinculosPage {

    public static final Target MAESTRO_CLASES_VINCULOS = Target.the("Bton para seleccionar el aparatado Maestro Vinculos")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target TXT_DESCRIPCION = Target.the("Input para agregar una descripcion")
            .located(By.xpath("(//td[@align='left'])[1]"));

    public static final Target INPUT_DESCRIPCION = Target.the("Input para agregar una descripcion")
            .located(By.xpath("//input[@class='dhx_combo_edit']"));




    public static final Target BTN_GUARDAR_MAESTRO = Target.the("Bton para guardar info")
            .located(By.xpath("//a[text()='Grabar']"));

}
