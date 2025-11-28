package com.co.confecamaras.stepdefinitions.bandeja.revision_desistimientos;

import com.co.confecamaras.tasks.Bandeja.general.IngresarArchivar;
import com.co.confecamaras.tasks.Bandeja.general.IngresarDesistimiento;
import com.co.confecamaras.tasks.Bandeja.general.IngresoMarcarPresncial;
import com.co.confecamaras.tasks.Bandeja.general.IngresoTelefonica;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RevisionDesistimientosStepDefinitions {

    @Then("ingreso y valido el desistimiento")
    public void ingresoYValidoElDesistimiento() {
        theActorInTheSpotlight().attemptsTo(IngresarDesistimiento.Desistimiento());
    }

    @Then("realizo la confirmacion telefonica")
    public void realizoLaConfirmacionTelefonica() {
        theActorInTheSpotlight().attemptsTo(IngresoTelefonica.telefonica());
    }

    @Then("valido el modulo de marcar notificado presencial")
    public void validoElModuloDeMarcarNotificadoPresencial() {
        theActorInTheSpotlight().attemptsTo(IngresoMarcarPresncial.presencial());
    }

    @Then("archivo el proceso en la bandeja desistimientos")
    public void archivoElProcesoEnLaBandejaDesistimientos() {
        theActorInTheSpotlight().attemptsTo(IngresarArchivar.archivarRevision());
    }
}
