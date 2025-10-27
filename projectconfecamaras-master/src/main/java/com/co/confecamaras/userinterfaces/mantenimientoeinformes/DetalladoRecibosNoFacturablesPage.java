package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class DetalladoRecibosNoFacturablesPage {

    // VENTANA QUE SOLICITA INGRESAR FECHAS
    public static Target FECHA_INICIO = Target.the("fecha desde").locatedBy("#_fecini");
    public static Target FECHA_FIN = Target.the("fecha hasta").locatedBy("#_fecfin");
    public static Target BTN_GENERAR = Target.the("generar un reporte").locatedBy("//a[text()='Generar']");

    // VENTANA QUE PERMITE DESCARGAR EXTRACTO
    public static Target TXT_INFORMATIVO = Target.the("informacion de lo que se ha generado").locatedBy("//div[@id='frameSecundarioCentral']/center//center");
    public static Target LINK_DESCARGAR = Target.the("descargar el documento").locatedBy("//a[text()='Descargar archivo']");
}
