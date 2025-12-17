package com.co.confecamaras.userinterfaces.maestros;

import net.serenitybdd.screenplay.targets.Target;

public class page {

    public static final Target BOTON_NUEVO_MAESTRO = Target.the("boton de nuevo registro ")
            .locatedBy("//button[@class='btn btn-primary mb-2 add_clave_valor']");

    public static final Target CAMPO_ID = Target.the("campo id")
            .locatedBy("//input[@id='idorden']");

    public static final Target CAMPO_GRUPO = Target.the("campo grupo")
            .locatedBy("//select[@id='grupo']");

    public static final Target OPCION_SI_CAMPO_GRUPO = Target.the("opcion si del campo grupo")
            .locatedBy("//option[@value='S']");

    public static final Target CAMPO_TITULO = Target.the("campo titulo")
            .locatedBy("//input[@id='titulo']");

    public static final Target LISTA_AYUDA = Target.the("lista ayuda")
            .locatedBy("//select[@id='Ayuda']");

    public static final Target CAMPO_DESCRIPCION = Target.the("Campo ayuda")
            .locatedBy("//textarea[@id='descripcion']");

    public static final Target BOTON_GRABAR = Target.the("boton grabar")
            .locatedBy("//button[@class='btn btn-primary mt-3']");

    public static final Target BOTON_ACEPTAR_MENSAJE_INFORMATIVO = Target.the("boton aceptar mensaje informativo")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target AYUDA_SELECCION = Target.the("seleccion de ayuda tipo de documentos")
            .locatedBy("//option[@value='001']");

    public static final Target BOTON_EDITAR = Target.the("boton de editar")
            .locatedBy("(//button[@data-pr-tooltip='   Actualizar clave valor'])[1]");

    public static final Target BOTON_ELIMINAR = Target.the("boton de eliminar")
            .locatedBy("(//button[@data-pr-tooltip='Eliminar clave valor'])[1]");

}
