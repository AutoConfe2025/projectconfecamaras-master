package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleCajaAnalisisPage {

    public static final Target LISTA_OPERADOR = Target.the("lista de operador")
            .locatedBy("//select[@id='_operador']");

    public static final Target OPCION_CAJAQA_LISTA_OPERADOR = Target.the("opcion caja qa lista de operador")
            .locatedBy("//option[@value='CAJAQA']");

    public static final Target CAMPO_FECHA_INICIAL_ANALISIS = Target.the("campo fecha inicial")
            .locatedBy("//input[@id='_fecini']");

    public static final Target CAMPO_FECHA_FIN_ANALISIS = Target.the("campo fecha final")
            .locatedBy("//input[@id='_fecfin']");

    public static final Target LISTA_TIPOS_INFORME = Target.the("lista de tipo de informe")
            .locatedBy("//select[@id='_tipo']");

    public static final Target OPCION_SERVICIO_LISTA_TIPOS_INFORME = Target.the("opcion de servicio lista de tipo de informe")
            .locatedBy("(//option[@value='S'])[1]");

    public static final Target LISTA_TIPOS_SALIDA = Target.the("lista de tipo de salida")
            .locatedBy("//select[@id='_tiposalida']");

    public static final Target OPCION_PDF_LISTA_TIPOS_SALIDA = Target.the("opcion de pdf lista de tipo de salida")
            .locatedBy("(//option[@value='P'])[1]");

    public static final Target CAMPO_EMAIL_CONTROL = Target.the("campo correo electronico")
            .locatedBy("//input[@id='_emailusuariosistema']");

    public static final Target LISTA_AMBIENTE = Target.the("lista de ambiente")
            .locatedBy("//select[@id='_ambiente']");

    public static final Target OPCION_DEFAULT_LISTA_AMBIENTE = Target.the("opcion default lista de ambiente")
            .locatedBy("(//option[@value='S'])[2]");

    public static final Target BTN_GENERAR = Target.the("boton generar")
            .locatedBy("//button[contains(text(),'Generar')]");

    public static final Target BTN_GENERAR_ALERTA = Target.the("boton generar en alerta")
            .locatedBy("(//button[contains(text(),'Generar')])[2]");
}
