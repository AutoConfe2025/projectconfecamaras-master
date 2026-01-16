package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformesSSPage {
    public static final Target INPUT_ANO_INICIAL = Target.the("Campo Año Inicial")
            .located(By.id("anoini"));
    public static final Target INPUT_ANO_FINAL = Target.the("Campo Año Final")
            .located(By.id("anofin"));
    public static final Target INPUT_ANO_SUPERVIVENCIA = Target.the("Campo Año Supervivencia")
            .located(By.id("anosup"));
    public static final Target SELECT_AMBIENTE = Target.the("Selector de Ambiente")
            .located(By.id("ambiente"));
    public static final Target INPUT_CIIU = Target.the("Campo de CIIU")
            .located(By.id("ciius"));


    public static Target BTN_GENERAR = Target.the("Boton pára generar datos")
            .located(By.xpath("//button[text()='Generar']"));
    public static final Target BOTON_EXTRAER = Target.the("Botón Extraer")
            .located(By.xpath("//button[contains(text(), 'Extraer')]"));
    public static final Target BOTON_EXPORTAR = Target.the("Botón Extraer")
            .located(By.xpath("//button[contains(text(), 'Exportar')]"));
    public static final Target BOTON_EJECUTAR = Target.the("Botón Ejecutar")
            .located(By.xpath("//button[contains(text(), 'Ejecutar')]"));

    public static Target BTN_ACEPTAR_GENERAR = Target.the("Boton pára aceptar generar")
            .located(By.xpath("(//button[text()='Generar'])"));



}
