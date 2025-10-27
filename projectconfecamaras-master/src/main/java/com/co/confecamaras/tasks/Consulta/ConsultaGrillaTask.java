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

public class ConsultaGrillaTask implements Task {
    private String dato;

    public ConsultaGrillaTask(String dato) {
        this.dato = dato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> filas = null;
        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("second_main_window", main_window);
        System.out.println("Ingreso Consulta Grilla Task Codigo de Barras: " + dato);
        actor.attemptsTo(
                WaitInteractions.untilAppears(TramitesReingresadosPage.INPUT_BUSCAR),
                Enter.theValue(dato).into(TramitesReingresadosPage.INPUT_BUSCAR),
                LogEvent.recordevent(Reportes.INFO, "Se ha consultado el dato: " + dato)
        );

        filas = TramitesReingresadosPage.TABLA_RESULTADOS.resolveAllFor(actor);

        boolean encontrado = false;
        for (int i = 0; i < filas.size(); i++) {
            actor.attemptsTo(WaitSeconds.seconds(1));
            if (filas.get(i).getText().contains(dato)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            Reportes.reportEvent(Reportes.FAILED, "No se encontro el dato: " + dato);
            Assert.fail("No se encontro el dato: " + dato);
        }
    }

    public static ConsultaGrillaTask consultar(String dato) {
        return new ConsultaGrillaTask(dato);
    }
}
