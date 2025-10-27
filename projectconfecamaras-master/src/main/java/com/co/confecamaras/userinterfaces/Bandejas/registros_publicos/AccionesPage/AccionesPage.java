package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AccionesPage {

    // PARA BUSCAR ALGUN TIPO DE INFORMACION
    public static final Target INPUT_BUSCAR = Target.the("buscar reingresados").locatedBy("//input[@type='search']");

    public static Target LINK_ACCION = Target.the("ingresar a la acción").
            locatedBy("//*[@data-original-title='{0}']");

    public static Target LINK_ACCION_1 = Target.the("ingresar a la acción").
            located(By.xpath("(//*[name()='svg'][@role='img'])[3]"));

    public static Target LINK_ACCION_2 = Target.the("ingresar a la acción").
            locatedBy("//*[@data-original-title='Ver XML']");

    public static Target TXT_FECHA_INICIAL = Target.the("ingresar a la acción").
            located(By.id("fechainicial"));

    public static Target LINK_ACCION_DOS = Target.the("Seleccionar el Boton archivar").
            //located(By.xpath("//*[@id=\"tablecb\"]/tbody/tr/td[10]/p/small/a[5]"));
            located(By.xpath("/html/body/div[2]/div/div/div[8]/div/div/center/div/div/div[3]/div[2]/table/tbody/tr/td[10]/p/small/a[4]"));

    public static Target BTN_ARCHIVAR = Target.the("Seleccionar el Boton archivar").
                    located(By.xpath("/html/body/div[2]/div/div/div[7]/div/div/center/div[2]/div/div[3]/div[2]/table/tbody/tr/td[8]/p/small/a[5]"));

    public static Target BTN_FINALIZAR_ESTUDIO = Target.the("Boton finalizart estudio").
            located(By.xpath("//*[@id=\"tablecb\"]/tbody/tr/td[10]/p/small/a[6]"));

    public static Target BTN_ARCHIVAR_TRAMITE = Target.the("Boton finalizart estudio").
            located(By.xpath("//*[@id=\"tablecb\"]/tbody/tr/td[10]/p/small/a[7]"));

    public static final Target TITULO_VER_RUTA = Target.the("titulo de consulta").
            locatedBy("//p[contains(text(),'Consulta código de barras')]");

    // VER RUTA
    public static final Target TABLA_ANEXOS = Target.the("tramites anexos").locatedBy("//strong[text()='Anexos al trámite']/following::div[1]//p[1]/a");
    public static final Target TABLA_ANEXOS_RESULTADOS = Target.the("tramites anexos").locatedBy("//strong[text()='Anexos al trámite']/following::div[1]//p[{0}]/a");

    // VER COMENTARIO
    public static final Target COMENTARIOS_ALMACENADOS = Target.the("comentarios almacenados").locatedBy("//*[@id='page-top']/div[2]//div[2]/div");

    // ADICIONAR COMENTARIO
    public static final Target TITULO_ADICIONAR_COMS = Target.the("titulo adicionar comentario").locatedBy("//p[contains(text(),'Adición de comentarios')]");
    public static final Target SLC_TIPO_COMENTARIO = Target.the("seleccionar opcion de comentario").locatedBy("#_tipo");
    public static final Target TEXTAREA_COMENTARIO = Target.the("ingresar comentario").locatedBy("#_comentario");
    public static final Target BTN_GRABAR_COMENTARIO = Target.the("guardar comentario").locatedBy("//button[text()='Grabar']");
    public static final Target MSG_MENSAJEALMACENADO = Target.the("comentario guardado").locatedBy("//p[text()='Comentario almacenado']");

    // ESCANEAR
    public static final Target TITULO_ESCANEAR = Target.the("titulo escanear").locatedBy("//p[contains(text(),'Criterios')]");
    public static final Target TABLA_OBSERVACIONES = Target.the("tabla escanear").locatedBy("//table[@id='tableanx']/tbody/tr/td[1]");

    //FINALIZAR ESCANEO Y DIGITALIZACION
    public static final Target MSG_POPUP = Target.the("popup finalizar").locatedBy("//*[@id='page-top']/div[8]");
    public static final Target MSG_POPUP_PUBLICAR = Target.the("popup publicar").locatedBy("//div[@class='bootbox-body']");
    public static final Target MSG_POPUP_FINALIZAR = Target.the("texto de finalizacion").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_CERRAR_POPUP = Target.the("cerrar alerta").locatedBy("(//button[text()='×'])[3]");
    public static final Target BTN_CANCELAR_F = Target.the("cancelar la accion").locatedBy("//button[text()='Cancelar']");
    public static final Target BTN_CONTINUAR_F = Target.the("continuar la accion").locatedBy("//button[text()='Continuar']");

    // CONSULTA DE RUTA NACIONAL
    public static Target LINK_CONSULTA_RUTA_NACIONAL = Target.the("consulta ruta nacional").
            locatedBy("//tr[2]/td/a[contains(@onmouseover,'Consulta ruta nacional')]");

    // CARGAR IMAGENES
    public static Target LINK_CARGAR_IMAGENES = Target.the("cargar imagenes").
            locatedBy("//tr[2]/td/a[contains(@onmouseover,'Cargar imágenes del trámite')]");

    // CAMBIAR ESTADO
    public static Target LINK_CAMBIAR_ESTADO = Target.the("cambiar estado").
            locatedBy("//tr[2]/td/a[contains(@onmouseover,'Cambiar estado de la transacción')]");

    // ACTUALIZAR ESTADO
    public static Target LINK_ACTUALIZAR_ESTADOS = Target.the("actualizar estados").
            locatedBy("//a[normalize-space()='Enviar Estado']");

    // DESCARGAR IMAGENES
    public static Target LINK_DESCARGAR_IMAGEN = Target.the("descargar imagen").locatedBy("//tr[2]/td/a[contains(@onmouseover,'Descargar imágenes del trámite')]");

    // REGRESAR A LA BANDEJA
    public static Target LINK_REGRESAR_BANDEJA = Target.the("regresara a la bandeja").locatedBy("//*[text()='Regresar a la bandeja']");

    public static Target LINK_VOLVER_BANDEJA = Target.the("volver a la bandeja").locatedBy("//*[contains(text(),'Volver')]");

    // PROCESO FINALIZADO
    public static Target TXT_FINALIZADO = Target.the("texto de proceso finalizado").locatedBy("//form/p");

    // ALERTAS
    public static Target TXT_ALERT = Target.the("texto de alerta").locatedBy(".bootbox-body");
    public static Target BTN_OK = Target.the("aceptar alerta").locatedBy("//*[text()='OK']");


}
