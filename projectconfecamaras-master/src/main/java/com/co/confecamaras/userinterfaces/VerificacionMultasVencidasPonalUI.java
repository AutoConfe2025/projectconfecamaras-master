package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VerificacionMultasVencidasPonalUI extends PageObject {

    public static final Target SELECT_TIPO_IDENTIFICACION_VERIFICACION_MULTAS = Target.the("Boton seleccionar tipo identificacion")
            .located(By.id("idclase"));

    public static final Target TXT_IDENTIFICACION_VERIFICACION_MULTAS = Target.the("Escribir identificacion")
            .located(By.id("identificacion"));

    public static final Target BTN_CONTINUAR_VERIFICACION_MULTAS = Target.the("Boton continuar")
            .located(By.xpath("//*[@id=\"formVerificacionMultasVencidasPonal\"]/div[2]/button"));

    public static final Target LBL_VERIFICACION_MULTAS_VENCIDAS_PONAL = Target.the("Mesaje verificacion multas vencidas ponal")
            .located(By.xpath("//*[text()='No existen multas vencidas en el RNMC para la identificación ']"));

    public static final Target LBL_VERIFICACION_MULTAS_DOS_VENCIDAS_PONAL = Target.the("Mesaje verificacion multas vencidas ponal dos")
            .located(By.xpath("//div[text()='No fue posible consultar multas en el RNMC (ER)']"));
}