package com.co.confecamaras.userinterfaces.Matricula;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MatriculaConEmbargoPage {

    public static final Target TEXTO_ESTADO_MATRICULA = Target.the("Texto para verificar el estado de la matricula en este caso embargado")
            .located(By.xpath("//a[@class='sizeTextC badge badge-info' and @data-original-title='Matrícula activa - Embargo']"));

    public static final Target INOUT_ACTIVOS = Target.the("Inout oara ingresar igresos ")
            .located(By.cssSelector("#cardBody_1 > div > div > table > tbody > tr > td:nth-child(3) > div > input"));
    public static final Target BTN_CONTINUAR_LIQUIDACION_MATRICULA = Target.the("Boton para continuar con el proceso")
            .located(By.cssSelector("button[type='submit']"));
    public static final Target TEXTO_DATOS_GENERALES = Target.the("Titulo de los datos de liquidación")
            .located(By.cssSelector("#accordion1 > div > div.card-header.text-uppercase > h6"));
}
