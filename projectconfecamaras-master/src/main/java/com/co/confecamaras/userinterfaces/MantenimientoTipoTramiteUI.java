package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoTipoTramiteUI extends PageObject {

    public static final Target BTN_EDITAR_MANTENIMIENTO_TIPO_TRAMITE = Target.the("Boton editar")
            .located(By.xpath("(//a[@data-original-title=\"Editar\"])[1]"));

    public static final Target BTN_CONTINUAR_MANTENIMIENTO_TIPO_TRAMITE = Target.the("Boton continuar")
            .located(By.id("submit"));

    public static final Target BTN_REGRESAR_MANTENIMIENTO_TIPO_TRAMITE = Target.the("Boton regresar")
            .located(By.xpath("//button[text()='Regresar']"));

    public static final Target LBL_MANTENIMIENTO_TIPO_TRAMITE = Target.the("Mensaje mantenimiento tipo de tramite")
            .located(By.xpath("//center[text()='Maestro de Trámites (Tipos)']"));
}