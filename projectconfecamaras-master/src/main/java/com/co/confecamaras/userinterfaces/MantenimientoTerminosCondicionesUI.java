package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoTerminosCondicionesUI extends PageObject {

    public static final Target BTN_EDITAR_MANTENIMIENTO_TERMINOS = Target.the("Boton editar")
            .located(By.xpath("(//a[@data-original-title=\"Editar\"])[1]"));

    public static final Target BTN_NEGRITA_MANTENIMIENTO_TERMINOS = Target.the("Boton negrita")
            .located(By.id("mceu_2-button"));

    public static final Target TXT_NOMBRE_PANTALLA = Target.the("Escribir en la pantalla de texto")
            .located(By.id("nombre"));


    public static final Target TXT_PANTALLA_MANTENIMIENTO_TERMINOS = Target.the("Escribir en la pantalla de texto")
            .located(By.id("tinymce"));



    public static final Target BTN_CONTINUAR_MANTENIMIENTO_TERMINOS = Target.the("Boton continuar")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target BTN_REGRESAR_MANTENIMIENTO_TERMINOS = Target.the("Boton regresar")
            .located(By.xpath("//button[text()='Regresar']"));

    public static final Target LBL_MANTENIMIENTO_TERMINOS_CONDICIONES = Target.the("Mensaje Mantenimiento Terminos y Condiciones")
            .located(By.xpath("//center[text()='Pantallas de términos y condiciones']"));
}