package com.co.confecamaras.stepdefinitions;


import com.co.confecamaras.tasks.IngresoBusquedaGeneralTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class IngresoBusquedaPrincipalDefinitions {
    @Cuando("^Buscamos por el boton principal de busqueda el elemento (.+)$")
    public void BuscamosPorElBotonPrincipalDeBusquedaElElemento(String Elemento_busqueda) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoBusquedaGeneralTask.digitar(Elemento_busqueda));
    }
}
