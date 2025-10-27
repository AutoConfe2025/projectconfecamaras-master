package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoKardex extends PageObject {

    // ----- Campos para validacion ----- //
    public static final Target LIBRO_TXT = Target.the("")
            .located(net.serenitybdd.core.annotations.findby.By.id("libro"));
    //public static final By LIBRO_TXT = By.id("libro");
    public static By REGISTRO_TXT = By.id("registro");
    public static By DUPLI_TXT = By.id("dupli");
    public static By FECHA_TXT = By.id("fecharegistro");
    public static By HORA_TXT = By.id("horaregistro");
    public static By ACTO = By.id("acto");

    public static By LIBRO_SLC = By.id("_idlibro");
    public static By NUM_INICIAL_INPUT = By.id("_numini");
    public static By CONTINUAR_BTN = By.id("submit");
    public static By EDITAR_IMG = By.xpath("(//a[@data-original-title=\"Editar\"])[1]");
    public static By NOTICIA_TXT = By.id("noticia");
    public static By GRABAR_BTN = By.id("submit");
    public static final Target BTN_CERRAR_KARDEX = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_REGRESAR_KARDEX = Target.the("Boton regresar")
            .located(By.xpath("//button[text()='Regresar']"));

    // ----- Mantenimiento Tipos Comentarios ------ //

    public static By CAMPO_ID = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[1]");
    public static By CAMPO_ID_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[1]/input");
    public static By CAMPO_DESCRIPCION = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[2]");
    public static By CAMPO_DESCRIPCION_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[2]/input");
    public static By GRABAR_DESC_BTN = By.xpath("//a[@href=\"javascript:grabarComentarios()\"]");

    public static final Target VALIDACION_DESCR = Target.the("Boton regresar")
            .located(By.xpath("//a[@href=\"javascript:grabarComentarios()\"]"));

}
