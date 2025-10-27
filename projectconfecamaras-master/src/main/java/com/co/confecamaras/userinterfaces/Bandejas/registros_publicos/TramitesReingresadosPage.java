package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class TramitesReingresadosPage {

    public static final Target INPUT_BUSCAR = Target.the("buscar reingresados").
            locatedBy("//input[@type='search']");

    public static final Target TABLA_RESULTADOS = Target.the("informacion de reingresados").
            locatedBy("//div[@class='dataTables_scrollBody']/table/tbody/tr");

    public static final Target LINK_REFRESCAR = Target.the("refrescar luego de cambios").
            locatedBy("//a[text()='Refrescar']");

}
