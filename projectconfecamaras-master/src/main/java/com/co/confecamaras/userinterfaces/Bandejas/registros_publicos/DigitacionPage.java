package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class DigitacionPage {
    public static Target LINK_IMPOR_VUE_CTCE = Target.the("digitar vue y ctce").
            locatedBy("(//*[text()='Importar VUE/CTCE'])[1]");

    public static Target SLC_VERSION_IMP = Target.the("seleccionar version de importacion").
            locatedBy("#_versionimportacion");

    public static Target MODAL = Target.the("alerta mensaje").
            locatedBy("#modal_body");

    public static Target BTN_CERRAR = Target.the("cerrar alerta").
            locatedBy("//*[text()='Cerrar']");
    // ----------------------------------------------------------------------------------------------------------------------------------------//

    // INFORMACION QUANTUM
    public static Target LINK_INT_QUANTUM = Target.the("digitar informacion quantum").locatedBy("(//*[text()='Integración Quantum'])[1]");
    public static Target FORM_CARGAR_ARCHIVO = Target.the("cargar archivo").locatedBy("#my-awesome-dropzone");
    public static Target BTN_APLICAR = Target.the("aplicar importacion").locatedBy("//*[text()='Aplicar importación']");
    public static Target TXT_INFORMATIVO = Target.the("texto de la alerta").locatedBy(".bootbox-body");
    public static Target BTN_CONTINUAR = Target.the("continuar con proceso").locatedBy("//*[text()='Continuar']");
    public static Target BTN_REINICIAR_PROCESO = Target.the("reiniciar proceso").locatedBy("//*[text()='Reiniciar proceso']");
    public static Target BTN_REINICIAR = Target.the("reiniciar el proceso").locatedBy("//*[text()='Reiniciar']");
    public static Target LINK_PARAMETRIZACION = Target.the("parametrizacion").locatedBy("//*[text()='Parametrización']");
    public static Target BTN_REG_DIGITACION = Target.the("regresar digitacion").locatedBy("//*[text()='Regresar a digitación']");

    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_DIG_FORMULARIO = Target.the("digitar formulario").locatedBy("(//*[text()='Digitar formulario'])[1]");
    public static Target INP_MATRICULA = Target.the("ingresar matricula").locatedBy("#matricula");
    public static Target SLC_ORGANIZACION = Target.the("seleccionar organizacion").locatedBy("#organizacion");
    public static Target SLC_CATEGORIA = Target.the("seleccionar categoria").locatedBy("#categoria");
    public static Target SLC_ESTADO_MATRICULA = Target.the("seleccionar estado de matricula").locatedBy("#estadomatricula");
    public static Target INP_FECHA_MATRICULA = Target.the("ingresar fecha de matricula").locatedBy("#fechamatricula");
    public static Target SLC_EXTINCION_DOMINIO = Target.the("Esta inmerso en procesos de extinción de dominio").locatedBy("#extinciondominio");
    public static Target SLC_DB_GENERO = Target.the("seleccionar genero").locatedBy("#sexo");
    public static Target INP_FECHA_NACIMIENTO =Target.the("ingresar fecha de nacimiento").locatedBy("#fechanacimiento");
    public static Target INP_FECHA_EXP_DOC = Target.the("ingresar fecha de expedicion de documento").locatedBy("#fecexpdoc");
    public static Target INP_NACIONALIDAD = Target.the("ingresar nacionalidad").locatedBy("#nacionalidad");
    public static Target INP_NIT = Target.the("ingresar nit").locatedBy("#nit");
    public static Target SLC_EMP_SOCIAL = Target.the("Es emprendimiento social").locatedBy("#emprendimientosocial");
    /*
     Datos de ubicación comercial
     */
    public static Target SLC_UC_MUNICIPIO = Target.the("seleccionar municipio").locatedBy("#muncom");
    public static Target SLC_UC_PAIS = Target.the("seleccionar pais").locatedBy("#paicom");
    public static Target INP_UC_TELEFONO1 = Target.the("ingresar telefono").locatedBy("#telcom1");
    public static Target SLC_UC_ZONA = Target.the("seleccionar zona").locatedBy("#codigozonacom");
    public static Target INP_UC_EMAIL = Target.the("ingresar correo").locatedBy("#emailcom");
    public static Target SLC_UC_UBICACION = Target.the("seleccionar ubicacion").locatedBy("#ctrubi");
    public static Target SLC_UC_SEDE = Target.the("seleccionar sede").locatedBy("#tiposedeadm");
    /*
     Datos de ubicación para notificación judicial
     */
    public static Target SLC_NJ_MUNICIPIO = Target.the("seleccionar municipio").locatedBy("#munnot");
    public static Target INP_NJ_TELEFONO1 = Target.the("ingresar telefono").locatedBy("#telnot");
    public static Target SLC_NJ_ZONA = Target.the("seleccionar zona").locatedBy("#codigozonanot");
    public static Target INP_NJ_EMAIL = Target.the("ingresar correo").locatedBy("#emailnot");

    public static Target SLC_AUTORIZACION = Target.the("seleccionar autorizacion").locatedBy("#ctrmennot");
    public static Target INP_ANYO_DATOS = Target.the("ingresar anio datos").locatedBy("#anodatos");
    public static Target INP_FECHA_DATOS = Target.the("ingresar fecha datos").locatedBy("#fechadatos");
    public static Target SLC_GRUPO_NIFF = Target.the("seleccionar grupo").locatedBy("#gruponiif");
    public static Target TXTA_ACT_ECONOMICA = Target.the("descripcion de actividad economica").locatedBy("#desactiv");
    public static Target INP_FECHA_INICIO = Target.the("ingresar fecha inicio").locatedBy("#feciniact1");
    public static Target INP_DATOS_FECHA = Target.the("fecha de los datos").locatedBy("#fechadatostamanoempresarial");
    public static Target SLC_APORTANTE = Target.the("seleccionar es aportante").locatedBy("#aportantesegsocial");

    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_GRAB_ANEXO = Target.the("grabar anexo CAE").locatedBy("(//*[text()='Grabar Anexo CAE'])[1]");
    public static Target LINK_DIG_VINCULOS = Target.the("digitar vinculos").locatedBy("(//*[text()='Digitar vínculos'])[1]");
    public static Target LINK_ADD_VINCULO = Target.the("adicionar vinculo").locatedBy("//a/strong[text()='Adicionar vínculos']");
    public static Target SLC_INSCRP_NOMBRAMIENTO = Target.the("Inscripción que soporta el nombramiento").locatedBy("#_inscripcion");
    public static Target SLC_TIPO_IDENTIFICACION = Target.the("tipo de identificacion").locatedBy("#_idclase");
    public static Target SLC_GENERO = Target.the("genero").locatedBy("#_sexo");
    public static Target INP_NUM_IDENTIFICACION = Target.the("numero de identificacion").locatedBy("#_numid");
    public static Target INP_PRIM_APELLIDO = Target.the("primer apellido").locatedBy("#_ape1");
    public static Target INP_SEG_APELLIDO = Target.the("segundo apellido").locatedBy("#_ape2");
    public static Target INP_PRIM_NOMBRE = Target.the("primer nombre").locatedBy("#_nom1");
    public static Target INP_SEG_NOMBRE = Target.the("segundo nombre").locatedBy("#_nom2");
    public static Target SLC_TIPO_VINCULO = Target.the("tipo de vinculo").locatedBy("#_vinculo");
    public static Target SLC_CARGO = Target.the("seleccionar cargo").locatedBy("#_idcargo");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_DIG_CERTIFICAS = Target.the("digitar certificas").locatedBy("(//*[text()='Digitar certificas'])[1]");
    public static Target LINK_EDIT_CERTIFICAS = Target.the("modificar registro").locatedBy("//a[contains(@href,\"editar('{0}')\")]");
    public static Target INP_NUEVA_INFORMACION = Target.the("ingresar nueva informacion").locatedBy("#tinymce");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_INFO_FINANCIERA = Target.the("digitar informacion financiera").locatedBy("(//*[text()='Digitar información financiera'])[1]");
    public static Target INP_ANYO = Target.the("anyo datos").locatedBy("#_anodatos");
    public static Target INP_FECHA = Target.the("fecha datos").locatedBy("#_fechadatos");
    public static Target INP_PERSONAL = Target.the("personal").locatedBy("#_personal");
    public static Target INP_ACT_CORRIENTE = Target.the("activo corriente").locatedBy("#_actcte");
    public static Target INP_ACT_TOTAL = Target.the("activo total").locatedBy("#_acttot");
    public static Target INP_PAT_NETO = Target.the("patrimonio neto").locatedBy("#_patnet");
    public static Target INP_PASIV_PATRIM = Target.the("Pasivo + patrimonio").locatedBy("#_paspat");
    public static Target INP_INGR_OPERACIONAL = Target.the("ingreso operacional").locatedBy("#_ingope");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_DIG_CAPITALES = Target.the("digitar capitales").locatedBy("(//*[text()='Digitar capitales'])[1]");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_REV_EXPEDIENTES = Target.the("revisar expedientes").locatedBy("(//*[text()='Revisar expediente'])[1]");
    public static Target BTN_DOC_TRAMITE = Target.the("Documentos en trámite que afectan el expediente").locatedBy("(//*[contains(@href,'divTramites')])[1]");
    public static Target TABLE_TRAMITE = Target.the("informacion de tramites").locatedBy("//*[@id='divTramites']//tbody");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_SOLICITAR_NIT = Target.the("solicitud nit a la dian").locatedBy("(//*[text()='Solicitud Nit a la DIAN'])[1]");
    public static Target TXT_INFO = Target.the("mensaje informativo").locatedBy("//form/p");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_ACT_RUES = Target.the("actualizacion rues").locatedBy("(//*[text()='Actualización RUES'])[1]");
    public static Target BTN_ACT_RUES_V2 = Target.the("actualizar rues v2").locatedBy("//*[text()='Actualizar RUES V2']");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_ENVIO_INFO_ALCALDIA = Target.the("envio informacion a la alcaldia").locatedBy("(//*[text()='Envío información a la alcaldía'])[1]");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    public static Target LINK_FIN_DIGITACION = Target.the("finalizar digitalizacion").locatedBy("(//*[text()='Finalizar digitación'])[1]");
    // ----------------------------------------------------------------------------------------------------------------------------------------//
    // ELEMENTOS QUE PUEDEN SER USADOS MULTIPLES VECES
    public static Target BTN_VOLVER = Target.the("volver").locatedBy("//*[contains(text(),'Volver')]");
    public static Target BTN_REGRESAR = Target.the("regresar").locatedBy("//*[contains(text(),'Regresar')]");
    public static Target BTN_RECARGAR = Target.the("recargar").locatedBy("//*[contains(text(),'Recargar')]");
    public static Target BTN_GUARDAR = Target.the("boton de guardar").locatedBy("//button[text()='Grabar']");
    public static Target BTN_GRABAR = Target.the("grabar informacion").locatedBy("//*[contains(text(),'Grabar')]");
    public static Target LINK_NUEVO_REGISTRO = Target.the("Nuevo registro").locatedBy("//*[contains(text(),'Nuevo')]");
}
