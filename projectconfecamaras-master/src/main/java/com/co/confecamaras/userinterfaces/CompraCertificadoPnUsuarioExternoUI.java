package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraCertificadoPnUsuarioExternoUI extends PageObject {

    public static final Target BTN_CERTIFICADOS_CCPNUS = Target.the("Boton certificados")
            .located(By.xpath("//h4[text()='Certificados']"));

    public static final Target TXT_MATRICULA_CCPNUS = Target.the("Escribir matricula")
            .located(By.id("matricula"));

    public static final Target BTN_CONTINUAR_CCPNUS = Target.the("Boton continuar")
            .located(By.id("consultaCertificadosB"));

    public static final Target BTN_CERTIFICADOS_AUTOMATICOS_CCPNUS = Target.the("Boton certificados automaticos")
            .located(By.xpath("(//a[@data-original-title=\"Certificados automáticos (Inmediatos)\"])[1]"));

    public static final Target TXT_CERTIFICADOS_MATRICULA_CCPNUS = Target.the("Escribir certificados de matricula")
            .located(By.id("certimat"));

    public static final Target BTN_CONTINUAR_DOS_CCPNUS = Target.the("Boton continuar dos")
            .located(By.id("generarLiquidacion"));

    public static final Target BTN_CONTINUAR_TRES_CCPNUS = Target.the("Boton continuar tres")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target TXT_IDENTIFICACION_CLIENTE_CCPNUS = Target.the("Escribir identificacion del cliente")
            .located(By.id("_identificacioncliente"));

    public static final Target TXT_CONFIRMACION_CORREO_CCPNUS = Target.the("Escribir confirmacion correo")
            .located(By.id("_email"));

    public static final Target BTN_PAGAR_SISTEMA_TUCOMPRA_CCPNUS = Target.the("Boton pagar con sistem TuCompra")
            .located(By.xpath("(//button[normalize-space()='Pagar con PSE o Tarjeta de Crédito'])[1]"));
}