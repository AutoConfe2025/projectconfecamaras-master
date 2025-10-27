package com.co.confecamaras.userinterfaces.expedientegrafico;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExpedienteGraficoPage {

    public static Target EXPEDIENTE_GRAFICO_OPT = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target BTN_CERRAR_MENU = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("expMenu"));

    public static Target SELECT_BANDEJA  = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("bandeja"));

    public static Target INTPUT_ID_ANEXO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("idAnexo"));

    public static Target INTPUT_COD_BARRAS = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("codBarras"));

    public static Target INTPUT_RECIBO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("recibo"));

    public static Target INTPUT_NO_OPERACION= Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("noOperacion"));

    public static Target INTPUT_ID_IDENTIFICACION= Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("identificacion"));

    public static Target INPUT_NOMBRE = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("nombre"));

    public static Target INPUT_MATRICULA = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("matricula"));

    public static Target INPUT_PROPONENTE = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("proponente"));

    public static Target SELECT_TIPO_DOCUMENTO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("tipoDocumento"));

    public static Target INPUT_NO_DOCUMENTO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("noDocumento"));

    public static Target INPUT_FECHA_INICIAL = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("fechaInicial"));

    public static Target INPUT_FECHA_FINAL = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("fechaFinal"));
    public static Target INPUT_LIBRO_REGISTRO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("libroRegistro"));

    public static Target INPUT_NUM_REGISTRO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("noRegistro"));

    public static Target INPUT_IDENTIFICADOR = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("identificador"));

    public static Target INPUT_ORIGEN_EXTERNO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("origenExterno"));

    public static Target INPUT_SISTEMA_ORIGEN = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("sistemaOrigen"));

    public static Target INPUT_SISTEMA_EXCLUIR = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("sistemaExcluir"));

    public static Target INPUT_CAJA_ARCHIVO = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("cajaArchivo"));

    public static Target INPUT_LIBRO_ARCHIVO  = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("libroArchivo"));

    public static Target INPUT_OBSERVACIONES = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("observaciones"));

    public static Target BTN_LIMPIAR = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("//*[@id=\"expedienteGrafico\"]/div[2]/a"));

    public static Target BTN_CONTINUAR_CONSUL = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("//*[contains(text(),'Continuar')]"));

    public static Target BTN_VER_DOCUMENT = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("//a[@data-original-title='Ver imagen']"));

    public static Target BTN_CERRAR_DOCU= Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));

    public static Target BTN_REGRESAR = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.xpath("//button[@data-original-title='Regresar']"));

    public static Target TABLA_EXPEDIENTE = Target.the("Boton pára ingresar al apartado de expediente grafico")
            .located(By.id("ModalTitulo"));
}
