package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoActualizarProponentePage {

    /*flujo de ingreso de matricula hasta consulta de expediente*/
    public static final Target BOTON_PROPONENTE = Target.the("boton de proponente")
            .locatedBy("//span[contains(text(),'Proponente')]");

    public static final Target CAMPO_INGRESO_DATO_BUSQUEDA_PROPONENTE = Target.the("campo de ingreso de proponente")
            .locatedBy("//input[@id='criterio']");

    public static final Target BOTON_CONSULTAR_PROPONENTE = Target.the("boton consultar matricula proponente")
            .locatedBy("//button[@class='btn btn-primary newConsultar float-right']");

    public static final Target BOTON_ACCIONES_PROPONENTE = Target.the("boton acciones matricula proponente")
            .locatedBy("(//button[@class='btn btn-sm btn-outline-primary boton-accion'])[1]");

    public static final Target BOTON_TRAMITES_REGISTRO_PROPONENTE = Target.the("boton tramites de registro proponente")
            .locatedBy("(//a[@class='p-accordion-header-link'])[4]");

    public static final Target BOTON_ACTUALIZAR_REGISTRO_PROPONENTE = Target.the("boton actualizar de registro proponente")
            .locatedBy("(//div[@class='p-card-body'])[6]");

    public static final Target BOTON_CONSULTAR_REGISTRO_PROPONENTE = Target.the("boton consultar de registro proponente")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_ACCIONES_REGISTRO_PROPONENTE = Target.the("boton acciones de registro proponente")
            .locatedBy("//a[@class='btn btn-primary  btn-sm']");

    public static final Target BOTON_FORMULARIO_REGISTRO_PROPONENTE = Target.the("boton formulario de registro proponente")
            .locatedBy("//button[@class='btn btn-primary btn-block btn-block truncate ']//i[@class='fa fa-save']");


    // formulario de actualizacion

    public static final Target BOTON_GRABAR_FORM = Target.the("boton de grabar el formulario de registro proponente")
            .locatedBy("//button[@class='btn btn-primary btn-block btn-block truncate ']");

    public static final Target BOTON_EXPERIENCIA_FORM = Target.the("boton de experiencia el formulario de registro proponente")
            .locatedBy("//span[contains(text(),'Experiencia')]");

    public static final Target BOTON_ADICIONAR_CONTRATO = Target.the("boton de adicionar contrato formulario de registro proponente")
            .locatedBy("(//button[@class='btn btn-primary btn-block btn-block truncate '])[1]");

    public static final Target LITA_CELEBRADO_POR = Target.the("lista celebrado por")
            .locatedBy("//select[@id='celebradopor']");

    public static final Target CAMPO_NOMBRE_CONTRATANTE = Target.the("campo de nombre del contratante")
            .locatedBy("//input[@id='nombrecontratante']");

    public static final Target CAMPO_FECHA_EJECUCION_TERMINACION = Target.the("campo de fecha ejecucion terminacion")
            .locatedBy("//input[@id='fecejecucion']");

    public static final Target CAMPO_VALOR_EN_PESOS = Target.the("campo de valor en pesos")
            .locatedBy("//input[@id='valorpesos']");

    public static final Target CAMPO_CLASIFICACIONES = Target.the("campo de ingreso clasificaciones")
            .locatedBy("//textarea[@id='clasi1510texto']");

    public static final Target BOTON_GRABAR_DATOS_BASICOS_CONTRATO = Target.the("boton de grabar datos basicos del contrato")
            .locatedBy("//button[@id='btnGrabarDatosBasicosContrato']");

    //busqueda en tabla del elemento dinamico

    public static final Target TABLA = Target.the("tabla")
            .locatedBy("//table[contains(@class,'p-datatable-table')]");

    public static final Target QA_TEXTO = Target.the("valor QA")
            .locatedBy("(//span[contains(text(),'QA')])[2]");

    public static final Target SIGUIENTE = Target.the("boton siguiente")
            .locatedBy("//button[contains(@class,'p-paginator-next')]");

    public static final Target BOTON_CARGAR_DECLARACION_QA = Target.the("boton cargar declaracion campo qa")
            .locatedBy("(//td[normalize-space()='QA']/ancestor::tr/td[4]//a[2])[2]");

    //formulario cargar anexo
    public static final Target CAMPO_NUMERO_DEL_DOCUMENTO = Target.the("campo de numero del documento")
            .locatedBy("//input[@id='_numdoc']");
    public static final Target CAMPO_FECHA_DEL_ANEXO = Target.the("campo de fecha del anexo")
            .locatedBy("//input[@id='_fechadoc']");

    public static final Target CAMPO_ORIGEN_DOCUMENTO = Target.the("campo de origen del documento")
            .locatedBy("//input[@id='_origendoc']");

    public static final Target SELECCION_ARCHIVO_ORIGEN_DOCUMENTO = Target.the("campo de carga del documento")
            .locatedBy("//input[@id='userfile']");

    public static final Target BOTON_GRABAR_CARGAR_ANEXO = Target.the("boton de grabar cargar anexo")
            .locatedBy("(//button[@class='btn btn-primary mr-2'])[3]");

    //formulario clasificaciones

    public static final Target BOTON_CLASIFICACIONES = Target.the("boton de clasificaciones")
            .locatedBy("//span[contains(text(),'Clasificaciones ')]");

    public static final Target CAMPO_CLASIFICACIONES_INGRESO_TEXTO = Target.the("campo de ingreso de texto de clasificaciones")
            .locatedBy("//textarea[@id='_rproGen_clasi1510texto']");

    public static final Target BOTON_GRABAR_CLASIFICACIONES = Target.the("boton de grabar clasificaciones")
            .locatedBy("//button[@id='btnGrabarClTx']");

    public static final Target BOTON_VER_PDF = Target.the("boton lista de ver pdf")
            .locatedBy("(//button[@class='btn btn-primary dropdown-toggle'])[2]");
    public static final Target BOTON_FORMULARIO_BORRADOR = Target.the("boton formulario borrador")
            .locatedBy("//span[contains(text(),'Formulario Borrador')]");

    public static final Target BOTON_FORMULARIO_FINAL = Target.the("boton formulario final")
            .locatedBy("//span[contains(text(),'Formulario Final')]");

    public static final Target BOTON_CERRAR_PDF_FORMULARIO_BORRADOR = Target.the("boton cerrar formulario borrador")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_SI_GENERAR_FORM_FINAL = Target.the("boton si generar formulario final")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    // flujo de pagos

    public static final Target BOTON_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE = Target.the("boton recibir pago")
            .locatedBy("//button[@id='RecibirPago']");

    public static final Target BOTON_CONTINUAR_RECIBIR_PAGO_ACTUALIZAR_PROPONENTE = Target.the("boton continuar recibir pago")
            .locatedBy("//button[contains(text(),'Continuar')]");

    public static final Target LISTA_DE_SELECCION_TIPO_IDENTIFICACION = Target.the("lista de tipo de identificacion")
            .locatedBy("//select[@id='_idtipoidentificacioncliente']");

    public static final Target CAMPO_TIPO_IDENTIFICACION = Target.the("campo de tipo de identificacion")
            .locatedBy("//input[@id='_identificacioncliente']");

    public static final Target BOTON_VERIFICAR_IDENTIFICACION_ACTUALIZAR = Target.the("boton de verificar identificacion")
            .locatedBy("//button[contains(text(),'Verificar identificación')]");

    public static final Target CAMPO_CONFIRMAR_CORREO = Target.the("campo de confirmacion de correo electronico")
            .locatedBy("//input[@id='_emailconfirmacion']");

    public static final Target BOTON_DUPLICAR_DATOS_CLIENTE = Target.the("boton para duplicar los datos del cliente")
            .locatedBy("//button[contains(text(),'Duplicar datos del cliente')]");

    public static final Target BOTON_GENERAR_RECIBO_CLIENTE = Target.the("boton generar recibo de pago")
            .locatedBy("//button[contains(text(),'Generar recibo')]");

    public static final Target BOTON_GENERAR_RECIBO_CLIENTE_2 = Target.the("boton generar recibo de pago")
            .locatedBy("(//button[contains(text(),'Generar recibo')])[2]");
    public static final Target BOTON_CONTINUAR_RECIBO_PAGO = Target.the("boton continuar generar recibo de pago")
            .locatedBy("//button[contains(text(),'Continuar')]");

    public static final Target TEXTO_FINAL_PAGO = Target.the("texto finalizacion del pago")
            .locatedBy("(//p[@class='text-dark text-center'])[1]");
}
