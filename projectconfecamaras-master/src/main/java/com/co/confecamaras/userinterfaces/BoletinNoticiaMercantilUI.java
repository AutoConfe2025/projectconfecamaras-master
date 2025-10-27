package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BoletinNoticiaMercantilUI extends PageObject {

    public static final Target TXT_ANO_MES_BNM = Target.the("Escribir año y mes")
            .located(By.id("anomes"));

    public static final Target TXT_EMAIL_CONTROL_BNM = Target.the("Escribir email")
            .located(By.id("emailusuariosistema"));

    public static final Target BTN_GENERAR_BNM = Target.the("Boton generar")
            .located(By.xpath("//button[text()='Generar']"));

    public static final Target BTN_GENERAR_DOS_BNM = Target.the("Boton generar dos")
            .located(By.xpath("//button[@data-bb-handler=\"confirm\"]"));

    public static final Target LBL_MENSAJE_FINAL_BNM = Target.the("Mensaje final boletin noticia mercantil")
            .located(By.xpath("//p[contains(text(),'Apreciado usuario, se ha lanzado el boletín mensua')]"));

    public static final Target TXT_EMAIL_BNM = Target.the("Escribir email gmail")
            .located(By.id("identifierId"));

    public static final Target BTN_SIGUIENTE_BNM = Target.the("Boton siguiente")
            .located(By.xpath("//span[text()=\"Siguiente\"]"));

    public static final Target TXT_CONTRASENA_BNM = Target.the("Escribir contrasena")
            //.located(By.xpath("//input[@aria-label=\"Introduce tu contraseña\"]"));
            .located(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

    public static final Target BTN_CORREO_BOLETIN_BNM = Target.the("Boton correo boletin")
            .located(By.xpath("//span//span[contains(text(), 'generación noticia mercantil')][1]"));

    public static final Target LBL_MENSAJE_FINAL_CORREO_BNM = Target.the("Mensaje final correo")
            .located(By.xpath("//a[contains(text(),'Descargar')]"));
}