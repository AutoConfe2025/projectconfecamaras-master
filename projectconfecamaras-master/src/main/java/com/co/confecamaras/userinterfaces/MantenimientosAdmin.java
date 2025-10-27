package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientosAdmin extends PageObject {

    // ---- Mantenimiento Tabla de Retencion Documental ---- //

    public static By EDITAR_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[22]/a");
    public static By GUARDAR_BTN = By.xpath("//*[@id=\"formAdmMantenimientoTiposDocumentos\"]/center[1]/input");
    public static By FORMATOS_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[24]/a");
    public static By TIPO_INPUT = By.id("_idtipo");
    public static By DESCRIPCION_INPUT = By.id("_descripcion");
    public static By ARCHIVO_ANEXO_INPUT = By.name("_idfile");
    public static By GRABAR_BTN = By.xpath("//input[@value=\"Grabar\"]");
    public static By ELIMINAR_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]/a");
    public static By REGRESAR_BTN = By.xpath("//*[@id=\"frameSecundarioCentral\"]/center/center[1]/a");
    public static By RUTA_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[4]/td[25]/a");
    public static By REGRESAR_DOS_BTN = By.xpath("//*[@id=\"frameSecundarioCentral\"]/center/center/table/tbody/tr/td/div/center/table/tbody/tr/td[2]/a");

    // ---- Mantenimiento Salarios Minimos Mensuales ---- //

    public static By FECHA_INPUT = By.id("_fecha");
    public static By SALARIO_MINIMO_INPUT = By.id("_salmin");
    public static By TRANSPORTE_LEGAL_INPUT = By.id("_traleg");
    public static By VALOR_UVT = By.id("_valuvt");
    public static By VALOR_UVB = By.id("_valuvb");
    public static By GRABAR_MS_BTN = By.xpath("//a[@href=\"javascript:grabar()\"]");
    public static By BORRAR_REGISTRO_BTN = By.xpath("//a[@href=\"javascript: borrar(77)\"]");

    public static Target VALIDACION_MM = Target.the("")
            .located(By.id("_fecha"));

    // ---- Mantenimiento Tarifas ---- //


    public static Target VALIDACION_TARIFAS = Target.the("")
            .located(By.id("gridbox"));
    public static By SERVICIO_SLC = By.id("_servicio");
    public static By ANO_INPUT = By.id("_ano");
    public static By CONTINUAR_MT_BTN = By.xpath("(//input[@value=\"Continuar\"])[1]");
    public static By MINIMO_LOAD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]");
    public static By MINIMO_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]/input");
    public static By MAXIMO_LOAD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]");
    public static By MAXIMO_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]/input");
    public static By TARIFA_LOAD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[4]");
    public static By TARIFA_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[4]/input");
    public static By TARIFA_PNAT_LOAD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]");
    public static By TARIFA_PNAT_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]/input");
    public static By TARIFA_PJUR_LOAD = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]");
    public static By TARIFA_PJUR_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]/input");
    public static By GRABAR_MT_BTN = By.xpath("//a[@href=\"javascript:grabarServicios ()\"]");

    // ---- Mantenimiento Maestro de Tramites sin costo ---- //
    public static Target VALIDACION_MTRAMITES = Target.the("")
            .located(By.xpath("(//div[@id=\"frameSecundarioCentral\"]//table)[3]"));
    public static By SUBTIPO_ORD = By.xpath("//*[@id=\"gridbox\"]/div[1]/table/tbody/tr[2]/td[3]");
    public static By EDITAR_MMT_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[6]/a");
    public static By GRABAR_MMT_BTN = By.xpath("//input[@value=\"Grabar\"]");

    // ---- Mantenimiento Kardex Proponentes ---- //

    public static By FECHA_INICIAL_INPUT = By.id("_calendario");
    public static By CONTINUAR_MK_BTN = By.xpath("//input[@value=\"Continuar\"]");
    public static By EDITAR_MK_BTN = By.xpath("//a[@href='javascript:editarNoticia(\"1\");']");
    public static By ACTUALIZAR_SLC = By.id("actualizarexpediente");
    public static By GRABAR_MK_BTN = By.xpath("//input[@value=\"Grabar\"]");
    public static By VALIDACION = By.xpath("//body");








}
