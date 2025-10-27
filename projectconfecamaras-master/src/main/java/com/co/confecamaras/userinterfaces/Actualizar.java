package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Actualizar extends PageObject {

    public static By DIGITACION_BTN = By.xpath("//div[@data-target=\"#G5\"]");
    public static By ENVIO_MATRICULAS_BTN = By.xpath("//a[@data-original-title=\"Digitación - Envío matriculados al RUES\"]");
    public static By ACTUALIZAR_RUES_BTN = By.xpath("//a[@href=\"javascript:actualizarMatricula()\"]");
    public static Target VALIDACION_MATRICULA = Target.the("")
            //.located(By.xpath("//div[text()=\"Matricula Actualizada en RUES\"]"));
            .located(By.xpath("//p[contains(text(),'Expediente sincronizado a RUES, Hash:')]"));
    // ------ oo ------ //
    public static By ESPECIALES_BTN = By.xpath("//div[@data-target=\"#G6\"]");
    public static By ACTUALIZAR_PROPONENTES_BTN = By.xpath("//a[@data-original-title=\"Actualización Proponente al RUES\"]");
    public static By PROPONENTES_RUES_BTN = By.xpath("//a[@href=\"javascript:actualizarProponente()\"]");

    public static Target VALIDACION_PROPONENTE = Target.the("")
            .located(By.xpath("//h2[text()=\"La información del proponente fue actualizada en el RUES.\"]"));

}
