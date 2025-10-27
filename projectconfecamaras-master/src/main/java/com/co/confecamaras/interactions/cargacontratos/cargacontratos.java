package com.co.confecamaras.interactions.cargacontratos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.lang.annotation.Target;
import java.util.List;

public class cargacontratos implements Interaction {

    private Target tablaDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
/*public void realizarcargacontratos (Target datosContratante){

    List<WebElementFacade>TablaDeDatos = datosContratante.resolveAllFor(actor);
}
}*/
