package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpcionMisTramitesUsuarioCajeroUI extends PageObject {

    /*----------Boton continuar----------*/

    public static final Target BTN_CONTINUAR_MIS_TRAMITES = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), 'Continuar')]"));

    public static final Target BTN_CONTINUAR_DOS_MIS_TRAMITES = Target.the("Boton continuar dos")
            .located(By.id("submit"));

    /*-----------------------------------*/

    public static final Target SELECT_CONSULTA_POR_MIS_TRAMITES = Target.the("Seleccionar el tipo de consulta")
            .located(By.id("selectS"));

    public static final Target TXT_INGRESAR_INFORMACION_MIS_TRAMITES = Target.the("Escribir el proponente")
            .located(By.id("criterio"));

    public static final Target BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    /*public static final Target BTN_OPERACIONES_MERCANTIL_MIS_TRAMITES = Target.the("Boton operaciones mercantil")
            .located(By.xpath("//*[text()='Operaciones Mercantil/ESADL']"));*/
    public static final Target BTN_OPERACIONES_MERCANTIL_MIS_TRAMITES = Target.the("Boton operaciones mercantil")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_INSCRIPCION_DOCUMENTOS_MIS_TRAMITES = Target.the("Boton inscripcion de documentos")
            .located(By.xpath("//span[text()='Inscripciones de documentos']"));

    public static final Target BTN_SELECCIONE_TRANSACCION_INCLUIR_MIS_TRAMITES = Target.the("Boton selecciones una transaccion a incluir")
            //.located(By.xpath("//a[text()='Seleccione una transacción a incluir']"));
            //.located(By.cssSelector("div[class='btn-group'] button[type='button']"));
    .located(By.id("_filtrotransacciones"));

    public static final Target SELECT_FILTRAR_MIS_TRAMITES = Target.the("Seleccionar filtrar")
            .located(By.id("_filtrotransacciones"));

    public static final Target BTN_AUMENTO_CAPITAL_SUSCRITO_MIS_TRAMITES = Target.the("Boton aumento de capital suscrito")
            .located(By.xpath("//a[text()='AUMENTO DE CAPITAL SUSCRITO (05.502)']"));

    public static final Target SELECT_TIPO_MIS_TRAMITES = Target.the("Seleccionar tipo")
            .located(By.id("_tipodoc"));

    public static final Target TXT_NUMERO_MIS_TRAMITES = Target.the("Escribir el numero")
            .located(By.id("_numdoc"));

    public static final Target TXT_ORIGEN_DOCUMENTO_MIS_TRAMITES = Target.the("Escribir el origen del documento")
            .located(By.id("_origendoc"));

    public static final Target TXT_CAPITAL_SUSCRITO_MIS_TRAMITES = Target.the("Escribir capital suscrito")
            .located(By.id("_capitalsuscrito"));

    public static final Target BTN_RECIBIR_PAGO_MIS_TRAMITES = Target.the("Boton recibir pago")
            .located(By.xpath("//button[contains(text(), 'Recibir pago')]"));

    public static final Target SELECT_TIPO_IDENTIFICACION_MIS_TRAMITES = Target.the("Seleccionar tipo identificacion")
            .located(By.id("_idtipoidentificacioncliente"));

    public static final Target TXT_IDENTIFICACION_MIS_TRAMITES = Target.the("Escribir identificacion")
            .located(By.id("_identificacioncliente"));

    public static final Target BTN_VERIFICAR_IDENTIFICACION_MIS_TRAMITES = Target.the("Boton verificar identificacion")
            .located(By.xpath("//button[contains(text(), 'Verificar identificación')]"));

    public static final Target TXT_EMAIL_CONFIRMACION_MIS_TRAMITES = Target.the("Escribir email confirmacion")
            .located(By.id("_emailconfirmacion"));

    public static final Target BTN_DUPLICAR_DATOS_CLIENTES_MIS_TRAMITES = Target.the("Boton duplicar datos cliente")
            .located(By.xpath("//button[contains(text(), 'Duplicar datos del cliente')]"));

    public static final Target TXT_FECHA_EXPEDICION_MIS_TRAMITES = Target.the("Escribir fecha expedicion")
            .located(By.id("_fechaexpradicador"));

    public static final Target BTN_GENERAR_RECIBO_MIS_TRAMITES = Target.the("Boton generar recibo")
            .located(By.xpath("//button[contains(text(), 'Generar recibo')]"));

    /*public static final Target BTN_CERRAR_MIS_TRAMITES = Target.the("Boton cerrar")
            .located(By.xpath("(//button[text()='Cerrar'])[1]"));*/
    public static final Target BTN_CERRAR_MIS_TRAMITES = Target.the("Boton cerrar")
            .located(By.xpath("//div[@class='modal-body']//button[1]"));

    public static final Target BTN_HOME_MIS_TRAMITES = Target.the("Boton home")
            //.located(By.id("accionHome"));
            .located(By.xpath("//*[@id=\"accionHome\"]/div/ul/li[1]/a/span/i"));

    public static final Target BTN_BUSCAR_MIS_TRAMITES = Target.the("Boton buscar")
            .located(By.xpath("//a[@class=\"btn btn-sm btn-primary py-0\"]"));

    public static final Target BTN_VER_RUTA_DOCUMENTO_MIS_TRAMITES = Target.the("Boton ver ruta del documento")
            //.located(By.xpath("//span[text()='Ver ruta del documento']"));
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div/ul/li[1]/div[2]/div/div/div[3]/div/div[2]/div/div[1]/a"));

    public static final Target LBL_CONSULTA_RUTA_DOCUMENTOS_MIS_TRAMITES = Target.the("Mensaje consulta ruta de documentos")
            .located(By.xpath("//*[contains(text(), ' Consulta ruta de documentos')]"));

    public static final Target BTN_FINALIZAR_DIGITALIZACION_MIS_TRAMITES = Target.the("Boton finalizar digitalizacion")
            //.located(By.xpath("//span[text()='Finalizar digitalización y enrutar']"));
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div/ul/li[1]/div[2]/div/div/div[3]/div/div[2]/div/div[2]/a"));

    public static final Target SELECT_USUARIO_MIS_TRAMITES = Target.the("Seleccionar usuario")
            .located(By.xpath("(//span[@id='select2-usuarioX-container'])[1]"));

    public static final Target SELECT_USUARIO_MIS_TRAMITES2 = Target.the("Seleccionar usuario")
            .located(By.xpath("//input[@role='textbox']"));

    public static final Target BTN_ASIGNAR_USUARIO_MIS_TRAMITES = Target.the("Boton asignar usuario")
            .located(By.xpath("//*[text()='Asignar usuario']"));

    public static final Target LBL_PROCESO_FINALIZADO_MIS_TRAMITES = Target.the("Mensaje proceso finalizado")
            .located(By.xpath("//div[text()='Proceso Finalizado: ']"));

    public static final Target BTN_OK_MIS_TRAMITES = Target.the("Boton asignar usuario")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target LBL_OPCION_MIS_TRAMITES_USUARIO_CAJERO = Target.the("Mensaje final opcion mis tramites usuario cajero")
            .located(By.xpath("//*[contains(text(), 'Proceso Finalizado: ')]"));
    //public static final Target LBL_OPCION_MIS_TRAMITES_USUARIO_CAJERO = Target.the("Mensaje final opcion mis tramites usuario cajero")
    //            .located(By.xpath("//*[contains(text(), ' No existen trámites pendientes')]"));
}