package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransaccionesRuesUI extends PageObject {

    public static final Target BTN_CONSULTAR_EXPEDIENTES_RUES = Target.the("Boton consultar expedientes")
            .located(By.xpath("//a[text()='Consultar Expedientes']"));

    public static final Target SELECT_TIPO_CONSULTA_RUES = Target.the("Seleccionar el tipo de consulta rues")
            .located(By.xpath("//li[@role=\"tab\"]//a"));

    public static final Target SELECT_CC_RESPONSABLE_RUES = Target.the("Seleccionar el cc responsable")
            .located(By.id("_camaraResponsable"));

    public static final Target TXT_MATRICULA_RUES = Target.the("Escribir numero de matricula")
            .located(By.id("_matricula"));

    public static final Target BTN_CONSULTAR_MATRICULA_RUES = Target.the("Boton consultar matricula")
            .located(By.xpath("//a[text()='Consultar Matrícula']"));

    public static final Target BTN_RADICAR_ACTOS_DOCUMENTOS_RUES = Target.the("Boton radicar actos y documentos")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[17]"));

    public static final Target SELECT_BENEFICIO_RUES = Target.the("Seleccionar beneficio")
            .located(By.id("_indicadorBeneficio"));

    public static final Target SELECT_IR_RUES = Target.the("Seleccionar ir")
            .located(By.id("_indicadorir"));

    public static final Target SELECT_GRUPO_ACTOS_RUES = Target.the("Seleccionar grupo actos")
            .located(By.id("_grupoacto"));

    public static final Target SELECT_SERVICIO_RUES = Target.the("Seleccionar servicio rues")
            .located(By.id("_servicio"));

    public static final Target BTN_RADICAR_RUES = Target.the("Boton radicar")
            .located(By.xpath("//a[text()='Radicar']"));

    public static final Target BTN_LIQUIDAR_TRANSACCION_RUES = Target.the("Boton liquidar transaccion")
            .located(By.xpath("//a[text()='Liquidar Transacción']"));

    public static final Target BTN_PAGAR_RUES = Target.the("Boton pagar")
            .located(By.xpath("//a[text()='Pagar']"));

    public static final Target SELECT_TIPO_IDENTIFICACION_RUES = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("_idtipoidentificacioncliente"));

    public static final Target TXT_IDENTIFICACION_RUES = Target.the("Escribir identificacion")
            .located(By.id("_identificacioncliente"));
}