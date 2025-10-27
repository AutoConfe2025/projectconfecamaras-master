package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrepagarServiciosPage {

    public static final Target BTN_PRIMERA_OPCION_UNO = Target.the("Opcion Prepagar Servicios")
            .located(By.xpath("//span[@id='resultados-search-div']//a[1]"));

    public static Target MEN_DES_TIPO_ID = Target.the("Boton pára ingresar al apartado de prepagar servicios")
            .located(By.id("_tipoidentificacion"));

    public static Target BTN_VERIFICAR = Target.the("Input para ingresar identificacion")
            .located(By.xpath("//button[@type='submit' and text()='Verificar']"));

    public static Target TXT_PRIMER_APELLIDO = Target.the("Cuadro de texto Primer apellido ")
            .located(By.id("_apellido1"));

    public static Target BTN_ACEPTAR = Target.the("Boton POP UP Aceptar")
            .located(By.xpath("//button[normalize-space()='Aceptar']"));

    public static Target TXT_PRIMER_NOMBRE = Target.the("Cuadro de texto Primer nombre")
            .located(By.id("_nombre1"));

    public static Target TXT_EMAIL_UNO = Target.the("Cuadro de texto Email")
            .located(By.id("_email"));

    public static Target TXT_DIERCCION = Target.the("Cuadro de texto Dirección ")
            .located(By.id("_direccion"));

    public static Target MEN_DES_MUNICIPIO = Target.the("Menu desplegable Municipio")
            .located(By.id("_municipio"));

    public static Target TXT_CELULAR = Target.the("Cuadro de texto Celular")
            .located(By.id("_celular"));

    public static Target INPUT_CC = Target.the("Input para ingresar identificacion")
            //.located(By.id("documento"));
            .located(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/form/div/input"));

    public static Target INPUT_VALOR_RECARGAR = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("_cargar"));

    public static Target BTN_PAGAR = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("btnPagar"));

    public static Target SELECT_TIPO_DOCUMENTO = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("_idtipoidentificacioncliente"));

    public static Target BTN_VERIFICAR_IDENTIDAD = Target.the("Input para ingresar cantidad a recargar")
            .located(By.xpath("//button[@type='button' and text()='Verificar identificación']"));

    public static Target INPUT_TEL = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("_telefono"));

    public static Target INPUT_CELULAR = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("_celular"));

    public static Target INPUT_CORREO = Target.the("Input para ingresar cantidad a recargar")
            .located(By.id("_emailconfirmacion"));

    public static Target BTN_GENERAR_RECIBO = Target.the("Input para ingresar cantidad a recargar")
            .located(By.xpath("//button[@type='button' and text()='Generar recibo']"));

    public static Target BTN_GENERAR_RECIBO_ACEPTAR = Target.the("Input para ingresar cantidad a recargar")
            .located(By.xpath("//*[@id=\"page-top\"]/div[9]/div/div/div[2]/button[2]"));

    public static Target BTN_PDF = Target.the("Input para ingresar cantidad a recargar")
            .located(By.xpath("//a[@target='_blank' and text()='Descargar']"));
}
