package com.co.confecamaras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUsuarioCaja extends PageObject {
    public static Target BTN_CAMARA_20 = Target.the("Seleccionar la camara 20").
            located(By.id("camara_16"));
    public static Target TXT_USUARIO = Target.the("Ingresar el usuario en el cuadro de texto").
            located(By.id("mail"));
    public static Target TXT_IDENTIFICACION = Target.the("Ingresar en el cuadro de texto la Identificacion").
            located(By.id("identificacion"));
    public static Target TXT_CLAVE = Target.the("Ingresar en el cuadro de texto la clave").
            located(By.id("pass"));
    public static Target BTN_INGRESAR = Target.the("Seleccionar el Boton Ingresar").
            located(By.xpath("//button[normalize-space()='Ingresar']"));
}
