package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.ReasignacionCodBarrasQuestion;
import com.co.confecamaras.questions.devdos.TablaNombresCortosQuestion;
import com.co.confecamaras.tasks.DoNombresCortos;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TablaNombreCortoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la validacion de Tabla Nombres Cortos")
    public void confecamarasRequiereRealizarLaValidacionDeTablaNombresCortos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "TablaNombresCorto", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Tabla Nombres Cortos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTablaNombresCortos() {}

    @Entonces("realizara la consulta de tabla nombres cortos")
    public void realizaraLaConsultaDeTablaNombresCortos() {
        withCurrentActor(
                DoNombresCortos.nombresCortos()
        );
        theActorInTheSpotlight().should(seeThat(TablaNombresCortosQuestion.validacion()));
    }
}