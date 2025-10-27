package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.CerrarCajaQuestion;
import com.co.confecamaras.questions.devdos.ResumenDiarioCajaQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoResumenCaja;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ResumenCajaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar el Resumen diario de Caja")
    public void confecamaras_requiere_consulta_el_resumen_diario_de_caja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Integracion ERP RUES CFE, Mantenimiento e Informes, Resumen Diario de Caja")
    public void seleccione_modulo_de_integracion_erp_rues_cfe_mantenimiento_e_informes_resumen_diario_de_caja() {}

    @Entonces("podra consultar el Resumen Diario de Caja")
    public void podra_consultar_el_resumen_diario_de_caja() {
        withCurrentActor(
                DoResumenCaja.resumenCaja()
        );
    }

    @Entonces("descargar el resumen")
    public void descargar_el_resumen() {
        //theActorInTheSpotlight().should(seeThat(ResumenDiarioCajaQuestion.validacion()));  Validar pdf
    }
}