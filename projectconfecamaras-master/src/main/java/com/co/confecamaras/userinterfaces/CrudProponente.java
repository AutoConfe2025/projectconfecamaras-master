package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CrudProponente extends PageObject {

    public static final Target ESPERA_FORM = Target.the("EsperaForm")
            .located(By.id("modalLoader"));
    public static By PROPONENTE_INPUT = By.id("criterio");
    public static By CONSULTA_POR_SLC = By.id("selectS");
    public static By CONTINUAR_BTN = By.xpath("//*[@id=\"consultaExpediente\"]/div/div[3]/button[1]");

    public static By ESTADO_PROPONENTE_TH = By.xpath("//div[@id=\"tablaConsultaExpedientes_wrapper\"]//th[text()='Estado Proponente']");
    public static By ACCIONES_BTN = By.xpath("//*[@id=\"tablaConsultaExpedientes\"]/tbody/tr[1]/td[1]/a");
    public static By OPERACIONES_PROPONENTES_SLT = By.xpath("//div[text()='Trámites del Registro de Proponente']");
    public static By SOLICITUD_CANCELACION_BTN = By.xpath("//a[@data-original-title=\"Solicitud de cancelación del Registro de Proponentes\"]");
    public static By CONTINUAR_DOS_BTN = By.xpath("//*[contains(text(), ' Continuar')]");
    public static By ACCIONES_DOS_BTN = By.xpath("//a[@data-original-title=\"Iniciar trámite\"]");
    public static By IMPRIMIR_FORMULARIO_BTN = By.xpath("//a[@data-original-title=\"Imprimir Formulario\"]");
    public static By REPRESENTANTE_LEGAL_BTN = By.xpath("(//a[text()='JIMENEZ MACIAS IVAN GUSTAVO'])[1]");
    public static By CERRAR_BTN = By.xpath("//button[text()=\"Cerrar\"]");

    public static By RECIBIR_PAGO_BTN = By.id("RecibirPago");  //Para Radicacion Inscripcion de Proponente Persona Natural
    //public static By RECIBIR_PAGO_BTN = By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/form/div[2]/div[1]/div/div[2]/div[3]/div/div[1]/a");  //Para Radicacion Inscripcion de Proponente Persona Natural
    //public static By RECIBIR_PAGO_BTN_INSCRIPCION_RUP = By.id("btnGrabarLiquidacionInscripcionProponentes");
    public static By RECIBIR_PAGO_BTN_CANCELACION = By.id("btnGrabarLiquidacionInscripcionProponentes");
    public static By CONTINUAR_TRES_BTN = By.xpath("//button[normalize-space()='Continuar']");
    public static By TIPO_IDENTIFICACION_SLC = By.id("_idtipoidentificacioncliente");
    public static By IDENTIFICACION_INPUT = By.id("_identificacioncliente");
    public static By VERIFICAR_IDENT_BTN = By.xpath("(//button[normalize-space()='Verificar identificación'])[1]");
    public static By EMAIL_INPUT = By.id("_email");
    public static By EMAIL_CONFIR_INPUT = By.id("_emailconfirmacion");
    public static By DUPLICAR_DATOS_CLIENT_BTN = By.xpath("//div[@class=\"card fat\"]//button[text()='Duplicar datos del cliente']");
    public static By FECHA_EXPEDICION_INPUT = By.id("_fechaexpradicador");
    public static By GENERAR_RECIBO_BTN = By.xpath("//button[normalize-space()='Generar recibo']");
    public static By CONTINUAR_MODAL_BTN = By.xpath("//div[@class=\"modal-content\"]//button[@class=\"btn btn-success\"]");

    public static final Target LBL_CODIGO_BARRAS_CRUD = Target.the("Ver codigo de barras")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]"));

    public static final Target BTN_CERRAR_CRUD = Target.the("Ver codigo de barras")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_CAMARA_COMERCIO_CRUD = Target.the("Boton camara de comercio")
            .located(By.id("logo_camara"));
    //public static final Target BTN_ICONO_HOME = Target.the("Selecciona el botn HOME")
    //        .located(By.xpath("(//i[@class='fa fa-home small'])[1]"));

    public static By DESCARGAR_RECIBO_BTN = By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[5]/div/div/div/div/div/table/tbody/tr[3]/td[2]/a");

    public static final Target VAL_DESCARGA = Target.the("")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[5]/div/div/div/div/div/table/tbody/tr[3]/td[2]/a"));

    // --------- INCRIPCION PROPONENTE ------------ //

    public static final Target ESPERA_RESULTS = Target.the("").located(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]"));
    public static final Target ESPERA_MODAL = Target.the("").located(By.xpath("//div[@class=\"modal-dialog modal-lg\"]"));
    public static final Target ESPERA_MODAL_PE = Target.the("").located(By.xpath("(//div[@class=\"modal-content\"])[2]"));
    public static final Target ESPERA_MODAL_DOS = Target.the("").located(By.xpath("//div[@class=\"bootbox modal fade bootbox-alert show\"]//div[@class=\"modal-dialog modal-lg ui-draggable\"]//div[@class=\"modal-content ui-resizable\"]"));
    public static final Target ESPERA_MODAL_TRES = Target.the("").located(By.xpath("//div[@class=\"bootbox modal fade bootbox-alert show\"]//div[@class=\"modal-content\"]"));
    public static final Target ESPERA_SIGUIENTE_BLOQUE = Target.the("").located(By.xpath("//button[text()='Siguiente bloque']"));
    public static final Target ESPERA_BLOQUE_DOS = Target.the("").located(By.xpath("//a[@href=\"#step-2\"]"));
    public static final Target ESPERA_BLOQUE_CUATRO = Target.the("").located(By.xpath("//a[@href=\"#step-4\"]"));
    //public static final Target ESPERA_CARGAR_SOPORTE = Target.the("").located(By.xpath("(//table//a)[36]"));
    public static final Target ESPERA_CARGAR_SOPORTE = Target.the("").located(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/form/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[6]/div/div[2]/div[5]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[4]/div[2]/a"));
    public static final Target ESPERA_VALIDAR_SOPORTES = Target.the("").located(By.id("btnValidarSoportes"));
    public static final Target ESPERA_MODAL_FORM = Target.the("").located(By.xpath("//div[@class=\"bootbox modal fade bootbox-confirm show\"]//div[@class=\"modal-content\"]"));
    public static final Target ESPERA_BLOQUE_SEIS = Target.the("").located(By.xpath("//a[@href=\"#step-6\"]"));

    public static By MATRICULA_INPUT = By.id("matricula");
    public static By INSCRIPCION_PROPONENTE_BTN = By.xpath("//a[@data-original-title=\"Inscripción como proponente\"]");
    public static By CONTINUAR_IP_BTN = By.xpath("//*[@id=\"seleccionIdentificacion\"]/div[2]/button[2]");
    //public static By FORMULARIO_BTN = By.xpath("//a[text()='Formulario']");
    public static Target FORMULARIO_BTN = Target.the("Boton Formulario").
            located(By.xpath("//a[text()='Formulario']"));

    public static By TAMANO_EMPRESA_SLT = By.id("_rproGen_tamanoempresa");

    public static By RUT_PROPONENTE_BTN = By.xpath("(//table//a)[1]");

    public static By GRABAR_BTN = By.xpath("//a[@id=\"btnGrabarDatosBasicos\"]");
    public static By MODAL_OK_BTN = By.xpath("//div[@class='modal-footer']//button[text()='OK']");
    public static Target BTN_MODAL_OK = Target.the("Boton certificados Home").
            located(By.xpath("//div[@class='modal-footer']//button[text()='OK']"));
    public static By BLOQUE_DOS_BTN = By.xpath("//a[@href=\"#step-2\"]");
    public static By AUTORIZO_ENVIO_SLT = By.id("_rproGen_enviarnot");
    public static By GRABAR_UBICACION_BTN = By.xpath("//a[@id=\"btnGrabarUbicacion\"]");
    public static By BLOQUE_TRES_BTN = By.xpath("//a[@href=\"#step-3\"]");
    public static By FECHA_CORTE_INPUT = By.xpath("//input[@id=\"_rproGen_inffin1510_fechacorte\"]");
    public static By ACTIVO_CORRIENTE_INPUT = By.id("_rproGen_inffin1510_actcte");
    public static By PATROMONIO_NETO_INPUT = By.id("_rproGen_inffin1510_patnet");
    public static By INGRESOS_ACTIVIDAD_INPUT = By.id("_rproGen_inffin1510_ingope");
    public static By GRUPO_NIFF_SLT = By.id("_rproGen_inffin1510_gruponiif");
    public static By GRABAR_BLOQUETRES_BTN = By.id("btnGrabarIFP");

    public static By CONTABLE_LEY_BTN = By.xpath("(//table//a)[11]");

    public static By BLOQUE_CUATRO_BTN = By.xpath("//a[@href=\"#step-4\"]");
    public static By CLASIFICACIONES_F_INPUT = By.xpath("//div[@class=\"card w-100 mb-2 text-justify panelFormulario\"]//select[@id=\"clasif_\"]");
    public static By CLASIFICACIONES_INPUT = By.xpath("//input[@class=\"select2-search__field\"]");
    public static By GRABAR_BLOQUECUATRO_BTN = By.id("btnGrabarDatosBasicosContrato");
    public static By ENTER_CLICK_RESULT = By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]");
    public static By BLOQUE_CINCO_BTN = By.xpath("//a[@href=\"#step-5\"]");
    public static By BLOQUE_SEIS_BTN = By.xpath("//a[@href=\"#step-6\"]");
    public static By SIGUIENTE_BLOQUE = By.xpath("//button[text()='Siguiente bloque']");
    public static By ADICIONAR_CONTRATO_BTN = By.id("adicionarContrato");
    public static By CELEBRADO_SLT = By.id("celebradopor");
    public static By CONTRATANTE_INPUT = By.id("nombrecontratante");
    public static By FECHA_EJECUCION_INPUT = By.id("fecejecucion");
    public static By VALOR_PESOS_INPUT = By.id("valorpesos");
    public static By VALOR_INPUT = By.id("valor");
    public static By CAMPO_TXT = By.id("clasi1510texto");
    public static By GRABAR_FORM_BTN = By.xpath("(//a[@id='btnGrabarDatosBasicosContrato'])[2]");
    //public static By CARGAR_SOPORTE_BTN = By.xpath("(//table//a)[36]");
    public static By CARGAR_SOPORTE_BTN = By.xpath("//tbody/tr[1]/td[4]/div[2]/a[1]/i[1]");
    public static By NUMERO_DOCUMENTO_INPUT = By.id("_numdoc");
    public static By FECHA_DOCUMENTO_INPUT = By.id("_fechadoc");
    public static By ORIGEN_DOCUMENTO_INPUT = By.id("_origendoc");
    public static By CARGA_ARCHIVO_INPUT = By.id("userfile");
    public static By GRABAR_CARGA_BTN = By.id("guardarAnexo");
    public static By VALIDAR_FORMULARIO_BTN = By.id("btnValidarFormulario");
    public static By VALIDAR_FORMULARIO_DOS_BTN = By.id("btnValidarFormulario");
    public static By VALIDAR_SOPORTES_BTN = By.id("btnValidarSoportes");
    public static By IMPRIMIR_BORRADOR_BTN = By.xpath("//div[@class=\"card-footer text-right\"]//a[text()='Imprimir Borrador']");
    public static By MODAL_CERRAR_BTN = By.xpath("//div[@class=\"modal-footer\"]//button[text()='Cerrar']");
    public static By BTN_CERRAR_BTN = By.xpath("//button[text()='Cerrar']");
    public static By IMPRIMIR_FORMULARIO_FINAL_BTN = By.id("imprimirFormularioFinal");
    public static By MODAL_OK_DOS_BTN = By.xpath("(//button[normalize-space()='Si'])[1]");
    //public static By MODAL_OK_DOS_BTN = By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button");
    //public static By DESCARGAR_DOS_BTN = By.xpath("(//a)[3]");
    public static By BTN_SI_POPAD = By.xpath("//button[normalize-space()='Si']");
    public static By DESCARGAR_DOS_BTN = By.xpath("(//a[contains(text(),'Descargar')])[2]");
    public static By BODY = By.xpath("//div[@class=\"panel panel-default\"]");
    public static By SERVICIOS_FINAL_BTN = By.id("v-pills-home-tab");
    public static By SOPORTES_FINAL_BTN = By.id("soportesT");

    public static final Target VAL_RECIBO = Target.the("")
            .located(By.id("soportesT"));

    /*********  Apartir del mes 10 dia 30 el sistema no permite realizar renovaciones *************************/
    public static final Target VAL_MENSAJE_INACTIVIDAD = Target.the("")
            .located(By.xpath("//div[@class='form-group text-justify alert alert-warning p-3']"));


    // --------- RENOVACION PROPONENTE ------------ //

    public static By RENOVAR_REGISTRO_BTN = By.xpath("//a[@data-original-title=\"Renovar registro de proponentes\"]");
    public static By CONTINUAR_NUMERO_NIT_BTN = By.xpath("//div[@id=\"tab-panel0\"]//a");
    public static final Target BTN_CONTINUAR_NIT= Target.the("Boton continuar")
            .located(By.id("btnmostrarFormularioRenovacion"));
    public static By ACCIONES_RENOVACION_BTN = By.xpath("//div[@class=\"card-body collapse show\"]//a");
    public static By BLOQUE_SIETE_BTN = By.xpath("//a[@href=\"#step-7\"]");
    public static By FECHA_CORTE_BS_INPUT = By.id("_rproGen_inffin1510_fechacorte");
    //public static By GRABAR_BLOQUESIETE_BTN = By.id("btnGrabarIFP_2023");
    public static By GRABAR_BLOQUESIETE_BTN = By.id("btnGrabarIFP");
    //public static By CARGAR_SOPORTE_BS_BTN = By.xpath("/html/body/div[2]/main/div[2]/div[2]/div[1]/div/div/form/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[7]/div/div[2]/div[3]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/div/a");
    public static By CARGAR_SOPORTE_BS_BTN = By.xpath("(//a)[99]");
    public static By CARGAR_SOPORTE_BD_BTN = By.xpath("(//table//a)[1]");
    public static By CARGAR_SOPORTE_BSEIS_BTN = By.xpath("(//table//a)[11]");
    public static By MODAL_REPRESENTANTE_BTN = By.xpath("(//div[@class=\"modal-content ui-resizable\"]//a)[1]");
    public static By GENERAR_RECIBO_DOS_BTN = By.xpath("//button[normalize-space()='Generar recibo']");

    public static final Target BTN_CAMBIAR = Target.the("Boton cambiar").located(By.id("btnSeleccionIdentificacion"));

    public static final Target VAL_RECIBO_RENO = Target.the("")
            .located(By.xpath(""));

}
