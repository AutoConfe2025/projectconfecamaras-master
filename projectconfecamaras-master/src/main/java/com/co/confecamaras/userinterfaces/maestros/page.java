package com.co.confecamaras.userinterfaces.maestros;

import net.serenitybdd.screenplay.targets.Target;

public class page {

    public static final Target BOTON_NUEVO_MAESTRO = Target.the("boton de nuevo registro ")
            .locatedBy("(//a[@target='_self'])[1]");

    public static final Target CAMPO_ID = Target.the("campo id")
            .locatedBy("//input[@id='_idorden']");

    public static final Target CAMPO_GRUPO = Target.the("campo grupo")
            .locatedBy("//input[@id='_grupo']");

    public static final Target CAMPO_TITULO = Target.the("campo titulo")
            .locatedBy("//input[@id='_clave']");

    public static final Target LISTA_AYUDA = Target.the("lista ayuda")
            .locatedBy("//select[@id='_ayuda']");

    public static final Target CAMPO_DESCRIPCION = Target.the("Campo ayuda")
            .locatedBy("//textarea[@id='_descripcion']");

    public static final Target BOTON_GRABAR = Target.the("boton grabar")
            .locatedBy("//input[@class='myButton']");

    public static final Target AYUDA_SELECCION = Target.the("seleccion de ayuda tipo de documentos")
            .locatedBy("//option[@value='001']");

    public static final Target BOTON_EDITAR = Target.the("boton de editar")
            .locatedBy("(//a[@target='_self'])[1]");

    public static final Target BOTON_ELIMINAR = Target.the("boton de eliminar")
            .locatedBy("(//a[@target='_self'])[3]");

}
