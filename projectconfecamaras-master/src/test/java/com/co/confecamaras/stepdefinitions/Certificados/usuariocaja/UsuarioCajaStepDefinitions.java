package com.co.confecamaras.stepdefinitions.Certificados.usuariocaja;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.usuariocaja.ElTextoDelPDF;
import com.co.confecamaras.questions.Certificados.usuariocaja.TextoValores;
import com.co.confecamaras.questions.cargaspresupuestos.ConfirmacionCarga;
import com.co.confecamaras.tasks.Certificados.usuariocaja.UsuarioCaja;
import com.co.confecamaras.utils.cargapresupuestos.CargaExitosaConstans;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import static com.co.confecamaras.utils.usuarioCaja.UsuarioCajaConstants.TEXTO_PDF;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class UsuarioCajaStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere comprar un certificado a gasto administrativo")
    public void confecamarasRequiereComprarUnCertificadoAGastoAdministrativo(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("haga la compra y genere la facturacion")
    public void hagaLaCompraYGenereLaFacturacion() {
        withCurrentActor(UsuarioCaja.comprarCertificado());
    }

    @Entonces("podra ver no tendra costo el certificado")
    public void podraVerNoTendraCostoElCertificado() {
        OnStage.theActorInTheSpotlight().should(seeThat(ElTextoDelPDF.es(), containsString(TEXTO_PDF)));

    }
}
