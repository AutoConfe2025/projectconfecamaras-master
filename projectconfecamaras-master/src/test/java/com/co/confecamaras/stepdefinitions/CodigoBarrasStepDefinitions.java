package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.questions.devdos.ReasignacionCodBarrasQuestion;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryReasignacionCodigoBarras;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoCodigoBarras;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CodigoBarrasStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere reasignar el codigo de barras")
    public void confecamaras_requiere_reasignar_el_codigo_de_barras(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryReasignacionCodigoBarras.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Digitacion")
    public void seleccione_modulo_de_registro_registros_publicos_digitacion() {
    }

    @Entonces("ingresara el codigo de barras y completara los campos solicitados")
    public void ingresara_el_codigo_de_barras() {
        Excel excel = new Excel(Excel.rutaExcelDev, "CodBarras", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        System.out.println("CODIGO DE BARRAS ENCONTRADO EN LA BASE DE DATOS: " + DataBase.getCodigoBarras());
        withCurrentActor(
                DoCodigoBarras.codigoBarras(DataBase.getCodigoBarras(), datos.get("Asignar Usuario"), datos.get("Estado"), datos.get("Tipo"), datos.get("Observacion"))
        );
    }

    @Entonces("validara que se haya realizado correctamente la reasignacion del codigo de barras")
    public void validara_que_se_haya_realizado_correctamente_la_reasignacion_del_codigo_de_barras() {
        theActorInTheSpotlight().should(seeThat(ReasignacionCodBarrasQuestion.validacion()));
    }
}