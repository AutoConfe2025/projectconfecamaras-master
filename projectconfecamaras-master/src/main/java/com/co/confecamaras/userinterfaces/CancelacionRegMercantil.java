package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CancelacionRegMercantil extends PageObject {

    public static By CANCELACION_MATRICULA = By.xpath("//a[@data-original-title=\"Solicitud de cancelación del Registro Mercantil\"]");
    public static By MOTIVO_CANCELACION_SLC = By.id("idmotivocancelacion");
    public static By OBSERVACION_TXT = By.id("motivocancelacion");
    public static By CONTINUAR_BTN = By.xpath("(//button[contains(text(),'Continuar')])[1]");
    public static By SI_BTN = By.xpath("//button[normalize-space()='Si']");
    public static By CARGAR_BTN = By.xpath("(//a[@id=\"btnCargaSoporte\"])[1]");
    public static By ARCHIVO_CARGAR_INPUT = By.id("anexo");
    public static By OBSERVACIONES_TXT = By.id("descripcion");
    public static By FECHA_INPUT = By.xpath("//*[@id=\"formSubirAnexo\"]/div/div[2]/div[3]/div[1]/span/button[1]");
    public static Target BTN_DIA = Target.the("Seleccionar el dia en el calendario").
            located(By.xpath("/html/body/div[4]/div[3]/ul[3]/li[3]"));
    public static By CALENDAR = By.xpath("(//div[@data-view=\"days picker\"])[4]");
    public static By ENTIDAD_INPUT = By.id("origendoc");
    public static By CARGAR_DOS_BTN = By.id("btnCargar");
    public static By CERRAR_BTN = By.xpath("//div[@id='ModalInfo']//button[@type='button'][normalize-space()='Cerrar']");
    //public static By FECHA_INPUT = By.id("fechadoc");
//public static By CALENDAR = By.xpath("(//div[@data-view=\"days picker\"])[4]");
//public static By ENTIDAD_INPUT = By.id("origendoc");
//public static By CARGAR_DOS_BTN = By.id("btnCargar");
//public static By CERRAR_BTN = By.xpath("//button[@type='button' and @class='btn btn-info' and @data-dismiss='modal']");
    public static By RECIBIR_PAGO_BTN = By.id("btnRpago");
    public static Target VALIDACION = Target.the("")
            .located(By.xpath("//div//p[contains(text(), 'Datos generales del recibo')]"));


}
