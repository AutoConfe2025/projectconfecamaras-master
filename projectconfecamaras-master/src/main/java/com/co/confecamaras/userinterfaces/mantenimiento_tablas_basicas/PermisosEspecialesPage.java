package com.co.confecamaras.userinterfaces.mantenimiento_tablas_basicas;

import net.serenitybdd.screenplay.targets.Target;

public class PermisosEspecialesPage {

    public static final Target BOTON_NUEVO_PERMISO_ESPECIAL = Target.the("Boton permiso especial")
            .locatedBy("//button[@class='btn btn-primary mb-2 add_permiso']");

    public static final Target CAMPO_ID_PERMISO = Target.the("campo id permiso")
            .locatedBy("//input[@id='idpermiso']");

    public static final Target CAMPO_DESCRIPCION = Target.the("campo descripcion")
            .locatedBy("//input[@id='descripcion']");

    public static final Target LISTA_TIPO_EMPRESA = Target.the("lista de tipo de empresa")
            .locatedBy("(//select[@id='idactividad'])[1]");

    public static final Target OPCION_CAMARA_SII = Target.the("opcion de camara SII")
            .locatedBy("//option[@value='cam1']");

    public static final Target LISTA_ACTIVIDAD = Target.the("lista de actividad")
            .locatedBy("(//select[@id='idactividad'])[3]");

    public static final Target OPCION_ACTIVA = Target.the("opcion de activa")
            .locatedBy("//option[@value='A']");

    public static final Target CAMPO_GRUPO = Target.the("campo de grupo")
            .locatedBy("//input[@id='grupo']");

    public static final Target LISTA_CONTROL_USUARIO = Target.the("lista de control de usuario")
            .locatedBy("//select[@id='idcontrolusuario']");

    public static final Target OPCION_TODOS_CONTROL_USUARIO = Target.the("opcion de control de usuario")
            .locatedBy("(//option[@value='T'])[1]");

    public static final Target LISTA_CONTROL_EXPEDIENTE = Target.the("lista de control de usuario")
            .locatedBy("//select[@id='idcontrolexpediente']");

    public static final Target OPCION_TODOS_CONTROL_EXPEDIENTE = Target.the("opcion de control de expediente")
            .locatedBy("(//option[@value='T'])[2]");

    public static final Target LISTA_CONTROL_ESTADO = Target.the("lista de control de estado")
            .locatedBy("//select[@id='idcontrolestado']");


    public static final Target OPCION_MA_CONTROL_ESTADO = Target.the("opcion ma control de estado")
            .locatedBy("//option[@value='MA']");

    public static final Target CAMPO_SCRIPT = Target.the("campo script")
            .locatedBy("//textarea[@id='idscript']");

    public static final Target BOTON_GRABAR_AGREGAR_PERMISO_ESPECIAL = Target.the("boton agregar permiso especial")
            .locatedBy("//button[@class='btn btn-primary mt-3']");

    public static final Target BOTON_ACEPTAR_GRABAR_AGREGAR_PERMISO_ESPECIAL = Target.the("boton aceptar agregar permiso especial")
            .locatedBy("//button[contains(text(), 'Aceptar')]");

    public static final Target BOTON_EDITAR_PERMISO_ESPECIAL = Target.the("boton editar permiso especial")
            .locatedBy("(//button[@class='btn btn-outline-primary mr-2 update_permiso'])[1]");

    public static final Target BOTON_BORRAR_PERMISO_ESPECIAL = Target.the("boton eliminar permiso especial")
            .locatedBy("(//button[@class='btn btn-outline-danger delete_permiso'])[1]");

    public static final Target BOTON_SI_BORRAR_PERMISO_ESPECIAL = Target.the("boton si eliminar permiso especial")
            .locatedBy("//button[contains(text(), 'Sí')]");
}
