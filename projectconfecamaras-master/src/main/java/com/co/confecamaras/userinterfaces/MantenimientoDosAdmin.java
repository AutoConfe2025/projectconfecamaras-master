package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoDosAdmin extends PageObject {

    // ---- Secuencias ---- //
    public static final Target VALIDACION_RESULT = Target.the("")
            .located(By.xpath("//td[text()='165']"));
    public static By ID_BTN = By.xpath("//div[text()='Id']");
    public static By REGISTRO_SLC = By.xpath("//td[text()='PSEUDOMAT']");
    public static By REGISTRO_MODF_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[2]");
    public static By REGISTRO_MODF_INPUT_DOS = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[5]/td[2]/input");
    public static By GRABAR_BTN = By.xpath("//a[@href='javascript:grabarConsecutivos();']");

    // ---- Reimpresion ---- //
    public static By ID_IMPRE = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[1]");
    public static By ID_IMPRE_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[1]/input");
    public static By NOMBRE_IMPRE = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[2]");
    public static By NOMBRE_IMPRE_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[2]/input");
    public static By GRABAR_IMPRE_BTN = By.xpath("//a[@href='javascript:grabarGrilla(16)']");

    public static final Target VALIDACION_RESULT_IMPRE = Target.the("")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[8]/td[1]"));

    // ---- Certificas ---- //

    public static By DESCRIPCION_CERT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]");
    public static By DESCRIPCION_CERT_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]/input");
    public static By GRABAR_CERT_BTN = By.xpath("//a[@href='javascript:grabarCertificas()']");
    public static final Target VALIDACION_RESULT_CERT = Target.the("")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[2]"));

    // ---- Devolucion ---- //

    public static By GRABAR_DEV_BTN = By.xpath("//a[@href='javascript:grabarCodigos()']");

    // ---- Identificadores ---- //
    public static By RM_IDENTF = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]");
    public static By RM_IDENTF_INPUT = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[3]/input");
}
