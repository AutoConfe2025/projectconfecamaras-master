package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoTres extends PageObject {

    public static By EDITAR_BTN = By.xpath("//a[@href=\"javascript:editar('MDEuMDAx');\"]");
    public static By CONTINUAR_EDITAR_BTN = By.xpath("//button[@id=\"submit\"]");
    public static By DUPLICAR_BTN = By.xpath("//a[@href=\"javascript:duplicar('MDEuMDAx');\"]");
    public static By DUPLICAR_TXT = By.xpath("//input[@class=\"bootbox-input bootbox-input-text form-control\"]");
    public static By OK_DUPLICAR_BTN = By.xpath("//button[text()='OK']");
    public static By BUSCAR_TXT = By.xpath("//div[@id=\"tabletransacciones_filter\"]//input");
    public static By BORRAR_BTN = By.xpath("//a[@href=\"javascript:borrar('MDEuOTk5');\"]");
    public static By CONTINUAR_BORRAR_BTN = By.xpath("//button[text()='Continuar']");
    public static By VER_BTN = By.xpath("//a[@href=\"javascript:view('MDEuMDAx');\"]");
    public static By NUEVA_BTN = By.xpath("//a[@href=\"javascript:nueva();\"]");
    public static By CERRAR_BTN = By.xpath("(//button[text()='Cerrar'])[3]");
    public static By CODIGO_TXT = By.id("idcampo");
    public static By NOMBRE_TXT = By.id("nombre");
    public static By NOMBRE_CORTO_SLC = By.id("nombrecorto");
    public static By EXPORTAR_CONTROLES_BTN = By.xpath("//button[text()=\"Exportar Controles 1\"]");
    public static By DESCARGAR_BTN = By.xpath("//a[text()='Descargar']");

    public static Target VALIDACION_BTN_DESCARGA = Target.the("")
            .located(By.xpath("//a[text()='Descargar']"));

    // -------- Mantenimiento TablaCod -------- //

    public static By EDITAR_TC_BTN = By.xpath("(//a)[1]");
    public static By OPC_TC_SLC = By.xpath("//td[text()='INSCRIPCION']");
    public static By GRABAR_TC_BTN = By.xpath("//a[@href=\"javascript:grabarRegistro()\"]");
    public static By REGRESAR_TC_BTN = By.xpath("//a[text()='Regresar']");

    public static Target VALIDACION_TABLA = Target.the("")
            .located(By.id("frameSecundarioCentral"));

    // -------- Mantenimiento Sedes -------- //

    public static By EDITAR_S_TD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]");
    public static By EDITAR_S_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]/input");
    public static By EDITAR_S_DOS_TD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[3]/td[3]");
    public static By EDITAR_S_DOS_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[3]/td[3]/input");
    public static By GRABAR_S_BTN = By.xpath("//a[@href='javascript:grabarSedes()']");

    public static Target VALIDACION_SEDES = Target.the("")
            .located(By.xpath("//div[@id=\"gridbox\"]//div[@class=\"objbox\"]"));

    // -------- Mantenimiento Actos -------- //

    public static By RE_SLC = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[4]");
    public static By GRABAR_A_BTN = By.xpath("//a[@href='javascript:grabarActo()']");
    public static By LIBRO_SLC = By.id("_idlibrofiltro");

    public static Target VALIDACION_ACTOS = Target.the("")
            .located(By.xpath("//div[@id=\"frameSecundarioCentral\"]"));

    // -------- Mantenimiento Jurisdiccion -------- //

    public static By PUB_SLC = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]");
    public static By PUB_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]/input");
    public static By PRI_SLC = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[7]");
    public static By PRI_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[7]/input");
    public static By GRABAR_J_BTN = By.xpath("//a[@href=\"javascript:grabar()\"]");
    public static By VER_J_BTN = By.xpath("//a[@href='javascript:seleccionarMunicipio(\"1\");']");

    public static Target VALIDACION_JURISDICCION = Target.the("")
            .located(By.xpath("//div[@class=\"dhxwin_active\"]"));

}