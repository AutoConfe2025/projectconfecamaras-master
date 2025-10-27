package com.co.confecamaras.userinterfaces.consultasytransacciones;


import net.serenitybdd.screenplay.targets.Target;

public class ValidacionIdentidadPage {

    //VISTA PRINCIPAL DE VALIDACION DE IDENTIDAD
    public static Target SLC_TIPO_IDENTIFICACION = Target.the("tipo de identificacion").locatedBy("#idclase");
    public static Target INP_NUMERO_IDENTIFICACION = Target.the("numero de identificacion").locatedBy("#numid");
    public static Target CHK_TRATAMIENTO_DATOS = Target.the("aceptar tratamiento de datos").locatedBy("//*[@for='aceptaptdt']");
    public static Target CHK_TERMINOS_CONDICIONES = Target.the("aceptar terminos y condiciones").locatedBy("#aceptatyc");

    // FORMULARIO PARA VERIFICAR DATOS
    public static Target TITLE_VALIDACION= Target.the("titulo de formuario").locatedBy("//p[text()='DATOS DEL USUARIO']");
    public static Target INP_FECHA_EXPEDICION = Target.the("fecha de expedicion").locatedBy("#fechaexpedicion");
    public static Target INP_PRIMER_NOMBRE = Target.the("primer nombre").locatedBy("#nombre1");
    public static Target INP_SEGUNDO_NOMBRE = Target.the("segundo nombre").locatedBy("#nombre2");
    public static Target INP_PRIMER_APELLIDO = Target.the("primer apellido").locatedBy("#apellido1");
    public static Target INP_SEGUNDO_APELLIDO = Target.the("segundo apellido").locatedBy("#apellido2");
    public static Target INP_CORREO_ELECTRONICO = Target.the("correo electronico").locatedBy("#email");
    public static Target INP_REPETIR_CORREO = Target.the("reperit correo electronico").locatedBy("#emailrep");
    public static Target INP_NUMERO_CELULAR = Target.the("numero de celular").locatedBy("#celular");
    public static Target INP_DIRECCION = Target.the("direccion").locatedBy("#direccion");
    public static Target SLC_PAIS = Target.the("pais").locatedBy("#pais");
    public static Target SLC_MUNICIPIO = Target.the("municipio").locatedBy("#municipio");
    public static Target LABEL_PREGUNTA= Target.the("pregunta a responder").locatedBy("//*[contains(text(),'Resultado')]");
    public static Target INP_RESULTADO = Target.the("ingresar respuesta").locatedBy("#codaleat");

    // LOCATORS QUE PUEDEN SER COMPARTIDOS
    public static Target BTN_CONTINUAR_VI = Target.the("siguiente accion").locatedBy("//*[text()='Continuar']");
    public static Target BTN_REGRESAR_VI = Target.the("regresar a paso anterior").locatedBy("");
    public static Target ALERT1_VI = Target.the("mensaje alerta").locatedBy("#modal_body");
    public static Target ALERT2_VI = Target.the("mensaje alerta").locatedBy(".bootbox-body");

    public static Target BTN_OK_VI = Target.the("cerrar ventana").locatedBy("//*[text()='OK']");
    public static Target BTN_CERRAR_VI = Target.the("cerrar ventana").locatedBy("//*[text()='Cerrar']");
}
