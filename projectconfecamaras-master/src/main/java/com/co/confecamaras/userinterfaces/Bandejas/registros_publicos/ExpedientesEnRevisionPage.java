package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ExpedientesEnRevisionPage {

    /*
     LOCATORS PARA ACTUALIZAR FORMULARIO
     */
    public static Target SLC_ACCESO_PUBLICO = Target.the("abrir acceso a publico").locatedBy("#ctrcontrolaccesopublico");
    public static Target BTN_OK_ALERT = Target.the("aceptar la alerta").locatedBy("//div/*[text()='OK']");
    /*
     LOCATORS PARA ADICIONAR VINCULOS
     */
    public static Target LINK_ADD_VINCULO = Target.the("adicionar vinculo").locatedBy("//a/strong[text()='Adicionar vínculos']");
    public static Target SLC_INSCRP_NOMBRAMIENTO = Target.the("Inscripción que soporta el nombramiento").locatedBy("#_inscripcion");
    public static Target SLC_TIPO_IDENTIFICACION = Target.the("tipo de identificacion").locatedBy("#_idclase");
    public static Target SLC_GENERO = Target.the("genero").locatedBy("#_sexo");
    public static Target INP_NUM_IDENTIFICACION = Target.the("numero de identificacion").locatedBy("#_numid");
    public static Target SLC_TIPO_VINCULO = Target.the("tipo de vinculo").locatedBy("#_vinculo");
    public static Target SLC_CARGO = Target.the("seleccionar cargo").locatedBy("#_idcargo");
    /*
     LOCATORS PARA ACTUALIZAR FINANCIERA
     */
    public static Target LINK_EDIT_FINANCIERA = Target.the("editar expediente").locatedBy("//small[text()='{0}']/following::a[contains(@href,'editar')]");
    public static Target INP_ACT_CORRIENTE = Target.the("activo corriente").locatedBy("#_actcte");
    public static Target INP_ACT_TOTAL = Target.the("activo total").locatedBy("#_acttot");
    public static Target INP_PAT_NETO = Target.the("patrimonio neto").locatedBy("#_patnet");
    public static Target INP_PASIV_PATRIM = Target.the("Pasivo + patrimonio").locatedBy("#_paspat");
    public static Target INP_INGR_OPERACIONAL = Target.the("ingreso operacional").locatedBy("#_ingope");

    /*
     LOCATORS PARA ACTUALIZAR CAPITALES
     */
    public static Target TXT_INFORMACION = Target.the("mensaje informatico").locatedBy("(//p)[4]");

    /*
     LOCATORS PARA ACTUALIZAR CERTIFICAS
     */
    public static Target LINK_EDIT_CERTIFICAS = Target.the("modificar registro").locatedBy("//a[contains(@href,\"editar('{0}')\")]");
    public static Target INP_NUEVA_INFORMACION = Target.the("ingresar nueva informacion").locatedBy("#tinymce");

    /*
     LOCATORS PARA ACTUALIZAR KARDEX
     */
    public static Target INP_FECHA_LIMITE = Target.the("fecha limite").locatedBy("#fechalimite");
    public static Target TXT_ALERT = Target.the("mensaje de alerta").locatedBy(".bootbox-body");
    public static Target BTN_BORRAR = Target.the("borrara el registro").locatedBy("//*[text()='Borrar']");
    public static Target BTN_GENERAR_SELLO = Target.the("generar sello").locatedBy("//*[text()='Generar sello']");
    // FUNCIONA PARA LAS ALERTAS QUE CONTENGAN EL BOTON
    public static Target BTN_CANCELAR = Target.the("no se borrara el registro").locatedBy("//*[text()='Cancelar']");

    /*
     LOCATORS PARA MARCAR REVISADO
     */
    public static Target LINK_MARCAR_REVISADO = Target.the("marcar revisado").locatedBy("//*[@data-original-title='Marcar revisado']");

    /*
     LOCATORS QUE SIRVEN PARA LA MAYORIA DE ACCIONES
     */
    public static Target LINK_GRABAR = Target.the("guardar informacion").locatedBy("(//*[text()='Grabar'])[1]");
}
