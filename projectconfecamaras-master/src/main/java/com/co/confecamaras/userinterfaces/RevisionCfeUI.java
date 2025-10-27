package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RevisionCfeUI extends PageObject {

    public static final Target TXT_FECHA_REVISAR_REVISION = Target.the("Escribir la fecha a revisar")
            .located(By.id("_fecha"));

    public static final Target SELECT_FILTRO_REVISION = Target.the("Seleccionar filtro")
            .located(By.id("_filtro"));

    public static final Target BTN_CONTINUAR_UNO_REVISION = Target.the("Boton continuar")
            .located(By.xpath("(//button[text()='Continuar'])[1]"));

    public static final Target BTN_VER_LOG_REVISION = Target.the("Boton ver log")
            .located(By.xpath("(//a[@data-original-title=\"ver Log\"])[1]"));

    public static final Target BTN_RECUPERAR_ESTADO_REVISION = Target.the("Boton recuperar estado")
            .located(By.xpath("(//a[@data-original-title=\"Recuperar estado\"])[1]"));

    public static final Target BTN_VER_DETALLE_RECIBO_REVISION = Target.the("Boton ver detalle recibo")
            .located(By.xpath("(//a[@data-original-title=\"ver detalle recibo\"])[1]"));

    public static final Target BTN_VER_JSON_REQUEST_REVISION = Target.the("Boton ver json request")
            .located(By.xpath("(//a[@data-original-title=\"ver Json Request\"])[1]"));

    public static final Target BTN_VER_JSON_RESPONSE_REVISION = Target.the("Boton ver json response")
            .located(By.xpath("(//a[@data-original-title=\"ver Json Response\"])[1]"));

    public static final Target BTN_FACTURAR_RECIBO_REVISION = Target.the("Boton facturar recibo")
            .located(By.xpath("(//a[@data-original-title=\"Facturar recibo\"])[1]"));

    public static final Target BTN_REGRESAR_REVISION = Target.the("Boton regresar")
            .located(By.xpath("//*[text()='Regresar']"));

    public static final Target BTN_SELECCIONAR_FECHA_REVISION = Target.the("Boton seleccionar fecha")
            .located(By.xpath("//*[text()='Seleccionar fecha']"));

    public static final Target TXT_RECIBO_INDIVIDUAL_REVISION = Target.the("Escribir recibo individual")
            .located(By.id("_recibo"));

    public static final Target BTN_CONTINUAR_DOS_REVISION = Target.the("Boton continuar")
            .located(By.xpath("(//button[text()='Continuar'])[2]"));

    public static final Target TXT_FECHA_INICIAL_REVISION = Target.the("Escribir fecha inicial")
            .located(By.id("_fechaini"));

    public static final Target TXT_FECHA_FINAL_REVISION = Target.the("Escribir fecha final")
            .located(By.id("_fechafin"));

    public static final Target BTN_CONTINUAR_TRES_REVISION = Target.the("Boton continuar")
            .located(By.xpath("(//button[text()='Continuar'])[5]"));

    public static final Target BTN_RECIBOS_SIN_FACTURAR_REVISION = Target.the("Boton recibos sin facturar")
            .located(By.xpath("(//*[text()='Ver'])[1]"));

    public static final Target BTN_RECIBOS_NO_FACTURABLES_REVISION = Target.the("Boton recibos sin facturar")
            .located(By.xpath("(//*[text()='Ver'])[2]"));

    public static final Target BTN_ENVIADOS_CFE_REVISION = Target.the("Boton enviados cfe")
            .located(By.xpath("(//*[text()='Ver'])[3]"));

    public static final Target BTN_RECHAZADOS_CFE_REVISION = Target.the("Boton rechazados cfe")
            .located(By.xpath("(//*[text()='Ver'])[4]"));

    public static final Target BTN_ACEPTADOS_OPE_REVISION = Target.the("Boton aceptados cfe")
            .located(By.xpath("(//*[text()='Ver'])[5]"));

    public static final Target BTN_RECHAZADOS_OPE_REVISION = Target.the("Boton rechazados cfe")
            .located(By.xpath("(//*[text()='Ver'])[6]"));

    public static final Target BTN_ACEPTADOS_DIAN_REVISION = Target.the("Boton aceptados dian")
            .located(By.xpath("(//*[text()='Ver'])[7]"));

    public static final Target BTN_RECHAZADOS_DIAN_REVISION = Target.the("Boton rechazados dian")
            .located(By.xpath("(//*[text()='Ver'])[8]"));

    public static final Target BTN_ACEPTADOS_CLIENTE_REVISION = Target.the("Boton aceptados cliente")
            .located(By.xpath("(//*[text()='Ver'])[9]"));

    public static final Target BTN_RECHAZADOS_CLIENTE_REVISION = Target.the("Boton rechazados cliente")
            .located(By.xpath("(//*[text()='Ver'])[10]"));

    public static final Target BTN_OPE_NO_ENVIADOS_DIAN_REVISION = Target.the("Boton ope no enviados a dian")
            .located(By.xpath("(//*[text()='Ver'])[11]"));

    public static final Target BTN_CERRAR_REVISION = Target.the("Boton cerrar")
            .located(By.xpath("(//button[text()='Cerrar'])[1]"));

    public static final Target LBL_MENSAJE_ESTADISTICAS = Target.the("Mensaje estadisticas")
            .located(By.xpath("//p[text()='Exportar recibos a excel']"));
}