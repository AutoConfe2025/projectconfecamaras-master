package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.junit.Assert;

import java.util.List;

public class SearchForInformation implements Interaction {
    private final List<WebElementFacade> TABLA;
    private final String DATO;

    public SearchForInformation(List<WebElementFacade> TABLA, String DATO) {
        this.TABLA = TABLA;
        this.DATO = DATO;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> filas = TABLA;
        boolean encontrado = false;
        for (int i = 0; i < filas.size(); i++) {
            actor.attemptsTo(WaitSeconds.seconds(1));
            if (filas.get(i).getText().contains(DATO)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            Reportes.reportEvent(Reportes.FAILED, "No se encontro el registro proponente: "+ DATO);
            Assert.fail("No se encontro el registro proponente: " + DATO);
        }
    }

    public static SearchForInformation buscar(List<WebElementFacade> tabla, String dato) {
        return Tasks.instrumented(SearchForInformation.class, tabla, dato);
    }
}
