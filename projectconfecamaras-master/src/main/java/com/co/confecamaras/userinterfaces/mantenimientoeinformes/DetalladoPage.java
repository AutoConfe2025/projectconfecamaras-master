package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class DetalladoPage {
    public static Target INP_FECHA_INICIO = Target.the("ingresar fecha inicial").locatedBy("#_fecini");
    public static Target INP_FECHA_FIN = Target.the("ingresar fecha final").locatedBy("#_fecfin");
    public static Target SLC_OPERADOR = Target.the("seleccionar operador").locatedBy("#_operador");
    public static Target SLC_FORMATO = Target.the("seleccionar formato").locatedBy("#_tipoinforme");
    public static Target BTN_GENERAR = Target.the("generar formato").locatedBy("//a[text()='Generar']");
    public static Target LINK_DESCARGAR = Target.the("descargar archivo").locatedBy("//a[text()='Descargar archivo']");
}
