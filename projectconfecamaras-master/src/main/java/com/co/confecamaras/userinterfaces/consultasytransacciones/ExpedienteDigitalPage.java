package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExpedienteDigitalPage {

    public static Target BTN_EXPEDIENTE_DIGITAL = Target.the("Boton pára ingresar al apartado de expediente digital")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[12]/a"));

    public static Target INPUT_IDENTIFICACION = Target.the("input para ingresar identificacion")
            .located(By.id("_identificacion"));

    public static Target INPUT_MATRICULA = Target.the("input para ingresar identificacion")
            .located(By.id("_matricula"));

    public static Target INPUT_NOMBRE= Target.the("input para ingresar nombre")
            .located(By.id("_nombre"));

    public static Target INPUT_PALABRA= Target.the("input para ingresar nombre")
            .located(By.id("_palabras"));

    public static Target BTN_CONTINUAR_EXPEDIENTE= Target.the("input para ingresar nombre")
            .located(By.xpath("//button[@class='btn btn-primary btn-md' and text()='Continuar']"));

    public static Target DIV_TABLA_EXPEDIENTE = Target.the("input para ingresar nombre")
            .located(By.id("tableexpedientes_wrapper"));

    public static Target BTN_NUEVA_BUSQUEDA= Target.the("input para ingresar nombre")
            .located(By.xpath("//button[@class='btn btn-primary btn-md' and text()='Nueva búsqueda']"));
}
