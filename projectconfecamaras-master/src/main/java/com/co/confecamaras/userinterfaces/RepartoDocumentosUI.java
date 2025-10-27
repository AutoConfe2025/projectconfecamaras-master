package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RepartoDocumentosUI extends PageObject {

    public static final Target TXT_BUSCAR_CODIGO_REPARTO_DOCUMENTOS = Target.the("Escribir el codigo de barras")
            //.located(By.id("_codbarrasinicial"));
            .located(By.xpath("//*[@id=\"codigobarrasinicial\"]"));

    public static final Target TXT_BUSCAR_CLICK = Target.the("Escribir el codigo de barras")
            .located(By.cssSelector("input[type='search']"));

    public static final Target BTN_VER_RUTA_REPARTO_DOCUMENTOS = Target.the("Boton ver ruta")
            //.located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[19]/a/img"));
            //.located(By.linkText("Ver ruta"));
            .located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[2]/div[2]/table/tbody/tr[1]/td[10]/p/small/a[1]"));

    public static final Target BTN_ADICIONAR_COMENTARIOS_REPARTO_DOCUMENTOS = Target.the("Boton adicionar comentarios")
           // .located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[2]/div[2]/table/tbody/tr/td[10]/p/small/a[2]/svg/path"));
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(2) > svg > path"));

    public static final Target SELECT_TIPO_REPARTO_DOCUMENTOS = Target.the("Seleccionar tipo")
            .located(By.id("_tipo"));

    public static final Target TXT_COMENTARIO_REPARTO_DOCUMENTOS = Target.the("Escribir comentarios")
            //.located(By.id("_comentario"));
            .located(By.cssSelector("#_comentario"));

    public static final Target BTN_GRABAR = Target.the("Boton grabar")
            .located(By.id("submit"));

    public static final Target BTN_GRABAR_REPARTO_DOCUMENTOS = Target.the("Boton grabar")
           // .located(By.xpath("//input[@onmouseover=\"Tip('Actualizar comentarios')\"]"));
            .located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[2]/div[2]/table/tbody/tr/td[10]/p/small/a[3]"));

    public static final Target BTN_FINALIZAR_ESCANEO_ENRUTAR_REPARTO_DOCUMENTOS = Target.the("Boton finalizar escaneo y enrutar")
            //.located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[25]/a/img"));
            //.located(By.cssSelector("#tablecb > tbody > tr > td:nth-child(10) > p > small > a:nth-child(4) > svg > path"));
            .located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[2]/div[2]/table/tbody/tr/td[10]/p/small/a[4]"));

    public static final Target SELECT_USUARIO_REPARTO_DOCUMENTOS = Target.the("Seleccionar usuario")
            .located(By.id("_usuarioX"));

    public static final Target BTN_ASIGNAR_REPARTO_DOCUMENTOS = Target.the("Boton asignar")
            //.located(By.xpath("//input[@onmouseover=\"Tip('Asignar usuario')\"]"));
            .located(By.id("submit"));

    public static final Target LBL_REPARTO_DOCUMENTOS = Target.the("Mensaje reparto de documentos")
            //.located(By.xpath("//h2[text()='Proceso Finalizado: Escaneo']"));
            .located(By.xpath("//*[@id=\"formMensajes\"]/p"));


    public static final Target BTN_ACEPTAR = Target.the("Seleccionar usuario")
            .located(By.cssSelector("#page-top > div.bootbox.modal.fade.bootbox-confirm.show > div > div > div.modal-footer > button.btn.btn-success"));
}