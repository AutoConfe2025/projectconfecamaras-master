package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ReingresoTramiteRuesPage {

    public static final Target CAMPO_NUC = Target.the("campo de ingreso de nuc")
            .locatedBy("//input[@id='nuc']");

    public static final Target BOTON_CONSULTAR_NUC = Target.the("boton consultar nuc")
            .locatedBy("//*[text()='Consultar']");

    public static final Target CAMPO_NOMBRE_COMPLETO = Target.the("campo nombre completo")
            .locatedBy("//input[@id='txtReingresarTramiteNomApe']");

    public static final Target LISTA_TIPO_DOCUMENTO = Target.the("campo nombre completo")
            .locatedBy("//select[@id='slctReingresarTramiteTipoIdentificacion']");

    public static final Target OPCION_CE_TIPO_DOCUMENTO = Target.the("opcion ce tipo de documento")
            .locatedBy("//option[contains(text(), '3 - C.E.')]");

    public static final Target CAMPO_NUMERO_DE_IDENTIFICACION = Target.the("opcion ce tipo de documento")
            .locatedBy("//input[@id='txtReingresarTramiteNumeroIdentificacion']");

    public static final Target CAMPO_FECHA_EXPEDICION = Target.the("campo de fecha de expedicion")
            .locatedBy("//input[@id='txtReingresarTramiteFechaExpDocumento']");

    public static final Target CAMPO_EMAIL = Target.the("campo de correo electronico")
            .locatedBy("//input[@id='txtReingresarTramiteEmail']");

    public static final Target CAMPO_TELEFONO_FIJO = Target.the("campo de telefono fijo")
            .locatedBy("//input[@id='txtReingresarTramiteTelefonoFijo']");

    public static final Target CAMPO_CELULAR = Target.the("campo de celular")
            .locatedBy("//input[@id='txtReingresarTramiteCelular']");

    public static final Target BOTON_TOMAR_FOTO = Target.the("boton de tomar foto")
            .locatedBy("(//button[@data-titulo-modal='Foto del usuario'])[1]");

    public static final Target BOTON_CARA1_CEDULA = Target.the("boton cara 1 de cedula")
            .locatedBy("(//button[@data-titulo-modal='Foto del documento de identidad'])[1]");

    public static final Target BOTON_CARA2_CEDULA = Target.the("boton cara 2 de cedula")
            .locatedBy("(//button[@data-titulo-modal='Foto reverso del documento de identidad'])[1]");

    public static final Target BOTON_CARGAR_DOCUMENTO = Target.the("boton de carga de documento")
            .locatedBy("//input[@id='fileArchivoVerificacionDocIdentidad']");

    public static final Target BOTON_DOCUMENTO_CARGADO = Target.the("boton de carga de documento")
            .locatedBy("//a[(*)]");
}
