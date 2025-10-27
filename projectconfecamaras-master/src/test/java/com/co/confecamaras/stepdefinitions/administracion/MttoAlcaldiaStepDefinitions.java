package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.ValorInputAlcaldiaEsta;
import com.co.confecamaras.tasks.administracion.MttoAlcaldia;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.administracion.MttoMatriculaAlcaldiaPage.INPUT_NOMBRE_RAZON_SOCIAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MttoAlcaldiaStepDefinitions {

    @Dado("^(.*) requiere editar info de documentacion de alcaldia")
    public void confecamarasRequiereEditarInfoDeDocumentacionDeAlcaldia(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese al ingresar al apartado de mtto alcaldia e ingrese la info")
    public void ingreseAlIngresarAlApartadoDeMttoAlcaldiaEIngreseLaInfo() {
        withCurrentActor(MttoAlcaldia.matricula());
    }
    @Entonces("podra visualizar la nueva info agregada")
    public void podraVisualizarLaNuevaInfoAgregada() {
        OnStage.theActorInTheSpotlight().should(String.valueOf(Ensure.that(ValorInputAlcaldiaEsta.vacio(INPUT_NOMBRE_RAZON_SOCIAL).equals(true))));
    }

}
