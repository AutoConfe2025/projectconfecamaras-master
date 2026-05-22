package com.co.confecamaras.stepdefinitions.renovaciones;

import com.co.confecamaras.models.UsuarioPublicoModel;
import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import com.co.confecamaras.tasks.Bandeja.solicitudes_nits.IngresoModulo;
import com.co.confecamaras.tasks.login.LoginSegundario;
import com.co.confecamaras.tasks.nuevas_conexiones.RunDataBaseQueryRenovacionPnEstablecimiento;
import com.co.confecamaras.tasks.renovaciones.FlujoRenovacionHastaValores;
import com.co.confecamaras.tasks.renovaciones.renovacion_pn_est_sol_balance.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class FlujoRenovacionPnEstSolBalanceCaja {

    @When("realizo el proceso de actulalizacion de solicitud")
    public void realizoProcesoActulalizacionSolicitud() {
        theActorInTheSpotlight().attemptsTo(ActualizarCommoXx.ActualizaCierra());
        theActorInTheSpotlight().attemptsTo(CerrarSesionIngresarDeNuevo.cierraSesion());
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin20();
        withCurrentActor(LoginSegundario.loginDos(usuario));
    }

    @When("realiza el proceso de formlarios pn est sol balance {string} {string}")
    public void realizaElProcesoDeFormlariosPnEstSolBalance(String valor, String query) {
        QueryRenovacion queryEnum = QueryRenovacion.from(query);
        theActorInTheSpotlight().attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query(queryEnum.getSql()));
        theActorInTheSpotlight().attemptsTo(FlujoRenovacionHastaValores.FlujoHastaValores(valor));
        theActorInTheSpotlight().attemptsTo(PrimerFormPnEstBalance.primerForm());
        theActorInTheSpotlight().attemptsTo(SegundoFormBalance.segunfoForm());
    }

    @And("realiza el proceso de recibir el pago {string}")
    public void realizaElProcesoDeRecibirElPago(String bandeja) {
        theActorInTheSpotlight().attemptsTo(FlujoPagoPnEstBalance.FlujoPagos());
        theActorInTheSpotlight().attemptsTo(CerrarSesionIngresarDeNuevo.cierraSesion());
        UsuarioPublicoModel usuario = UsuarioPublicoModel.usuarioAdmin20();
        withCurrentActor(LoginSegundario.loginDos(usuario));
        theActorInTheSpotlight().attemptsTo(IngresoModulo.ingresoNits(bandeja));
        theActorInTheSpotlight().attemptsTo(ActualizarCommoXxNo.ActualizarNo());
    }
}
