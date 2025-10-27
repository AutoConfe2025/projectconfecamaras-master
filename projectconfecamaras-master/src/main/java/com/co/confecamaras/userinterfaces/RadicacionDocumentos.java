package com.co.confecamaras.userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RadicacionDocumentos extends PageObject {

    public static By CONSTITUCION_PERSONA_BTN = By.xpath("//button[contains(text(), 'Constitución persona jurídica')]");
    public static By RAZON_SOCIAL_INPUT = By.id("_nombrebase");
    public static By ORGANIZACION_JURIDICA_SLT = By.id("_organizacionbase");
    public static By CONTINUAR_BTN = By.id("submit");
    //public static By TRANSACCION_INCLUIR_LNK = By.xpath("//a[text()=\"Seleccione una transacción a incluir\"]");
    public static By TRANSACCION_INCLUIR_LNK = By.id("_filtrotransacciones");
    public static By CONSTITUCION_SAS_LNK = By.xpath("(//a[normalize-space()='CONSTITUCION - SAS (01.005)'])[1]");
    public static By DOMICILIO_SLT = By.id("_municipio");
    public static By TIPO_SLT = By.id("_tipodoc");
    public static By NUMERO_INPUT = By.id("_numdoc");
    public static By ORIGEN_DOCUMENTO_INPUT = By.id("_origendoc");
    public static By MUNICIPIO_ORIGEN_SLT = By.id("_mundoc");
    public static By ACTIVOS_VINCULADOS_INPUT = By.id("_activos");
    public static By PERSONAL_INPUT = By.id("_personal");
    public static By INGRESOS_INPUT = By.id("_ingresos");
    public static By CIIU_BTN = By.xpath("//a[@href=\"javascript:seleccionarCiiu();\"]");
    public static By CODIGO_BUSCAR_INPUT = By.id("textobuscar");
    public static By CONSULTAR_BTN = By.xpath("//button[text()='Consultar']");
    public static By COD_CIIU_LNK = By.xpath("//a//strong[text()='C2310']");
    public static By BENEFICIARIO_SLT = By.id("_benley1780");
    public static By CAPITAL_SUSCRITO_INPUT = By.id("_capitalsuscrito");
    public static By TIPO_IDENT_SLT = By.id("_tipoiderepleg");
    public static By NUMERO_IDENT_INPUT = By.id("_iderepleg");
    public static By APELLIDO_INPUT = By.id("_apellido1repleg");
    public static By APELLIDO_DOS_INPUT = By.id("_apellido2repleg");
    public static By NOMBRE_INPUT = By.id("_nombre1repleg");
    public static By NOMBRE_DOS_INPUT = By.id("_nombre2repleg");
    public static By EMAIL_INPUT = By.id("_emailrepleg");
    public static By NUMERO_CELULAR_INPUT = By.id("_celularrepleg");
    public static By CONTINUAR_DOS_BTN = By.xpath("//a[@href=\"javascript:grabarLiquidacion()\"]");
    public static By GRABAR_FORMULARIO_LNK = By.xpath("//a[text()='Grabar formulario']");
    public static By BIC_SLT = By.id("ctrbic");
    public static By GENERADOR_DIREC_BTN = By.xpath("//a[@href=\"javascript:generadorDireccion('dircom')\"]");
    public static By NOMENCLARUTA_SLT = By.id("viappaltipo");
    public static By NUMERO_DIREC_INPUT = By.id("viappalnro");
    public static By TRASLADAR_DIREC_BTN = By.xpath("//a[@href=\"javascript:fijarDireccion('dircom')\"]");
    public static By MUNICIPIO_SLT = By.id("muncom");
    public static By BARRIO_SLT = By.id("barriocom");
    public static By TELEFONO_INPUT = By.id("telcom1");
    public static By TELEFONO_DOS_INPUT = By.id("telcom2");
    public static By ZONA_SLT = By.id("codigozonacom");
    public static By EMAIL_CORP_INPUT = By.id("emailcom");
    public static By UBICACION_SLT = By.id("ctrubi");
    public static By SEDE_SLT = By.id("tiposedeadm");
    public static By DUPLICAR_DATOS_BTN = By.xpath("//a[@href=\"javascript:duplicarDireccion()\"]");
    public static By AUTORIZACION_SLT = By.id("ctrmennot");
    public static By ACTIVOS_CORRIENTES_INPUT = By.id("actcte_2025");
    public static By PATRIMONIO_INPUT = By.id("pattot_2025");
    public static By INGRESOS_OPERACIONALES = By.id("ingope_2025");
    public static By GRUPO_NIF_SLT = By.id("gruponiif");
    public static By CAPITAL_NACIONAL_INPUT = By.id("cap_porcnaltot");
    public static By CAPITAL_NACIONAL_PRIV_INPUT = By.id("cap_porcnalpri");
    public static By CIIU_DOS_BTN = By.xpath("//a[@href=\"javascript:seleccionarCiiu('1');\"]");
    public static By CONSULTAR_DOS_BTN = By.xpath("//button[text()='Consultar']");
    public static By CIIU_DOS_LNK = By.xpath("//a//strong[text()='C2310']");
    public static By FECHA_INPUT = By.id("feciniact1");
    public static By CIIU_GENERA_SLT = By.id("maying1");
    public static By APORTANTE_SLT = By.id("aportantesegsocial");

    public static By RESPONSABILIDAD_TRIBUTARIA_UNO_BTN = By.xpath("//a[@href=\"javascript:seleccionarResponsabilidades('1');\"]");

    public static By CUARENTA_OCHO_LNK = By.xpath("//a//small[text()='48 - Impuesto sobre las ventas ? IVA']");

    public static By RESPONSABILIDAD_TRIBUTARIA_DOS = By.xpath("//a[@href=\"javascript:seleccionarResponsabilidades('2');\"]");

    public static By OK_BTN = By.xpath("//button[text()='OK']");
    public static By EMPRENDIMIENTO_SOCIAL_SLC = By.id("emprendimientosocial");


}
