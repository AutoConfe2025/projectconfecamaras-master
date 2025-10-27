package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.TablaSsietmasEs;
import com.co.confecamaras.questions.administracion.TablaTipoDocumentalesEs;
import com.co.confecamaras.tasks.administracion.TipoDoc;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class TipoDocRuesStepDefinitions {
    @Dado("^(.*) requiere consultar o agregar un valor de tipo de documento")
    public void confecamarasRequiereConsultarOAgregarUnValorDeTipoDeDocumento(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());

    }
    @Cuando("ingrese al ingresar al apartado de Mtto Bas TipoDoc Hom Rues y agregue un valor o consulte")
    public void ingreseAlIngresarAlApartadoDeMttoBasTipoDocHomRuesYAgregueUnValorOConsulte() {
        withCurrentActor(TipoDoc.rues());
    }
    @Entonces("podra visualizar el valor del documento o solo visualizar los existentes")
    public void podraVisualizarElValorDelDocumentoOSoloVisualizarLosExistentes() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaTipoDocumentalesEs.visible()));

    }

}
