package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirmadoUI extends PageObject {

    public static final Target BTN_MIS_TRAMITES_FIRMADO = Target.the("Boton mis tramites")
            .located(By.id("iconoMisTramites"));

    public static final Target LBL_CODIGO_TRAMITES_FIRMADO = Target.the("Codigo tramites")
            .located(By.xpath("//li[@class=\"list-group-item list-group-item-action p-2\"]//span[@class=\"medium \"]"));

    public static final Target BTN_BUSCAR_FIRMADO = Target.the("Boton buscar")
            .located(By.xpath("//a[@class=\"btn btn-outline-info btn-sm  py-0\"]"));

    public static final Target BTN_CONTINUAR_TRAMITE_FIRMADO = Target.the("Boton continuar tramite")
            .located(By.xpath("//span[@class='truncate'][normalize-space()='Continuar Trámite']"));

    public static final Target MENU_DESPLEGABLE_SEDE_ADMINISTRATIVA = Target.the("Menu desplegable sede administrativa")
            .located(By.id("tiposedeadm"));

    public static final Target BTN_CONTINUAR_COSTO_FIRMADO = Target.the("Boton continuar con costo")
            .located(By.xpath("//a[@data-original-title=\"Continuar (Con costo).\"]"));

    public static final Target BTN_FIRMA_ELECTRONICA_FIRMADO = Target.the("Boton firma electronica")
            .located(By.id("btnFelectronica"));

    public static final Target BTN_FIRMAR_FIRMADO = Target.the("Boton firmar")
            .located(By.id("firmar"));

    public static final Target BTN_SI_FIRMADO = Target.the("Boton Si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_CONTINUAR_FIRMADO = Target.the("Boton continuar")
            .located(By.xpath("//button[text()='Continuar']"));
    public static final  Target BTN_ACEPTAR_ALERTA_IMPORTANTE = Target.the("Boton aceptar realizar la actualización de datos (mutación) de establecimientos de comercios").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));

    public static final Target BTN_SOBRE_DIGITAL_FIRMADO = Target.the("Boton sobre digital")
            .located(By.id("btnSobreDigital"));

    public static final Target LBL_SOBRE_DIGITAL_FIRMADO = Target.the("Ver sobre digital")
            .located(By.id("ModalTitulo"));


    public static final Target BTN_TRAMITES_CONSULTAS_EXPEDIENTE_FIRMADO = Target.the("Boton tramites y consultas de expediente")
            .located(By.xpath("//h4[text()='Trámites y Consultas de Expediente']"));

    public static final Target TXT_MATRICULA_FIRMADO = Target.the("Escribir matricula")
            .located(By.id("filtro"));

    public static final Target BTN_CONSULTAR_FIRMADO = Target.the("Boton consultar")
            .located(By.id("consulta"));

    public static final Target BTN_ACCIONES_DISPONIBLES_FIRMADO = Target.the("Boton acciones disponibles")
            .located(By.xpath("//i[@data-original-title='Acciones Disponibles']"));

    public static final Target BTN_OPERACIONES_MERCANTIL_ESADL_FIRMADO = Target.the("Boton operaciones mercantil esadl")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_ACTUALIZACION_DATOS_MUTACION_FIRMADO = Target.the("Boton actualizacion datos mutacion")
            .located(By.xpath("//a[@data-original-title='Actualización de datos (mutación)']"));

    public static final Target CHK_BOX_UBICACION_COMERCIAL_FIRMADO = Target.the("Check Box ubicacion comercial")
            .located(By.xpath("//*[contains(text(), 'Ubicación comercial')]"));

    public static final Target TXT_CELULAR_FIRMADO = Target.the("Escribir celular")
            .located(By.id("celcom"));
    public static final Target BTN_CONTINUAR_DOS_FIRMADO = Target.the("Boton continuar dos")
            .located(By.id("btnLiquidar"));

    public static final Target LBL_NUM_RECUPERACION_FIRMADO = Target.the("Numero de recuperacion")
            .located(By.xpath("//small[@id='recuperacion']"));

    public static final Target BTN_HOME_FIRMADO = Target.the("Boton home")
            .located(By.id("accionHome"));
}