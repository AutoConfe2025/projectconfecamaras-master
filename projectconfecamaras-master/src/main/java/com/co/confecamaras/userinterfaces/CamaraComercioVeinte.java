package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CamaraComercioVeinte extends PageObject {

    public static final Target ESPERA = Target.the("Espera")
            .located(By.xpath("//div[@class=\"loaderOnload\"]"));

    /*----------Menu principal----------*/

    public static final Target BTN_MENU_LATERAL_INICIAL = Target.the("Boton ingresar modulo de registro")
            .located(By.cssSelector("#expMenu > a > span > i"));

    public static final Target CERRAR_LATERALL = Target.the("Boton ingresar modulo de registro")
            .located(By.cssSelector("#expMenu > a > span > i"));

    public static final Target BTN_BANDEJAS = Target.the("Boton ingresar bandejas")
            // .located(By.xpath("(//*[contains(text(), 'BANDEJAS')])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[1]/li/a/div[1]"));

    public static final Target BTN_CONSULTAS_TRANSACCIONES = Target.the("Boton ingresar consultas y transacciones")
            .located(By.xpath("(//*[contains(text(), 'CONSULTAS Y TRANSACCIONES')])[2]"));

    public static final Target BTN_PARAMETRIZACION_ERP = Target.the("Boton mantenimiento opciones")
            .located(By.xpath("(//*[contains(text(), 'PARAMETRIZACION ERP')])[2]"));

    public static final Target BTN_INTEGRACION_ERP_RUES_CFE = Target.the("Boton ingresar integracion ERP, RUES, CFE")
            .located(By.xpath("(//*[contains(text(), 'INTEGRACION ERP, RUES, CFE')])[2]"));

    public static final Target BTN_MENU_LATERAL = Target.the("Boton menu lateral")
            .located(By.cssSelector(".rounded.expMenu"));

    public static final Target BTNS_MENU_LATERAL = Target.the("Botones menu lateral")
            .located(By.xpath("(//div[@class='titulo-menu'][normalize-space()='BANDEJAS'])[2]"));

    // @IsaacGomez - Se implementa para validar que el tablero de opciones se encuentre
    public static final Target NAV_OPCIONES = Target.the("opciones de menu").
            locatedBy("//nav[@id='menu' and not(contains(@style,'overflow: auto;'))]/div");

    //@IsaacGomez - Se implementa localizador para realizar una busqueda mas repida
    public static final Target INPUT_BUSCAR = Target.the("Buscar algun modulo especifico").
            locatedBy("//input[@placeholder='Buscar...']");

    // @IsaacGomez - se implementa este boton que ayuda a identificar la busqueda esperada
    //public static final Target BTN_OPCION_BUSQUEDA = Target.the("Selecciona el modulo buscado").
    //        locatedBy("//span//a[contains(normalize-space(string(.)),'{0}')]");

    public static final Target BTN_OPCION_BUSQUEDA = Target.the("Selecciona el modulo buscado").
            locatedBy("//ul[@class='list-unstyled list-group']//li[contains(.,'{0}')]//a");


    public static final Target OPCIONES_MENU_LATERAL = Target.the("opciones laterales").
            locatedBy("#accordionLateral1");

    public static final Target BTN_MODULO_REGISTRO = Target.the("Boton ingresar modulo de registro")
            //.located(By.xpath("(//*[contains(text(), 'MODULO DE REGISTRO')])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[16]/li/a"));

    public static final Target BTN_MODULO_REGISTRO_TIPO_TRAMIRE = Target.the("Boton ingresar modulo de registro")
            //.located(By.xpath("(//*[contains(text(), 'MODULO DE REGISTRO')])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[10]/li/a"));

    /*public static final Target BTN_MODULO_REGISTRO_2 = Target.the("Boton ingresar modulo de registro")
            //.located(By.xpath("(//*[contains(text(), 'MODULO DE REGISTRO')])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[10]/li/a"));*/

    public static final Target BTN_MODULO_REGISTRO_2 = Target.the("Boton ingresar modulo de registro")
            //.located(By.xpath("(//*[contains(text(), 'MODULO DE REGISTRO')])[2]"));
            .located(By.xpath("//nav/div/div[10]/li/a/div[1]"));


    public static final Target BTN_ASEGURAMIENTO_SII = Target.the("Boton ingresar aseguramiento del sii")
            .located(By.xpath("(//*[contains(text(), 'ASEGURAMIENTO DEL S.I.I')])[2]"));

    /*----------Menu secundario----------*/

    public static final Target BTN_REGISTROS_PUBLICOS = Target.the("Boton ingresar registros publicos")
            //.located(By.xpath("(//*[text()='Registros públicos'])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[1]/li/div/ul/li/div/li/a/div[1]"));

    public static final Target BTN_CONSULTAS_REGISTROS_PUBLICOS = Target.the("Boton ingresar consultas registros publicos")
            .located(By.xpath("(//*[contains(text(), 'Consultas registros públicos')])[2]"));

    public static final Target BTN_TRAMITES_REGISTROS_PUBLICOS = Target.the("Boton ingresar tramites registros publicos")
            .located(By.xpath("(//*[contains(text(), 'Trámites registros públicos')])[2]"));

    public static final Target BTN_REGISTROS_PUBLICOS_ADMINISTRACION = Target.the("Boton ingresar registros publicos administracion")
            .located(By.xpath("(//*[contains(text(), 'Registros públicos - administración')])[2]"));

    public static final Target BTN_REGISTROS_PUBLICOS_GESTION_CAJA = Target.the("Boton ingresar registros publicos gestion caja")
            .located(By.xpath("(//div[text()='Registros públicos - gestión de caja'])[2]"));

    public static final Target BTN_MANTENIMIENTO_INFORMES = Target.the("Boton ingresar mantenimiento e informes")
            .located(By.xpath("(//*[contains(text(), 'Mantenimiento e informes')])[2]"));

    public static final Target BTN_REGISTROS_PUBLICOS_PROCESOS_ESPECIALES = Target.the("Boton ingresar registros publicos procesos especiales")
            .located(By.xpath("(//div[text()='Registros públicos - procesos especiales'])[2]"));

    public static final Target BTN_MANTENIMIENTO_TABLAS_BASICAS = Target.the("Boton ingresar mantenimiento tablas basicas")
            .located(By.xpath("(//*[contains(text(), 'Mantenimiento tablas básicas')])[2]"));

    public static final Target BTN_REGISTROS_PUBLICOS_CONSULTAS_INTERNAS = Target.the("Boton ingresar registros publicos consultas internas")
            .located(By.xpath("(//div[text()='Registros públicos - consultas internas'])[2]"));

    public static final Target BTN_REGISTROS_PUBLICOS_ESTADISTICAS_EXTRACCIONES = Target.the("Boton ingresar registros publicos estadisticas extracciones")
            .located(By.xpath("(//div[text()='Registros públicos - estadísticas y extracciones'])[2]"));

    public static final Target BTN_PROCESOS_SIPREF_GOBERNABILIDAD = Target.the("Boton ingresar procesos sipref gobernabilidad")
            .located(By.xpath("(//div[text()='Procesos sipref/gobernabilidad'])[2]"));

    public static final Target BTN_MANTENIMIENTO_SII = Target.the("Boton ingresar mantenimiento del sii")
            .located(By.xpath("(//div[text()='Mantenimiento del sii'])[2]"));

    public static final Target BTN_CONSULTAS_REGISTROS_NACIONALES = Target.the("Boton ingresar consultas registros nacionales")
            .located(By.xpath("(//*[contains(text(), 'Consultas - registros nacionales')])[2]"));

    /*----------Menu terciario----------*/

    public static final Target BTN_REPORTES_EE = Target.the("Boton ingresar reportes ee")
            //.located(By.xpath("(//*[text()='Reportes E.E.'])[2]"));
            .located(By.xpath("//body/div[@id='container']/main[@role='main']/div[@id='navbar']/nav[@id='menu']/div[@id='accordionLateral1']/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[8]/a/span"));

    public static final Target BTN_SOLICITUD_REGISTRO = Target.the("Boton ingresar solicitud registro")
            .located(By.xpath("(//*[text()='Solicitudes de registro'])[2]"));

    public static final Target BTN_VINCULOS_IDENTIFICACION = Target.the("Boton ingresar vinculos identificacion")
            .located(By.xpath("(//*[text()='Vínculos Identificación'])[2]"));

    public static final Target BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO = Target.the("Boton ingresar matriculas persona natural establecimiento")
            .located(By.xpath("(//*[text()='Matricula Persona Natural y/o Establecimiento'])[2]"));

    public static final Target BTN_ANULACION_RECIBOS_CAJA = Target.the("Boton ingresar anulacion recibos caja")
            .located(By.xpath("(//a[text()='Anulación de Recibos de Caja'])[4]"));

    public static final Target BTN_EXPEDIENTES = Target.the("Boton ingresar expedientes")
            .located(By.xpath("(//*[text()='Expedientes'])[2]"));

    public static final Target BTN_COMPRA_SERVICIOS_EMPRESARIALES = Target.the("Boton compra de servicios empresariales")
            .located(By.xpath("(//*[text()='Compra de Servicios Empresariales'])[2]"));

    public static final Target BTN_REINGRESO_TRAMITES = Target.the("Boton ingresar reingreso tramites")
            .located(By.xpath("(//*[text()='Reingreso de trámites'])[2]"));

    public static final Target BTN_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton ingresar reingreso tramites")
            .located(By.xpath("(//*[text()=\"Reingreso de trámites en Bloque\"])[2]"));

    public static final Target BTN_REVISION_CFE = Target.the("Boton ingresar revision cfe")
            .located(By.xpath("(//*[text()='Revisión CFE'])[2]"));

    public static final Target BTN_ESTUDIO_REGESADL = Target.the("Boton ingresar estudio RegEsadl")
            .located(By.xpath("(//*[text()='(R) Estudio RegEsadl'])[2]"));

    public static final Target BTN_ESTUDIO_REGMTIL = Target.the("Boton ingresar estudio RegMtil")
            .located(By.xpath("(//*[text()='(R) Estudio RegMtil'])[2]"));

    public static final Target BTN_TRANSACCIONES_RUES = Target.the("Boton ingresar transacciones rues")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[10]/li/div/ul/li/div[2]/li/div/ul/li/li[8]/a"));

    public static final Target BTN_DESBLOQUEAR_LIQUIDACION_PAGO_CAJA = Target.the("Boton ingresar desbloquear liquidacion pago en caja")
            .located(By.xpath("(//*[text()='Desbloquear liquidación (Pago en Caja)'])[2]"));

    public static final Target BTN_DESBLOQUEAR_LIQUIDACION_PAGO_ELECTRONICO = Target.the("Boton ingresar desbloquear liquidacion en pago electronico")
            .located(By.xpath("(//*[text()='Desbloquear liquidación (en Pago Electrónico)'])[2]"));

    public static final Target BTN_DESBLOQUEAR_LIQUIDACION_FIRMADO_ELECTRONICO = Target.the("Boton ingresar desbloquear liquidacion en firmado electronico")
            .located(By.xpath("(//*[text()='Desbloquear liquidación (en Firmado Electrónico)'])[2]"));

    public static final Target BTN_DESBLOQUEAR_LIQUIDACION_FORMULARIO_FINAL = Target.the("Boton ingresar desbloquear liquidacion en formulario final")
            .located(By.xpath("(//*[text()='Desbloquear liquidación (Formulario Final)'])[2]"));

    public static final Target BTN_OPCIONES = Target.the("Boton ingresar opciones")
            .located(By.xpath("(//*[text()='Opciones'])[2]"));

    public static final Target BTN_SERVICIOS = Target.the("Boton ingresar servicios")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[16]/li/div/ul/li/div[1]/li/div/ul/li/li[1]/a"));

    public static final Target BTN_SERVICIOS_RUES = Target.the("Boton ingresar servicios RUES")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[16]/li/div/ul/li/div[1]/li/div/ul/li/li[2]/a"));

    public static final Target BTN_TIPO_TRAMITE = Target.the("Boton ingresar tipo de tramite")
            .located(By.xpath("(//*[text()='Maestro Tipos Tramite'])[2]"));

    public static final Target BTN_DEPOSITO_ESTADOS_FINANCIEROS = Target.the("Boton ingresar deposito de estados financieros")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[3]/li/div/ul/li/li[9]/a"));

    public static final Target BTN_VERIFICACION_MULTAS_VENCIDAS_PONAL = Target.the("Boton ingresar verificacion multas vencidas ponal")
            .located(By.xpath("(//*[text()='Verificación Multas Vencidas (PONAL)'])[2]"));

    public static final Target BTN_VERIFICACION_ANI = Target.the("Boton ingresar verificacion ani")
            .located(By.xpath("(//*[text()='Verificación ANI'])[2]"));

    public static final Target BTN_MODULOS_API_INTEGRACION_REST_FULL = Target.the("Boton ingresar modulos api integracion rest full")
            .located(By.xpath("(//*[text()='Modulos API de Integración Rest Full'])[2]"));

    public static final Target BTN_USUARIOS_API_INTEGRACION_REST_FULL = Target.the("Boton ingresar usuarios api integracion rest full")
            .located(By.xpath("(//*[text()='Usuarios API de Integración Rest Full'])[2]"));

    public static final Target BTN_EXTRACCION_MATRICULADOS = Target.the("Boton ingresar extraccion matriculados")
            .located(By.xpath("(//*[text()='Extracción de Matriculados'])[2]"));

    public static final Target BTN_EXTRACCION_AFILIADOS = Target.the("Boton ingresar extraccion afiliados")
            .located(By.xpath("(//*[text()='Extracción de Afiliados'])[2]"));

    public static final Target BTN_CREACION_MATRICULAS = Target.the("Boton ingresar creacion de matriculas")
            .located(By.xpath("(//*[text()='Creación de Matrículas'])[2]"));

    public static final Target BTN_LIQUIDACION_RENOVACION_SIMULADOR = Target.the("Boton ingresar liquidacion renovacion simulador")
            .located(By.xpath("(//*[text()='Liquidación Renovación (simulador)'])[2]"));

    public static final Target BTN_MUNICIPIOS_DEPARTAMENTOS = Target.the("Boton ingresar municipios y departamentos")
            .located(By.xpath("(//*[text()='Municipios y Departamentos'])[2]"));

    public static final Target BTN_SEDES_BIOMETRIA = Target.the("Boton ingresar sedes biometria")
            .located(By.xpath("(//*[text()='Sedes Biometría'])[2]"));

    public static final Target BTN_BARRIOS = Target.the("Boton ingresar barrios")
            .located(By.xpath("(//*[text()='Barrios'])[2]"));

    public static final Target BTN_REPARTO_ESCANEO = Target.the("Boton ingresar reparto y escaneo")
            //.located(By.xpath("(//*[text()='(R) Reparto y Escaneo'])[2]"));
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[1]/li/div/ul/li/div/li/div/ul/li/li[6]/a"));

    public static final Target BTN_GESTION_USUARIOS_EXTERNOS = Target.the("Boton ingresar gestion de usuarios externos")
            .located(By.xpath("//main[@role='main']//li[51]//a[1]"));

    public static final Target BTN_MAESTRO_ALCALDIAS_CAE = Target.the("Boton ingresar maestro de alcaldias - CAE")
            .located(By.xpath("(//*[text()='Maestro de alcaldías - CAE'])[2]"));

    public static final Target BTN_MAESTRO_CLASES_VINCULOS = Target.the("Boton ingresar maestro clases vinculos")
            .located(By.xpath("(//*[text()='Maestro Clases Vínculos'])[2]"));

    public static final Target BTN_INACTIVAR_EXPEDIENTES_SIPREF = Target.the("Boton ingresar inactivar expedientes sipref")
            .located(By.xpath("(//*[text()='Inactivar expedientes SIPREF'])[2]"));

    public static final Target BTN_T_C = Target.the("Boton ingresar T y C")
            .located(By.xpath("(//*[text()='T y C'])[2]"));

    public static final Target BTN_MANTENIMIENTO_COMMONXX = Target.the("Boton ingresar mantenimiento commonXX")
            .located(By.xpath("(//*[text()='Mantenimiento CommonXX'])[2]"));

    public static final Target BTN_MANTENIMIENTO_CLAVES_VALOR = Target.the("Boton ingresar mantenimiento claves valor")
            .located(By.xpath("(//*[text()='Mantenimiento Claves - Valor'])[2]"));

    public static final Target BTN_VINCULOS_MATRICULAS_RUES = Target.the("Boton ingresar vinculos matriculas rues")
            //.located(By.xpath("(//*[text()='Vinculos Matrículas RUES'])[2]"));
            .located(By.xpath("(//*[text()='Vinculos Nacionales (RUES)'])[2]"));

    public static final Target BTN_LOGOS_BANNERS = Target.the("Boton ingresar logos y banners")
            .located(By.xpath("(//*[text()='Logos y Banners'])[2]"));

    public static final Target BTN_MAESTRO_RUTAS = Target.the("Boton ingresar maestro de rutas")
            .located(By.xpath("(//*[text()='Maestro de Rutas'])[2]"));

    public static final Target BTN_MAESTRO_RUTAS_PASOS_RUTA = Target.the("Boton ingresar maestro de rutas pasos ruta")
            .located(By.xpath("(//*[text()='Maestro de Rutas  - Pasos ruta'])[2]"));

    public static final Target BTN_MAESTRO_RUTAS_DIGITACION = Target.the("Boton ingresar maestro de rutas digitacion")
            .located(By.xpath("(//*[text()='Maestro de Rutas - Digitación'])[2]"));

    public static final Target BTN_MAESTRO_DEVOLUCIONES = Target.the("Boton ingresar maestro de devoluciones")
            .located(By.xpath("(//*[text()='Maestro de Devoluciones'])[2]"));

    public static final Target BTN_MAESTRO_VINCULOS = Target.the("Boton ingresar maestro vinculos")
            .located(By.xpath("(//*[text()='Maestro Vínculos'])[2]"));

    public static final Target BTN_INGRESOS_RECIBO = Target.the("Boton ingresos por recibo")
            .located(By.xpath("(//*[text()='Ingresos por Recibo'])[2]"));

    public static final Target BTN_CONSULTAS_LIQUIDACIONES = Target.the("Boton ingresar consulta liquidaciones")
            .located(By.xpath("(//*[text()='Consulta liquidaciones'])[2]"));

    public static final Target BTN_CONCILIACION_RUES = Target.the("Boton ingresar conciliacion rues")
            .located(By.xpath("(//*[text()='Conciliacion RUES'])[3]"));

    public static final Target BTN_DEPURACION_REGISTROS = Target.the("Boton ingresar depuracion registros")
            .located(By.xpath("(//*[text()='Depuración Registros 2015'])[2]"));

    public static final Target BTN_DESAFILIACION_MASIVA = Target.the("Boton ingresar desafiliacion masiva")
            .located(By.xpath("(//*[text()='Desafiliación Masiva'])[2]"));

    public static final Target BTN_REVERSION_PARCIAL = Target.the("Boton ingresar reversion parcial")
            .located(By.xpath("(//*[text()='Reversión parcial'])[2]"));

    public static final Target BTN_BOLETIN_NOTICIA_MERCANTIL = Target.the("Boton ingresar boletin noticia mercantil")
            .located(By.xpath("(//*[text()='Boletin Noticia Mercantil'])[2]"));

    public static final Target BTN_EXTRACCION_EXPERIAN_NUEVO = Target.the("Boton ingresar extraccion experian nuevo")
            .located(By.xpath("(//*[text()='Extracción Experian (nuevo)'])[2]"));

    public static final Target BTN_EXTRACCION_INFORMA_NUEVO = Target.the("Boton ingresar extraccion informa nuevo")
            .located(By.xpath("(//*[text()='Extracción Informa (nuevo)'])[2]"));
}