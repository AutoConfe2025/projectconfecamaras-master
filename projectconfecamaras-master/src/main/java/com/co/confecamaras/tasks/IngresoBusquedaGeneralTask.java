package com.co.confecamaras.tasks;


import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.BusquedaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.BusquedaInicial.*;

public class IngresoBusquedaGeneralTask implements Task {
    private final String elemento_busqueda;

    public IngresoBusquedaGeneralTask(String elemento_busqueda) {
        this.elemento_busqueda = elemento_busqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Ingreso a pagina principal a buscar  " + elemento_busqueda);
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_BUSQUEDA_HEADER),
                Click.on(BOTON_BUSQUEDA_HEADER),
                 WaitInteractions.untilAppears(INPUT_BUSCAR),
                 Enter.theValue(elemento_busqueda).into(INPUT_BUSCAR),
                 Click.on(BusquedaInicial.elementoBuscadoDinamico(elemento_busqueda))


        );
    }

    public static IngresoBusquedaGeneralTask digitar(String elemento_busqueda) {
        return new IngresoBusquedaGeneralTask(elemento_busqueda);
    }
}
