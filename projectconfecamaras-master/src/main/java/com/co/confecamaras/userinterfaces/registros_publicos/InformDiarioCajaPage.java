package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class InformDiarioCajaPage {

    public static final Target LISTA_USUARIO_CAJERO = Target.the("lista de usuario de caja")
            .locatedBy("//select[@id='operador']");

    public static final Target OPCION_CAJAQA = Target.the("opcion de caja qa")
            .locatedBy("//option[@value='CAJAQA']");

    public static final Target BOTON_CONSULTAR_CAJA = Target.the("boton de consulta")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_SI_GENERA_INFORME = Target.the("boton de si genera informe")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_CERRAR = Target.the("boton cerrar ver documento")
            .locatedBy("//button[@class='btn btn-secondary']");

    public static final Target OPCION_LISTA_TIPO_INFORME = Target.the("lista tipo de informe")
            .locatedBy("(//option[@value='S'])[1]");

    public static final Target LISTA_TIPO_INFORME = Target.the("lista tipo de informe")
            .locatedBy("//select[@id='tipoInforme']");

    public static final Target LISTA_TIPO_SALIDA = Target.the("lista tipo de salida")
            .locatedBy("//select[@id='tipoSalida']");

    public static final Target CSV_LISTA_TIPO_SALIDA = Target.the("opcion de lista tipo de salida")
            .locatedBy("//option[@value='C']");

    public static final Target LISTA_INCLUIR_CONSULTAS = Target.the("lista de incluir consultas")
            .locatedBy("//select[@id='incluirConsulta']");

    public static final Target OPCION_NO_INCLUIR_CONSULTAS = Target.the("opcion no lista de incluir consultas")
            .locatedBy("//option[@value='N']");

    public static final Target OPCION_PDF_TIPO_SALIDA = Target.the("opcion pdf lista de tipo de salida")
            .locatedBy("//option[@value='P']");

    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo de fecha incial")
            .locatedBy("//input[@id='fechaInicial']");
}
