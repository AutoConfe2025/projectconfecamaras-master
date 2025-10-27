package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExtraccionMatriculadosUI extends PageObject {

    public static final Target TXT_FECHA_MATRICULA_INICIAL_EXTRACCION_MATRICULADOS = Target.the("Escribir fecha matricula inicial")
            .located(By.id("_fecmatini"));

    public static final Target TXT_FECHA_MATRICULA_FINAL_EXTRACCION_MATRICULADOS = Target.the("Escribir fecha matricula final")
            .located(By.id("_fecmatfin"));

    public static final Target TXT_ULTIMO_ANO_RENOVADO_INICIAL_EXTRACCION_MATRICULADOS = Target.the("Escribir ultimo ano renovado inicial")
            .located(By.id("_anoren"));

    public static final Target TXT_ULTIMO_ANO_RENOVADO_FINAL_EXTRACCION_MATRICULADOS = Target.the("Escribir ultimo ano renovado final")
            .located(By.id("_anorenult"));

    public static final Target BTN_GENERAR_EXTRACCION_MATRICULADOS = Target.the("Boton generar")
            .located(By.xpath("//button[text()='Generar']"));

    public static final Target BTN_GENERAR_DOS_EXTRACCION_MATRICULADOS = Target.the("Boton generar dos")
            .located(By.xpath("//*[@id=\"page-top\"]/div[8]/div/div/div[2]/button[2]"));

    public static final Target LBL_MENSAJE_EXTRACCION_MATRICULADOS = Target.the("Mesaje extraccion matriculados")
            .located(By.xpath("//p[text()='Mensaje informativo']"));
}