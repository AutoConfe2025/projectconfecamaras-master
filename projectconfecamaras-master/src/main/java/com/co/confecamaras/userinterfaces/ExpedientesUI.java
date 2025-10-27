package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExpedientesUI extends PageObject {

    public static final Target SELECT_CONSULTA_POR_EXPEDIENTES = Target.the("Seleccionar el tipo de consulta")
            .located(By.id("selectS"));

    public static final Target TXT_INGRESAR_INFORMACION_EXPEDIENTES = Target.the("Escribir el proponente")
            .located(By.id("criterio"));

    public static final Target BTN_CONTINUAR_EXPEDIENTES = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), 'Continuar')]"));

    public static final Target BTN_RECUPERAR_EXPEDIENTES = Target.the("Boton recuperar expediente")
            .located(By.xpath("(//button[@type='submit'])[2]"));

    //@IsaacGomez - El boton se encuentra cumple una funcion similar a BTN_RECUPERAR_EXPEDIENTES
    public static final Target BTN_CONTINUAR_RECUPERAR_EXPEDIENTES = Target.the("Boton continuar expediente")
            .located(By.xpath("//a[contains(text(),'Continuar')]"));

    public static final Target BTN_ACCIONES_DISPONIBLES_EXPEDIENTES = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    public static final Target BTN_OPERACIONES_MERCANTIL_EXPEDIENTES = Target.the("Boton operaciones mercantil")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_OPERACIONES_PROPONENTES_EXPEDIENTES = Target.the("Boton operaciones proponentes")
            .located(By.xpath("//*[text()='Trámites del Registro de Proponente']"));

    public static final Target BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES = Target.the("Boton actualizacion datos mutacion")
            .located(By.xpath("//a[@data-original-title=\"Actualización de datos (mutación)\"]"));

    public static final Target BTN_RADICAR_DOCUMENTOS_SIN_COSTO_EXPEDIENTES = Target.the("Boton radicar documentos sin costo")
            .located(By.xpath("//a[@data-original-title=\"Radicar documentos sin costo\"]"));

    public static final  Target BTN_ACEPTAR_ALERTA_IMPORTANTE = Target.the("Boton aceptar realizar la actualización de datos (mutación) de establecimientos de comercios").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));

    public static final Target BTN_ACTUALIZACION_REGISTRO_PROPONENTES_EXPEDIENTES = Target.the("Boton actualizacion registro proponentes")
            .located(By.xpath("//a[@data-original-title=\"Actualizar registro de proponentes\"]"));

    //@IsaacGomez nuevo localizador
    public static final Target BTN_INSCRIPCION_PROPONENTE_EXPEDIENTES = Target.the("Boton inscripcion proponentes")
            .located(By.xpath("//a/following::span[text()='Inscripción como proponente']"));


    //@IsaacGomez se cambia el xpath para sea general
    public static final Target BTN_RECUPERAR_TRAMITE = Target.the("Boton recuperar tramite registro proponentes")
            .located(By.xpath("//a[text()='Retomar trámite']"));

    //@IsaacGomez - se modifica el tipo de localizador
    public static final Target TXT_CODIGO_RECUPERACION = Target.the("Cuadro de texto codigo recuperacion")
            .located(By.xpath("//input[@placeholder='código recuperación']"));

    //@IsaacGomez - se crea el tipo de localizador
    public static final Target TXT_CODIGO_RECUPERACION_INSCRIPCION = Target.the("Cuadro de texto codigo recuperacion")
            .located(By.xpath("//input[@placeholder='Número Recuperación']"));

    public static final Target CHK_DATOS_MODIFICAR_EXPEDIENTES = Target.the("Escribir los datos a modificar")
            .located(By.xpath("//label[@class=\"form-check-label\"]"));

    public static final Target CHK_DATOS_MODIFICAR_EXPEDIENTES_UBICACION_COMERCIAL = Target.the("Escribir los datos a modificar")
            .located(By.xpath("(//input[@value='2'])[1]"));

    public static final  Target BTN_ACEPTAR_ALERTA_MUTACION = Target.the("Boton aceptar realizar la actualización de datos (mutación) de establecimientos de comercios").
            located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));

    public static final Target BTN_CONTINUAR_DOS_EXPEDIENTES = Target.the("Boton continuar dos")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target TXT_DIRECCION_EXPEDIENTES = Target.the("Escribir la direccion")
            .located(By.id("dircom"));

    public static final Target TXT_TELEFONO_EXPEDIENTES = Target.the("Escribir el telefono")
            .located(By.id("telcom2"));

    public static final Target BTN_CONTINUAR_TRES_EXPEDIENTES = Target.the("Boton continuar tres")
            .located(By.xpath("//a[text()='Continuar']"));

    public static final Target BTN_VER_SOPORTE_EXPEDIENTES = Target.the("Boton ver soporte")
            .located(By.id("btnSoporte"));

    public static final Target BTN_CERRAR_EXPEDIENTES = Target.the("Boton cerrar")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));
    //public static final Target BTN_CERRAR_EXPEDIENTES = Target.the("Boton cerrar")
    //            .located(By.xpath("//button[text()='Cerrar']"));


    public static final Target BTN_RECIBIR_PAGO_EXPEDIENTES = Target.the("Boton recibir pago")
            .located(By.id("btnRpago"));

    public static final Target BTN_INICIAR_TRAMITE_EXPEDIENTES = Target.the("Boton iniciar tramite")
            .located(By.xpath("//a[@data-original-title=\"Iniciar trámite\"]"));

    public static final Target BTN_FORMULARIO_EXPEDIENTES = Target.the("Boton formulario")
            .located(By.xpath("//a[@data-original-title=\"Grabar formulario.\"]"));

    public static final Target ESPERA_BARRA = Target.the("Espera barra")
            .located(By.id("modalLoader"));

    //@IsaacGomez - Se modifica identificador experiencia para que se use en general
    public static final Target BTN_BLOQUE_EXPEDIENTES = Target.the("Boton bloque nueve")
            .located(By.xpath("//small[text()='Experiencia']"));

    //@IsaacGomez - localizador de tabla cargue inscripiones
    public static final Target TABLA_EXPERIENCIA3 = Target.the("Tabla experiencia")
            .locatedBy("(//div[@class='dataTables_scrollBody'])[3]//tbody/tr");

    //@IsaacGomez - Localizador de tabla de cargue
    public static final Target TABLA_EXPERIENCIA4 = Target.the("Tabla experiencia")
            .locatedBy("(//div[@class='dataTables_scrollBody'])[4]//tbody/tr");


    public static final Target BTN_CARGAR_SOPORTE_1 = Target.the("Tabla experiencia")
            .locatedBy("(//div[@class='dataTables_scrollBody'])[{0}]//tbody/tr[{1}]//div[2]//i[contains(@class,'fa-upload')]");
    //.locatedBy("(//div[@class=\"dataTables_scrollBody\"])[4]//tbody//div[2]//i[contains(@class,'fa-upload')]");

    public static final Target BTN_CARGAR_SOPORTE_2 = Target.the("Tabla experiencia")
            .locatedBy("(//div[@class='dataTables_scrollBody'])[{0}]//tbody/tr[{1}]//div[3]//i[contains(@class,'fa-upload')]");

    public static final Target BTN_ANADIR_CONTRATO_EXPEDIENTES = Target.the("Boton añadir cotrato")
            .located(By.id("adicionarContrato"));

    public static final Target SELECT_CELEBRADO_EXPEDIENTES = Target.the("Seleccionar celebrado por")
            .located(By.id("celebradopor"));

    public static final Target TXT_NOMBRE_CONTRATANTE_EXPEDIENTES = Target.the("Escribir el nombre del contratante")
            .located(By.id("nombrecontratante"));

    public static final Target TXT_FECHA_EJECUCION_EXPEDIENTES = Target.the("Escribir la fecha de ejecucion")
            .located(By.id("fecejecucion"));

    public static final Target TXT_VALOR_PESOS_EXPEDIENTES = Target.the("Escribir el valor en pesos")
            .located(By.id("valorpesos"));

    public static final Target TXT_CLASIFICACION_EXPEDIENTES = Target.the("Escribir la clasificacion")
            .located(By.id("clasi1510texto"));

    public static final Target BTN_GRABAR_EXPEDIENTES = Target.the("Boton añadir cotrato")
            .located(By.xpath("(//*[text()='Grabar'])[5]"));

    public static final Target ESPERA_MODAL_EXPEDIENTES = Target.the("Espera modal")
            .located(By.xpath("//div[@class=\"bootbox modal fade bootbox-alert show\"]//div[@class=\"modal-content\"]"));

    public static final Target BTN_OK_EXPEDIENTES = Target.the("Boton añadir cotrato")
            .located(By.xpath("//*[contains(text(), 'OK')]"));

    public static final Target BTN_CARGAR_SOPORTE_EXPEDIENTES = Target.the("Boton cargar soporte")
            .located(By.xpath("((//table)[8]//a[@data-original-title=\"Cargar soporte\"])[65]"));

    public static final Target TXT_IDENTIFICACION_ANEXO_EXPEDIENTES = Target.the("Escribir la identificacion del anexo")
            .located(By.id("_identificacion"));

    public static final Target TXT_NUMERO_IDENTIFICACION_EXPEDIENTES = Target.the("Escribir la identificacion del anexo")
            .located(By.id("_numdoc"));

    public static final Target TXT_FECHA_DOCUMENTO_EXPEDIENTES = Target.the("Escribir la fecha del documento")
            .located(By.id("_fechadoc"));

    public static final Target TXT_ORIGEN_DOCUMENTO_EXPEDIENTES = Target.the("Escribir el origen del documento")
            .located(By.id("_origendoc"));

    public static final Target BTN_SUBIR_ARCHIVO_EXPEDIENTES = Target.the("Boton subir archivo")
            .located(By.id("userfile"));

    public static final Target BTN_GRABAR_DOS_EXPEDIENTES = Target.the("Boton grabar dos")
            .located(By.id("guardarAnexo"));

    public static final Target BTN_VALIDAR_FORMULARIO_EXPEDIENTES = Target.the("Boton validar formulario")
            .located(By.id("btnValidarFormulario"));

    public static final Target BTN_VALIDAR_SOPORTES_EXPEDIENTES = Target.the("Boton validar soportes")
            .located(By.id("btnValidarSoportes"));

    public static final Target BTN_IMPRIMIR_BORRADOR_EXPEDIENTES = Target.the("Boton imprimir borrador")
            .located(By.xpath("//*[text()='Imprimir Borrador']"));

    public static final Target BTN_REPRESENTANTE_LEGAL_EXPEDIENTES = Target.the("Boton representante legal")
            .located(By.xpath("(//*[text()='OSSA ZULUAGA JOSE ORLANDO'])[2]"));

    public static final Target ESPERA_MODAL_DOS_EXPEDIENTES = Target.the("Espera modal dos")
            .located(By.xpath("//div[@class=\"modal-content ui-resizable\"]"));

    public static final Target BTN_IMPRIMIR_FORMULARIO_FINAL_EXPEDIENTES = Target.the("Boton representante legal")
            .located(By.id("imprimirFormularioFinal"));

    public static final Target ESPERA_MODAL_TRES_EXPEDIENTES = Target.the("Espera modal tres")
            .located(By.xpath("/html/body/div[4]/div/div"));

    public static final Target BTN_SI_EXPEDIENTES = Target.the("Boton si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_RECIBIR_PAGO_DOS_EXPEDIENTES = Target.the("Boton recibir pago")
            .located(By.id("RecibirPago"));
}