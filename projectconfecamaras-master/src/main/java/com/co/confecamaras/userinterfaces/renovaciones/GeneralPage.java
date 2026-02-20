package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class GeneralPage {

    public static final Target BOTON_MATRICULA = Target.the("boton de matricula")
            .locatedBy("//span[contains(text(),'Matrícula')]");

    public static final Target CAMPO_INGRESO_DATO_BUSQUEDA = Target.the("Campo de ingreso de busqueda")
            .locatedBy("//input[@id='criterio']");

    public static final Target BOTON_CONSULTAR_DATO_BUSQUEDA = Target.the("boton de consultar dato de busqueda")
            .locatedBy("//button[@class='btn btn-primary newConsultar float-right']");

    public static final Target BOTON_MATRICULA_SELECCION = Target.the("boton de matricula ")
            .locatedBy("(//button[@data-pr-tooltip='Acciones'])[1]");

    public static final Target BOTON_TRAMITES_REGISTROMERCANTIL_ESADL = Target.the("boton de registro mercantil esadl")
            .locatedBy("//a[.//span[contains(text(),'Trámites del Registro Mercantil y de ESADL')]]");

    public static final Target BOTON_RENOVAR_MATRICULA = Target.the("boton de renovar matricula")
            .locatedBy("//a[@data-pr-tooltip='Renovar matrícula']");

    public static final Target BOTON_CONTINUAR_RENOVACION = Target.the("boton de continuar renovacion")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_ACEPTAR_MENSAJE_IMPORTANTE = Target.the("boton de aceptar mensaje")
            .locatedBy("//button[contains(text(),'Aceptar')]");

    public static final Target CAMPO_NUEVO_VALOR_PERSONA = Target.the("campo nuevo valor persona")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[1]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO = Target.the("campo nuevo valor establecimiento")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[2]");

    public static final Target BOTON_CONTINUAR_RENOVACION_1 = Target.the("boton continuar renovacion despues de valor")
            .locatedBy("//button[@class='btn btn-primary ml-2 mr-2']");
}
