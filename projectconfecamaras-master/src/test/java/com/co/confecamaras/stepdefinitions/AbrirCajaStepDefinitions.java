package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoAbrirCaja;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class AbrirCajaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere re abrir la caja")
    public void que_confecamaras_requiere_re_abrir_la_caja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion")
    public void seleccione_modulo_de_registro_registros_publicos_administracion() {}

    @Entonces("re abrira la caja con el siguiente operador")
    public void re_abrira_la_caja() {
        Excel excel = new Excel(Excel.rutaExcelDev, "AbrirCaja", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoAbrirCaja.reAbrirCaja(datos.get("Operador"))
        );
    }

    @Entonces("validara que se haya realizado una apertura de caja exitosa")
    public void validara_que_se_haya_realizado_una_apertura_de_caja_exitosa() {
        //theActorInTheSpotlight().should(seeThat(ReAbrirCajaQuestion.validacion()));
    }
}