package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VerificacionAniUI extends PageObject {

    public static final Target TXT_CEDULA_VERIFICACION_ANI = Target.the("Escribir numero de cedula")
            .located(By.id("Nidentificacion"));

    public static final Target BTN_CONTINUAR_VERIFICACION_ANI = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target BTN_CERRAR_VERIFICACION_ANI = Target.the("Boton cerrar")
            //.located(By.xpath("(//button[text()='Cerrar'])[1]"));
            .located(By.xpath("//div[@id='divAuxiliar']//div[@class='modal-footer']//button[1]"));

    public static final Target BTN_LIMPIAR_VERIFICACION_ANI = Target.the("Boton limpiar")
            .located(By.xpath("//*[text()='Limpiar']"));

    public static final Target BTN_MAS_VERIFICACION_ANI = Target.the("Boton mas")
            .located(By.xpath("//*[@id=\"campoC\"]/div/a[1]"));

    public static final Target TXT_CEDULA_DOS_VERIFICACION_ANI = Target.the("Escribir numero de cedula dos")
            .located(By.id("Nidentificacion2"));

    public static final Target LBL_VERIFICACION_ANI = Target.the("Mesaje verificacion ANI")
            .located(By.xpath("//*[text()=' Respuesta Servicio RNEC']"));
}