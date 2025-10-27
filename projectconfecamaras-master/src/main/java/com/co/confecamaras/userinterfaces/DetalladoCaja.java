package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalladoCaja extends PageObject {

    public static final Target SELECT_OPERACION_DETALLADO = Target.the("Seleccionar el operador")
            .located(By.id("_operador"));

    public static final Target TXT_FECHA_INICIAL_DETALLADO = Target.the("Escribir Fecha inicial")
            .located(By.id("_fecini"));

    public static final Target TXT_FECHA_FINAL_DETALLADO = Target.the("Escribir Fecha final")
            .located(By.id("_fecfin"));

    public static final Target SELECT_TIPOS_INFORME_DETALLADO = Target.the("Seleccionar el tipo de informe")
            .located(By.id("_tipo"));

    public static final Target SELECT_TIPOS_SALIDA_DETALLADO = Target.the("Seleccionar el tipo de salida")
            .located(By.id("_tiposalida"));

    public static final Target TXT_EMAIL_CONTROL_DETALLADO = Target.the("Escribir email control")
            .located(By.id("_emailusuariosistema"));

    public static final Target SELECT_AMBIENTE_DETALLADO = Target.the("Seleccionar el ambiente")
            .located(By.id("_ambiente"));
    public static final Target GENERAR_DETALLADO_BTN = Target.the("Boton Generar")
            .located(By.xpath("//button[text()='Generar']"));

    public static final Target GENERAR_DOS_DETALLADO_BTN = Target.the("Boton Generar Dos")
            .located(By.xpath("(//button[text()='Generar'])[2]"));

    public static final Target LBL_MENSAJE_DETALLADO_CAJA = Target.the("Mensaje Final Detallado de Caja")
            .located(By.xpath("//p[text()='Mensaje informativo']"));
    public static By DESCARGAR_BTN = By.xpath("//div[@id=\"frameSecundarioCentral\"]//a");
}
