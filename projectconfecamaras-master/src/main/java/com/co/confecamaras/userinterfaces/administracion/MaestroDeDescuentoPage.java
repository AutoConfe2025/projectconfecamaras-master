package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaestroDeDescuentoPage {

    public static final Target MAESTRO_DESCUENTOS = Target.the("Boton para seleccionar la opcion Maestro decuentos")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target ID_CODIGO = Target.the("Input para ingresar valor id")
            .located(By.id("_id"));

    public static final Target NOMBRE_USUARIO = Target.the("Input para ingresar Nombre")
            .located(By.id("_nombre"));

    public static final Target TIPO = Target.the("Input para ingresar tipo")
            .located(By.id("_tipo"));

    public static final Target CONDICIONADO = Target.the("Input para ingresar si es condicionado")
            .located(By.id("_condicionado"));

    public static final Target BTN_GRABAR = Target.the("Boton para guardar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target TABLA_DATOS = Target.the("Tabla que muestra datos")
            .located(By.xpath("//table[@class='obj row20px']"));
}
