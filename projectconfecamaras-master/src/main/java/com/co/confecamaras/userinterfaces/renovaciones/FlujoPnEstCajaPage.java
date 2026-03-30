package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoPnEstCajaPage {

    //CAMPOS DE PRIMER FORMULARIO PERSONA NATURAL ESTABLECIMIENTO CAJA

    public static final Target BOTON_FORMULARIO_1 = Target.the("boton de ingreso al formulario primero")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[1]");
    public static final Target LISTA_SELECION_AUTORIZACIONES = Target.the("lista de seleccion de autorizaciones")
            .locatedBy("//select[@id='ctrmennot']");

    public static final Target LISTA_SELECION_TIPO_DE_LOCAL = Target.the("lista de seleccion de autorizaciones")
            .locatedBy("//select[@id='tipolocal']");

    public static final Target LISTA_SELECION_TIPO_DE_LOCAL_NO_PROPIO = Target.the("lista de seleccion de autorizaciones")
            .locatedBy("(//option[@value='0'])[2]");

    public static final Target CAMPO_FECHA_INICIO_ACTIVIDAD_SEGUNDARIA = Target.the("campo fecha de inicio de actividad segundaria")
            .locatedBy("//input[@id='feciniact2']");

    public static final Target CAMPO_VALOR_ACTIVO_TOTAL = Target.the("campo donde se encuentra el valor del activo")
            .locatedBy("//input[@id='acttot_2026']");

    public static final Target CAMPO_VALOR_COMERCIAL_VINCULADOS = Target.the("campo valor comercial activos vinculados")
            .locatedBy("//input[@id='actvin_2026']");

    public static final Target BUTTON_CIIU_MAYOR_INGRESO = Target.the("boton de ciiu para generar mejores ingresos")
            .locatedBy("//input[@id='ciiutamanoempresarial_1']");

    public static final Target LISTA_SELECCION_DIAN = Target.the("lista de seleccion DIAN")
            .locatedBy("//select[@id='admondian']");

    public static final Target CAMPO_ACTIVO_CORRIENTE = Target.the("campo de activo corriente")
            .locatedBy("//input[@id='actcte_2026']");

    public static final Target CAMPO_ACTIVO_CORRIENTE_2025 = Target.the("campo de activo corriente 2025")
            .locatedBy("//input[@id='actcte_2025']");

    public static final Target CAMPO_ACTIVO_CORRIENTE_2024 = Target.the("campo de activo corriente 2025")
            .locatedBy("//input[@id='actcte_2024']");

    public static final Target CAMPO_PASIVO_CORRIENTE = Target.the("campo de pasivo corriente")
            .locatedBy("//input[@id='pascte_2026']");

    public static final Target CAMPO_PASIVO_CORRIENTE_2025 = Target.the("campo de pasivo corriente 2024")
            .locatedBy("//input[@id='pascte_2025']");

    public static final Target CAMPO_PASIVO_CORRIENTE_2024 = Target.the("campo de pasivo corriente 2025")
            .locatedBy("//input[@id='pascte_2024']");

    public static final Target CAMPO_PERSONAL_OCUPADO = Target.the("campo de personal ocupado")
            .locatedBy("//input[@id='personal_2026']");

    public static final Target CAMPO_PERSONAL_OCUPADO_2025 = Target.the("campo de personal ocupado 2025")
            .locatedBy("//input[@id='personal_2025']");
    public static final Target CAMPO_PERSONAL_OCUPADO_2024 = Target.the("campo de personal ocupado 2024")
            .locatedBy("//input[@id='personal_2024']");

    public static final Target LISTA_PERSONAL_OCUPADO_ADMINISTRATIVO = Target.the("campo de personal ocupado administrativo")
            .locatedBy("//select[@id='etnias_cargdir_participacion']");

    public static final Target CAMPO_PERSONAL_OCUPADO_ADMINISTRATIVO = Target.the("campo de personal ocupado administrativo")
            .locatedBy("//input[@id='etnias_cardir_rom_participacion']");

    public static final Target CAMPO_CANTIDAD_MUJERES_OCUPADAS = Target.the("campo cantidad de mujeres ocupadas")
            .locatedBy("//input[@id='cantidadmujeres']");

    public static final Target LISTA_PERTENECE_GRUPO_ETNICO = Target.the("lista de si pertenece a un grupo etnico en especifico")
            .locatedBy("//select[@id='etnias_pnat_pertenencia']");

    public static final Target LISTA_AUTORIZA_INFORMACION = Target.the("lista de si autoriza datos etnia")
            .locatedBy("//select[@id='etnias_pnat_permite_uso_informacion']");

    public static final Target LISTA_GRUPO_ETNICO = Target.the("lista de seleccion grupo etnico")
            .locatedBy("//select[@id='etnias_pnat_etnia']");

    public static final Target CAMPO_NOMBRE_GRUPO_ETNICO = Target.the("campo de ingreso nombre grupo etnico")
            .locatedBy("//input[@id='etnias_pnat_cual']");

    public static final Target LISTA_CUENTA_EMPLEADOS_ETNICOS = Target.the("lista de seleccion de si cuenta con empleados de grupos etnicos")
            .locatedBy("//select[@id='etnias_pnat_pertenencia_empleados']");

    public static final Target LISTA_CUENTA_EMPLEADOS_ETNICOS_1 = Target.the("lista de seleccion de si cuenta con empleados de grupos etnicos")
            .locatedBy("//select[@id='etnias_empleados_participacion']");

    public static final Target LISTA_AUTORIZA_USO_INFORMACION = Target.the("lista de seleccion de si autoriza uso de la informacion")
            .locatedBy("//select[@id='etnias_pnat_permite_uso_informacion']");

    public static final Target CAMPO_GITANOS = Target.the("campo gitanos")
            .locatedBy("//input[@id='etnias_empleados_rom_participacion']");

    public static final Target CAMPO_RAZIAL = Target.the("campo razial")
            .locatedBy("//input[@id='etnias_empleados_raizal_participacion']");

    public static final Target CAMPO_PALENQUES = Target.the("campo palenques")
            .locatedBy("//input[@id='etnias_empleados_palenquero_participacion']");

    public static final Target CAMPO_NEGROS = Target.the("campo negros")
            .locatedBy("//input[@id='etnias_empleados_negro_participacion']");

    public static final Target CAMPO_AFRODECENDIENTES = Target.the("campo afrodecendientes")
            .locatedBy("//input[@id='etnias_empleados_afrodescendiente_participacion']");

    public static final Target CAMPO_INDIGENAS = Target.the("campo indigenas")
            .locatedBy("//input[@id='etnias_empleados_indigenas_participacion']");

    public static final Target CAMPO_CUAL = Target.the("campo cual")
            .locatedBy("//input[@id='etnias_empleados_indigenas_cual']");

    public static final Target BOTON_ALAMCENAR = Target.the("boton almacenar")
            .locatedBy("//button[@class='btn btn-primary']");

    public static final Target BOTON_MENSAJE_INFORMACION = Target.the("boton aceptar informacion despues de almacenar")
            .locatedBy("//button[contains(text(),'Aceptar')]");

    //CAMPOS DE SEGUNDO FORMULARIO PERSONA NATURAL ESTABLECIMIENTO CAJA

    public static final Target BOTON_ACEPTAR_ALERTA = Target.the("boton de aceptar alerta REGN0080")
            .locatedBy("//button[contains(text(),'Aceptar')]");

    public static final Target LISTA_SELECCION_TIPO_DOCUMENTO_RECIBO = Target.the("lista de seleccion de tipo de documento al generar recibo")
            .locatedBy("//select[@id='_idtipoidentificacioncliente']");

    public static final Target LISTA_SELECCION_MUNICIPIO = Target.the("lista de seleccion de municipio al generar recibo")
            .locatedBy("//select[@id='_idtipoidentificacioncliente']");
    public static final Target BOTON_FORMULARIO_2 = Target.the("boton de ingreso al formulario segundo")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[3]");

    public static final Target CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO = Target.the("campo de ingreso de valor vinculado al establecimiento")
            .locatedBy("//input[@id='actvin_2026']");

    public static final Target CAMPO_DIRECCION_COMERCIAL = Target.the("campo de direccion comercial")
            .locatedBy("//input[@id='_direccion']");

    public static final Target CAMPO_CODIGO_POSTAL = Target.the("campo de direccion comercial")
            .locatedBy("//input[@id='_codposcom']");

    public static final Target BOTON_DUPLICAR = Target.the("boton duplicar")
            .locatedBy("//a[contains(text(),'Duplicar')]");
    public static final Target CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2025 = Target.the("campo de ingreso de valor vinculado al establecimiento")
            .locatedBy("//input[@id='actvin_2025']");

    public static final Target CAMPO_VALOR_COMERCIAL_VINCULADO_ESTABLECIMIENTO_2024 = Target.the("campo de ingreso de valor vinculado al establecimiento")
            .locatedBy("//input[@id='actvin_2024']");

    public static final Target CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM = Target.the("campo personal ocupado 2 formulario")
            .locatedBy("//input[@id='personal_2026']");

    public static final Target CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2025 = Target.the("campo personal ocupado 2 formulario")
            .locatedBy("//input[@id='personal_2025']");

    public static final Target CAMPO_PERSONAL_OCUPADO_SEGUNDO_FORM_2024 = Target.the("campo personal ocupado 2 formulario")
            .locatedBy("//input[@id='personal_2024']");

    public static final Target BOTON_PRIMER_PDF = Target.the("boton de ver pdf generado")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[2]");

    public static final Target BOTON_SEGUNDO_PDF = Target.the("boton de ver pdf generado dos")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[4]");

    public static final Target CUADRO_GENERADO_PDF = Target.the("boton de ver pdf generado dos")
            .locatedBy("//div[@class='p-dialog p-component p-dialog-default p-ripple-disabled p-dialog-enter-done']");

    public static final Target CONTENEDOR_PDF = Target.the("contenedor")
            .locatedBy("//div[@class='col-lg-12 py-2 text-center']");

    public static final Target BOTON_CERRAR_PDF = Target.the("boton de ver pdf generado dos")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_INSERTAR_PDF_1 = Target.the("boton para ingreso de relacion trabajadores")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[5]");

    public static final Target BOTON_INSERTAR_PDF_2 = Target.the("boton para ingreso de declaracion de la persona")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[6]");

    public static final Target CAMPO_INGRESO_RUTA_PDF = Target.the("campo de ingreso de pdf")
            .locatedBy("//input[@id='anexo']");

    public static final Target CAMPO_OBSERVACIONES = Target.the("campo de ingreso de observaciones")
            .locatedBy("//textarea[@id='descripcion']");

    public static final Target CAMPO_ENTIDAD_PERSONA_QUE_EXPIDE = Target.the("campo de ingreso de persdona o entidad que expide")
            .locatedBy("//input[@id='origendoc']");

    public static final Target BOTON_CARGAR_DOCUMENTO = Target.the("boton cargar documento")
            .locatedBy("//button[@class='btn btn-primary mr-2']");

    //CAMPOS DE RECIBIR PAGO

    public static final Target CAMPO_NOMBRE_RECIBO = Target.the("campo de nombre en el recibo")
            .locatedBy("//input[@id='_nombre1cliente']");

    public static final Target CAMPO_SEGUNDO_NOMBRE_RECIBO = Target.the("campo de nombre en el recibo")
            .locatedBy("//input[@id='_nombre2cliente']");

    public static final Target CAMPO_PRIMER_APELLIDO_RECIBO = Target.the("campo de primer apellido en el recibo")
            .locatedBy("//input[@id='_apellido1cliente']");

    public static final Target CAMPO_SEGUNDO_APELLIDO_RECIBO = Target.the("campo de segundo apellido en el recibo")
            .locatedBy("//input[@id='_apellido2cliente']");
    public static final Target CAMPO_IDENTIFICACION = Target.the("campo de identificacion verificar identificacion")
            .locatedBy("//input[@id='_identificacioncliente']");

    public static final Target BOTON_VERIFICAR_IDENTIFICACION = Target.the("boton de verificar identificacion")
            .locatedBy("//button[contains(text(),'Verificar identificación')]");

    public static final Target CAMPO_CELULAR_VERIFICACION = Target.the("campo de numero de celular en verificacion")
            .locatedBy("//input[@id='_celular']");

    public static final Target CAMPO_CORREO_VERIFICACION = Target.the("campo de correo en verificacion")
            .locatedBy("//input[@id='_email']");

    public static final Target CAMPO_CORREO_VERIFICACION_CONFIRMACION = Target.the("campo de correo en verificacion confirmacio")
            .locatedBy("//input[@id='_emailconfirmacion']");

    public static final Target BOTON_GENERAR_RECIBO = Target.the("boton de generar recibo")
            .locatedBy("//button[contains(text(),'Generar recibo')]");

    public static final Target BOTON_CONTINUAR_GENERAR_RECIBO = Target.the("boton de continuar generar recibo")
            .locatedBy("//button[contains(text(),'Continuar')]");

    public static final Target TEXTO_RESUMEN_TRANSACCION = Target.the("texto final despues de generar recibo")
            .locatedBy("//strong[contains(text(),'Resumen final de la transacción')]");

    public static final Target OPCION_SERVICIOS = Target.the("opcion servicios despues de generar recibo")
            .locatedBy("//a[contains(text(),'Servicios')]");

    public static final Target OPCION_SOPORTES = Target.the("opcion soportes despues de generar recibo")
            .locatedBy("//a[contains(text(),'Soportes')]");

    public static final Target OPCION_SOPORTES_VER_1 = Target.the("opcion soportes despues de generar recibo ver pdf 1")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[1]");

    public static final Target OPCION_SOPORTES_VER_2 = Target.the("opcion soportes despues de generar recibo ver pdf 2")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[2]");

    public static final Target OPCION_SOPORTES_VER_3 = Target.the("opcion soportes despues de generar recibo ver pdf 3")
            .locatedBy("(//button[@class='btn btn-outline-primary btn-sm'])[3]");

    public static final Target BOTON_RECIBIR_PAGO = Target.the("boton para recibir el pago")
            .locatedBy("//button[@id='botones_ren0']");

    public static final Target BOTON_RECIBIR_PAGO_1 = Target.the("boton para recibir el pago")
            .locatedBy("//button[@id='botones_ren1']");

    public static final Target BOTON_RECIBIR_PAGO_TEXTO = Target.the("boton para recibir el pago por texto")
            .locatedBy("//button[contains(.,'Pago Electrónico')]");

    public static final Target BOTON_RECIBIR_PAGO_TEXTO_2 = Target.the("boton para recibir el pago por texto 2")
            .locatedBy("//button[contains(.,'Recibir Pago')]");

    public static final Target ALERTA_CAJERO = Target.the("alerta del cajero")
            .locatedBy("//div[@id='modal_body']");

    public static final Target CERRAR_ALERTA_CAJERO = Target.the("cierra alerta del cajero")
            .locatedBy("(//button[contains(text(),'Cerrar')])[1]");

    public static final Target BOTON_VERIFICAR_PAGO = Target.the("boton para veriricar pago")
            .locatedBy("//button[contains(text(),'Verificar pago')]");

}
