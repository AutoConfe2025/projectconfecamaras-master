package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class DesafiliacionMasivaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Desafiliacion Masiva")
    public void confecamarasRequiereRealizarLaDesafiliacionMasiva(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DesafiliacionMasiva", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryDesafiliacionMasiva.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales asignadas en la aplicacion SII3")
    public void ingresaLasCredencialesAsignadasEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Procesos sipref gobernabilidad, Desafiliacion Masiva")
    public void seleccioneModuloDeRegistroProcesosSiprefGobernabilidadDesafiliacionMasiva() {
        withCurrentActor(DesafiliacionMasiva.enConfecamaraSII(data.get("Desafiliacion")));
    }

    @Entonces("validara que se puede realizar las desafiliaciones masivas")
    public void validaraQueSePuedeRealizarLasDesafiliacionesMasivas() {

    }
}