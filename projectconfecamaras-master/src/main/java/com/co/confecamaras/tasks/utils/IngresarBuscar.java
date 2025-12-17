package com.co.confecamaras.tasks.Consulta;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TramitesReingresadosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.Assert;

import java.util.List;

public class IngresarBuscar implements Task {
    private String dato;

    public IngresarBuscar(String dato) {
        this.dato = dato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Ingreso Consulta Grilla Task Codigo de Barras: " + dato);
        actor.attemptsTo(
                WaitInteractions.untilAppears(TramitesReingresadosPage.INPUT_BUSCAR),
                Enter.theValue(dato).into(TramitesReingresadosPage.INPUT_BUSCAR),
                LogEvent.recordevent(Reportes.INFO, "Se ha consultado el dato: " + dato)
        );


    }

    public static IngresarBuscar consultar(String dato) {
        return new IngresarBuscar(dato);
    }
}
