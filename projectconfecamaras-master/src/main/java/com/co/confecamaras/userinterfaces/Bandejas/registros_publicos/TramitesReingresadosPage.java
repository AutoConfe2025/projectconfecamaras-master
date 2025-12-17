package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TramitesReingresadosPage {



    public static final Target INPUT_BUSCAR = Target.the("buscar reingresados").
            located(By.xpath("//input[@type='search']"));

    public static final Target TABLA_RESULTADOS = Target.the("informacion de reingresados").
            located(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr"));

    public static final Target LINK_REFRESCAR = Target.the("refrescar luego de cambios").
            located(By.xpath("//a[text()='Refrescar']"));

}
