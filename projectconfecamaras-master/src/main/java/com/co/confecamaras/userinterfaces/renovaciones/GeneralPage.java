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

    public static final Target CAMPO_ULTIMOS_ACTIVOS = Target.the("campo nuevos activos")
            .locatedBy("//*[@id=\"table\"]/tbody/tr/td[2]");

    public static final Target CAMPO_NUEVO_VALOR_PERSONA_2 = Target.the("campo nuevo valor persona numero dos varios anios")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[2]");

    public static final Target CAMPO_NUEVO_VALOR_PERSONA_3 = Target.the("campo nuevo valor persona numero tres varios anios")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[3]");

    public static final Target CAMPO_NUEVO_VALOR_PERSONA_4 = Target.the("campo nuevo valor persona numero cuatro inactiva")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[4]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO = Target.the("campo nuevo valor establecimiento")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[2]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS = Target.the("campo nuevo valor establecimiento para varios años")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[4]");
    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_2 = Target.the("campo nuevo valor establecimiento para varios años dos")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[5]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_VARIOS_ANIOS_3 = Target.the("campo nuevo valor establecimiento para varios años tres")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[6]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_3 = Target.the("campo nuevo valor establecimiento para varios años tres")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[7]");

    public static final Target CAMPO_NUEVO_VALOR_ESTABLECIMIENTO_INACTIVA_4 = Target.the("campo nuevo valor establecimiento para varios años tres")
            .locatedBy("(//input[@class='form-control-sm form-control pruebacomas'])[8]");
    public static final Target CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO = Target.the("checkbox seleccionar segundo tramite")
            .locatedBy("(//input[@class='form-check-input checkrenovacion'])[2]");

    public static final Target CAMPO_SELECCION_SELECCION_VALOR_ESTABLECIMIENTO_2 = Target.the("checkbox seleccionar segundo tramite")
            .locatedBy("(//input[@class='form-check-input checkrenovacion'])[3]");

    public static final Target BOTON_CUMPLE_REQUISITOS_LEY_1780 = Target.the("boton cumple con los requisitos 1780")
            .locatedBy("(//input[@class='p-inputswitch-input'])[1]");

    public static final Target BOTON_MANTIENE_REQUISITOS_LEY_1780 = Target.the("boton mantiene con los requisitos 1780")
            .locatedBy("(//input[@class='p-inputswitch-input'])[2]");

    public static final Target BOTON_RENUNCIA_LEY_1780 = Target.the("boton renuncia a ley 1780")
            .locatedBy("(//input[@class='p-inputswitch-input'])[3]");

    public static final Target BOTON_CONTINUAR_RENOVACION_1 = Target.the("boton continuar renovacion despues de valor")
            .locatedBy("//button[@class='btn btn-primary ml-2 mr-2']");

    public static final Target MENSAJE_RENOVACION_INACTIVO = Target.the("mensaje que se muestra con renovacion inactiva")
            .locatedBy("(//div[@class='contenedorInfoPrincipal'])[2]");
}
