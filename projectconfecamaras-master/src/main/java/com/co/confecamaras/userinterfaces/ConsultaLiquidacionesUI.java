package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConsultaLiquidacionesUI extends PageObject {

    public static final Target TXT_IDENTIFICACION_CL = Target.the("Escribir identificacion")
            //.located(By.id("identificacion"));
            .located(By.id("identificacion"));

    public static final Target BTN_CONTINUAR_CL = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target BTN_REGRESAR_CL = Target.the("Boton regresar")
            .located(By.xpath("//button[@data-original-title=\"Regresar\"]"));

    public static final Target BTN_LIMPIAR_CL = Target.the("Boton limpiar")
            .located(By.xpath("//*[text()='Limpiar']"));

    public static final Target TXT_NOMBRE_CL = Target.the("Escribir nombre")
            .located(By.id("nombre"));

    public static final Target TXT_EXPEDIENTE_CL = Target.the("Escribir expediente")
            .located(By.id("expediente"));

    public static final Target TXT_RECIBO_CL = Target.the("Escribir recibo")
            .located(By.id("recibo"));

    public static final Target TXT_FECHA_INICIAL_CL = Target.the("Escribir fecha inicial")
            .located(By.id("fechaInicial"));

    public static final Target TXT_FECHA_FINAL_CL = Target.the("Escribir fecha final")
            .located(By.id("fechaFinal"));

    public static final Target TXT_LIQUIDACION_CL = Target.the("Escribir liquidacion")
            .located(By.id("liquidacion"));

    public static final Target BTN_VER_SOPORTE_DE_PAGO_CL = Target.the("Boton ver soporte de pago")
            .located(By.cssSelector(".btn.btn-outline-success.btn-sm"));

    public static final Target BTN_SOPORTES_CL = Target.the("Boton soporte en la ventana de detalles de pago")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_SOPORTE_RADICACION_CL = Target.the("Boton ver soporte de radicacion")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[21]"));

    public static final Target LBL_VER_DOCUMENTO_CL = Target.the("Mensaje ver documento")
            .located(By.id("ModalTitulo"));

    public static final Target BTN_CERRAR_CL = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()=\"Cerrar\"]"));

    public static final Target BTN_VER_SOPORTE_CL = Target.the("Boton ver soporte")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[1]"));

    public static final Target BTN_VER_CL = Target.the("Boton ver")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[21]"));
}