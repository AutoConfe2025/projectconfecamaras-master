package com.co.confecamaras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AccesoSistemaIntegradoInformacion extends PageObject {

    public static final Target TXT_NUMERO_CAMARA = Target.the("Escribir el numero de la camara")
            .located(By.id("searchCam"));

    public static final Target BTN_BUSCAR = Target.the("Boton buscar camara")
            .located(By.xpath("//button[@data-original-title=\"Buscar\"]"));

    public static final Target BTN_CAMARA_VEINTE = Target.the("Boton camara veinte")
            .located(By.xpath("//img[contains(@id,'camara_')]"));

    public static final Target TXT_USUARIO = Target.the("Escribir usuario")
            .located(By.id("mail"));

    public static final Target TXT_IDENTIFICACION = Target.the("Escribir identificacion")
            .located(By.id("identificacion"));

    public static final Target TXT_CLAVE = Target.the("Escribir clave")
            .located(By.id("pass"));

    public static final Target BTN_INGRESAR = Target.the("Boton ingresar")
            .located(By.xpath("//*[contains(text(), 'Ingresar')]"));
}
