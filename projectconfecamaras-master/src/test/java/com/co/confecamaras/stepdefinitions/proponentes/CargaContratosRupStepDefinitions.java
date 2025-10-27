package com.co.confecamaras.stepdefinitions.proponentes;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.proponentes.CargaContratosRup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CargaContratosRupStepDefinitions {
    @Dado("^(.*) que un usuario cajero realice la carga de soportes en contratos")
    public void confecamarasQueUnUsuarioCajeroRealiceLaCargaDeSoportesEnContratos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario cajero y realice una actualizacion RUP")
    public void ingreseAlSistemaSII3ComoUsuarioCajeroYRealiceUnaActualizacionRUP(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CargaContratosRup.cargaContratosRup(data));
    }

    @Entonces("el sistema debe permitir el cargue en todos los contratos")
    public void elSistemaDebePermitirElCargueEnTodosLosContratos() {

    }
}
