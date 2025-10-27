package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.TablaEmailEs;
import com.co.confecamaras.questions.administracion.TablaMaestroEs;
import com.co.confecamaras.tasks.administracion.MantenimientoEmails;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MantenimientoEmailStepDefintions {

    @Dado("^(.*) requiere editar la informacion de un email")
    public void confecamarasRequiereEditarLaInformacionDeUnEmail(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al apartado de emails programados e ingrese la info")
    public void ingreseAlApartadoDeEmailsProgramadosEIngreseLaInfo() {
        withCurrentActor(MantenimientoEmails.programados());
    }
    @Entonces("podra visualizar los cambios realzados en el email editado")
    public void podraVisualizarLosCambiosRealzadosEnElEmailEditado() {
        OnStage.theActorInTheSpotlight().should(seeThat(TablaEmailEs.visible()));

    }

}
