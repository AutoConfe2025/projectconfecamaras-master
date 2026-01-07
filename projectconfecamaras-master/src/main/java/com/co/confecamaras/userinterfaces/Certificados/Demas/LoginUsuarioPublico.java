package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUsuarioPublico extends PageObject {

    public static Target TXT_CAMARA = Target.the("Cuadro de texto para Seleccionar la camara de comercio").
            located(By.xpath("//input[@class='p-orderlist-filter-input p-inputtext p-component']"));
    public static Target BTN_CAMARA = Target.the("Seleccionar Icono camara para ingresar ").
            located(By.xpath("//span[@class='text-dark textCamara']"));
    public static Target TXT_USUARIO = Target.the("Ingresar el usuario en el cuadro de texto").
            located(By.id("mail"));
    public static Target TXT_IDENTIFICACION = Target.the("Ingresar en el cuadro de texto la Identificacion").
            located(By.id("identificacion"));
    public static Target TXT_CLAVE = Target.the("Ingresar en el cuadro de texto la clave").
            located(By.id("pass"));
    public static Target BTN_INGRESAR = Target.the("Seleccionar el Boton Ingresar").
            located(By.xpath("//button[normalize-space()='Ingresar']"));
}
