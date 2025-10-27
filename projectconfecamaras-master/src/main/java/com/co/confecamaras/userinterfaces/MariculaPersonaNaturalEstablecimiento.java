package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MariculaPersonaNaturalEstablecimiento extends PageObject {

    public static final Target SELECT_CONSULTA_POR_MPNE = Target.the("Seleccionar el tipo de consulta")
            .located(By.id("selectS"));

    public static final Target TXT_INGRESAR_INFORMACION_MPNE = Target.the("Escribir el proponente")
            .located(By.id("criterio"));

    public static final Target BTN_CONTINUAR_MPNE = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), 'Continuar')]"));

    public static final Target BTN_ESTADO_MATRICULA_MPNE = Target.the("Boton estado matricula")
            .located(By.xpath("//th[contains(text(),'Estado Matricula')]"));

    public static final Target BTN_ACCIONES_DISPONIBLES_MPNE = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    public static final Target BTN_ESPECIALES_MPNE = Target.the("Boton especiales")
            .located(By.xpath("//*[text()='Especiales ']"));

    public static final Target BTN_ACTUALLIZACIONES_ACTUALIZAR_MATRICULADOS_MPNE = Target.the("Boton actualizaciones - actualizar matriculados")
            .located(By.xpath("//a[@data-original-title='Actualizaciones - Actualizar matriculados']"));

    public static final Target SELECT_ESTADO_MATRICULA_REGISTRO_MPNE = Target.the("Seleccionar matricula en registro")
            .located(By.id("estadomatricula"));

    public static final Target BTN_GRABAR_MPNE = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));

    public static final Target BTN_CANCELACION_MPNE = Target.the("Boton cancelacion")
            .located(By.xpath("//a[text()='Cancelación']"));

    public static final Target TXT_FECHA_CANCELACION_MPNE = Target.the("Escribir fecha cancelacion")
            .located(By.id("fechacancelacion"));

    public static final Target SELECT_MOTIVO_CANCELACION_MPNE = Target.the("Seleccionar motivo de cancelacion")
            .located(By.id("motivocancelacion"));

    public static final Target BTN_OK_MPNE = Target.the("Boton OK")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_ACTUALIZACION_MATRICULADOS_RUES_MPNE = Target.the("Boton actualizacion matriculados al RUES")
            .located(By.xpath("//a[@data-original-title='Actualización Matriculados al RUES']"));


    public static final Target BTN_ACTUALIZAR_RUES_MPNE = Target.the("Boton actualizar RUES")
            //.located(By.xpath("//a[@onmouseover=\"Tip('Actualización de la matricula en el RUES')\"]"));
            .located(By.xpath("/html/body/div[2]/div/div/div[16]/div/a[1]/button"));
    //.located(By.xpath("//span[normalize-space()='Actualización Matriculados al RUES']"));

    //.located(By.xpath("//a[contains(@class, 'btn') and contains(@class, 'd-block') and contains(@class, 'btn-light') and .//span[text()='Actualización Matriculados al RUES']]\n"));
    public static final Target LBL_ACTUALIZAR_RUES_MPNE = Target.the("Mensaje actualizar RUES")
    //.located(By.id("campo"));
            .located(By.id("//button[@class='btn btn-primary btn-md' and text()='Actualizar RUES V1']\n"));


    public static final Target BTN_CERRAR_MPNE = Target.the("Boton cerrar")
            //.located(By.xpath("(//button[text()='Cerrar'])[1]"));
            .located(By.xpath("//div[@class='modal-body']//button[1]"));
    public static final Target BTN_HOME_MPNE = Target.the("Boton home")
            .located(By.xpath("//i[contains(@class, 'fa fa-home small')]"));

    public static final Target BTN_X_MPNE = Target.the("Boton X")
            .located(By.xpath("(//i[@class='fas fa-times'])[1]"));

    public static final Target BTN_MENU_MPNE = Target.the("Boton MENU")
            .located(By.id("expMenu"));

    public static final Target BTN_MATRICULA_MPNE = Target.the("Boton matricula")
            .located(By.xpath("(//*[contains(text(), 'Matricula')])[1]"));

    public static final Target BTN_CONTINUAR_MATRICULA = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), 'CONTINUAR')]"));

    public static final Target BTN_MATRICULA_PERSONA_NATURAL_CON_ESTABLECIMIENTO_DE_COMERCIO = Target.the("Boton matricula persona natural con establecimiento de comercio")
            .located(By.xpath("(//button[contains(text(), 'Matricular persona natural')])[1]"));

    public static final Target BTN_MATRICULA_SOLO_ESTABLECIMIENTO_COMERCIO = Target.the("Boton matricula solo establecimiento comercio")
            .located(By.xpath("(//button[contains(text(), 'Matricular solo establecimiento de comercio')])[1]"));

    public static final Target BTN_MATRICULA_PERSONA_NATURAL_SIN_ESTABLECIMIENTO = Target.the("Boton matricula persona natural sin establecimiento")
            .located(By.xpath("//button[normalize-space()='Matricular persona natural(sin establecimiento)']"));

    public static final Target TXT_NOMBRE_COMPLETO_RAZON_SOCIAL_MATRICULA = Target.the("Escribir el nombre completo")
            .located(By.id("_nombrepnat"));

    public static final Target SELECT_TIPO_IDENTIFICACION_MATRICULA = Target.the("Seleccionar el tipo de identificacion")
            .located(By.xpath("//select[@id=\"_tipoidepnat\"]//option"));

    public static final Target SELECT_TIPO_IDENTIFICACION_DOS_MATRICULA = Target.the("Seleccionar el tipo de identificacion")
            .located(By.id("_tipoidepnat"));

    public static final Target TXT_TIPO_IDENTIFICACION_MATRICULA = Target.the("Escribir numero de identificacion")
            .located(By.id("_idepnat"));

    public static final Target SELECT_DOMICILIO_MATRICULA = Target.the("Seleccionar el domicilio")
            .located(By.xpath("//select[@id=\"_munpnat\"]//option"));

    public static final Target SELECT_DOMICILIO_DOS_MATRICULA = Target.the("Seleccionar el domicilio")
            .located(By.id("_munpnat"));

    public static final Target SELECT_TAMANO_EMPRESA_MATRICULA = Target.the("Seleccionar el tamaño de la empresa")
            .located(By.xpath("//select[@id=\"_tamanoempresarial957\"]//option"));

    public static final Target SELECT_TAMANO_EMPRESA_DOS_MATRICULA = Target.the("Seleccionar el tamaño de la empresa")
            .located(By.id("_tamanoempresarial957"));

    public static final Target TXT_VALOR_ACTIVOS_MATRICULA = Target.the("Escribir el valor de los activos")
            .located(By.id("_actpnat"));

    public static final Target TXT_NUMERO_EMPLEADOS_MATRICULA = Target.the("Escribir el numero de empleados")
            .located(By.id("_perpnat"));

    public static final Target BTN_NO_SOY_BENEFICIARIO_MATRICULA = Target.the("Boton no soy beneficiario")
            .located(By.xpath("//button[text()='No soy beneficiario']"));

    public static final Target SELECT_BTN_BENEFICIARIO_MATRICULA = Target.the("Seleccionar boton beneficiario")
            .located(By.xpath("//button[@class=\"btn btn-secondary btn-md\"]"));

    public static final Target TXT_NOMBRE_ESTABLECIMIENTO_MATRICULA = Target.the("Escribir el nombre del establecimiento")
            .located(By.id("_nombreest"));

    public static final Target TXT_VALORES_ACTIVOS_DOS_MATRICULA = Target.the("Escribir los valores activos")
            .located(By.id("_actest"));

    public static final Target SELECT_DOMICILIO_ESTABLECIMIENTO_MATRICULA = Target.the("Seleccionar el domicilio del establecimietno")
            .located(By.xpath("//select[@id=\"_munest\"]//option"));

    public static final Target BTN_LIQUIDAR_MATRICULA = Target.the("Boton liquidar")
            .located(By.xpath("//button[contains(text(), 'Liquidar')]"));
}
