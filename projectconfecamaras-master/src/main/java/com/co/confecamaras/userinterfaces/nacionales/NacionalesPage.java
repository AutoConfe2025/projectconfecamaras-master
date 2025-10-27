package com.co.confecamaras.userinterfaces.nacionales;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NacionalesPage {
    public static final Target OPCION_SUSCRIPCIONES_NACIONALES = Target.the("Opcion de suscripciones nacionales")
            .located(By.cssSelector("#resultados-search-div > ul > li:nth-child(2) > a"));


}
