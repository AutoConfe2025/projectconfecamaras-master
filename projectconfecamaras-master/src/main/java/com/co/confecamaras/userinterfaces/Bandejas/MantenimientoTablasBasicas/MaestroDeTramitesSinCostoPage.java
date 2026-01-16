package com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MaestroDeTramitesSinCostoPage {

    public static final Target BOTON_NUEVO_TRAMITE_SIN_COSTO = Target.the("Botón Nuevo trámite sin costo")
            .located(By.xpath("//button[@data-pr-tooltip='Nuevo tramite sin costo']"));

    public static final Target SELECT_TIPO_REGISTRO = Target.the("Selector de Tipo de Registro")
            .located(By.id("tipoRegistro"));
    public static final Target SELECT_TIPO_TRAMITE = Target.the("Selector de Tipo de Trámite en posición 5")
            .located(By.xpath("//form//div[5]//select[@id='tipoTramite']"));
    public static final Target SELECT_SUBTIPO_TRAMITE = Target.the("Selector de Subtipo de Trámite")
            .located(By.id("subTipoTramite"));
    public static final Target SELECT_RUTA_DE_REPARTO= Target.the("Selector de Ruta de Reparto")
            .located(By.xpath("//form//div[13]//select[@id='tipoTramite']"));
    public static final Target SELECT_SERVICIO_UNO = Target.the("Selector de Servicio 1")
            .located(By.id("servicio1"));

    public static final Target SELECT_SERVICIO_DOS = Target.the("Selector de Servicio 2")
            .located(By.id("servicio2"));
    public static final Target SELECT_SERVICIO_TRES = Target.the("Selector de Servicio 3")
            .located(By.id("servicio3"));
    public static final Target CAMPO_DESCRIPCION_TRAMITE = Target.the("Campo Descripción del Trámite")
            .located(By.id("descripcionTramite"));
    public static final Target CHECKBOX_ACEPTACION = Target.the("Checkbox de Aceptación")
            .located(By.xpath("//*[@id='aceptacion']/input"));
    public static final Target CHECKBOX_DESEMBARGO = Target.the("Checkbox de Desembargo")
            .located(By.xpath("//*[@id='desembargo']/input"));
    public static final Target CHECKBOX_PIDE_PQR = Target.the("Checkbox Pide PQR")
            .located(By.xpath("//*[@id='pidepqr']/input"));
    public static final Target INPUT_TEXTO_LIBRE = Target.the("Input de Texto Libre")
            .located(By.xpath("//*[@id='textoLibre']/input"));

    public static final Target CELDA_RESULTADO_PRIMERA_FILA_COLUMNA_CUATRO =
            Target.the("Celda de la primera fila y columna 4")
                    .locatedBy("//form[@id='formGenerico']//table/tbody/tr[1]/td[4]");
    public static final Target BOTON_ACTUALIZAR_TRAMITE_SIN_COSTO = Target.the("Actualizar tramite sin costo")
            .located(By.xpath("//button[contains(@data-pr-tooltip, '   Actualizar tramite sin costo')]"));

    public static final Target BOTON_ELIMINAR_TRAMITE_SIN_COSTO = Target.the("Eliminar tramite sin costo")
            .located(By.xpath("//*[@id='formGenerico']//td[6]//button[@data-pr-tooltip='Eliminar tramite sin costo']"));

}
