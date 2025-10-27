package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.consultasytransacciones.TablaExpedienteEs;
import com.co.confecamaras.tasks.ConsultasTransacciones.ConsultaExpedientes;
import com.co.confecamaras.tasks.ConsultasTransacciones.ConsultarExpediente;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ExpedienteStepDefinitions {


    @Cuando("ingrese los datos correspondientes a la consulta de expediente por matricula")
    public void ingreseLosDtosCorrespondientesALaConsultaDeExpedientePorMatricula() {
        withCurrentActor(ConsultaExpedientes.matricula());
    }
   // @Entonces("podra ver los datos del expediente")
  //  public void podraVerLosDatosDelExpediente() {
    //    OnStage.theActorInTheSpotlight().should(seeThat(TablaExpedienteEs.visible()));
   // }
}
