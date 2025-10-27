package com.co.confecamaras.stepdefinitions.administracion;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.administracion.ElTextoDelEstado;
import com.co.confecamaras.questions.administracion.TextoActividadComercial;
import com.co.confecamaras.questions.cargaspresupuestos.ConfirmacionCarga;
import com.co.confecamaras.tasks.administracion.ConsultarMaestro;
import com.co.confecamaras.tasks.administracion.MttoCodigo;
import com.co.confecamaras.utils.cargapresupuestos.CargaExitosaConstans;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.administracion.MaestroCiiusConstants.SEGUNDO_TEXTO_ACTIVIDAD_COMERCIAL;
import static com.co.confecamaras.utils.administracion.MttoCodBarrasConstants.TEXTO_ESTADO_ARCHIVADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class mttoCodBarrasStepDefinitions {

    @Dado("^(.*) requiere editar la informacion de un codigo de barras")
    public void confecamarasRequiereEditarLaInformacionDeUnCodigoDeBarras(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al apartado de mtto codigo de barras e ingrese la nueva informacion")
    public void ingreseAlApartadoDeMttoCodigoDeBarrasEIngreseLaNuevaInformacion() {
        withCurrentActor(MttoCodigo.barras());
    }

    @Entonces("podra visualizar los cambios realzados en el codigo de barras")
    public void podraVisualizarLosCambiosRealzadosEnElCodigoDeBarras() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElTextoDelEstado.es(), Matchers.is(TEXTO_ESTADO_ARCHIVADO)));

    }

}
