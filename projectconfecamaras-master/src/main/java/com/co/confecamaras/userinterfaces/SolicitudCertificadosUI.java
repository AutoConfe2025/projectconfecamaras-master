package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SolicitudCertificadosUI extends PageObject {

    // ---- Elements NA ---- //

    public static By ACCIONES_BTN = By.xpath("//*[@id=\"tablaConsultaExpedientes\"]/tbody/tr[1]/td[1]/a");
    public static final Target OPERACIONES_MERCANTIL_ESADL_BTN = Target.the("Boton operaciones mercantil ESADL")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));
    public static By SOLICITUD_CERTIFICADOS_BTN = By.xpath("//span[text()='Solicitar certificados']");
    public static By AUTOMATICOS_BTN = By.xpath("//div[@class=\"modal-footer\"]//button[text()='C. Automáticos']");
    public static By CERTIFICADO_NUM_INPUT = By.id("certimat");
    public static By CERTIFICADO_LIBROS_INPUT = By.id("certilib");
    public static By CERTIFICADOS_EXISTENCIA_INPUT = By.id("certiesadl");
    public static By CERTIFICADOS_EXISTENCIA_INPUT_ESADL = By.id("certiesadl");
    //public static Target CERTIFICADOS_EXISTENCIA_INPUT_ESADL = Target.the("")
    //        .located(By.id("certiesadl"));
    public static By CONTINUAR_BTN = By.id("generarLiquidacion");
    //public static By OK_BTN = By.xpath("(//div[@class=\"modal-footer\"]//button)[2]");
    public static By OK_BTN = By.xpath("//button[normalize-space()='OK']");

    public static Target OK_BTN_1 = Target.the("")
            .located(By.xpath("//button[normalize-space()='OK']"));

    public static By DESCARGAR_BTN = By.xpath("//div[@class=\"swal2-popup swal2-modal swal2-icon-success swal2-show\"]//a");
    public static By CONTINUAR_DOS_BTN = By.xpath("//button[normalize-space()='Continuar']");

    public static final Target CONTINUAR_TRES_BTN = Target.the("Boton continuar Certificado generado")
            .located(By.xpath("//button[normalize-space()='Continuar']"));

    public static By SERVICIOS_BTN = By.id("v-pills-home-tab");
    public static By SOPORTES_BTN = By.id("soportesT");
    public static By VER_BTN = By.xpath("//table[@id=\"soportes\"]//a");

    public static Target VER_BTN_VAL = Target.the("")
            .located(By.xpath("//table[@id=\"soportes\"]//a"));

    // ---- Elements NP ---- //

    public static final Target BTN_SOLICITAR_CERTIFICADOS = Target.the("Boton solicitar certificados")
            .located(By.xpath("//*[text()='Solicitar certificados']"));

    public static final Target BTN_SOLICITAR_CERTIFICADOS_DOS = Target.the("Boton solicitar certificados dos")
            .located(By.xpath("//*[text()='Solicitar Certificados']"));

    public static final Target BTN_C_AUTOMATICOS_SOLICITUD_CERTIFICADOS = Target.the("Boton C.Automaticos")
            .located(By.xpath("//*[text()='C. Automáticos']"));

    public static final Target TXT_CERTIFICADOS_MATRICULA_SOLICITUD_CERTIFICADOS = Target.the("Escribir cantidad certificados de matricula")
            .located(By.id("certimat"));

    public static final Target TXT_CERTIFICADOS_EXISTENCIA_SOLICITUD_CERTIFICADOS = Target.the("Escribir cantidad certificados de existencia")
            .located(By.id("certimat"));

    public static final Target TXT_CERTIFICADOS_PROPONENTES_SOLICITUD_CERTIFICADOS = Target.the("Escribir cantidad certificados de proponente")
            .located(By.id("certiprop"));

    public static final Target BTN_CONTINUAR_SOLICITUD_CERTIFICADOS = Target.the("Boton continuar")
            .located(By.id("generarLiquidacion"));

    public static final Target BTN_OK_SOLICITUD_CERTIFICADOS = Target.the("Boton OK")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_DESCARGAR_CERTIFICADO_SOLICITUD_CERTIFICADOS = Target.the("Boton descargar certificado")
            .located(By.xpath("//a[@data-original-title=\"Descargar certificado\"]"));

    public static final Target BTN_DESCARGAR_CERTIFICADO_DOS_SOLICITUD_CERTIFICADOS = Target.the("Boton descargar dos certificado")
            //.located(By.xpath("(//a[@data-original-title=\"Descargar certificado\"])[2]"));
            .located(By.xpath("//*[@id=\"swal2-html-container\"]/table/tbody/tr/th/a"));

    public static final Target BTN_CONTINUAR_DOS_SOLICITUD_CERTIFICADOS = Target.the("Boton continuar dos")
            .located(By.xpath("//*[text()=' Continuar']"));

    public static final Target BTN_SERVICIOS_SOLICITUD_CERTIFICADOS = Target.the("Boton servicios")
            .located(By.id("v-pills-home-tab"));

    public static final Target BTN_SOPORTES_SOLICITUD_CERTIFICADOS = Target.the("Boton soportes")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_SOLICITUD_CERTIFICADOS = Target.the("Boton ver")
            .located(By.xpath("//a[@class='btn btn-outline-primary btn-sm']"));

    public static final Target MODAL_SOLICITUD_CERTIFICADOS = Target.the("Modal")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div"));

    public static final Target LBL_DOCUMENTO_FINAL_SOLICITUD_CERTIFICADOS = Target.the("Mensaje documento final solicitud certificados")
            .located(By.xpath("//*[text()=' Ver documento']"));
}
