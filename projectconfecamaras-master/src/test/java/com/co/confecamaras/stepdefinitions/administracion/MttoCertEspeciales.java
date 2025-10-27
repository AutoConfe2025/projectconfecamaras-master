package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.ElTextoDelEstado;
import com.co.confecamaras.questions.administracion.TextoNombreCer;
import com.co.confecamaras.tasks.administracion.MttoCer;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MttoCertEspecialesConstants.NOMBRE_ORIGINAL;
import static com.co.confecamaras.utils.administracion.MttoCodBarrasConstants.TEXTO_ESTADO_ARCHIVADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class MttoCertEspeciales {

    @Dado("^(.*) requiere editar info de un certificado especial")
    public void confecamarasRequiereEditarInfoDeUnCertificadoEspecial(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al ingresar al apartado de mtto cert especiales e ingrese la infp")
    public void ingreseAlIngresarAlApartadoDeMttoCertEspecialesEIngreseLaInfp() {
       withCurrentActor(MttoCer.especiales());
    }

    @Entonces("podra visualizar la nueva info agregada del certificado")
    public void podraVisualizarLaNuevaInfoAgregadaDelCertificado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoNombreCer.es(), Matchers.is(NOMBRE_ORIGINAL)));
    }

}
