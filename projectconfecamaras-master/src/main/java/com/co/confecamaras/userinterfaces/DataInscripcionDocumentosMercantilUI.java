package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DataInscripcionDocumentosMercantilUI extends PageObject {

    public static final Target SELECT_CONSULTA_POR_DIDM = Target.the("Seleccionar la consulta")
            .located(By.id("selectS"));

    public static final Target TXT_CRITERIO_DIDM = Target.the("Escribir el criterio")
            .located(By.id("criterio"));

    public static final Target BTN_CONTINUAR_DIDM = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target BTN_CONTINUAR_DOS_DIDM = Target.the("Boton continuar dos")
            .located(By.id("submit"));

    public static final Target BTN_CONTINUAR_TRES_DIDM = Target.the("Boton continuar dos")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target BTN_ACCIONES_DISPONIBLES_DIDM = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    public static final Target BTN_OPCIONES_MERCANTIL_ESADL_DIDM = Target.the("Boton opciones mercantil esadl")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_INSCRIPCION_DOCUMENTOS_DIDM = Target.the("Boton inscripcion documentos")
            .located(By.xpath("//a[@data-original-title='Inscripciones de documentos']"));

    public static final Target BTN_SELECCION_TRANSACCION_DIDM = Target.the("Boton seleccion transaccion a incluir")
            //.located(By.xpath("//a[text()='Seleccione una transacción a incluir']"));
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/div/div[2]/div/div/div/a/button"));

    public static final Target SELECT_FILTRAR_DIDM = Target.the("Seleccionar filtrar")
            .located(By.id("_filtrotransacciones"));

    public static final Target BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM = Target.the("Boton aceptacion representante legal")
            .located(By.xpath("//a[contains(text(),'ACEPTACION REPRESENTANTE LEGAL   - COMERCIALES (09.005)')]"));
    public static final Target BTN_ACEPTACION_REPRESENTANTE_LEGAL_DIDM_ESADL = Target.the("Boton aceptacion representante legal")
            .located(By.xpath("(//a[contains(text(),'NOMBRAMIENTOS - REPRESENTANTE LEGAL')])[1]"));

    public static final Target SELECT_TIPO_DIDM = Target.the("Seleccionar tipo")
            .located(By.id("_tipodoc"));
    public static final Target SELECT_NUMERO_DIDM = Target.the("cuadro de texto Numero")
            .located(By.id("_numdoc"));

    public static final Target TXT_ORIGEN_DOCUMENTO_DIDM = Target.the("Escribir el origen del documento")
            .located(By.id("_origendoc"));

    public static final Target SELECT_VINCULO_DIDM = Target.the("Seleccionar vinculo")
            .located(By.id("_idvinculo"));

    public static final Target TXT_PRIMER_APELLIDO_DIDM = Target.the("Escribir el primer apellido")
            .located(By.id("_ape1"));

    public static final Target TXT_SEGUNDO_APELLIDO_DIDM = Target.the("Escribir el segundo apellido")
            .located(By.id("_ape2"));

    public static final Target TXT_PRIMER_NOMBRE_DIDM = Target.the("Escribir el primer nombre")
            .located(By.id("_nom1"));

    public static final Target TXT_OTRO_NOMBRE_DIDM = Target.the("Escribir otro nombre")
            .located(By.id("_nom2"));

    public static final Target SELECT_RENGLON_DIDM = Target.the("Seleccionar renglon")
            .located(By.id("_idrenglon"));

    public static final Target SELECT_ACEPTACION_DIDM = Target.the("Seleccionar aceptacion")
            .located(By.id("_aceptacion"));

    public static final Target BTN_RECIBIR_PAGO_DIDM = Target.the("Boton recibir pago")
            .located(By.xpath("//button[text()='Recibir pago']"));

    public static final Target BTN_FACTURAR_CLIENTE_FINAL_GENERICO_DIDM = Target.the("Boton facturar cliente final generico")
            .located(By.xpath("//button[text()='Facturar a cliente final genérico']"));

    public static final Target BTN_DUPLICAR_DATOS_CLIENTE_DIDM = Target.the("Boton duplicar datos del cliente")
            .located(By.xpath("//button[text()='Duplicar datos del cliente']"));

    public static final Target TXT_FECHA_EXPEDICION_DIDM = Target.the("Escribir fecha de expedicion")
            .located(By.id("_fechaexpradicador"));

    public static final Target TXT_EMAIL_DIDM = Target.the("Escribir email")
            .located(By.id("_emailradicador"));

    public static final Target TXT_TELEFONO_FIJO_DIDM = Target.the("Escribir telefono fijo")
            .located(By.id("_telefonoradicador"));

    public static final Target TXT_NRO_CELULAR_DIDM = Target.the("Escribir numero celular")
            .located(By.id("_celularradicador"));

    public static final Target BTN_GENERAR_RECIBO_DIDM = Target.the("Boton generar recibo")
            .located(By.xpath("//button[text()='Generar recibo']"));

    public static final Target LBL_CODIGO_BARRAS_DIDM = Target.the("Codigo de barras")
            //.located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[2]/div/div/div/div/div/table/tbody/tr[2]"));
            .located(By.xpath("/html/body/div[2]/div/center/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]"));
    public static final Target BTN_CERRAR_DIDM = Target.the("Boton cerrar")
            .located(By.xpath("(//button[contains(text(), 'Cerrar')])[1]"));

    public static final Target TXT_CODIGO_BARRAS_DIDM = Target.the("Cuadro de texto codigo de barras")
            .located(By.id("codigobarrasinicial"));

    public static final Target BTN_SIGUIENTE_DIDM = Target.the("Boton continuar  Seguro de finalizar el escaneo y la digitalización del codigo de barras")
            .located(By.xpath("//button[normalize-space()='Continuar']"));

    public static final Target BTN_FINALIZAR_ESCANEO_DIDM = Target.the("Boton finalizar escaneo")
            //.located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[25]/a"));
    .located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[2]/div[2]/table/tbody/tr[1]/td[10]/p/small/a[4]"));

    public static final Target SELECT_USUARIO_DIDM = Target.the("Seleccionar usuario")
            .located(By.id("_usuarioX"));

    public static final Target BTN_ASIGNAR_DIDM = Target.the("Boton asignar")
            //.located(By.xpath("//input[@onmouseover=\"Tip('Asignar usuario')\"]"));
            .located(By.id("submit"));

    public static final Target LBL_PROCESO_FINALIZADO_DIDM = Target.the("Proceso finalizado")
            .located(By.xpath("//*[text()='Proceso Finalizado: Escaneo']"));
}