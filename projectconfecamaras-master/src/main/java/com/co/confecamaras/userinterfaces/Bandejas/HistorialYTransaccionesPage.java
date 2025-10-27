package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HistorialYTransaccionesPage {
    public static final Target BTN_HISTORIAL_TRANSACCIONES = Target.the("Bton para ingresar al historial de transacciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[17]/a"));

    public static final Target LBL_CODIGO_DE_BARRAS = Target.the("Label con el texto de codigo de barras")
            .located(By.xpath("//*[@id=\"resultados\"]/tbody/tr/td[5]"));

    public static final Target LBL_EXPEDIENTE = Target.the("Label con el texto de Expediente")
            .located(By.xpath("//*[@id=\"resultados\"]/tbody/tr/td[9]"));

    public static final Target LBL_NIT = Target.the("Label con el texto de Expediente")
            .located(By.xpath("//*[@id=\"resultados\"]/tbody/tr[1]/td[10]"));

    public static final Target LBL_HISTORIAL_TITULO = Target.the("Label con el texto de Expediente")
            .located(By.xpath("//div[@class='d-flex align-items-start p-0 mr-1']//h6[contains(text(), 'Historial de transacciones')]"));

    public static final Target FECHA_INICIAL = Target.the("Input para ingresar fecha inciial")
            //.located(By.xpath("//*[@id=\"resultados\"]/tbody/tr/td[10]"));
            .located(By.id("fechaInicial"));

    public static final Target FECHA_FINAL  = Target.the("Input para seleccionar fecha limite de consulta")
            .located(By.xpath("//*[@id=\"fechaFinal\"]"));

    public static final Target INPUT_CODIGO_DE_BARRAS = Target.the("Input para ingresar el codigo de barras")
            .located(By.xpath("//*[@id=\"codBarras\"]"));

    public static final Target INPUT_EXPEDIENTE = Target.the("Input para consultar por expediente")
            .located(By.xpath("//*[@id=\"expediente\"]"));

    public static final Target INPUT_NIT = Target.the("Input para consultar por nit/identificacion")
            .located(By.xpath("//*[@id=\"identificacion\"]"));

    public static final Target SELECT_ESTADO_LIQUIDACION = Target.the("Menu desplegable estado liquidacion")
            .located(By.id("estadoLiquidacion"));

    public static final Target  SELECT_INCLUIR_CERTIFICADO = Target.the("Menu desplegable  para seleccionar si desea incluir certificado")
            .located(By.id("estadoLiquidacion"));

    public static final Target SELECT_INCLUIR_RENOVACIONES = Target.the("Menus desplegable para seleccionar si desea incluir renovaciones")
            .located(By.id("incluirRenovaciones"));

    public static final Target BTN_LIMPIAR = Target.the("Boton para limpiar los parametros de busqueda")
            .located(By.xpath("//*[@id=\"consultaExpediente\"]/div/div[3]/a"));

    public static final Target BTN_CONSULTAR_HISTORIAL = Target.the("Boton para realizar la consulta segun los parametros seleccionados")
            .located(By.xpath("//*[@id=\"consultaExpediente\"]/div/div[3]/button"));

    public static final Target TEXTO_TITULO_HISTORIAL = Target.the("Titulo del aparatado del historial")
            .located(By.xpath("//*[@id=\"bodyInicio\"]/div/div[2]/div[1]/div/span[1]/div/div/h6/text()"));

    public static final Target BTN_REGRESAR = Target.the("Boton para regresar")
            .located(By.xpath("//button[@data-original-title = 'Regresar']"));


}
