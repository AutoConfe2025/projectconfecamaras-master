package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DataFirmadoManuscritoSobreUI extends PageObject {

    public static final Target LBL_RECUPERACION_DFMS = Target.the("Numero de recuperacion")
            .located(By.xpath("//small[@id=\"recuperacion\"]"));
}