package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ReasignacionCodBarrasPage {

    public static final Target CAMPO_NUMERO_CODIGO_BARRAS = Target.the("campo de ingreso de codigo de barras")
            .locatedBy("//input[@id='_codigobarras']");

    public static final Target BOTON_CONTINUAR_COD_BARRAS = Target.the("boton de continuar reasignacion de codigo de barras")
            .locatedBy("//input[@class='myButton']");

    public static final Target LISTA_ASIGNAR_USUARIO = Target.the("lista de asignar usuario")
            .locatedBy("//input[@class='myButton']");

    public static final Target OPCION_ASIGNAR_USUARIO = Target.the("opcion caja qa")
            .locatedBy("//option[contains(text(), 'CAJAQA - ( CAJAQA )')]");

    public static final Target LISTA_ESTADO_A_APLICAR = Target.the("lista de asignar usuario")
            .locatedBy("//select[@id='_estadoasignar']");

    public static final Target OPCION_ESTADO_A_APLICAR = Target.the("opcion anulado")
            .locatedBy("//option[contains(text(), 'ANULADO - ( 99 )')]");

    public static final Target LISTA_TIPO = Target.the("lista de tipo")
            .locatedBy("//select[@id='_tipoanotacion']");

    public static final Target OPCION_TIPO = Target.the("opcion zpruebasotros")
            .locatedBy("//option[contains(text(), 'ZPRUEBAOTROS')]");

    public static final Target CAMPO_OBSERVACIONES = Target.the("campo observaciones")
            .locatedBy("//textarea[@id='_anotacion']");

    public static final Target BOTON_ACEPTAR = Target.the("boton aceptar")
            .locatedBy("//input[@class='myButton']");
}
