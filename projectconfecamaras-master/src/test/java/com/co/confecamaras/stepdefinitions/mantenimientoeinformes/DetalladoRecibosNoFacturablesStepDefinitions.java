package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.detalladoRecibosNoFacturados.GenerarDocumentoDetalladoRecibosNoFacturados;
import com.co.confecamaras.tasks.mantenimientoeinformes.detalladoRecibosNoFacturados.IngresarFechaDesdeyHasta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class DetalladoRecibosNoFacturablesStepDefinitions {

    @Cuando("^enviara una fecha inicial (.+) y fecha final (.+) dando click en generar$")
    public void enviaraUnaFechaInicialYFechaFinal(String fecha_inicio, String fecha_fin) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarFechaDesdeyHasta.generar(fecha_inicio,fecha_fin));
    }

    @Entonces("decargara el documento verificando que tenga contenido")
    public void decargaraElDocumentoVerificandoQueTengaContenido() {
        OnStage.theActorInTheSpotlight().attemptsTo(GenerarDocumentoDetalladoRecibosNoFacturados.descargar());
    }

}
