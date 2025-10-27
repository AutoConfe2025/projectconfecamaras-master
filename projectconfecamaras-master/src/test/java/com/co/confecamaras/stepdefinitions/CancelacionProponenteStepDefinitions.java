package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.questions.devdos.RadicacionCancelacionProponenteQuestion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoCancelacionProponente;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CancelacionProponenteStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la cancelacion de proponente")
    public void confecamaras_requiere_realizar_la_cancelacion_de_proponente(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingrese en la aplicacion con sus credenciales cajero")
    public void confecamarasIngreseEnLaAplicacionConSusCredencialescajero(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
    }

    @Y ("seleccione Consultas y Transacciones, Consultas Registros Publicos, Expedientes")
    public void seleccione_consultas_y_transacciones_consultas_registros_publicos_expedientes() {}

    @Entonces("consultara con el numero de proponente y comenzara a realizar las acciones requeridas")
    public void consultara_con_el_numero_de_proponente_y_comenzara_a_realizar_las_acciones_requeridas(Map<String, String> data) {
        withCurrentActor(DoCancelacionProponente.cancelacionProponente(data));
    }

    @Entonces("validara que se haya realizado la cancelacion del proponente exitosamente")
    public void validara_que_se_haya_realizado_la_cancelacion_del_proponente_exitosamente() {
        theActorInTheSpotlight().should(seeThat(RadicacionCancelacionProponenteQuestion.validacion()));
    }
}