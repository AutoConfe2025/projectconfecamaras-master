package com.co.confecamaras.userinterfaces.actualizacion_datos;

import net.serenitybdd.screenplay.targets.Target;

public class ActualizacionMutacionCajaPage {

    public static final Target BOTON_ACTUALIZACION_DATOS = Target.the("Opcion de lista actualizacion de datos")
            .locatedBy("//a[.//span[contains(normalize-space(),'Actualización de datos')]]");

    public static final Target ALERTA_ACTUALIZACION_DATOS_BOTON_OK = Target.the("alerta de actualizacion de datos")
            .locatedBy("//button[contains(text(),'OK')]");

    public static final Target CAMPO_DIRECCION = Target.the("campo de ingreso de direccion")
            .locatedBy("//textarea[@id='dircom']");

    public static final Target CAMPO_TELEFONO_1 = Target.the("campo de ingreso de telefono 1")
            .locatedBy("//input[@id='telcom1']");

    public static final Target CAMPO_CELULAR = Target.the("campo de ingreso de celular")
            .locatedBy("//input[@id='celcom']");

    public static final Target CAMPO_CORREO = Target.the("campo de ingreso de correo electronico")
            .locatedBy("//input[@id='emailcom']");

    public static final Target CAMPO_CORREO_NOTIFICACION_JUDICIAL = Target.the("campo de ingreso de correo electronico notificacion judicial")
            .locatedBy("//input[@id='emailnot']");

    public static final Target BOTON_BUSQUEDA_CIIU_2 = Target.the("boton buscar ciiu 2")
            .locatedBy("(//button[@data-id='ciiu2'])[1]");

    public static final Target CAMPO_BUSQUEDA_CIIU_2 = Target.the("campo de ingreso de celular")
            .locatedBy("//input[@class='w-100 p-inputtext p-component']");

    public static final Target BOTON_REALIZAR_BUSQUEDA_CIIU_2 = Target.the("boton realizar buscar ciiu 2")
            .locatedBy("//span[@class='pi pi-search accionCursor p-input-icon']");

    public static final Target PRIMER_OPCION_BUSQUEDA_CIIU_2 = Target.the("primer opcion busqueda ciiu 2")
            .locatedBy("(//span[@class='p-accordion-header-text'])[1]");

    public static final Target BOTON_AGREGAR_CIIU_2 = Target.the("boton para agregar ciiu2 uno")
            .locatedBy("(//button[@class='btn btn-outline-primary'])[1]");

    public static final Target BOTON_SI_AGREGAR_CIIU_2 = Target.the("boton de si para agregar ciiu2 uno")
            .locatedBy("(//button[@class='swal2-confirm swal2-styled'])[1]");

    public static final Target LISTA_CIIU_GENERO_MRAYOR_INGRESO = Target.the("boton de si para agregar ciiu2 uno")
            .locatedBy("//select[@id='ciiutamanoempresarial']");

    public static final Target BOTON_LIQUIDAR_MUTACION = Target.the("boton de liquidar")
            .locatedBy("//button[@id='btnLiquidar']");

    public static final Target BOTON_FIRMA_ELECTRONICA_MUTACION = Target.the("boton de firma electronica mutacion")
            .locatedBy("//button[@id='btnFelectronica']");

    public static final Target BOTON_CARGAR_DOCUMENTO_MUTACION = Target.the("boton cargar el documento de la mutacion")
            .locatedBy("//button[contains(text(),'Cargar ')]");

    public static final Target BOTON_VISUALIZAR_DOCUMENTO_MUTACION = Target.the("boton visualizar el documento de la mutacion")
            .locatedBy("//i[@class='fa fa-eye text-dark cursorPointer']");

    public static final Target BOTON_VER_SOPORTE_MUTACION = Target.the("boton de ver soporte de la mutacion")
            .locatedBy("//button[@id='btnSoporte']");

    public static final Target BOTON_CERRAR_SOPORTE_MUTACION = Target.the("boton de cerrar soporte de la mutacion")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");
    public static final Target BOTON_CARGAR_SOPORTE_MUTACION = Target.the("boton de cargar soporte mutacion")
            .locatedBy("//a[@id='btnCargaSoporte']");

    public static final Target BOTON_RECIBIR_PAGO_MUTACION = Target.the("boton de recibir el pago de la mutacion")
            .locatedBy("//button[@id='btnRpago']");

    public static final Target BOTON_SOBRE_DIGITAL = Target.the("boton de sobre digital")
            .locatedBy("//button[contains(normalize-space(),'Sobre digital')]");

    public static final Target BOTON_PAGAR_MUTACION = Target.the("boton de sobre digital")
            .locatedBy("(//button[contains(normalize-space(),'Pagar')])[1]");

    public static final Target CAMPO_CAPTURA_COD_BARRAS = Target.the("campo de  captura del codigo de barras")
            .locatedBy("//td[contains(.,'Cod. Barras')]/following-sibling::td");
    public static final Target BOTON_MENU_CAMARA_DE_COMERCIO = Target.the("boton de menu camara de comercio")
            .locatedBy("//button[@class='btnhamburgesaMenu hoverIconosHeader']");

    public static final Target BOTON_CERRAR_ACCIONES = Target.the("boton de menu camara de comercio")
            .locatedBy("//button[@class='close']");

    public static final Target BOTON_BANDEJAS = Target.the("boton de bandejas menu camara de comercio")
            .locatedBy("//span[contains(text(),'BANDEJAS')]");
    public static final Target OPCION_REGISTROS_PUBLICOS = Target.the("boton de registros publicos")
            .locatedBy("//a[@class='p-menuitem-link']");

    public static final Target OPCION_REPATO_Y_ESCANEO = Target.the("boton de reparto y escaneo")
            .locatedBy("//span[contains(text(),'(R) Reparto y Escaneo')]");

    public static final Target CAMPO_INGRESO_COD_BARRAS_INICIAL = Target.the("campo de ingreso de cod de barras incial")
            .locatedBy("//input[@id='codigobarrasinicial']");

    public static final Target BOTON_ESCANEO_Y_DIGITALIZACION = Target.the("boton de escaneo y digitalizacion")
            .locatedBy("//a[@data-original-title='Finalizar escaneo y digitalización']");

    public static final Target BOTON_CONTINUAR_ESCANEO_DIGITALIZACION = Target.the("boton continuar de escaneo y digitalizacion")
            .locatedBy("//button[contains(text(),'Continuar')]");

    public static final Target LISTA_USUARIO_SELECCION = Target.the("boton usuario seleccion")
            .locatedBy("//select[@id='_usuarioX']"); //CAJAQA usuario lista

    public static final Target BOTON_ASIGNAR_ESCANEO_DIGITALIZACION = Target.the("boton asignar de escaneo y digitalizacion")
            .locatedBy("//button[contains(text(),'Asignar')]");

    public static final Target OPCION_ESTUDIO_REGMTIL = Target.the("boton asignar de escaneo y digitalizacion")
            .locatedBy("//span[contains(text(),'(R) Estudio RegMtil')]");

    public static final Target CAMPO_BUSCAR_REGMTIL = Target.the("campo  de busqueda de regmtil")
            .locatedBy("//input[@type='search']");

    public static final Target BOTON_DEVOLVER_REQUERIMIENTO = Target.the("boton de devolver el requerimiento")
            .locatedBy("//a[@data-original-title='Devolver/Requerir']");

    public static final Target LISTA_TIPO_TRAMITE_DEVOLUCION = Target.the("lista de tipo de tramite en devolucion")
            .locatedBy("//select[@id='_tipotramite']");//mutacionactualizacion

    public static final Target LISTA_TIPO_PROCEDE_REINGRESO = Target.the("lista de tipo de procede reingreso")
            .locatedBy("//select[@id='_tipodevolucion']");//D

    public static final Target LISTA_TIPO_DEVOLUCION = Target.the("lista de tipo de devolucion")
            .locatedBy("//select[@id='_devolucionparcial']");//T

    public static final Target SELECCIONAR_ACLARAR_AUMENTO_CAPITAL = Target.the("boton de seleccionar por aumento de capital")
            .locatedBy("(//a[contains(text(),'Seleccionar')])[1]");

    public static final Target CAMPO_INGRESO_OBSERVACIONES = Target.the("campo de ingreso de obervaciones")
            .locatedBy("//textarea[@id='_observaciones']");

    public static final Target BOTON_GRABAR_FORMULARIO_ = Target.the("boton de grabar el formulario")
            .locatedBy("//button[contains(text(),'Grabar')]");

    public static final Target BOTON_APLICAR_FORMULARIO_ = Target.the("boton de aplicar el formulario")
            .locatedBy("//button[contains(text(),'Aplicar')]");

    public static final Target BOTON_BUSCAR_CRTL_K = Target.the("boton buscar ctrlk")
            .locatedBy("//button[@class='btn_busqueda_header']");

    public static final Target CAMPO_BUSCAR_CRTL_K = Target.the("campo buscar ctrlk")
            .locatedBy("//input[@id='searchInput']");

    public static final Target OPCION_RUTA_DOCUMENTOS = Target.the("opcion de ruta de documentos")
            .locatedBy("//span[contains(text(),'Ruta de documentos')]");

    public static final Target OPCION_REINGRESO_TRAMITES = Target.the("opcion de reingreso de tramites")
            .locatedBy("(//span[contains(text(),'Reingreso de trámites')])[1]");

    public static final Target CAMPO_INGRESO_VALOR_BUSQUEDA = Target.the("campo de ingreso de valor de busqueda ")
            .locatedBy("//input[@class='w-100 p-inputtext p-component']");

    public static final Target BOTON_CONSULTAR_ = Target.the("campo de ingreso de valor de busqueda ")
            .locatedBy("//button[@class='p-button-primary mr-2 p-button p-component']");

    public static final Target BOTON_ENTREGAR_AL_USUARIO = Target.the("boton entregar al usuario")
            .locatedBy("//span[contains(text(),'Entregar al usuario')]");

    public static final Target BOTON_SI_INFORMATIVO = Target.the("boton si entregar al usuario")
            .locatedBy("//button[contains(text(),'Si')]");

    public static final Target BOTON_OK_SI_INFORMATIVO = Target.the("boton ok si entregar al usuario")
            .locatedBy("//button[contains(text(),'OK')]");

    public static final Target CAMPO_CODIGO_DE_BARRAS_INGRESO = Target.the("campo de ingreso de cod de barras")
            .locatedBy("//input[@id='codigobarras']");

    public static final Target BOTON_CONTINUAR_REINGRESAR = Target.the("boton continuar reingresar tramite devuelto")
            .locatedBy("//button[@class='btn btn-sm btn-primary']");

    public static final Target VALIDA_TEXTO_FINAL = Target.the("texto final")
            .locatedBy("//div[@id='swal2-html-container']");

    public static final Target OPCION_INSCRIPCION_PROPONENTE = Target.the("boton inscripcion proponente")
            .locatedBy("//span[normalize-space()='Inscripción como proponente']");

    public static final Target BOTON_CONSULTAR_PROPONENTE = Target.the("boton consultar proponente")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_INICIAR_TRAMITE_PROPONENTE = Target.the("boton iniciar tramite proponente")
            .locatedBy("//a[@title='Iniciar trámite']");

    public static final Target BOTON_FORMULARIO_PROPONENTE = Target.the("boton formulario proponente")
            .locatedBy("(//button[@id='btnGrabarLiquidacionInscripcionProponentes'])[2]");

    public static final Target LISTA_TAMAÑO_EMPRESA = Target.the("lista de tamaño de la empresa")
            .locatedBy("//select[@id='_rproGen_tamanoempresa']");

    public static final Target BOTON_GRABAR_LISTA_TAMAÑO_EMPRESA = Target.the("boton de grabar lista de tamaño de la empresa")
            .locatedBy("//button[@id='btnGrabarDatosBasicos']");

    public static final Target OPCION_RUTA_PROPONENTE = Target.the("opcion ruta del proponente")
            .locatedBy("(//a[@title='Cargar soporte'])[1]");

    public static final Target CAMPO_DOCUMENTO_PROPONENTE = Target.the("campo de ingreso de documento proponente")
            .locatedBy("//input[@id='_numdoc']");

    public static final Target CAMPO_FECHA_PROPONENTE = Target.the("campo de ingreso de fecha proponente")
            .locatedBy("//input[@id='_fechadoc']");

    public static final Target CAMPO_ORIGEN_DOCUMENTO_PROPONENTE = Target.the("campo de ingreso de origen del documento proponente")
            .locatedBy("//input[@id='_origendoc']");

    public static final Target CAMPO_ANEXO_CARGAR_PROPONENTE = Target.the("campo de ingreso de anexo proponente")
            .locatedBy("//input[@id='userfile']");

    public static final Target BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE = Target.the("boton de grabar el formulario")
            .locatedBy("//button[@class='btn btn-primary mr-2']");

    public static final Target BOTON_GRABAR_FORMULARIO_ANEXO_PROPONENTE_2 = Target.the("boton de grabar el formulario")
            .locatedBy("(//Button[@class='btn btn-primary mr-2'])[2]");


    public static final Target OPCION_DOCUMENTO_IDENTIDAD_PROPONENTE = Target.the("opcion documento de identidad proponente")
            .locatedBy("(//a[@title='Cargar soporte'])[2]");

    public static final Target OPCION_CERTIFICADO_DE_PEQUENA_EMPRESA = Target.the("opcion de certificado de pequeña empresa")
            .locatedBy("(//a[@title='Cargar soporte'])[3]");

    public static final Target OPCION_TARJETA_PROFESIONAL_DEL_CONTADOR = Target.the("opcion de tarjeta profesional del contador publico")
            .locatedBy("(//a[@title='Cargar soporte'])[4]");

    public static final Target CERTIFICACION_JUNTA_CENTRAL_CONTADORES = Target.the("opcion de junta central de contadores")
            .locatedBy("(//a[@title='Cargar soporte'])[5]");

    public static final Target CERTIFICACION_APORTES_SISTEMA_SEGURIDAD_SOCIAL = Target.the("certificacion de aportes al sistema de seguridad social")
            .locatedBy("(//a[@title='Cargar soporte'])[6]");

    public static final Target BOTON_UBICACION_COMERCIAL_NOTIFICACIONES = Target.the("boton de ubicacion comercial y de notificaciones")
            .locatedBy("//span[contains(text(),'Ubicación Comercial y de Notificación')]");

    public static final Target BOTON_GRABAR_FORMULARIO = Target.the("boton de grabar formulario")
            .locatedBy("//button[@id='btnGrabarUbicacion']");

    public static final Target BOTON_CAPACIDAD_FINANCIERA_ORGANIZACION = Target.the("boton de capacidad financiera y de organizacion")
            .locatedBy("//span[contains(text(),'Capacidad financiera y de Organización')]");

    public static final Target CAMPO_INGRESO_FECHA_CORTE = Target.the("ingreso de fecha de corte")
            .locatedBy("//input[@id='_rproGen_inffin1510_fechacorte']");

    public static final Target LISTA_GRUPO_NIIF = Target.the("lista de seleccion de grupo niif")
            .locatedBy("//select[@id='_rproGen_inffin1510_gruponiif']");//3c

    public static final Target BOTON_GRABAR_CAPACIDAD_FINANCIERA = Target.the("grabar capacidad financiera")
            .locatedBy("//button[@id='btnGrabarIFP']");

    public static final Target BOTON_EXPERIENCIA = Target.the("boton de experiencia")
            .locatedBy("//span[contains(text(),'Experiencia')]");

    public static final Target BOTON_ADICIONAR_CONTRATO = Target.the("boton de experiencia")
            .locatedBy("//a[@id='adicionarContrato']");

    public static final Target LISTA_CELEBRADO_POR = Target.the("lista de celebrado por")
            .locatedBy("//select[@id='celebradopor']");

    public static final Target CAMPO_NOMBRE_DEL_CONTRATANTE = Target.the("campo nombre del contratante")
            .locatedBy("//input[@id='nombrecontratante']");

    public static final Target CAMPO_FECHA_DEL_CONTRATANTE = Target.the("campo fecha del contratante")
            .locatedBy("//input[@id='fecejecucion']");

    public static final Target CAMPO_VALOR_EN_PESOS = Target.the("campo fecha del contratante")
            .locatedBy("//input[@id='valorpesos']");

    public static final Target CAMPO_CLASIFICAIONES_DATOS = Target.the("campo nigreso de calificaciones datos")
            .locatedBy("//textarea[@id='clasi1510texto']");

    public static final Target BOTON_GRABAR_DATOS_BASICOS_CONTRATO = Target.the("boton de grabar datos basicos del contrato")
            .locatedBy("//button[@id='btnGrabarDatosBasicosContrato']");

    public static final Target VALIDAR_PDF_EXPERIENCIA = Target.the("boton de validar datos basicos del contrato")
            .locatedBy("//a[@title='Generar Declaración']");

    public static final Target BOTON_CARGAR_DECLARACION = Target.the("boton de cargar declaracion")
            .locatedBy("//a[@title='Cargar Declaración']");

    public static final Target BOTON_CARGAR_SOPORTE = Target.the("boton de cargar soporte")
            .locatedBy("//a[@title='Cargar soporte']");

    public static final Target BOTON_CLASIFICACIONES = Target.the("boton de clasificaciones")
            .locatedBy("//span[contains(text(),'Clasificaciones ')]");

    public static final Target CAMPO_INGRESO_CLASIFICACION = Target.the("campo para ingresar clasificacion")
            .locatedBy("//textarea[@id='_rproGen_clasi1510texto']");


    public static final Target BOTON_GRABAR_CLASIFICACION = Target.the("boton grabar clasificacion")
            .locatedBy("//button[@id='btnGrabarClTx']");

    public static final Target BOTON_REVISION = Target.the("boton revision")
            .locatedBy("(//button[@class='btn btn-primary dropdown-toggle'])[1]");

    public static final Target BOTON_OPCION_FORMULARIO= Target.the("boton opcion de formulario")
            .locatedBy("//span[@id='btnValidarFormulario']");

    public static final Target BOTON_CERRAR_OPCION_FORMULARIO= Target.the("boton cerrar opcion de formulario")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_OPCION_SOPORTES= Target.the("boton opcion de soportes")
            .locatedBy("//span[@id='btnValidarSoportes']");

    public static final Target BOTON_VER_PDF = Target.the("boton ver pdf")
            .locatedBy("(//button[@class='btn btn-primary dropdown-toggle'])[2]");

    public static final Target BOTON_OPCION_FORMULARIO_BORRADOR= Target.the("boton opcion de formulario borrador")
            .locatedBy("//span[contains(text(),'Formulario Borrador')]");

    public static final Target BOTON_CERRAR_FORMULARIO_BORRADOR= Target.the("boton opcion de formulario borrador")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_OPCION_FORMULARIO_FINAL= Target.the("boton opcion de formulario final")
            .locatedBy("//span[contains(text(),'Formulario Final')]");

    public static final Target BOTON_SI_FORMULARIO_FINAL= Target.the("boton si de formulario final")
            .locatedBy("//button[contains(text(),'Sí')]");

    public static final Target BOTON_RECIBIR_PAGO = Target.the("boton recibir pago")
            .locatedBy("//button[@id='RecibirPago']");

    public static final Target BOTON_REFORMAS_CAPITAL = Target.the("boton reformas capital")
            .locatedBy("//button[contains(text(),'REFORMAS DE CAPITAL')]");

    public static final Target BOTON_CONTINUAR_AUMENTO_DE_CAPITAL_SUSCRITO_PRIMA = Target.the("boton continuar asociado al texto de aumento de capital")
            .locatedBy("//h6[normalize-space()='AUMENTO DE CAPITAL SUSCRITO PRIMA EN COLOCACION DE ACCIONES'] /following-sibling::a[normalize-space()='Continuar']");


    public static final Target CAMPO_FECHA_DOCUMENTO = Target.the("campo de fecha del documento")
            .locatedBy("//input[@id='_fechadoc']");

    public static final Target CAMPO_INGRESO_TEXTO_OBSERVACIONES = Target.the("campo de ingreso de texto")
            .locatedBy("//textarea[@id='_texto']");

    public static final Target BOTON_CARGA_SOPORTE = Target.the("campo de cargar el soporte")
            .locatedBy("//a[contains(text(),'Cargar soporte')]");
    public static final Target CAMPO_INGRESO_PDF = Target.the("campo de cargar el soporte en pdf")
            .locatedBy("//input[@id='file1']");
    public static final Target CAMPO_OBSERVACIONES_DESCRIPCION = Target.the("campo ingreso de observaciones")
            .locatedBy("//textarea[@id='descripcion']");
    public static final Target LISTA_TIPO_DOCUMENTO_ASOCIADO = Target.the("lista de tipo de documento asociado")
            .locatedBy("//select[@id='idtipodoc']");
    public static final Target CAMPO_DE_INGRESO_NO_DOC = Target.the("campo de ingreso de numero de documento")
            .locatedBy("//input[@id='numdoc']");

    public static final Target CAMPO_DE_INGRESO_FECHA_DOC = Target.the("campo de ingreso de fecha de documento")
            .locatedBy("//input[@id='fechadoc']");
    public static final Target CAMPO_DE_INGRESO_ORIGEN_DOC = Target.the("campo de ingreso de origen de documento")
            .locatedBy("//input[@id='txtorigendoc']");
    public static final Target BOTON_CARGAR_DOCUMENTO = Target.the("boton para cargar el documento")
            .locatedBy("//button[contains(text(),'Cargar')]");
    public static final Target BOTON_RECIBIR_PAGO_DOCUMENTO = Target.the("boton para recibir el pago del documento")
            .locatedBy("//button[contains(text(),'Recibir pago')]");
    public static final Target CAMPO_NOMBRE_REGISTRO = Target.the("campo de nombre de registro")
            .locatedBy("//input[@id='txtReingresarTramiteNomApe']");
    public static final Target LISTA_CAMPO_IDENTIFICACION_REGISTRO = Target.the("lista campo de identificacion de registro")
            .locatedBy("//select[@id='slctReingresarTramiteTipoIdentificacion']");
    public static final Target CAMPO_NUMERO_IDENTIFICACION_REGISTRO = Target.the("campo numero de identificacion de registro")
            .locatedBy("//input[@id='txtReingresarTramiteNumeroIdentificacion']");
    public static final Target CAMPO_FECHA_EXPEDICION_REGISTRO = Target.the("campo fecha de expedicion de registro")
            .locatedBy("//input[@id='txtReingresarTramiteFechaExpDocumento']");
    public static final Target CAMPO_CORREO_ELECTRONICO_REGISTRO = Target.the("campo correo electronico de registro")
            .locatedBy("//input[@id='txtReingresarTramiteEmail']");
    public static final Target CAMPO_TELEFONO_FIJO_REGISTRO = Target.the("campo telefono fijo de registro")
            .locatedBy("//input[@id='txtReingresarTramiteTelefonoFijo']");
    public static final Target CAMPO_CELULAR_REGISTRO = Target.the("campo celular de registro")
            .locatedBy("//input[@id='txtReingresarTramiteCelular']");
    public static final Target BOTON_TOMAR_FOTO_AL_USUARIO = Target.the("boton de tomar foto al usuario")
            .locatedBy("//button[@data-titulo-modal='Foto del usuario']");
    public static final Target BOTON_TOMAR_FOTO_DOCUMENTO_USUARIO = Target.the("boton de tomar foto documento usuario")
            .locatedBy("//button[@data-titulo-modal='Foto del documento de identidad']");
    public static final Target BOTON_TOMAR_FOTO_REVERSO_DOCUMENTO_USUARIO = Target.the("boton de tomar foto reverso documento usuario")
            .locatedBy("//button[@data-titulo-modal='Foto reverso del documento de identidad']");
    public static final Target BOTON_TOMAR_FOTO = Target.the("boton de tomar foto")
            .locatedBy("//button[@class='btn btn-sm btn-block btn-primary w-50 mx-auto']");
    public static final Target BOTON_GUARDAR_FOTO = Target.the("boton de guardar foto")
            .locatedBy("//button[@class='btn btn-primary btn-sm ml-2']");
    public static final Target BOTON_ACEPTAR_FOTO = Target.the("boton de aceptar foto")
            .locatedBy("//button[contains(text(),'Aceptar')]");
    public static final Target CAMPO_INGRESO_ARCHIVO = Target.the("boton de aceptar foto")
            .locatedBy("//input[@id='fileArchivoVerificacionDocIdentidad']");
    public static final Target BOTON_CONTINUAR_REINGRESO = Target.the("boton de continuar reingreso")
            .locatedBy("//button[@class='btn btn-sm btn-primary']");
}
