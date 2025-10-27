package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InactivarExpedientesSiprefUI extends PageObject {

    public static final Target BTN_INACTIVAR_SIPREF = Target.the("Boton inactivar")
            //.located(By.xpath("//a[text()='Inactivar']"));
            .located(By.cssSelector(".btn.btn-primary.btn-md"));

    public static final Target BTN_CONTINUAR_EJECUTAR_PROCESO = Target.the("Boton inactivar")
            //.located(By.xpath("//a[text()='Inactivar']"));
            .located(By.cssSelector(".btn.btn-success"));
    public static final Target LBL_INACTIVAR_SIPREF = Target.the("Mensaje inactivar expedientes sipref")
            .located(By.xpath("//p[contains(text(),'Proceso de inactivación de matrículas terminado, t')]"));
}