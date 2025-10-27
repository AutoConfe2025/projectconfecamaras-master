package com.co.confecamaras.stepdefinitions.bandeja.registros_publicos;

import com.co.confecamaras.tasks.Bandeja.registros_publicos.LibrosComercioTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class LibrosComercioStepDefinitios {
    @Entonces("^validara las acciones de libros de comercios relacionados al codigo de barras (.+)$")
    public void validaraLasAccionesDeLibrosDeComerciosRelacionadosAlCodigoDeBarras(String codigo_barras) {
        OnStage.theActorInTheSpotlight().attemptsTo(LibrosComercioTask.libros(codigo_barras));
    }
}
