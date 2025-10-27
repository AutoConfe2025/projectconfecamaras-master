package com.co.confecamaras.userinterfaces.mantenimientoeinformes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MantenimientoServiciosPage {

    public static Target BTN_MANTENIMIENTO_SERVICIOS = Target.the("Boton pára ingresar al apartado de Mantenimineto servicios")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li/a"));

    public static Target BUSCADOR_SERVICIOS = Target.the("Input para hacer una busqueda")
            .located(By.xpath("//input[@aria-controls='tableservices']"));

    public static Target BTN_EDITAR_SERVICIO = Target.the("Boton pára editar")
            .located(By.xpath("//a[@data-original-title='Editar']"));

    public static Target NOMBRE_SERVICIO = Target.the("Input para ingresar nombre servicio")
            .located(By.id("_nombre"));

    public static Target TXT_NOMBRE_CORTO = Target.the("Cuadro de texto para ingresar nombre corto del servicio")
            .located(By.id("_descripcioncorta"));

    public static Target MENU_DES_TARJETA = Target.the("Cuadro de texto para ingresar nombre corto del servicio")
            .located(By.id("_idrecibetarjeta"));

    public static Target BTN_GUARDAR_SERVICIO = Target.the("Boton pára guardar info")
            .located(By.id("submit"));


    public static Target BTN_NIF = Target.the("Boton ingresar al NIF")
            .located(By.xpath("//a[@data-original-title='NIIF']"));

    public static Target BUSCADOR_PARAMETRO = Target.the("Input para hacer una busqueda")
            .located(By.xpath("//input[@aria-controls='tableparameters']"));


    public static Target BTN_EDITAR_CONTADO = Target.the("boton editar")
            .located(By.xpath("(//a[text()='Editar'])[1]"));


    public static Target SELECT_DEBITO = Target.the("Menu desplegable para elegir debito")
            .located(By.id("xcuentadeb")); // BY TEXT Seleccione  and value 110505

    public static Target SELECT_CREDITO = Target.the("Menu desplegable para elegir credito")
            .located(By.id("xcuentacre")); // BY TEXT Seleccione  and value 5199151

    public static Target BTN_GUARDAR_CONTADO = Target.the("Boton pára guardar info")
            .located(By.xpath("//button[text()='Grabar']")); //Usar para guardar otros

    public static Target EDITAR_OTROS = Target.the("Boton pára editar")
            .located(By.xpath("(//a[text()='Editar'])[12]"));

    public static Target SELECT_COSTOS = Target.the("Menu para elegir tipo cosgto")
            .located(By.id("xccos")); // by text Seleccione and value 0001

    public static Target SELECT_ANEXO = Target.the("Menu para elegir tipo Anexo")
            .located(By.id("xanexo")); // by text Seleccione and value 0001

    public static Target INPUT_PROGRAMA = Target.the("Input para ingresar programa")
            .located(By.id("xprograma"));

    public static Target INPUT_PROYECTO = Target.the("Input para ingresar proyecto")
            .located(By.id("xproyecto"));


    public static Target TEXTO_OTROS = Target.the("Caja de texto Otros")
            .located(By.xpath("(//p[@style='text-align:center'])[11]"));

    public static Target TEXTO_CONTADO = Target.the("caja de texto contado ")
            .located(By.xpath("(//p[@style='text-align:center'])[2]"));


}
