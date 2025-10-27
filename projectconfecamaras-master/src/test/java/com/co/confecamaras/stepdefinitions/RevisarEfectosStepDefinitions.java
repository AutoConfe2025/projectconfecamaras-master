package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoCesacionEfectos;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryRevisarCesacionEfectos;
import com.co.confecamaras.tasks.RunDataBaseQueryRevisarCesacionEfectosDos;
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

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RevisarEfectosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere revisar la cesacion de efectos")
    public void confecamarasRequiereRevisarLaCesacionDeEfectos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "CesacionEfectos", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRevisarCesacionEfectos.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Auditorias, Revisar cesacion de efectos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAuditoriasRevisarCesacionDeEfectos() {}

    @Entonces("revisara la cesacion de efectos")
    public void revisaraLaCesacionDeEfectos() {
        withCurrentActor(
                DoCesacionEfectos.cesacionEfectos()
        );
        withCurrentActor(RunDataBaseQueryRevisarCesacionEfectosDos.query());
        //theActorInTheSpotlight().should(seeThat(RevisarCesacionEfectosQuestion.validacion()));
    }
}