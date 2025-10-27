package com.co.confecamaras.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalLoader extends PageObject {
    public static Target MODAL_LOADER = Target.the("Modal de carga")
            .located(By.xpath("//div[@id='modalLoader']"));

    public static Target MODAL_LOADER_INICIO = Target.the("Modal de carga")
            .located(By.xpath("//div[@class='loaderOnload']"));


    public static Target WAIT_DIALOG = Target.the("dialogo de espera").locatedBy("#pleaseWaitDialog");
}
