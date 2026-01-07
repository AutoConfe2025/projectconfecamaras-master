package com.co.confecamaras.userinterfaces.consultas_registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class Page {

    public static final Target CAMPO_CODIGO_BARRAS = Target.the(" campo de codigo de barras")
            .locatedBy("//input[@id='codBarras']");

    public static final Target LISTA_MOSTRAR_RECIBOS = Target.the("lista de mostrar recibos")
            .locatedBy("//select[@id='mostrarRecibos']");

    public static final Target OPCION_SI_MOSTRAR_RECIBOS = Target.the("opcion de si en mostrar recibos")
            .locatedBy("(//option[@value='SI'])[1]");

    public static final Target LISTA_MOSTRAR_SELLOS = Target.the("lista de mostrar sellos")
            .locatedBy("//select[@id='mostrarSellos']");

    public static final Target OPCION_SI_MOSTRAR_SELLOS = Target.the("opcion de si en mostrar sellos")
            .locatedBy("(//option[@value='SI'])[2]");

    public static final Target LISTA_MOSTRAR_ELIMINADOS = Target.the("lista de mostrar eliminados")
            .locatedBy("//select[@id='mostrarEliminados']");

    public static final Target OPCION_SI_MOSTRAR_ELIMINADOS = Target.the("opcion de si en mostrar eliminados")
            .locatedBy("(//option[@value='SI'])[3]");

    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo de fecha inicial")
            .locatedBy("//input[@id='fechaInicial']");

    public static final Target CAMPO_FECHA_FIN = Target.the("campo de fecha fechas")
            .locatedBy("//input[@id='fechaFinal']");

    public static final Target BOTON_CONSULTAR_EXPEDIENTE_GRAFICO = Target.the("boton consultar expediente grafico")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_VER_IMAGEN_1 = Target.the("Boton ver imagen 1")
            .locatedBy("(//span[@class='btn btn-outline-primary btn-sm'])[1]");

    public static final Target BOTON_CERRAR_SOPORTE = Target.the("Boton cerrar soporte")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_VOLVER_EXPEDIENTE_GRAFICO = Target.the("Boton volver en expediente grafico")
            .locatedBy("//button[@id='btn-volver']");


    public static final Target LISTA_OTROS_CRITERIOS = Target.the("lista de otros criterios")
            .locatedBy("//select[@id='busqueda']");

    public static final Target OPCION_RECIBO_OTRO_CRITERIO = Target.the("opcion de otros criterios recibo")
            .locatedBy("//option[@value='recibo']");

    public static final Target OPCION_MATRICULA_OTRO_CRITERIO = Target.the("opcion de otros criterios matricula")
            .locatedBy("//option[@value='matricula']");

    public static final Target CAMPO_RECIBO = Target.the("campo de ingreso de recibo a consultar")
            .locatedBy("//input[@id='recibo']");

    public static final Target CAMPO_MATRICULA = Target.the("campo de ingreso de matricula")
            .locatedBy("//input[@id='matricula']");
}
