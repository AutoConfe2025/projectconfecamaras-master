package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoAgilPnPage {

    //Login

    public static final Target CAMPO_CORREO_AGIL = Target.the("correo")
            .locatedBy("//input[@id='correo']");

    public static final Target CAMPO_IDENTIFICACION_AGIL = Target.the("identificacion")
            .locatedBy("//input[@id='identificacion']");

    public static final Target CAMPO_CONTRASEÑA_AGIL = Target.the("contraseña")
            .locatedBy("//input[@class='p-password-input p-inputtext p-component']");

    public static final Target BOTON_INGRESAR = Target.the("boton de ingreso")
            .locatedBy("//button[@class='btn btn-primary']");

    //Login


    //Valores

    public static final Target CAMPO_NUEVO_VALOR = Target.the("campo nuevo valor")
            .locatedBy("(//td[@class='p-editable-column'])[1]");

    public static final Target CAMPO_NUEVO_EDITABLE = Target.the("campo nuevo valor editable")
            .locatedBy("(//input[@class=\"p-inputnumber-input p-inputtext p-component p-filled\"])[1]");

    public static final Target CAMPO_NUEVO_VALOR_2 = Target.the("campo nuevo valor 2")
            .locatedBy("(//td[@class='p-editable-column'])[2]");


    public static final Target BOTON_LIQUIDAR = Target.the("boton para liquidar")
            .locatedBy("//button[contains(text(),'Liquidar')]");

    //valores

    //Diligenciar Formulario 1
    public static final Target BOTON_DILIGENCIAR_FORMULARIO_1 = Target.the("boton diligenciar formulario 1")
            .locatedBy("(//button[contains(text(),'Diligenciar')])[1]");

    public static final Target BOTON_DILIGENCIAR_FORMULARIO_2 = Target.the("boton diligenciar formulario 2")
            .locatedBy("(//button[contains(text(),'Diligenciar')])[2]");

    public static final Target CAMPO_FECHA_CIIU2 = Target.the("campo fecha CIIU 2")
            .locatedBy("//input[@id='feciniact2']");
    public static final Target VALOR_ACTIVO_TOTAL = Target.the("valor de activo total")
            .locatedBy("//input[@id='acttot_2026']");

    public static final Target CAMPO_ACTIVO_TOTAL = Target.the("Campo de activo total")
            .locatedBy("//input[@id='actcte_2026']");

    public static final Target CAMPO_PASIVO_TOTAL = Target.the("Campo de pasivo total")
            .locatedBy("//input[@id='pascte_2026']");

    public static final Target CAMPO_PERSONAL_OCUPADO_AGIL = Target.the("Campo de personal ocupado renovacion agil")
            .locatedBy("//input[@id='personal_2026']");

    public static final Target LISTA_GRUPO_ETNICO_AGIL = Target.the("lista de grupo etnico agil")
            .locatedBy("//select[@id='etnias_pnat_pertenencia']");

    public static final Target LISTA_AUTORIZACION_USO_INFO = Target.the("lista de seleccion de autorizacion de uso de informacion")
            .locatedBy("//select[@id='etnias_pnat_permite_uso_informacion']");

    public static final Target LISTA_GRUPO_ETNICO = Target.the("lista de seleccion de grupo etnico")
            .locatedBy("//select[@id='etnias_pnat_etnia']");

    public static final Target CAMPO_NOMBRE_COMUNIDAD_INDIGENA = Target.the("campo de ingreso de comunidad indigena")
            .locatedBy("//input[@id='etnias_pnat_cual']");

    public static final Target LISTA_SI_CUENTA_EMPLEADOS_ETNICO = Target.the("lista de seleccion si tiene empleados con grupo etnico")
            .locatedBy("//select[@id='etnias_empleados_participacion']");

    public static final Target CAMPO_GITANOS_CANTIDAD = Target.the("campo de ingreso cantidad gitanos")
            .locatedBy("//input[@id='etnias_empleados_rom_participacion']");

    public static final Target CAMPO_RAZIAL_CANTIDAD = Target.the("campo de ingreso cantidad razial")
            .locatedBy("//input[@id='etnias_empleados_raizal_participacion']");

    public static final Target CAMPO_PALENQUEROS_CANTIDAD = Target.the("campo de ingreso cantidad palenqueros")
            .locatedBy("//input[@id='etnias_empleados_palenquero_participacion']");

    public static final Target CAMPO_NEGROS_CANTIDAD = Target.the("campo de ingreso cantidad Negros")
            .locatedBy("//input[@id='etnias_empleados_negro_participacion']");

    public static final Target CAMPO_AFRO_CANTIDAD = Target.the("campo de ingreso cantidad afro")
            .locatedBy("//input[@id='etnias_empleados_afrodescendiente_participacion']");

    public static final Target CAMPO_INDIGENAS_CANTIDAD = Target.the("campo de ingreso cantidad indigenas")
            .locatedBy("//input[@id='etnias_empleados_indigenas_participacion']");

    public static final Target CAMPO_INDIGENAS_CUAL_CANTIDAD = Target.the("campo de ingreso cantidad indigenas cual")
            .locatedBy("//input[@id='etnias_empleados_indigenas_cual']");

    public static final Target BOTON_GRABAR_FORM = Target.the("boton de grabar formulario")
            .locatedBy("//button[contains(text(),'  Grabar')]");

    //Diligenciar Formulario 1

    //Diligenciar Formulario 2
    public static final Target LISTA_AUTORIZACION_MENSAJES = Target.the("Lista de autorizacion de mensajes")
            .locatedBy("//select[@id='ctrmennot']");

    public static final Target LISTA_CIIU_MAYORES_INGRESOS = Target.the("Lista de seleccion ciiu con mayor ingreso")
            .locatedBy("//select[@id='ciiutamanoempresarialselect']");

    public static final Target CAMPO_VALOR_COMERCIAL_AGIL = Target.the("campo de valor comercial o activos vinculados al establecimiento")
            .locatedBy("//input[@id='actvin_2026']");

    public static final Target BOTON_LIQUIDACION_TRAMITE = Target.the("boton de liquidacion del tramite")
            .locatedBy("(//button[@class='btn btn-sm btn-primary'])[1]");

    public static final Target BOTON_CERRAR_LIQUIDACION_TRAMITE = Target.the("boton de cerrar liquidacion del tramite")
            .locatedBy("//button[@class='p-sidebar-close p-sidebar-icon p-link']");

    public static final Target BOTON_CONTINUAR_LIQUIDACION_AGIL = Target.the("boton de continuar agil")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_OK_ALERTA = Target.the("boton de ok alerta en agil")
            .locatedBy("//button[contains(text(),'OK')]");

    //Diligenciar Formulario 2

    //Flujo Firma

    public static final Target BOTON_PRIMER_PDF_AGIL = Target.the("boton primer pdf agil")
            .locatedBy("(//button[@id])[7]");

    public static final Target BOTON_SEGUNDO_PDF_AGIL = Target.the("boton segundo pdf agil")
            .locatedBy("(//button[@id])[8]");

    public static final Target BOTON_CERRAR_PDF_AGIL = Target.the("boton cerrar pdf agil")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_FIRMAR = Target.the("boton firmar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_SI_ALERTA_FIRMAR = Target.the("boton si alerta firmar")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_CERRAR_ALERTA_FIRMAR = Target.the("boton cerrar firmar")
            .locatedBy("//button[@class='swal2-cancel swal2-styled']");

    public static final Target BOGON_PAGAR = Target.the("boton pagar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOGON_CONTINUAR_PAGO_NO_PRESENCIAL = Target.the("boton continuar pago no presencial")
            .locatedBy("//button[contains(text(),'Continuar')]");
    //Flujo Firma

    //Flujo formulario pago
    public static final Target LISTA_TIPO_CLIENTE = Target.the("lista de tipo de cliente")
            .locatedBy("//select[@id='_tipocliente']");

    public static final Target LISTA_IDENTIFICACION_CLIENTE = Target.the("lista de identificacion de cliente")
            .locatedBy("//select[@id='_tipoidentificacioncliente']");

    public static final Target CAMPO_IDENTIFICACION_CLIENTE = Target.the("campo de identificacion de cliente")
            .locatedBy("//input[@id='_identificacioncliente']");

    public static final Target CAMPO_CELULAR_CLIENTE = Target.the("campo de celular de cliente")
            .locatedBy("//input[@id='_movil']");

    public static final Target BOTON_PAGAR_PSE_TC = Target.the("boton para pagar con pes o tc")
            .locatedBy("//button[contains(text(),'Pagar con PSE o Tarjeta de Crédito')]");

}
