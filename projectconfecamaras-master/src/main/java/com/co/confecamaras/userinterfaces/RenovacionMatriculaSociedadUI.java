package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RenovacionMatriculaSociedadUI extends PageObject {
    public static final Target BTN_RENOVACION_MATRICULA_SOCIEDAD = Target.the("Boton renovacion matricula")
            .located(By.xpath("//span[text()='Renovar matrícula']"));

    public static final Target BTN_CONTINUAR_SOCIEDAD = Target.the("Boton continuar")
            .located(By.xpath("//form[@id='iniciarRenovacion']//button[@type='submit']"));

    public static final Target TXT_NUEVOS_ACTIVOS_SOCIEDAD = Target.the("Escribir nuevos activos Comerciante")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[4]/div/input"));

    public static final Target POP_UP_INFORMATIVO = Target.the("Pop-ups Recuerde que a partir del 1ro de enero de 2025 ... ")
            .located(By.xpath("//button[normalize-space()='Aceptar']"));

    public static final Target RAD_BTN_NUEVOS_ACTIVOS_SOCIEDAD = Target.the("checkbox nuevos activos establecimiento")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]"));

    public static final Target TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD = Target.the("Escribir nuevos activos dos EST")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[4]/div[2]/div/div[2]/table/tbody/tr/td[4]/div/input"));

    public static final Target TXT_NUEVOS_ACTIVOS_TRES_SOCIEDAD = Target.the("Escribir nuevos activos tres Comerciante")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/div/input"));

    public static final Target TXT_NUEVOS_ACTIVOS_CUATRO_SOCIEDAD = Target.the("Escribir nuevos activos cuatro EST")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[4]/div[2]/div/div[2]/table/tbody/tr[2]/td[4]/div/input"));

    public static final Target TXT_NUEVOS_ACTIVOS_CINCO_SOCIEDAD = Target.the("Escribir nuevos activos cinco Comerciante")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr[3]/td[4]/div/input"));

    public static final Target TXT_NUEVOS_ACTIVOS_SEIS_SOCIEDAD = Target.the("Escribir nuevos activos seis EST")
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/form/div[1]/div[4]/div[2]/div/div[2]/table/tbody/tr[3]/td[4]/div/input"));

    public static final Target TXT_NUMERO_EMPLEADOS_SOCIEDAD = Target.the("Escribir numero de empleados")
            .located(By.id("numeroempleados"));

    public static final Target BTN_LIQUIDAR_SOCIEDAD = Target.the("Boton liquidar")
            .located(By.xpath("(//button[normalize-space()='Continuar'])[1]"));

    public static final Target BTN_SELECCIONAR_ARCHIVO_SOCIEDAD = Target.the("Boton seleccionar archivo")
            .located(By.id("activosMenores"));

    public static final Target LBL_SERVICIO_SOCIEDAD = Target.the("Mensaje numero de servicio")
            .located(By.xpath("//th[text()='06010002']"));

    public static final Target BTN_FORMULARIO_SOCIEDAD = Target.the("Boton formulario")
            .located(By.xpath("//i[@class='fa-sharp fa-solid fa-pen-to-square']"));

    public static final Target BTN_FORMULARIO_DOS_SOCIEDAD = Target.the("Boton formulario dos")
            .located(By.xpath("(//i[@class='fa-sharp fa-solid fa-pen-to-square'])[2]"));

    public static final Target SELECT_ES_EMPRENDIMIENTO_SOCIAL_SOCIEDAD = Target.the("Seleccionar es emprendimiento social")
            .located(By.id("emprendimientosocial"));

    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_PDH = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_pdh"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_ADS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_ads"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_RPD = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_rpd"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OOEP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_ooep"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OTR = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccat_otr"));
    public static Target SELECT_EMPRENDIMIENTO_CATEGORIA_OTROS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsoccategorias_otros"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PRUIS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_pruis"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PPRRRE = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_pprrre"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_MRCCA = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_mrcca"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PCIRNARP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_pcirnarp"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PHVCA = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_phvca"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PD = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_pd"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_PEP = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_pep"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_OTR = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocben_otr"));
    public static Target SELECT_EMPRENDIMIENTO_BENEFICIA_OTROS = Target.the("Seleccionar es emprendimiento social En qué categoria desarrolla su emprendimiento social?")
            .located(By.id("empsocbeneficiarios_otros"));


    public static final Target SELECT_AUTORIZA_MENSAJES_CORREO_SOCIEDAD = Target.the("Seleccionar autoriza envio de mensajes al correo electronico")
            .located(By.id("ctrmennot"));
    public static final Target RBTN_MAYOR_INGRESO = Target.the("Seleccionar el radio boton de mayor ingresos")
            .located(By.id("ciiutamanoempresarial_1"));
    public static final Target TXT_FECHA_SOCIEDAD = Target.the("Escribir fecha")
            .located(By.id("feciniact2"));

    public static final Target RD_BTN_CIUU_SOCIEDAD = Target.the("Radio boton ciuu")
            .located(By.id("ciiutamanoempresarial_1"));

    public static final Target TXT_ACTIVO_CORRIENTE_SOCIEDAD = Target.the("Escribir activo corriente")
            .located(By.id("actcte_2025"));

    public static final Target TXT_PATRIMONIO_NETO_SOCIEDAD = Target.the("Escribir patrimonio neto")
            .located(By.id("pattot_2025"));

    public static final Target TXT_INGRESOS_ACTIVIDAD_ORDINARIA_SOCIEDAD = Target.the("Escribir ingresos actividad ordinaria")
            .located(By.id("ingope_2025"));
    public static final Target TXT_PERSONAL_OCUPADO_SOCIEDAD = Target.the("Escribir cantidad de personal ocupado")
            .located(By.id("personal_2025"));
    public static final Target PERSONAL_OCUPADO_TXT = Target.the("Escribir Personal ocupado")
            .located(By.id("personal_2025"));
    public static final Target NUM_CARGOS_DIRECTIVOS_TXT = Target.the("Escribir Numero total de cargos directivos")
            .located(By.id("cantidadcargosdirectivos"));
    public static final Target MENU_DES_REQUIERE_VIGILANCI_CONTROL = Target.the("Menu desplegable Ha remitido documentación al ente de inspección, vigilancia y control?")
            .located(By.id("ctresainfoivc"));
    public static final Target MENU_DES_REQUIERE_AUTORIZACION = Target.the("Menu desplegable Requiere autorización de registro?")
            .located(By.id("ctresaautregistro"));
    public static final Target MENU_DES_NATURALEZA = Target.the("Menu desplegable Clasificación (Naturaleza)")
            .located(By.id("ctresacodnat"));
    public static final Target MENU_DES_CLASE_IDENTIDAD = Target.the("Menu desplegableClase de entidad de economía solidaria")
            .located(By.id("claseeconsoli"));
    public static final Target MENU_DES_CLASE_INDICADORES_GESTION = Target.the("Menu desplegableClase de Cuenta con indicadores de gestión")
            .located(By.id("ctresaindgest"));

    public static final Target TXT_ACTIVO_VINCULADO_EST = Target.the("Cuadro de texto Activos vinculados establecimiento")
            .located(By.id("actvin_2025"));

    public static final Target MENU_DES_TIPO_LOCAL = Target.the("Menu desplegable Tipo de local")
            .located(By.id("tipolocal"));

    public static final Target BTN_ALMACENAR_SOCIEDAD = Target.the("Boton almacenar")
            .located(By.xpath("//*[contains(text(), 'Almacenar')]"));

    public static final Target BTN_OK_SOCIEDAD = Target.the("Boton Aceptar")
            .located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));

    public static final Target BTN_OK_SOCIEDAD_OK = Target.the("Boton Aceptar")
            .located(By.xpath("/html/body/div[3]/div/div/div[2]/button"));


    public static final Target BTN_OK_DATOS_ALMACENADOS = Target.the("Boton OK Los datos fueron almacenados correctamente despues del formulario")
            .located(By.cssSelector("button[class='btn btn-primary bootbox-accept']"));

    public static final Target BTN_OK = Target.the("Boton OK")
            //.located(By.cssSelector("button[class='btn btn-primary bootbox-accept']"));
            .located(By.cssSelector("body > div.bootbox.modal.fade.bootbox-alert.show > div > div > div.modal-footer > button"));

    public static final Target BTN_FIRMA_MANUSCRITA_SOCIEDAD = Target.the("Boton firma manuscrita")
            .located(By.xpath("//*[text()='Firma Manuscrita']"));

    public static final Target TXT_NOMBRE_APELLIDO_FIRMANTE = Target.the("Escribir correo electronico")
            .located(By.id("nombres"));
    public static final Target TXT_CORREO_ELECTRONICO_SOCIEDAD = Target.the("Escribir correo electronico")
            .located(By.id("correo"));
    public static final Target MENUDES_CEDULA_EXTRANJERIA = Target.the("Escribir correo electronico")
            .located(By.id("tipoid"));
    public static final Target TXT_IDENTIFICACION = Target.the("Escribir correo electronico")
            .located(By.id("identificacion"));
    public static final Target TXT_CELULAR_SOCIEDAD = Target.the("Escribir celular")
            .located(By.id("celular"));

    public static final Target BTN_GENERAR_QR_SOCIEDAD = Target.the("Boton generar qr")
            .located(By.xpath("//*[contains(text(), 'Generar QR')]"));

    public static final Target IMG_QR_SOCIEDAD = Target.the("Imagen qr")
            .located(By.xpath("//img[@alt=\"FirmaQR\"]"));

    public static final Target BTN_GUARDAR_FIRMA_SOCIEDAD= Target.the("Boton guardar firma")
            .located(By.xpath("//*[contains(text(), ' Guardar firma')]"));

    public static final Target BTN_OK_DOS_SOCIEDAD = Target.the("Boton ok")
            .located(By.xpath("(//button[text()='OK'])[2]"));

    public static final Target BTN_RECIBIR_PAGO_SOCIEDAD = Target.the("Boton recibir pago")
            .located(By.xpath("(//a[@role='button'])[1]"));

    public static final Target BTN_CERRAR_SOCIEDAD = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_SI_SOCIEDAD = Target.the("Boton si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_OBTENER_SOBRE_DIGITAL_SOCIEDAD = Target.the("Boton obtener sobre digital")
            .located(By.xpath("//*[text()='Obtener Sobre Digital']"));

    public static final Target LBL_VER_DOCUMENTO_SOCIEDAD = Target.the("Mensaje ver documento")
            .located(By.id("ModalTitulo"));

    public static final Target BTN_CERRAR_DOS_SOCIEDAD = Target.the("Boton cerrar")
            .located(By.xpath("(//button[text()='Cerrar'])[1]"));

    public static final Target BTN_VISULALIZAR_BALANCE_SOCIEDAD = Target.the("Boton visualizar balance")
            .located(By.xpath("//i[@title=\"Visualizar balance\"]"));

    public static final Target BTN_SOPORTES_SOCIEDAD = Target.the("Boton soportes")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_RECIBO_CAJA_SOCIEDAD = Target.the("Boton ver recibo de caja")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[1]"));

    public static final Target BTN_VER_FORMULARIO_RENOVACION_SOCIEDAD = Target.the("Boton ver formulario de renovacion")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[2]"));

    public static final Target BTN_VER_RADICADO_SOCIEDAD = Target.the("Boton ver radicado")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[8]"));

    public static final Target BTN_VER_RADICADO_DOS_SOCIEDAD = Target.the("Boton ver radicado dos")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[5]"));

    public static final Target LBL_NOMBRES_SOCIEDAD = Target.the("Nombres")
            .located(By.xpath("//table[@id=\"soportes\"]//child::td[1]"));

    public static final Target BTN_VER_RADICADO_TABLE_SOCIEDAD = Target.the("Boton ver radicado")
            .located(By.xpath("//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"]"));

    public static final Target LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SOCIEDAD = Target.the("Mensaje final renovacion matricula sociedad")
            .located(By.id("ModalTitulo"));

    public static final Target LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_PN_ESTADO_INACTIVO = Target.the("Mensaje final renovacion matricula sociedad")
            .located(By.xpath("//small[@id=\"estado\"]"));

    public static final Target LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_PJ_ESTADO_INACTIVO = Target.the("Mensaje final renovacion matricula sociedad")
            .located(By.id("estado"));

    public static final Target LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_ACTIVIDAD_NO_COMERCIAL = Target.the("Mensaje final renovacion matricula actividad no comercial")
            //.located(By.xpath("//*[text()='Para la matrícula ']"));
            .located(By.id("matricula"));

}