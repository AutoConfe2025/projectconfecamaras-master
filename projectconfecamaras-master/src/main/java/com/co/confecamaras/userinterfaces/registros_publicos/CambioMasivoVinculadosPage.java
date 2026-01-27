package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class CambioMasivoVinculadosPage {

    public static final Target LISTA_CLASE_IDENTIFICACION_REEMPLAZAR = Target.the("lista de clase de identificacion a reemplazar")
            .locatedBy("//select[@id='_idclase']");

    public static final Target CAMPO_IDENTIFICACION = Target.the("campo de identificacion")
            .locatedBy("//input[@id='_numid']");

    public static final Target LISTA_CLASE_IDENTIFICACION_NUEVA = Target.the("lista de clase de identificacion nueva")
            .locatedBy("//select[@id='_idclasenew']");

    public static final Target CAMPO_IDENTIFICACION_NUEVA = Target.the("campo de identificacion nueva")
            .locatedBy("//input[@id='_numidnew']");

    public static final Target CAMPO_RAZON_SOCIAL_NOMBRE = Target.the("Campo razon social o nombre")
            .locatedBy("//input[@id='_nombrenew']");

    public static final Target CAMPO_PRIMER_APELLIDO = Target.the("Campo primer apellido")
            .locatedBy("//input[@id='_apellido1new']");

    public static final Target CAMPO_SEGUNDO_APELLIDO = Target.the("Campo segundo apellido")
            .locatedBy("//input[@id='_apellido2new']");

    public static final Target CAMPO_PRIMER_NOMBRE = Target.the("Campo primer nombre")
            .locatedBy("//input[@id='_nombre1new']");

    public static final Target CAMPO_SEGUNDO_NOMBRE = Target.the("Campo segundo nombre")
            .locatedBy("//input[@id='_nombre2new']");

    public static final Target BOTON_BUSCAR_VINCULOS = Target.the("boton buscar vinculos")
            .locatedBy("//button[contains(text(), 'Buscar vínculos')]");
}
