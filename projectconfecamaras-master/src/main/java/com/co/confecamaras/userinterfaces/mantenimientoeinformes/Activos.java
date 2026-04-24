package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class Activos {

    public static final Target BOTON_MOSTRAR_RELACION = Target.the("boton de mostrar relaciones").
            locatedBy("//a[@class='myButton']");

    public static final Target BOTON_NUEVO_REGISTRO = Target.the("boton de nuevo registro").
            locatedBy("(//a[@target='_self'])[1]");

    public static final Target CAMPO_ID_ACTIVO = Target.the("Campo a id activo").
            locatedBy("//input[@id='idactivo']");

    public static final Target LISTA_ESTADO = Target.the("lista estado").
            locatedBy("//select[@id='estado']");

    public static final Target OPCION_ESTADO_ACTIVADO = Target.the("opcion activado").
            locatedBy("//option[normalize-space(text())='2.- Activado']");

    public static final Target LISTA_FONDO = Target.the("lista fondo").
            locatedBy("//select[@id='fondo']");

    public static final Target OPCION_FONDO_PUBLICO = Target.the("opcion fondo publico").
            locatedBy("//option[normalize-space(text())='1.- Público']");

    public static final Target CAMPO_DETALLE = Target.the("campo detalle").
            locatedBy("//input[@ID='detalle']");

    public static final Target CAMPO_FECHA_DE_COMPRA = Target.the("campo fecha de compra").
            locatedBy("//input[@ID='fechacompra']");

    public static final Target LISTA_CENTRO_DE_COSTOS = Target.the("lista de centro de costos").
            locatedBy("//select[@ID='ccos']");

    public static final Target OPCION_ADMINISTRATIVA_FINANCIERA = Target.the("opcion administrativa y financiera").
            locatedBy("//*[@id=\"ccos\"]/option[2]");

    public static final Target LISTA_AREA_DE_TRABAJO = Target.the("lista area de trabajo").
            locatedBy("//select[@id='areatrabajo']");

    public static final Target OPCION_PRESIDENCIA = Target.the("lista area de trabajo").
            locatedBy("//option[normalize-space(text())='100 - PRESIDENCIA']");

    public static final Target CAMPO_MANTENIDO_VENTA = Target.the("lista area de trabajo").
            locatedBy("  //input[@id='paralaventa']");
    public static final Target BOTON_GRABAR_PLANILLA = Target.the("boton de grabar la planilla").
            locatedBy("//input[@class='myButton']");

    public static final Target BOTON_EXPORTAR_EXCEL = Target.the("boton exportar excel").
            locatedBy("//a[normalize-space(text())='Exportar excel']");

    public static final Target BOTON_DESCRAGR_EXCEL = Target.the("boton descargar excel").
            locatedBy("//a[normalize-space(text())='Descargar excel']");
    public static final Target BOTON_ELIMINAR = Target.the("boton eliminar").
            locatedBy("//a[@title='Borrar']");

    public static final Target BOTON_IMPORTAR_EXCEL = Target.the("boton importar excel").
            locatedBy("//a[normalize-space(text())='Importar excel']");

    public static final Target BOTON_CONTINUAR = Target.the("boton continuarl").
            locatedBy("//input[@class='myButton']");
}
