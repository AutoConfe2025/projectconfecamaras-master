package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RecibirPago extends PageObject {

    public static final Target SELECT_CONSULTA_POR_RP = Target.the("Seleccionar el tipo de consulta")
            .located(By.id("selectS"));

    public static final Target TXT_INGRESAR_INFORMACION_RP= Target.the("Escribir el proponente")
            .located(By.id("criterio"));

    public static final Target BTN_CONTINUAR_RP = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), 'Continuar')]"));

    public static final Target BTN_ACCIONES_DISPONIBLES_RP = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    public static final Target BTN_OPERACIONES_MERCANTIL_ESADL_RP = Target.the("Boton operaciones mercantil esadl")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_SOLICITAR_CERTIFICADOS_RP = Target.the("Boton solicitar certificados")
            .located(By.xpath("//*[text()='Solicitar certificados']"));

    public static final Target BTN_C_AUTOMATICOS_RP = Target.the("Boton c.automaticos")
            .located(By.xpath("//button[text()='C. Automáticos']"));

    public static final Target TXT_CERTIFICADOS_MATRICULA_RP= Target.the("Escribir certificados matricula")
            .located(By.id("certimat"));

    public static final Target BTN_CONTINUAR_DOS_RP = Target.the("Boton continuar dos")
            .located(By.id("generarLiquidacion"));

    public static final Target LBL_NUMERO_RECUPERACION_RP = Target.the("Mensaje numero de recuperacion")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/div/div[22]/div/div[2]/div/div/table/tbody/tr[1]/td[2]"));

    public static final Target BTN_OK_RP = Target.the("Boton ok")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_HOME_RP = Target.the("Boton home")
            //.located(By.id("accionHome"));
            .located(By.cssSelector("#accionHome > div > ul > li:nth-child(1) > a > span > i"));




    // ---------------- Elements Recibir Pago NA ---------------- //
    public static By RECIBIR_PAGO_BTN =  By.xpath("//button[text()='Recibir pago']");
    public static By CONTINUAR_BTN = By.xpath("//button[text()='Continuar']");
    public static By TIPO_IDENTIFICACION_SLC = By.id("_idtipoidentificacioncliente");
    public static By IDENTIFICACION_INPUT = By.id("_identificacioncliente");
    public static By VERIFICAR_IDENT_BTN = By.xpath("//button[text()='Verificar identificación']");

    public static By EMAIL_CONFIRMACION_INPUT = By.id("_emailconfirmacion");
    public static By DUPLICAR_DATOS_BTN = By.xpath("//button[text()='Duplicar datos del cliente']");
    public static By GENERAR_RECIBO_BTN = By.xpath("//button[text()='Generar recibo']");
    public static By GENERAR_RECIBO_DOS_BTN = By.xpath("//a[@href=\"javascript:validarDatosRecibo();\"]");
    public static By RECIBO_DESCARGAR_LNK = By.xpath("(//a[text()='Descargar'])[3]");

    /// prueba
    public static Target VALOR_TOTAL = Target.the("")
            .located(By.xpath("(//strong[contains(text(),'$5,800.00')])[1]"));
    public static Target VALOR_PAGADO = Target.the("")
            .located(By.xpath("(//strong[contains(text(),'$5,800.00')])[2]"));
    public static Target VALOR_VUELTAS = Target.the("")
            .located(By.xpath("(//strong[normalize-space()='$0.00'])[1]"));
    /// prueba

    public static Target VALIDACION_DESCARGAR = Target.the("")
            .located(By.xpath("(//a[text()='Descargar'])[3]"));


    // ---- Recibir Pago Nuevo ---- //

    public static By NUMERO_RECUPERACION_INPUT = By.id("_numrec");
    public static By INCLUIR_COBRO_SLC = By.id("_forzarformularios");
    public static By FORZAR_DESCUENTO_SLC = By.id("_forzardescuento1756");

    public static Target VALIDACION_PAGO = Target.the("")
            .located(By.xpath("(//a[text()='Descargar'])[3]"));

}
