package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class RecursosReposicionPage {
    public static Target SLC_TIPO_RESPUESTA = Target.the("seleccionar tipo de respuesta").locatedBy("#confirmainscripcion");
    public static Target INP_NUM_RESOLUCION = Target.the("ingresar el numero de resolicion").locatedBy("#numeroresolucion");
    public static Target DATE_FECHA_RESOLUCION = Target.the("ingresar fecha de resolucion").locatedBy("#fecharesolucion");

    public static Target BTN_ACTUALIZAR = Target.the("actualizar la resolucion").locatedBy("//*[text()='Actualizar']");
    public static Target BTN_REGRESAR = Target.the("regresar a la ventan anterior").locatedBy("//*[text()='Regresar']");
    public static Target TXT_INFORMATIVO = Target.the("mensaje de confirmacion").locatedBy("//form/p");
 }
