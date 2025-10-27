package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ParametroRenovacionSucAgen extends PageObject {

    public static final Target MENU_DES_BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS = Target.the("Menu desplegable BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS")
            .located(By.id("BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS"));

    public static final Target BTN_GRABAR_COMMONXX = Target.the("Boton Grabar")
            .located(By.xpath("(//input[@value='Grabar'])[1]"));

    public static final Target BTN_DATOS_USUARIOS = Target.the("Boton Datos del Usuarios")
            .located(By.id("btn_datos_usuario"));

    public static final Target BTN_SALIR_DATOS_USUARIOS = Target.the("Boton Salir Datos del Usuarios")
            .located(By.xpath(" (//a[@href='javascript:salir();'])[1]"));





}
