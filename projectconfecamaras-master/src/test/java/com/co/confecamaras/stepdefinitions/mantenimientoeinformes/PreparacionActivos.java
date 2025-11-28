package com.co.confecamaras.stepdefinitions.mantenimientoeinformes;

import com.co.confecamaras.tasks.mantenimientoeinformes.activos.ValidaDescargas;
import com.co.confecamaras.tasks.mantenimientoeinformes.activos.FormularioMantenimientoActivos;
import io.cucumber.java.en.And;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PreparacionActivos {

    @And("lleno el formulario de mantenimiento de activos")
    public void llenoElFormularioDeMantenimientoDeActivos() {
        theActorInTheSpotlight().attemptsTo(FormularioMantenimientoActivos.llenaFormulario());
    }

    @And("exporto el archivo de excel")
    public void exportoElArchivoDeExcel() {
        theActorInTheSpotlight().attemptsTo(ValidaDescargas.excel());
    }

}
