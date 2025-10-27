package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class LibrosComerciosPage {
    //ESTUDIAR ACCIONES

    //DEVOLVER - REQUERIR
    public static Target SLC_TIPO_TRAMITE = Target.the("seleccionar tipo de tramite").
            locatedBy("#_tipotramite");

    public static Target SLC_PROCEDE_REINGRESO = Target.the("seleccionar procede de reingreso").locatedBy("#_tipodevolucion");
    public static Target SLC_TIPO_DEVOLUCION = Target.the("seleccionar tipo de devolución").locatedBy("#_devolucionparcial");

    public static Target LINK_BORRAR_MOTIVO = Target.the("borrar motivo 1").
            locatedBy("(//*[text()='Borrar'])[1]");

    public static Target LINK_MOITVO = Target.the("seleccionar motivo 1").
            locatedBy("(//*[text()='Seleccionar'])[1]");

    public static Target TEXTA_OBSERVACION =Target.the("ingresar observaciones").locatedBy("#_observaciones");
    // LOCALIZADORES QUE SE PUEDEN USAR FRECUENTEMENTE1
    public static Target BTN_GRABAR = Target.the("grabar la información").locatedBy("//*[text()='Grabar']");
    public static Target BTN_REGRESAR = Target.the("regresar a la ventana principal").locatedBy("//*[contains(text(),'Regresar')]");
}
