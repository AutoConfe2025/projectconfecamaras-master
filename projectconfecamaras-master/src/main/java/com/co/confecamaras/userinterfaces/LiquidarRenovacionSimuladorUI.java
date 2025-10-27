package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LiquidarRenovacionSimuladorUI extends PageObject {

    public static final Target TXT_MATRICULA_SIMULADOR = Target.the("Escribir la matricula")
            .located(By.id("matricula"));

    public static final Target BTN_CONTINUAR_SIMULADOR = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target BTN_SIMULAR_RENOVACION_SIMULADOR = Target.the("Boton simular renovacion")
            .located(By.xpath("(//i[@data-original-title=\"Simular Renovación\"])[1]"));

    public static final Target TXT_NUEVOS_ACTIVOS_SIMULADOR = Target.the("Escribir los nuevos activos")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]"));

    public static final Target TXT_NUEVOS_ACTIVOS_DOS_SIMULADOR = Target.the("Escribir los nuevos activos dos")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]"));

    public static final Target BTN_LIQUIDAR_SIMULADOR = Target.the("Boton liquidar")
            .located(By.xpath("//button[normalize-space()='Continuar']"));

    public static final Target TXT_NUMERO_EMPLEADOS_NIVEL_NACIONAL_SIMULADOR = Target.the("Escribir el numero de empleados a nivel nacional")
            .located(By.id("numeroempleados"));

    public static final Target LBL_MENSAJE_LIQUIDAR_RENOVACION_SIMULADOR = Target.the("Mensaje liquidacion renovacion simulador")
            .located(By.xpath("//small[@id=\"estado\"]"));
}
