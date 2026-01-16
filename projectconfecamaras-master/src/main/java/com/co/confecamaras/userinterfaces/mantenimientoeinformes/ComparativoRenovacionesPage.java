package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComparativoRenovacionesPage {
    public static Target INPUT_ANO_RENOVACION = Target.the("Input para ingresar Ano de renovacion")
            .located(By.id("_anoren"));

    public static final Target INPUT_EMAIL_CONTROL = Target.the("Escribir email")
            .located(By.id("_emailusuariosistema"));
    public static Target INPUT_FECHA_FINAL_DETALLADO = Target.the("Input para ingresar fecha final")
            .located(By.id("_fechafin"));

    public static Target BTN_GENERAR = Target.the("Boton pára generar datos")
            .located(By.xpath("//button[text()='Generar']"));


    public static Target BTN_ACEPTAR_GENERAR = Target.the("Boton pára aceptar generar")
            .located(By.xpath("(//button[text()='Generar'])[2]"));

    public static Target MENSAJE_GENERAACION_DETALLADO = Target.the("Mensaje informativo de data generada")
            .located(By.xpath("(//p[@class='text-dark text-center'])[2]"));

    public static final Target SELECT_AMBIENTE = Target.the("Selector de Ambiente")
            .located(By.id("_ambiente"));
}
