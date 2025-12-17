package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.tasks.registro_publico.AccionesAministradorServicios;
import com.co.confecamaras.tasks.registro_publico.LlenaElFormulario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresoFormulario {

    @And("lleno el formulario de agregar servicio")
    public void llenoElFormularioDeAgregarServicio() {
        theActorInTheSpotlight().attemptsTo(LlenaElFormulario.forumlarioAgregaServicio());
    }

    @Then("realiza las validaciones en el modulo")
    public void realizaLasValidacionesEnElModulo() {
        theActorInTheSpotlight().attemptsTo(AccionesAministradorServicios.AccionesAdminSer());
    }

}
