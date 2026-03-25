package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TransaccionesRUESPage {
    public static Target SLC_ESTADOS = Target.the("seleccionar estados").locatedBy("#_filtro");
    public static Target SLC_TIPO_OPERACION = Target.the("seleccionar operacion").locatedBy("#_tipo");
    public static Target INP_FECHA_INICIO = Target.the("fecha inicial").locatedBy("#_fecha");
    public static Target TABLE_RESULTADOS = Target.the("tabla resultados").locatedBy("//*[@class='obj']//tr[2]");

    // PROPIEDADES DE VENTANA
    public static Target BTN_CERRAR_POPUP = Target.the("cerrar popup").locatedBy("//span[text()='Cerrar']");

    // CONSULTA DE RUTA NACIONAL
    // NOTA PARA LLEGAR A ESTE LOCALIZADOR HAY QUE ENTRAR PRIMERO A UN FRAME Y LUEGO A OTRO

    public static Target CAMPO_FECHA_RUES = Target.the("campo fecha para ingresar rues").
            locatedBy("//input[@id='_fecha']");


    public static Target TXT_NUMERO_UNICO = Target.the("numero unico de consulta").
            locatedBy("//strong[text()='numero_unico_consulta:']/../following-sibling::td");

    // CARGAR IMAGENES
    public static Target FORM_CARGAR_ARCHIVO = Target.the("subir archivo").
            locatedBy("//span[text()='Mueva aqui el archivo que desea cargar']");

    public static Target BTN_SOBRE = Target.the("transladar en sobre").
            locatedBy("//a[contains(text(),'sobre')]");

    public static Target BTN_ZIP = Target.the("transladar en zip").locatedBy("//a[contains(text(),'zip')]");
    public static Target BTN_VOLVER = Target.the("volver a la pantalla principal").locatedBy("//a[contains(text(),'Retornar relación')]");
    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar en Modal SWAL2")
            .located(By.xpath("//button[contains(@class, 'swal2-confirm') and text()='Continuar']"));

    public static final Target BTN_CONSULTAR = Target.the("Botón Consultar")
            .locatedBy("//button[contains(@class, 'btn-primary') and text()=' Consultar']");
    public static final Target BTN_OPCIONES_PRIMER_RESULTADO =
            Target.the("Botón de opciones/acciones del primer resultado")
                    .locatedBy("/html/body/center/div[2]/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/center/table[7]/tbody/tr/td/div/div[2]/table/tbody/tr[2]/td[14]/a[2]");

    public static final Target OPCION_RUTA_NACIONAL =
            Target.the("Opción 'Consultar Ruta Nacional'")
                    .locatedBy("/html/body/center/div[2]/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/center/table[7]/tbody/tr/td/div/div[2]/table/tbody/tr[2]/td[14]/a[1]");

    public static final Target OPCION_SINCRONIZAR_ESTADOS =
            Target.the("Opción 'Sincronizar estados con RUES'")
                    .locatedBy("//*[@aria-label='Sincronizar estados con RUES']");

    public static final Target OPCION_SOLICITAR_CAMBIO_ESTADO =
            Target.the("Opción 'Solicitar cambio de estado'")
                    .locatedBy("/html/body/center/div[2]/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/center/table[7]/tbody/tr/td/div/div[2]/table/tbody/tr[2]/td[14]/a[3]");

    public static final Target BOTON_VOLVER_A_BANDEJA =
            Target.the("volver a bandeja")
                    .locatedBy("//a[contains(text(),'Regresar a la bandeja')]");

    public static final Target OPCION_CARGAR_IMAGENES =
            Target.the("Opción 'Cargar imagenes del trámite (15)'")
                    .locatedBy("//*[@aria-label='Cargar imagenes del trámite (15)']");

    public static final Target OPCION_VISOR_IMAGENES =
            Target.the("Opción 'Vísor de imágenes'")
                    .locatedBy("/html/body/center/div[2]/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/center/table[7]/tbody/tr/td/div/div[2]/table/tbody/tr[2]/td[14]/a[4]");
    public static final Target BTN_CERRAR_MODAL =
            Target.the("Botón Cerrar Modal dentro de Dialogo")
                    .locatedBy("//div[@role='dialog']//button[@data-pc-section='closebutton']");

    public static final Target BOTON_NUEVA_CONSULTA = Target.the("Boton Nueva Consulta")
            .located(By.xpath("//*[contains(@id, '_content')]//button[contains(text(), 'Nueva Consulta')]"));
    // CAMBIAR ESTADO

    // ACTUALIZAR ESTADO

    // DESCARGAR IMAGENES
    public static Target TXT_IMAGENES_ENCONTRADAS = Target.the("informa si hay imagenes").locatedBy("//center[contains(text(),'No obtienen imágenes')]");

    public static Target LINK_VOLVER = Target.the("volver a la pantalla principal").locatedBy("//a[text()='Retornar a la bandeja de trámites RUES']");
}
