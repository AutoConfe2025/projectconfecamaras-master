package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoAgilEsadlPage {

    public static final Target BOTON_SELECCION_MATRICULA = Target.the("boton para seleccionar la primera matricula")
            .locatedBy("//*[@id=\"pr_id_11_content\"]/div/div/ul/li[1]");

    public static final Target EDITAR_NUEVO_VALOR_BOTON = Target.the("boton para editar")
            .locatedBy("(//td[@class='p-editable-column'])[1]");

    public static final Target EDITAR_NUEVO_VALOR_BOTON_ESTABLECIMIENTO = Target.the("boton para editar establecimiento")
            .locatedBy("//*[@id=\"pr_id_149_content_1\"]/div/div/div/div/table/tbody/tr/td[4]");

    public static final Target CAMPO_EDITABLE_NUEVO_VALOR_BOTON = Target.the("campo ingreso nuevo valor")
            .locatedBy("(//input[@class='p-inputnumber-input p-inputtext p-component p-filled'])[1]");

    public static final Target LISTA_EMPRENDIMIENTO_SOCIAL = Target.the("lista de emprendimiento social")
            .locatedBy("//select[@id='emprendimientosocial']");

    public static final Target CAMPO_NUMERO_DE_PERSONAL = Target.the("campo numero de personal")
            .locatedBy("(//input[@class='p-inputnumber-input p-inputtext p-component p-filled'])[1]");

    public static final Target BOTON_LIQUIDAR_ESADL_AGIL = Target.the("boton de liquidar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_DILIGENCIAR_ESADL_AGIL = Target.the("boton de diligenciar esadl")
            .locatedBy("//button[contains(text(),'Diligenciar')]");

    public static final Target LISTA_AUTORIZA_MENSAJES = Target.the("lista de autorizacion de envio de mensaje correo electronico")
            .locatedBy("//select[@id='ctrmennot']");

    public static final Target CAMPO_INGRESO_VALOR_ACTIVOS_VINCULADOS = Target.the("campo de ingreso de activos vinculados")
            .locatedBy("//input[@id='actvin_2026']");

    public static final Target VALOR_ACTIVO_TOTAL = Target.the("valor de activo total")
            .locatedBy("//input[@id='acttot_2026']");

    //FORMULARIO DILIGENCIAR
    public static final Target CAMPO_INGRESO_VALOR_ACTIVO_TOTAL = Target.the("campo valor de activo total")
            .locatedBy("//input[@id='actcte_2026']");


    public static final Target CAMPO_INGRESO_VALOR_PASIVO_TOTAL = Target.the("campo valor de pasivo total")
            .locatedBy("//input[@id='pascte_2026']");

    public static final Target CAMPO_INGRESO_VALOR_ACTIVIDAD_ORDINARIA = Target.the("campo valor de actividad ordinaria")
            .locatedBy("//input[@id='actcte_2026']");

    public static final Target LISTA_PARTICIPACION_GRUPOS_ETNICOS = Target.the("lista de participacion de grupos etnicos")
            .locatedBy("//select[@id='etnias_socios_participacion']");

    public static final Target LISTA_PERTENECE_GRUPOS_ETNICOS = Target.the("lista de pertenece de grupos etnicos")
            .locatedBy("//select[@id='etnias_empleados_participacion']");

    public static final Target LISTA_PARTICIPACION_GRUPOS_ETNICOS_ADMINISTRATIVOS = Target.the("lista de participacion de grupos etnicos administrativos")
            .locatedBy("//select[@id='etnias_cargdir_participacion']");

    public static final Target BOTON_GRABAR_FORMLARIO_ESADL = Target.the("boton de grabar formulario esadl")
            .locatedBy("(//button[@class='btn btn-primary'])[2]");

    public static final Target BOTON_CONTINUAR_FORMLARIO_ESADL = Target.the("boton de continuar formulario esadl")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_OK_FORMLARIO_ESADL = Target.the("boton de ok de continuar formulario esadl")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_LIQUIDACION_DEL_TRAMITE = Target.the("boton liquidacion del tramite")
            .locatedBy("(//button[@class='btn btn-sm btn-primary'])[1]");

    public static final Target BOTON_CERRAR_LIQUIDACION_DEL_TRAMITE = Target.the("boton cerrar liquidacion del tramite")
            .locatedBy("//button[@class='p-sidebar-close p-sidebar-icon p-link']");

    //FLUJO DE FIRMA

    public static final Target BOTON_ABRIR_PDF_DE_FIRMA = Target.the("boton abrir pdf de firma")
            .locatedBy("//button[@data-pr-tooltip='Visualizar']");

    public static final Target BOTON_CERRAR_PDF_DE_FIRMA = Target.the("boton cerrar pdf de firma")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_FIRMAR_ESADL = Target.the("boton firmar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_SI_FIRMAR_ESADL = Target.the("boton si firmar")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_CERRAR_SI_FIRMAR_ESADL = Target.the("boton cerrar si firmar")
            .locatedBy("//button[@class='swal2-cancel swal2-styled']");

    //FLUJO VISUALIZAR

    public static final Target BOTON_ABRIR_PDF_DE_VISUALIZAR = Target.the("boton abrir pdf de visualizar")
            .locatedBy("//button[@data-pr-tooltip='Visualizar']");

    public static final Target BOTON_PAGAR_ESADL_AGIL = Target.the("boton pagar esadl agil")
            .locatedBy("//button[@class='btn btn-primary']");

    //PAGOS

    public static final Target MODAL_RECONOCIMIENTO_EMPRESARIAL = Target.the("mensaje alerta de beneficios")
            .locatedBy("//div[@id='modal1200x600_body']");

    public static final Target BOTON_CERRAR_ALERTA_PAGOS = Target.the("boton cerrar mensaje alerta de beneficios")
            .locatedBy("//*[@id=\"modal1200x600_body\"]/p[1]");

    public static final Target LISTA_SELECCION_TIPO_CLIENTE = Target.the("lista de seleccion de tipo de cliente")
            .locatedBy("//select[@id='_tipocliente']");

    public static final Target LISTA_SELECCION_TIPO_IDENTIFICACION = Target.the("lista de seleccion de tipo de identificacion")
            .locatedBy("//select[@id='_tipoidentificacioncliente']");

    public static final Target CAMPO_INGRESO_IDENTIFICACION_CLIENTE = Target.the("campo de tipo de identificacion")
            .locatedBy("//input[@id='_identificacioncliente']");

    public static final Target BOTON_PAGAR_CON_PSE = Target.the("boton de pagos con pse")
            .locatedBy("//button[contains(text(),'Pagar con PSE o Tarjeta de Crédito')]");
}
