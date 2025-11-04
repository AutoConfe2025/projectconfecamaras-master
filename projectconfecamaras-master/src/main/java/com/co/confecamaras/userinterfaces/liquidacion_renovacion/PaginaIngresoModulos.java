package com.co.confecamaras.userinterfaces.liquidacion_renovacion;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaIngresoModulos {

    public static final Target BOTON_MENU = Target.the("boton menu de seleccion de modulos")
            .locatedBy("//button[@class='btnhamburgesaMenu hoverIconosHeader']");
    public static final Target OPCION_CONSULTA_TRANSACCIONES = Target.the("modulo consultas y transacciones")
            .locatedBy("(//div[@class='p-panelmenu-header-content'])[2]");
    public static final Target OPCION_CONSULTA_REGISTRO = Target.the("opcion consulta de registro")
            .locatedBy("(//div[@class='p-menuitem-content'])[1]");
    public static final Target OPCION_LIQUIDACION_RENOVACION = Target.the("opcion de seleccion de tipo de consulta liquidacion renovacion")
            .locatedBy("(//div[@class='p-menuitem-content'])[3]");
    public static final Target LISTA_OPCIONES_BUSQUEDA = Target.the("lista de opciones para seleccionar como buscar")
            .locatedBy("//select[@class='custom-select mr-sm-2']");
    public static final Target OPCION_NOMBRE = Target.the("opcion nombre lista")
            .locatedBy("option[value=\"3\"]");
    public static final Target CAMPO_INGRESO_TEXTO_BUSQUEDA = Target.the("campo para ingresar valor a buscar")
            .locatedBy("//input[@class='form-control']");
    public static final Target BOTON_BUSCAR_CRITERIO = Target.the("boton para realizar la busqueda")
            .locatedBy("//button[@class='btn btn-primary mt-1']");
    public static final Target SELECCION_MATRICULA_ESPACIO_4 = Target.the("Matricula en espacio 4")
            .locatedBy("(//a[@data-pr-tooltip='Seleccionar matrícula' and contains(@class, 'btn_seleccionar')])[4]");

    public static final Target SELECCION_MATRICULA_ESPACIO_1 = Target.the("Matricula en espacio 4")
            .locatedBy("(//a[@data-pr-tooltip='Seleccionar matrícula' and contains(@class, 'btn_seleccionar')])[1]");
    public static final Target BOTON_CONTINUAR_MATRICULA = Target.the("boton continuar con la matricula seleccionada")
            .locatedBy("//button[@class='btn btn-info']");
    public static final Target BOTON_ACEPTAR_AVISO = Target.the("boton aceptar")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");
    public static final Target CAMPO_INGRESO_NUEVO_VALOR = Target.the("campo para ingresar el nuevo valor")
            .locatedBy("//input[@id='activos_105266']");

    public static final Target CAMPO_INGRESO_NUEVO_VALOR_IDENTIFICACION = Target.the("campo para ingresar el nuevo valor identificacion")
            .locatedBy("//input[@id='activos_S0000393']");
    public static final Target CAMPO_INGRESO_NUEVO_VALOR_PROPONENTE = Target.the("campo para ingresar el nuevo valor proponente")
            .locatedBy("//input[@id='activos_80304']");

    public static final Target CAMPO_INGRESO_NUEVO_VALOR_PALABRAS = Target.the("campo para ingresar el nuevo valor palabras")
            .locatedBy("//input[@id='activos_15025']");

    public static final Target CAMPO_CANTIDAD_CERTIFICADOS = Target.the("cantidad de certificados")
            .locatedBy("//input[@id='cantidadcertificados']");
    public static final Target CAMPO_NUMERO_EMPLEADOS_NACIONAL = Target.the("campo empleados a nivel nacional")
            .locatedBy("(//input[@class='text-center form-control-sm p-inputtext p-component p-filled'])[2]");

    public static final Target BOTON_CONTINUAR_CERTIFICADO = Target.the("boton continuar")
            .locatedBy("//button[@class='btn btn-primary ml-2 mr-2']");


}
