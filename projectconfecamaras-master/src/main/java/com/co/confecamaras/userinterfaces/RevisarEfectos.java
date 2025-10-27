package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RevisarEfectos extends PageObject {

    public static By CONTINUAR_BTN = By.xpath("//a[@href=\"javascript:revisarCesacion()\"]");
    public static By TABLE_BTN = By.xpath("//*[@id=\"gridbox\"]/div[1]/table/tbody/tr[2]/td[10]");
    public static By TABLE_NOMBRE_BTN = By.xpath("//*[@id=\"gridbox\"]/div[1]/table/tbody/tr[2]/td[4]");
    public static By TABLE_DOS_BTN = By.xpath("//*[@id=\"gridbox\"]/div[1]/table/tbody/tr[2]/td[11]");
    public static By SELECT_ROW = By.xpath("(//div[@id=\"gridbox\"]//tr)[7]");
    public static By CESAR_EFECTOS_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[10]/a");
    public static By CERRAR_BTN = By.xpath("//*[@id=\"GB_window\"]/div[1]/table/tbody/tr/td[2]/div/span");
    public static By VER_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[11]/a");
    public static By ESTADO_BTN = By.xpath("//*[@id=\"gridbox\"]/div[1]/table/tbody/tr[2]/td[8]");
    public static By FRAME_DOS = By.id("GB_frame");
    public static By TEST = By.xpath("(//table)[1]//td[@class=\"caption\"]");
    public static Target VAL_VER = Target.the("").located(By.xpath("//*[text()=\"Cesación terminada\"]"));
    public static Target VAL_VER_ANTES_DEL_FIN_TEMPORADA = Target.the("").
            located(By.xpath("//*[@id=\"formMensajes\"]/p"));
    public static By DIV_UNO = By.id("GB_window");

}
