package com.co.confecamaras.stepdefinitions.registros_publicos;

import com.co.confecamaras.questions.bandeja.estudio_general.ValidaComentarioPresente;
import com.co.confecamaras.questions.registros_publicos.ValidaRegistrosPublicos;
import com.co.confecamaras.tasks.registro_publico.FormularioExtraxxionLibrosActos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class FormularioExtraccionLibrosActosStepDefinitions {

    @Then("lleno el formulario de extraccion")
    public void llenoElFormularioDeExtraccion(){
        theActorInTheSpotlight().attemptsTo(FormularioExtraxxionLibrosActos.formularioLLeno());
    }

    @And("valido que se muestre el mensaje de exito")
    public void validoQueSeMuestreElMensajeDeExito(){
        theActorInTheSpotlight().should(
                        seeThat("La tarjeta de comentarios es visible",
                                ValidaRegistrosPublicos.extraccionInformeDetalladoActos(), is(true))
        );
    }
}
