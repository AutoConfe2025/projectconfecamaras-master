package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;

public class EmpresasCfePage {

    public static final Target BOTON_NUEVA_ENTIDAD= Target.the("boton para generar nueva entidad")
            .locatedBy("//button[@class='btn btn-secondary btn-lg']");

    public static final Target LISTA_TIPO_IDENTIFICACION= Target.the("lista de seleccion de tipo de identificacion")
            .locatedBy("(//select[@class='form-control border-danger'])[1]");

    public static final Target OPCION_CEDULA= Target.the("opcion cedula lista de seleccion de tipo de identificacion")
            .locatedBy("(//option[@value='1'])[1]");

    public static final Target CAMPO_IDENTIFICACION= Target.the("campo de identificacion")
            .locatedBy("(//input[@class='form-control border-danger'])[1]");

    public static final Target LISTA_TIPO_PERSONA= Target.the("campo de tipo de persona")
            .locatedBy("(//select[@class='form-control border-danger'])[2]");

    public static final Target OPCION_PERSONA_NATURAL= Target.the("opcion de persona natural")
            .locatedBy("(//option[@value='2'])[2]");

    public static final Target LISTA_CODIGO_CAMARA= Target.the("campo de tipo de persona")
            .locatedBy("(//select[@class='form-control border-danger'])[3]");

    public static final Target OPCION_MANIZALES= Target.the("opcion de manizales")
            .locatedBy("(//option[@value='20'])[1]");
    public static final Target OPCION_MEDELLIN= Target.the("opcion de medellin")
            .locatedBy("(//option[@value='21'])[1]");

    public static final Target CAMPO_RAZON_SOCIAL= Target.the("campo de razon social")
            .locatedBy("(//input[@class='form-control'])[1]");

    public static final Target CAMPO_NOMBRE_REGISTRADO= Target.the("campo de nombre registrado")
            .locatedBy("(//input[@class='form-control'])[2]");

    public static final Target CAMPO_PRIMER_NOMBRE= Target.the("campo de primer nombre")
            .locatedBy("(//input[@class='form-control'])[3]");

    public static final Target CAMPO_SEGUNDO_NOMBRE= Target.the("campo de segundo nombre")
            .locatedBy("(//input[@class='form-control'])[4]");

    public static final Target CAMPO_PRIMER_APELLIDO= Target.the("campo de primer apellido")
            .locatedBy("(//input[@class='form-control'])[5]");

    public static final Target CAMPO_SEGUNDO_APELLIDO= Target.the("campo de segundo apellido")
            .locatedBy("(//input[@class='form-control'])[6]");

    public static final Target CAMPO_PARTICULA= Target.the("campo particula")
            .locatedBy("(//input[@class='form-control'])[7]");

    public static final Target CAMPO_CORREO= Target.the("campo correo")
            .locatedBy("(//input[@class='form-control border-danger'])[2]");

    public static final Target CAMPO_CORREO_1= Target.the("campo correo")
            .locatedBy("(//input[@class='form-control border-danger'])[1]");

    public static final Target CAMPO_TELEFONO_1= Target.the("campo telefono 1")
            .locatedBy("(//input[@class='form-control border-danger'])[3]");

    public static final Target CAMPO_TELEFONO_1_1= Target.the("campo telefono 1")
            .locatedBy("(//input[@class='form-control border-danger'])[2]");

    public static final Target CAMPO_DIRECCION_COMERCIAL= Target.the("campo direccion comercial")
            .locatedBy("(//input[@class='form-control border-danger'])[4]");

    public static final Target LISTA_MUNICIPIO= Target.the("lista municipio")
            .locatedBy("(//select[@class='form-control border-danger'])[4]");

    public static final Target OPCION_MANIZALES_MUNICIPIO= Target.the("opcion manizales municipio")
            .locatedBy("(//option[@value='17001'])[1]");

    public static final Target CAMPO_DIRECCION_NOTIFICACION= Target.the("campo de direccion de notificacion")
            .locatedBy("(//input[@class='form-control border-danger'])[5]");

    public static final Target LISTA_DIRECCION_MUNICIPIO= Target.the("lista direccion municipio")
            .locatedBy("(//select[@class='form-control border-danger'])[5]");

    public static final Target OPCION_MANIZALES_DIRECCION_MUNICIPIO= Target.the("opcion direccion municipio manizales")
            .locatedBy("(//option[@value='17001'])[2]");

    public static final Target BOTON_GRABAR_ = Target.the("boton grabar")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");

    public static final Target CAMPO_BUSAR_REGISTRO = Target.the("campo buscar registro")
            .locatedBy("//input[@class='form-control']");

    public static final Target BOTON_EDITAR = Target.the("boton editar")
            .locatedBy("(//a[@data-original-title='Editar'])[1]");
}
