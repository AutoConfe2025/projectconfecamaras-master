package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.consultasytransacciones.TablaFormatosEs;
import com.co.confecamaras.tasks.ConsultasTransacciones.ConsultaFormato;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class FormulariosYFormatosStepDefinitions {

    @Dado("^(.*) requiere consultar formularios y formatos en blanco")
    public void confecamarasRequiereConsultarFormulariosYFormatosEnBlanco(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione los formatos y los descargue")
    public void seleccioneLosFormatosYLosDescargue() {
        withCurrentActor(ConsultaFormato.formularioEnBlanco());
    }
    @Entonces("podra ver los archivos")
    public void podraVerLosArchivos() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaFormatosEs.visible()));
    }

}
