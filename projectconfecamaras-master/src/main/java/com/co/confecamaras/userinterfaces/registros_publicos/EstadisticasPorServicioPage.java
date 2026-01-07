package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class EstadisticasPorServicioPage {

    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo fecha inicial por servicio")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo fecha fin por servicio")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target LISTA_TIPO_SERVICIO = Target.the("lista de tipo de servicio")
            .locatedBy("//select[@id='_tipo']");

    public static final Target OPCION_ARTICULO_7_TODOS = Target.the("opcion de articulo 7 todos")
            .locatedBy("//option[@value='BEN1429-7']");

    public static final Target LISTA_TIPO_INFORME = Target.the("lista de tipo de informe")
            .locatedBy("//select[@id='_detalle']");

    public static final Target OPCION_DETALLADO_RECIBO_RECIBO = Target.the("opcion de detallado recibo a recibo")
            .locatedBy("//option[@value='DT']");

    public static final Target BOTON_GENERAR_POR_SERVICIOS = Target.the("Boton generar por servicios")
            .locatedBy("//a[@class='myButton']");

    public static final Target DESCARGAR_CSV_POR_SERVICIO = Target.the("Boton descargar csv")
            .locatedBy("//a[contains(text(),'Descargar CSV')]");
}
