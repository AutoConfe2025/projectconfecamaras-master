package com.co.confecamaras.userinterfaces;

import org.openqa.selenium.By;

public class MatriculaPersona {

    public static By CONTINUAR_BTN = By.xpath("//button[text()='CONTINUAR']");
    public static By SIN_ESTABLECIMIENTO_BTN = By.xpath("//button[text()='(sin establecimiento)']");
    public static By NOMBRE_COMPLETO_INPUT = By.id("_nombrepnat");
    public static By TIPO_IDENT_PROPIETARIO_SLC = By.id("_tipoidepnat");
    public static By NUM_IDENTIFICACION_INPUT = By.id("_idepnat");
    public static By DOMICILIO_SLC = By.id("_munpnat");
    public static By TAMANO_EMPRESA_SLC = By.id("_tamanoempresarial957");
    public static By VALOR_ACTIVOS_INPUT = By.id("_actpnat");
    public static By NUMERO_EMPLEADOS_INPUT = By.id("_perpnat");
    public static By NO_BENEFICIARIO_BTN = By.xpath("//div[@class='card-body']//a[@href='javascript:noSoyBeneficiario();']");
    public static By LIQUIDAR_BTN = By.xpath("//div[@class='card-body']//a[@href='javascript:validarDatosLiquidacionNueva()']");
    public static By CERRAR_BTN = By.xpath("(//*[contains(text(), 'Cerrar')])[1]");
    public static By GRABAR_FORM_LNK = By.xpath("//a[text()='Grabar formulario']");
    public static By GENERO_SLC = By.id("sexo");
    public static By LUGAR_EXP_SLC = By.id("idmunidoc");
    public static By PAIS_EXP_SLC = By.id("paisexpdoc");
    public static By GENERADOR_DIRECCION_BTN = By.xpath("(//a//button[text()='Generador de direcciones'])[1]");

}