package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.persona_juridica_inactivo.FlujoValoresPjInactivo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.MENSAJE_RENOVACION_INACTIVO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPjEstadoInactivoStepDefinitions {

    @When("realizo el flujo de valores estado inactivo juridica {string}")
    public void realizoElFlujoDeValoresEstadoInactivoPj(String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoValoresPjInactivo.flujoValorInactiva());
    }

    @Then("valido la matricula en estado inactivo")
    public void validoLaMatriculaEnEstadoInactivo() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(MENSAJE_RENOVACION_INACTIVO, isPresent()).forNoMoreThan(10).seconds());
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(MENSAJE_RENOVACION_INACTIVO), WebElementStateMatchers.isVisible()));
    }
}
