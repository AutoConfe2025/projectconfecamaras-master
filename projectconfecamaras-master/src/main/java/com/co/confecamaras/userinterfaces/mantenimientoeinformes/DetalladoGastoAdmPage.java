package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalladoGastoAdmPage {

    public static Target SELECT_OPERADOR = Target.the("Select tipo oerador")
            .located(By.id("_operador")); //VALUE ZZZ

    public static Target SELECT_FORMATO = Target.the("Select tipo formato")
            .located(By.id("_tipoinforme"));


    public static Target BTN_GENERAR_ = Target.the("Boton generar informe")
            .located(By.xpath("//a[text()='Generar']"));

    public static Target BTN_DESCARGAR = Target.the("Boton descargar")
            .located(By.xpath("//a[text()='Descargar']"));

}
