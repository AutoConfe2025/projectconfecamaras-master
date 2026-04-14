package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class InfoemesPorServicios {

    public static final Target LISTA_SELECCION_USUARIO = Target.the("lista de seleccion de usuario")
            .locatedBy("(//div[@class='col-md-6 mb-3'])[3]");

    public static final Target CAMPO_FECHA_INICIAL_RESUMIDO_SERVICIOS = Target.the("campo fecha incial de resumido por servicios")
            .locatedBy("//input[@id='fechaInicial']");

    public static final Target CAMPO_FECHA_FINAL_RESUMIDO_SERVICIOS = Target.the("campo fecha final de resumido por servicios")
            .locatedBy("//input[@id='fechaFinal']");


    public static final Target CAMPO_BUSQUEDA_USUARIO = Target.the("campo ingreso de busqueda")
            .locatedBy("//input[@class='p-dropdown-filter p-inputtext p-component']");


    public static final Target SELECCION_OPCION_0 = Target.the("opcion cero de seleccion")
            .locatedBy("//li[@id='dropdownItem_0']");

    public static final Target BOTON_CONSULTAR_INFORME_RESUMIDO = Target.the("boton consultar informe resumido")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target OPCION_SI_CAMPO_IMPORTANTE = Target.the("opcion si en cuadro de importante")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_CERRAR = Target.the("boton cerrar")
            .locatedBy("//button[@class='btn btn-secondary']");
}
