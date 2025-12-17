package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class PageRues {

    public static final Target BOTON_NUEVO_SERVICIO_RUES = Target.the("boton de nuevo servicio rues")
            .locatedBy("//button[@class='btn btn-primary mb-2 add_servicioRues']");

    public static final Target LISTA_TABLA = Target.the("lista de tabla")
            .locatedBy("//select[@id='idTabla']");

    public static final Target OPCION_LISTA_TABLA = Target.the("opcion tabla servicios lista de tabla")
            .locatedBy("(//option[@value='01'])[1]");

    public static final Target CAMPO_SERVICIO_RUE = Target.the("campo de ingreso de rue")
            .locatedBy("(//input[@class='form-control p-inputtext p-component'])[1]");

    public static final Target CAMPO_NOMBRE = Target.the("campo de Nombre")
            .locatedBy("//input[@class='form-control p-inputtext p-component']");

    public static final Target LISTA_SELECCION_SERVICIO_CAMARA = Target.the("campo de Nombre")
            .locatedBy("//select[@id='codigoCamara']");

    public static final Target OPCION_LISTA_SELECCION_SERVICIO_CAMARA = Target.the("opcion tabla servicios lista de tabla")
            .locatedBy("(//option[@value='01000000'])[1]");

    public static final Target LISTA_TIPO_TRAMITE = Target.the("lista tipo de tramite")
            .locatedBy("//select[@id='tipo']");

    public static final Target OPCION_LISTA_TIPO_TRAMITE = Target.the("opcion tipo lista de tipo")
            .locatedBy("(//option[@value='01'])[3]");

    public static final Target LISTA_GRUPOS = Target.the("lista grupos")
            .locatedBy("//select[@id='grupo']");

    public static final Target OPCION_LISTA_GRUPOS = Target.the("opcion tipo lista de tipo")
            .locatedBy("(//option[@value='001'])");

    public static final Target CONTROL_ESTADO_MATRICULA = Target.the("opcion MA")
            .locatedBy("(//input[@id='ma'])");

    public static final Target CAMPO_CONTROL_ORGANIZACIONES = Target.the("Campo control de organizaciones")
            .locatedBy("(//input[@id='ctrOrganizaciones'])");

    public static final Target CAMPO_CONTROL_CATEGORIAS = Target.the("Campo control de categorias")
            .locatedBy("(//input[@id='ctrCategorias'])");

    public static final Target LISTA_CONTROL_PROPIETARIO = Target.the("lista de control de propietario")
            .locatedBy("//select[@id='ctrPropietario']");

    public static final Target OPCION_LISTA_CONTROL_PROPIETARIO = Target.the("opcion de lista de control de propietario")
            .locatedBy("//select[@id='ctrPropietario']");

    public static final Target BOTON_GRABAR_RUE = Target.the("boton grabar rue")
            .locatedBy("//button[@class='btn btn-primary mt-3']");

    public static final Target BOTON_ACEPTAR_RUE = Target.the("boton aceptar rue")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_EDITAR = Target.the("boton editar rue")
            .locatedBy("(//button[@class='btn btn-outline-primary mr-2 update_servicioRues'])[1]");

    public static final Target BOTON_RETORNO = Target.the("boton retorno rue")
            .locatedBy("(//input[@type='checkbox'])[1]");

    public static final Target BOTON_VENTA = Target.the("boton venta rue")
            .locatedBy("(//input[@type='checkbox'])[2]");

    public static final Target BOTON_ELIMINAR = Target.the("boton eliminar rue")
            .locatedBy("(//button[@class='btn btn-outline-danger delete_servicioRues'])[1]");

    public static final Target BOTON_SI_ELIMINAR = Target.the("boton si eliminar rue")
            .locatedBy("(//button[@type='button'])[12]");
}
