package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RadicarDepositoEstadosFinancierosUI extends PageObject {

    public static final Target SELECT_BUSCAR_POR_RADICAR_DEPOSITO = Target.the("Seleccionar buscar por")
            .located(By.id("selectS"));

    public static final Target TXT_NIT_RADICAR_DEPOSITO = Target.the("Escribir nit").locatedBy("#search");
    public static final Target LINKS_PANEL = Target.the("opciones del panel para cargar archivo").locatedBy("//*[@id='panel-tab']/a");

    public static final Target BTN_CONSULTAR_RADICAR_DEPOSITO = Target.the("Boton consultar")
            .located(By.xpath("//*[contains(text(), 'Consultar')]"));

    public static final Target BTN_SELECCIONAR_MATRICULA_RADICAR_DEPOSITO = Target.the("Boton seleccionar matricula")
            .located(By.xpath("//a[@data-original-title='Seleccionar matrícula']"));

    public static final Target BTN_INICIAR_RADICAR_DEPOSITO = Target.the("Boton iniciar")
            .located(By.xpath("//i[@class='fa-solid fa-circle-play']"));

    public static final Target INP_FECHA_SITUACION_FINANCIERA_RADICAR_DEPOSITO = Target.the("Escribir fecha situacion financiera")
            .locatedBy("#fecha_informe");

    public static final Target INP_FOLIOS_SITUACION_FINANCIERA_RADICAR_DEPOSITO = Target.the("Escribir nro de folios situacion financiera")
            .locatedBy("#numFolios");

    public static final Target BTN_GUARDAR_RADICAR_DEPOSITO = Target.the("Boton guardar")
            .locatedBy("#almacenarFormulario");

    public static final Target BTN_ACEPTAR_RADICAR_DEPOSITO = Target.the("Boton aceptar")
            .locatedBy("//button[text()='Aceptar']");

    /*------Botones Cargar------*/
    public static final Target BTN_CARGUE_SOPORTE = Target.the("cargar archivo").locatedBy("//*[contains(@placeholder,'Cargar soportes')]");

    /*--------------------------*/

    public static final Target BTN_CERRAR_RADICAR_DEPOSITO = Target.the("Boton cerrar")
            .locatedBy("//*[@id='swal2-title']/following::button[text()='Cerrar']");
    public static final Target BTN_CERRAR_VISTA_DOCUMENTO = Target.the("Boton cerrar dos")
            .located(By.xpath("//div[@style='display: block;']//*[text()='Cerrar']"));

    public static final Target BTN_RADICAR_DEPOSITO = Target.the("Boton radicar tramite")
            .located(By.xpath("//*[text()='Radicar tramite']"));

    public static final Target BTN_SERVICIOS_RADICAR_DEPOSITO = Target.the("Boton servicios")
            .located(By.id("v-pills-home-tab"));

    public static final Target BTN_SOPORTES_RADICAR_DEPOSITO = Target.the("Boton soportes")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_RECIBO_CAJA_RADICAR_DEPOSITO = Target.the("Boton ver recibo de caja")
            .located(By.xpath("//tbody/tr[1]/td[2]/a[1]"));

    public static final Target BTN_VER_RADICADO_RADICAR_DEPOSITO = Target.the("Boton ver radicado")
            .located(By.xpath("//tbody/tr[3]/td[2]/a[1]/i[1]"));

    public static final Target MODAL_RADICAR_DEPOSITO = Target.the("Modal")
            //.located(By.xpath("//div[@class=\"modal-content ui-resizable\"]"));
            .located(By.xpath("//*[@id='ModalInfo']/div/div"));

    public static final Target LBL_DOCUMENTO_FINAL_RADICAR_DEPOSITO = Target.the("Mensaje documento final radicar deposito")
            //.located(By.xpath("//*[text()=' Ver documento']"));
            .locatedBy("#ModalTitulo");

}