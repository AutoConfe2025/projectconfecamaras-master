package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ReingresoTramiteRuesPage {

    public static final Target CAMPO_NUC = Target.the("campo de ingreso de nuc")
            .locatedBy("//input[@id='_nuc']");

    public static final Target BOTON_CONSULTAR_NUC = Target.the("boton consultar nuc")
            .locatedBy("//input[@value='Continuar']");

    public static final Target CAMPO_NOMBRE_COMPLETO = Target.the("campo nombre completo")
            .locatedBy("//input[@id='_nombreradicador']");

    public static final Target LISTA_TIPO_DOCUMENTO = Target.the("campo nombre completo")
            .locatedBy("//select[@id='_tipoideradicador']");

    public static final Target OPCION_CE_TIPO_DOCUMENTO = Target.the("opcion ce tipo de documento")
            .locatedBy("//option[contains(text(), '3 - C.E.')]");

    public static final Target CAMPO_NUMERO_DE_IDENTIFICACION = Target.the("opcion ce tipo de documento")
            .locatedBy("//input[@id='_ideradicador']");

    public static final Target CAMPO_FECHA_EXPEDICION = Target.the("campo de fecha de expedicion")
            .locatedBy("//input[@id='_fechaexpradicador']");

    public static final Target CAMPO_EMAIL = Target.the("campo de correo electronico")
            .locatedBy("//input[@id='_emailradicador']");

    public static final Target CAMPO_TELEFONO_FIJO = Target.the("campo de telefono fijo")
            .locatedBy("//input[@id='_telefonoradicador']");

    public static final Target CAMPO_CELULAR = Target.the("campo de celular")
            .locatedBy("//input[@id='_celularradicador']");

    public static final Target BOTON_TOMAR_FOTO = Target.the("boton de tomar foto")
            .locatedBy("(//a[@role='button'])[1]");

    public static final Target BOTON_CARA1_CEDULA = Target.the("boton cara 1 de cedula")
            .locatedBy("(//a[@role='button'])[3]");

    public static final Target BOTON_CARA2_CEDULA = Target.the("boton cara 2 de cedula")
            .locatedBy("(//a[@role='button'])[5]");

    public static final Target BOTON_CARGAR_DOCUMENTO = Target.the("boton de carga de documento")
            .locatedBy("//input[@id='_evidenciarnec']");

    public static final Target BOTON_DOCUMENTO_CARGADO = Target.the("boton de carga de documento")
            .locatedBy("//a[(*)]");
}
