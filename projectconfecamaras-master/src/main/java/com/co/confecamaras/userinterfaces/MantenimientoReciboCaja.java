package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoReciboCaja extends PageObject {

    public static By NUMERO_RECIBO_INPUT = By.id("_recibo");
    public static By RECUPERAR_BTN = By.xpath("(//a)[1]");
    public static By BENEFICIO_INPUT = By.id("ben1429");
    public static By GRABAR_BTN = By.xpath("//a[@href=\"javascript:grabarReciboMantenimiento ();\"]");
    public static By ELIMINAR_BTN = By.xpath("//a[@href=\"javascript:grabarReciboEliminar ();\"]");
    public static By ABANDONAR_BTN = By.xpath("//a[@href=\"mregMantenimientoRecibos.php?accion=seleccionmantenimiento\"]");
    public static Target VALIDACION_RC = Target.the("Mensaje final mantenimiento recibos de caja")
            .located(By.id("frameSecundarioCentral"));

}