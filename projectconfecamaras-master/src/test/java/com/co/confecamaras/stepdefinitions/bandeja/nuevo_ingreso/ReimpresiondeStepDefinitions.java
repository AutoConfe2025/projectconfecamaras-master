package com.co.confecamaras.stepdefinitions.bandeja.nuevo_ingreso;


import com.co.confecamaras.database.Bandeja.QueryGetDatosReimpresion;
import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.MaestroClavesTask;
import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ReCertificadosTask;
import com.co.confecamaras.tasks.Bandeja.nuevo_ingreso.ReRecibosTask;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReimpresiondeStepDefinitions {

    @Entonces("realizara acciones de Reimpresion de Recibos")
    public void realizaraAccionesDeReimpresionDeRecibos() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReRecibosTask.administracion());
    }
    @Entonces("realizara acciones de Reimpresion de Certificados")
    public void realizaraAccionesDeReimpresionDeCertificados() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReCertificadosTask.administracion());
    }
    @Entonces("query para traer datos numOperacion numRecibo")
    public void QueryParaTraerDatos() {
        OnStage.theActorInTheSpotlight().attemptsTo(QueryGetDatosReimpresion.deCertificadosVirtuales());
    }
}
