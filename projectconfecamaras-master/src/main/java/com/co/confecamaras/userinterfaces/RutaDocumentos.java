package com.co.confecamaras.userinterfaces;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RutaDocumentos extends PageObject {

    public static Target ESPERA_MODAL = Target.the("").located(By.xpath("//div[@class=\"modal-content ui-resizable\"]"));

    public static By CODIGO_BARRAS_INPUT = By.id("codigo_barras");
    public static By OPERACION_INPUT = By.id("operacion");
    public static By RECIBO_INPUT = By.id("recibo");
    public static By NOMBRE_INPUT = By.id("nombre");
    public static By IDENTIFICACION_INPUT = By.id("identificacion");
    public static By MATRICULA_INPUT = By.id("matricula");
    public static By FECHA_INICIAL_INPUT = By.id("fechaInicial");
    public static By FECHA_FINAL_INPUT = By.id("fechaFinal");
    public static By CONTINUAR_BTN = By.xpath("//div[@class=\"card-footer text-center\"]//button");

    //public static By ACCION_BTN = By.xpath("//*[@id=\"datataevidenciaanexos\"]/tbody/tr[1]/td[5]/a");
    //public static By ACCION_DOS_BTN = By.xpath("//*[@id=\"datataevidenciasipref\"]//a");
    public static Target ACCION_BTN = Target.the("Boton ver Acciones 2")
            .located(By.xpath("//*[@id=\"datataevidenciaanexos\"]/tbody/tr[1]/td[5]/a"));

    public static Target BTN_CERRER_INFORMACON = Target.the("Boton Cerra Operación no tiene códigos de barras asociados para ser consultados")
            .located(By.xpath("//div[@id='ModalInfo']//button[@type='button'][normalize-space()='Cerrar']"));

    public static Target ACCION_DOS_BTN = Target.the("Boton ver Acciones 2")
            .located(By.xpath("//*[@id=\\\"datataevidenciasipref\\\"]//a"));

    public static By CERRAR_BTN = By.xpath("//div[@id='ModalInfo']//button[@type='button'][normalize-space()='Cerrar']");

    public static Target CERRAR_BTN_1 = Target.the("Boton cerrar")
            .located(By.xpath("//div[@id='ModalInfo']//button[@type='button'][normalize-space()='Cerrar']"));

    public static Target BTN_OK_1 = Target.the("Boton ok No se recupero el anexo.")
            .located(By.xpath("//button[normalize-space()='OK']"));

    //public static By NUEVA_CONSULTA_BTN = By.xpath("//form[@id=\"detalleRutaDocumentos\"]//a[3]");
    public static By NUEVA_CONSULTA_BTN = By.id("abandonar");
    public static By LIMPIAR_BTN = By.xpath("//form[@id=\"formRutaDocumentos\"]//a[1]");
    public static By VER_RUTA_BTN = By.xpath("(//div[@id=\"collapseresultados\"]//a)[1]");

    public static Target VER_RUTA_BTN_1 = Target.the("")
            .located(By.xpath("(//div[@id=\"collapseresultados\"]//a)[1]"));

    public static By ANEXOS_ACCION_BTN = By.xpath("//*[@id=\"datataevidenciaanexos\"]/tbody/tr[1]/td[5]/a");

    public static Target VALIDACION_RD = Target.the("")
            .located(By.xpath("//div[@class=\"modal-content ui-resizable\"]"));

    public static Target VALIDACION_LB = Target.the("")
            .located(By.xpath("//form[@id=\"formRutaDocumentos\"]//a[1]"));
}
