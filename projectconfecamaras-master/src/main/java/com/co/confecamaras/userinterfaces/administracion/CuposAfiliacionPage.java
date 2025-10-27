package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuposAfiliacionPage {

    public static final Target CUPOS_AFILIACION = Target.the("Bton para seleccionar el aparatado cupos afiliados")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_CONSULTAR_CUPO = Target.the("Boton para consultar cupo")
            .located(By.xpath("//input[@type='submit' and @value='Continuar']"));

    public static final Target INPUT_MINIMO = Target.the("Input para ingresar cupo minimo")
            .located(By.xpath("(//td[@align='center'])[12]"));
    public static final Target INPUT = Target.the("Input para ingresar valor")
            .located(By.xpath("//input[@class='dhx_combo_edit']"));

    public static final Target INPUT_MAXIMO = Target.the("Input para ingresar cupo Maximo")
            .located(By.xpath("(//td[@align='center'])[13]"));

    public static final Target INPUT_CUPO = Target.the("Input para ingresar cupo")
            .located(By.xpath("(//td[@align='center'])[14]"));

    public static final Target BTN_GRABAR_CUPO = Target.the("Boton para guardar cupo")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target DATOS_GUARDADOS_COLUMNA = Target.the("Tabla que muestra los datos guardados")
            .located(By.xpath("(//tr[@class=' ev_dhx_web'])[2]"));
}
