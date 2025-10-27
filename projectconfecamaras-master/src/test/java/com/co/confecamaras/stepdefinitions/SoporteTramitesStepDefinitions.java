package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.SoporteTramitesQuestion;
import com.co.confecamaras.questions.devdos.TablaNombresCortosQuestion;
import com.co.confecamaras.tasks.DoSoportesTramites;
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

public class SoporteTramitesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el soporte de tramites")
    public void confecamarasRequiereRealizarElSoporteDeTramites(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "SoporteTramites", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }


    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Soporte Tramites")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionSoporteTramites() {}

    @Entonces("realizara el soporte de tramites")
    public void realizaraElSoporteDeTramites() {
        withCurrentActor(
                DoSoportesTramites.soportesTramites(datos.get("Observacion"))
        );
        theActorInTheSpotlight().should(seeThat(SoporteTramitesQuestion.validacion()));
    }
}