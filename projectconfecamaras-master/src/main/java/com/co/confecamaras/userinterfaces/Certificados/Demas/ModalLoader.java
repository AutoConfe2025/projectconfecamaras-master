package com.co.confecamaras.userinterfaces.Certificados.Demas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalLoader extends PageObject {
    public static Target MODAL_LOADER = Target.the("Modal de carga")
            //.located(By.id("modalLoader"));
            .located(By.xpath("//div[@id='modalLoader']"));
}
