package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReversionParcialUI extends PageObject {

    public static final Target TXT_NUMERO_RECIBO_RP = Target.the("Escribir el numero del recibo")
            .located(By.id("_recibo"));

    public static final Target BTN_CONTINUAR_RP = Target.the("Boton continuar")
            .located(By.id("submit"));

    public static final Target TXT_VALOR_DEVOLVER_RP = Target.the("Escribir el valor a devolver")
            .located(By.xpath("(//input[@class=\"form-control\"])[31]"));

    public static final Target TXT_JUSTIFICACION_RP = Target.the("Escribir justificacion")
            .located(By.id("justificacion"));

    public static final Target BTN_GENERAR_NOTA_REVERSION_RP = Target.the("Boton generar nota de reversion")
            .located(By.xpath("//button[text()=\"Generar nota de reversión\"]"));

    public static final Target BTN_REVERSAR_PARCIALMENTE_RP = Target.the("Boton reversar parcialmente")
            .located(By.xpath("//button[text()=\"Reversar parcialmente\"]"));

    public static final Target LBL_REVERSION_RP = Target.the("Mensaje de reversion")
            .located(By.xpath("//p[contains(text(), 'Se generó la Nota de reversión parcial')]"));

    public static final Target TXT_RECIBO_RP = Target.the("Escribir recibo")
            .located(By.id("_recibonota"));

    public static final Target BTN_CONTINUAR_DOS_RP = Target.the("Boton continuar dos")
            .located(By.xpath("(//button[text()='Continuar'])[2]"));

    public static final Target BTN_ABANDONAR_RP = Target.the("Boton abandonar")
            .located(By.xpath("//button[text()='Abandonar']"));

    public static final Target BTN_ASIGNAR_NUEVO_NUMERO_RP = Target.the("Boton asignar nuevo numero")
            .located(By.xpath("//button[text()='Asignar Nuevo No.']"));

    public static final Target BTN_NUEVA_NOTA_RP = Target.the("Boton nueva nota")
            .located(By.xpath("//button[text()='Nueva nota']"));

    public static final Target SELECT_TIPO_IDENTIFICACION_RP = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("tipoidentificacion"));

    public static final Target TXT_IDENTIFICACION_RP = Target.the("Escribir identificacion")
            .located(By.id("identificacion"));
    public static final Target TXT_PAIS_RP = Target.the("Escribir identificacion")
            .located(By.id("pais"));

    public static final Target TXT_SERVICIO_RP = Target.the("Escribir servicio")
            .located(By.id("ser_1"));

    public static final Target TXT_CANTIDAD_RP = Target.the("Escribir cantidad")
            .located(By.id("can_1"));

    public static final Target TXT_VALOR_RP = Target.the("Escribir valor")
            .located(By.id("val_1"));

    public static final Target TXT_JUSTIFICACION_DOS_RP = Target.the("Escribir justificacion dos")
            .located(By.id("justificacion"));

    public static final Target BTN_ACTIVAR_NOTA_REVERSION_RP = Target.the("Boton activar nota de reversion")
            .located(By.xpath("//button[text()='Activar nota de reversión']"));

    public static final Target BTN_ACTIVAR_RP = Target.the("Boton activar")
            .located(By.xpath("//button[text()='Activar']"));

    public static final Target LBL_MENSAJE_FINAL_REVERSION_PARCIAL_RP = Target.the("Mensaje final reversion parcial")
            .located(By.xpath("//p[text()='Nota de reversión sin recibo - APLICADA']"));
}