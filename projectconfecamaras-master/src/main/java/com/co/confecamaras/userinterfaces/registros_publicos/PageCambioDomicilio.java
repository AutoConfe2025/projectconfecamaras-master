package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class PageCambioDomicilio {

    public static final Target CAMPO_NIT = Target.the("campo de ingreso de NIT")
            .locatedBy("//input[@class='form-control']");

    public static final Target BOTON_CONSULTAR_NIT = Target.the("boton consultar nit")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_FIRMA_MANUSCRITA = Target.the("boton firma manuscrita")
            .locatedBy("(//button[@class='btn btn-primary btn-block btn-block truncate '])[1]");

    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("campo de correo electronico")
            .locatedBy("//input[@class='form-control form-control-sm']");

    public static final Target LISTA_TIPO_IDENTIFICACION = Target.the("lista de identificacion")
            .locatedBy("//select[@class='form-control form-control-sm']");

    public static final Target OPCION_CEDULA_LISTA_TIPO_IDENTIFICACION = Target.the("opcion cedula lista de identificacion")
            .locatedBy("//option[@value='1']");

    public static final Target CAMPO_CELULAR = Target.the("campo celular")
            .locatedBy("(//input[@class='form-control form-control-sm numeros'])[2]");

    public static final Target BOTON_GENERAR_QR = Target.the("boton para generar el qr")
            .locatedBy("//button[@class='btn btn-primary float-center']");

    public static final Target IMG_QR_FIRMA = Target.the("imagen del qr")
            .locatedBy("//img[starts-with(@src, 'data:image/png;base64')]");

    public static final Target BOTON_RECUPERAR_TRAMITE = Target.the("boton de recuperacion de tramite")
            .locatedBy("//a[@id='pr_id_220_header_1']");

    public static final Target CAMPO_INGRESO_COD_RECUPERACION = Target.the("campo de ingreso de codigo de recuperacion")
            .locatedBy("//input[@class='form-control text-left col-12 col-lg-12 col-md-12 col-sm-12 form-control-sm  validarCaracteres text-center']");

    public static final Target BOTON_CONSULTAR = Target.the("boton consultar cod recuperacion")
            .locatedBy("//button[@class='btn btn-primary mt-2']");

    public static final Target BOTON_RADICAR_TRAMITE = Target.the("boton de sobre digital")
            .locatedBy("(//button[@class='btn btn-primary btn-block btn-block truncate '])[1]");

    public static final Target BOTON_ACEPTAR_TRAMITE = Target.the("boton aceptar radicar")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_SOPORTES = Target.the("boton soportes")
            .locatedBy("//a[@id='soportesT']");

    public static final Target BOTON_VER_SOPORTE= Target.the("boton ver soportes")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[1]");
}
