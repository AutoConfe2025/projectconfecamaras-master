package com.co.confecamaras.userinterfaces.Bandejas.contabilizacvion_ingresos;

import net.serenitybdd.screenplay.targets.Target;

public class PageContabilizacionIngresos {

    public static final Target BOTON_SELECCIONAR_DIA = Target.the("Boton de seleccion de dia").
            locatedBy("//input[@class='myButton']");
    public static final Target BOTON_VERIFICAR_RECIBOS = Target.the("boton de verificar recibos").
            locatedBy("//a[contains(text(),'Verificar recibos')]");

    public static final Target BOTON_DESCARGAR_RECIBOS = Target.the("boton de descargar recibos").
            locatedBy("//a[contains(text(),'Descargar')]");



    public static final Target BOTON_RELACION_DOCUMENTOS = Target.the("boton de relacion documentos").
            locatedBy("//a[contains(text(),'Relación documentos')]");
}
