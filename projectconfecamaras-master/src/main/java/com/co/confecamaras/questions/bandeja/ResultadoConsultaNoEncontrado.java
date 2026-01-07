package com.co.confecamaras.questions.Consulta;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TramitesReingresadosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Subject("si el dato '#datoEsperado' NO se encuentra en la tabla de resultados")
public class ResultadoConsultaNoEncontrado implements Question<Boolean> {

    private final String datoEsperado;

    public ResultadoConsultaNoEncontrado(String datoEsperado) {
        this.datoEsperado = datoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // 1. Esperar a que la tabla aparezca (para asegurar que la búsqueda haya terminado de cargar)
        // Usamos una espera más corta ya que el dato ya debería estar buscado por la Task.

        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("second_main_window", main_window);
        System.out.println("Ingreso Consulta Grilla Task Codigo de Barras: " + datoEsperado);
        actor.attemptsTo(
                WaitInteractions.untilAppears(TramitesReingresadosPage.INPUT_BUSCAR),
                Enter.theValue(datoEsperado).into(TramitesReingresadosPage.INPUT_BUSCAR),
                LogEvent.recordevent(Reportes.INFO, "Se ha consultado el dato: " + datoEsperado)
        );
        actor.attemptsTo(
                WaitUntil.the(TramitesReingresadosPage.TABLA_RESULTADOS, isVisible()).forNoMoreThan(5).seconds()
        );

        // 2. Obtener todas las filas de la tabla
        List<WebElementFacade> filas = TramitesReingresadosPage.TABLA_RESULTADOS.resolveAllFor(actor);

        // 3. Iterar y verificar la condición de 'No encontrado'
        for (WebElementFacade fila : filas) {
            // Si la grilla contiene el dato, significa que SÍ lo encontró.
            // Por lo tanto, el resultado de "NO ENCONTRADO" es FALSO.
            if (fila.getText().contains(datoEsperado)) {
                return false; // El dato SÍ se encontró. La pregunta falla.
            }
        }

        // Si el ciclo termina y no se encontró el dato en NINGUNA fila,
        // o si la lista de filas estaba vacía, el resultado de "NO ENCONTRADO" es VERDADERO.
        return true;
    }

    public static ResultadoConsultaNoEncontrado elDato(String datoEsperado) {
        return new ResultadoConsultaNoEncontrado(datoEsperado);
    }
}