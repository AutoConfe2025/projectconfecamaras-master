package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraServiciosEmpresarialesUI extends PageObject {

    public static final Target BTN_SEMINARIOS_CAPACITACIONES_COMPRA = Target.the("Boton seminarios y capacitaciones")
            .located(By.id("heading01"));

    public static final Target BTN_ANADIR_COMPRA = Target.the("Boton añadir")
            .located(By.xpath("(//*[contains(text(), 'Añadir')])[1]"));

    public static final Target BTN_PAGAR_COMPRA = Target.the("Boton pagar")
            .located(By.xpath("//button[contains(text(), 'Pagar')]"));

    public static final Target BTN_RECIBIR_PAGO_COMPRA = Target.the("Boton recibir pago")
            .located(By.id("btnLiquidarSE"));

    public static final Target SELECT_TIPO_IDENTIFICACION_COMPRA = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("_idtipoidentificacioncliente"));

    public static final Target TXT_IDENTIFICACION_COMPRA = Target.the("Escribir identificacion")
            .located(By.id("_identificacioncliente"));

    public static final Target LBL_TABLA_SOLICITUDES = Target.the("Tabla solicitudes registro")
            .located(By.xpath("(//div[@class=\"table-responsive\"])[1]"));
}
