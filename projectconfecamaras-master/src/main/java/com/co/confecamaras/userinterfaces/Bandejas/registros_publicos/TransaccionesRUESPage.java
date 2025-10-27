package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

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
    public static Target TXT_NUMERO_UNICO = Target.the("numero unico de consulta").
            locatedBy("//strong[text()='numero_unico_consulta:']/../following-sibling::td");

    // CARGAR IMAGENES
    public static Target FORM_CARGAR_ARCHIVO = Target.the("subir archivo").
            locatedBy("//span[text()='Mueva aqui el archivo que desea cargar']");

    public static Target BTN_SOBRE = Target.the("transladar en sobre").
            locatedBy("//a[contains(text(),'sobre')]");

    public static Target BTN_ZIP = Target.the("transladar en zip").locatedBy("//a[contains(text(),'zip')]");
    public static Target BTN_VOLVER = Target.the("volver a la pantalla principal").locatedBy("//a[contains(text(),'Retornar relación')]");

    // CAMBIAR ESTADO

    // ACTUALIZAR ESTADO

    // DESCARGAR IMAGENES
    public static Target TXT_IMAGENES_ENCONTRADAS = Target.the("informa si hay imagenes").locatedBy("//center[contains(text(),'No obtienen imágenes')]");

    public static Target LINK_VOLVER = Target.the("volver a la pantalla principal").locatedBy("//a[text()='Retornar a la bandeja de trámites RUES']");
}
