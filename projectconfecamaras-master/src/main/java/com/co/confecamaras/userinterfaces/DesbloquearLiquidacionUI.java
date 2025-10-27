package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DesbloquearLiquidacionUI extends PageObject {

    public static final Target TXT_NUMERO_RECUPERACION_DESBLOQUEAR_LIQUIDACION = Target.the("Escribir el numero de recuperacion")
            .located(By.id("numerorecuperacion"));

    public static final Target BTN_CONTINUAR_DESBLOQUEAR_LIQUIDACION = Target.the("Boton continuar")
            .located(By.xpath("(//*[text()='Continuar'])[2]"));

    public static final Target BTN_CONTINUAR_DOS_DESBLOQUEAR_LIQUIDACION = Target.the("Boton continuar dos")
            .located(By.xpath("//*[text()='Continuar']"));

    public static final Target BTN_DESBLOQUEAR_LIQUIDACION = Target.the("Boton desbloquear")
            .located(By.xpath("//*[text()='Desbloquear']"));

    public static final Target LBL_MENSAJE_FINAL_DESBLOQUEAR_LIQUIDACION = Target.the("Mensaje final desbloquear liquidacion")
            .located(By.xpath("//*[text()='La liquidación número ']"));

}