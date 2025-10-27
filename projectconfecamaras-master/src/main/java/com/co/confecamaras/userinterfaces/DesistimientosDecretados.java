package com.co.confecamaras.userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DesistimientosDecretados extends PageObject {

    public static By VISUALIZACION_BTN = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[6]/p/a");
    public static By BUSQUEDA_INPUT = By.xpath("//div[@id='table_id_wrapper']//input");
    //public static By VALIDACION_DOC = By.xpath("//div[@class='modal-content ui-resizable']");
    public static By VALIDACION_DOC = By.xpath("//*[@id=\"ModalTitulo\"]");

}
