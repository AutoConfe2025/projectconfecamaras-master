package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoTresAdmin extends PageObject {

    // ---- Usuarios Ws ---- //

    public static By EDITAR_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]/a");
    public static By CLAVE_INPUT = By.id("_clave");
    public static By GUARDAR_BTN = By.xpath("//input[@type=\"image\"]");

    public static final Target VALIDACION_RESULT = Target.the("")
            .located(By.xpath("//td[text()=\"7ygvfr4321\"]"));


    // ---- Permisos Especiales ---- //

    public static By EDITAR_PE_BTN = By.xpath("(//a[@data-original-title=\"Editar\"])[1]");
    public static By DESCRIPCION_PE_INPUT = By.id("descripcion");
    public static By GRABAR_PE_BTN = By.id("submit");
    public static final Target VALIDACION_RESULT_PE = Target.the("")
            .located(By.xpath("//td//p//small[text()='Consultas - Datos generales (matriculados)']"));

    // ---- Alertas Admin ---- //

    public static final Target EDITAR_AA_BTN = Target.the("Boton Editar")
            .located(By.xpath("(//td//a[text()=\"Ed\"])[1]"));

    //public static By EDITAR_AA_BTN = By.xpath("(//td//a[text()=\"Ed\"])[1]");
    public static By DETALLE_AA_INPUT = By.id("_detalle");
    public static By GRABAR_AA_BTN = By.xpath("//*[@id=\"formMregAlerta\"]/center/input");
    public static final Target VALIDACION_RESULT_AA = Target.the("")
            .located(By.xpath("//td[text()=\"PRUEBA DE ALERTA\"]"));

    // ---- Alertas Registro ---- //

    public static final Target EDITAR_AR_BTN = Target.the("Boton editar")
            .located(By.xpath("(//td//a[text()=\"Editar\"])[1]"));

    public static By GRABAR_AR_BTN = By.xpath("//*[@id=\"formMregAlertaRegistro\"]/center/input");

    public static final Target VALIDACION_RESULT_AR = Target.the("")
            .located(By.xpath("//td[text()=\"SE DEBE PRESENTAR EN LA VENTANILLA DE INFORMACION 23\"]"));

    public static final Target BTN_ADICIONAR = Target.the("Boton adicionar")
            .located(By.xpath("(//img)[1]"));

    public static final Target TXT_ID = Target.the("Cuadro de texto identificacion")
            .located(By.id("_identificacion"));

    public static final Target TXT_MATRICULA_ALERTA = Target.the("Cuadro de texto Matricula")
            .located(By.id("_matricula"));

    public static final Target MEN_DES_TIPO_ALERTA = Target.the("Menu desplegable tipo de alerta")
            .located(By.id("_tipoalerta"));

    // ---- Alertas Administrativa agregar nueva alerta ---- //

    public static final Target BTN_ADICIONAR_REGISTRO = Target.the("Boton adicionar registro")
            .located(By.cssSelector("img[src='../../html/default/images/pack/add32.png']"));

    public static final Target TXT_ID_ALERTAS = Target.the("Cuadro de texto documento").
            located(By.id("_identificacion"));

    public static final Target TXT_MATRICULA_ALERTAS = Target.the("Cuadro de texto matricula").
            located(By.id("_matricula"));

    public static final Target TXT_DETALLE_ALERTAS = Target.the("Cuadro de texto detalle").
            located(By.id("_detalle"));

    public static final Target TXT_VALOR_ALERTAS = Target.the("Cuadro de texto valor").
            located(By.id("_valoralerta"));

    public static final Target BTN_SERVICIO = Target.the("Boton buscar servicio").
            located(By.xpath("//img[@src='../../html/default/images/btnBuscar.gif']"));

    public static final Target BTN_SERVICIO_ALERTAS = Target.the("Boton servicio seleccionado").
            located(By.xpath("//a[normalize-space()='01010081']"));

    public static final Target MENU_DES_TIPO_ALERTA = Target.the("Menu desplegable tipo de alerta").
            located(By.id("_tipoalerta"));

    public static final Target BTN_GUARDAR_ALERTA = Target.the("Boton guardar").
            located(By.cssSelector("input[type='image']"));



    // ---- Firmas Digitales ---- //

    public static By PUBLIC_KEY_INPUT = By.id("_signin_cert");
    public static By CONTINUAR_FD_BTN = By.id("submit");

    public static final Target TXT_PRIVATE_KEY = Target.the("Cuadro de texto Private Key")
            .located(By.id("_private_cert"));

    public static final Target TXT_CLAVE = Target.the("Cuadro de texto Private Key")
            .located(By.id("_password_cert"));

    public static final Target TXT_VENCIMIENTO = Target.the("Cuadro de texto Private Key")
            .located(By.id("_vencimiento_cert"));

    public static final Target VALIDACION_RESULT_FD = Target.the("")
            .located(By.xpath("//p[text()=\"Firma actualizada\"]"));


}
