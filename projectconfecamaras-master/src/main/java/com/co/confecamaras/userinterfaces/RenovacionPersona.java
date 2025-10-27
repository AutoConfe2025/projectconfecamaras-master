package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RenovacionPersona extends PageObject {

    public static final Target ESPERA_INPUT = Target.the("").located(By.xpath("(//table)[1]//input"));

    public static By CONSULTA_SLC = By.id("selectS");
    public static By INFO_INPUT = By.id("criterio");
    public static By CONTINUAR_BTN = By.xpath("//div[@class='card-footer text-center']//button[1]");
    public static By ACCIONES_BTN = By.xpath("//*[@id=\"tablaConsultaExpedientes\"]/tbody/tr[1]/td[1]/a/i");
    public static By OPERACIONES_MERCANTIL_BTN = By.xpath("//*[@id=\"modalAuxiliar\"]/div/div/div[2]/div[1]/div[3]/div/div[1]");
    public static final Target RENOVAR_MATRICULA_BTN = Target.the("Boton Renovar matricula")
            .located(By.xpath("//a[@data-original-title=\"Renovar matrícula\"]"));


    public static By CONTINUAR_DOS_BTN = By.xpath("//*[@id=\"iniciarRenovacion\"]/div[3]/button");
    public static By ACTIVOS_UNO_INPUT = By.xpath("(//input[@placeholder=\"Nuevos activos\"])[1]");
    public static By ACTIVOS_DOS_INPUT = By.xpath("(//input[@placeholder=\"Nuevos activos\"])[2]");
    public static By NUMERO_EMPLEADOS_INPUT = By.id("numeroempleados");
    public static By LIQUIDAR_BTN = By.xpath("//a[text()='Liquidar']");
    public static By FORMULARIO_UNO_BTN = By.xpath("(//div[@id=\"accordion2\"]//a)[1]");


    public static final Target SELECT_ES_EMPRENDIMIENTO_SOCIAL = Target.the("Seleccionar es emprendimiento social")
            .located(By.id("emprendimientosocial"));

    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_PDH = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_pdh"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_ADS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsoccat_ads"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_RPD = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsoccat_rpd"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OOEP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsoccat_ooep"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OTR = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsoccat_otr"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OTROS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccategorias_otros"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PRUIS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_pruis"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PPRRRE = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_pprrre"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_MRCCA = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_mrcca"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PCIRNARP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_pcirnarp"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PHVCA = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_phvca"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PD = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_pd"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PEP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_pep"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_OTR = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocben_otr"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_OTROS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
                .located(By.id("empsocbeneficiarios_otros"));

    public static By AUTORIZA_SLC = By.id("ctrmennot");
    public static By ACTIVO_INPUT = By.id("actcte_2025");
    public static By PATRIMONIO_INPUT = By.id("pattot_2025");
    public static By ACTIVIDAD_ORDI_INPUT = By.id("ingope_2025");
    //public static By ALMACENAR_BTN = By.xpath("//div[@class=\"card-footer text-right\"]//button");

    public static final Target ALMACENAR_BTN = Target.the("Boton Almacenar formulario")
            .located(By.xpath("//div[@class=\"card-footer text-right\"]//button"));
    //public static By FORMULARIO_DOS_BTN = By.xpath("(//div[@id=\"accordion2\"]//a)[2]");

    public static final Target FORMULARIO_DOS_BTN = Target.the("Boton formulario 2")
            .located(By.xpath("(//div[@id=\"accordion2\"]//a)[2]"));

    public static By RECIBIR_PAGO_BTN = By.xpath("//div[@class=\"card-body text-center\"]//a");
    public static By CERRAR_MODAL_BTN = By.xpath("//div[@class=\"modal-footer\"]//button");
    public static By SERVICIOS_BTN = By.id("v-pills-home-tab");
    public static By SOPORTES_BTN = By.id("soportesT");
    public static By VER_BTN = By.xpath("//*[@id=\"soportes\"]/tbody/tr[1]/td[2]/a");
    //public static By GENERAR_RECIBO_BTN = By.xpath("(//button)[4]");
    public static By GENERAR_RECIBO_BTN = By.xpath("(//button[normalize-space()='Generar recibo'])[1]");

    public static  Target VAL_MODAL = Target.the("").located(By.xpath("//div[@class=\"modal-footer\"]//button"));

}