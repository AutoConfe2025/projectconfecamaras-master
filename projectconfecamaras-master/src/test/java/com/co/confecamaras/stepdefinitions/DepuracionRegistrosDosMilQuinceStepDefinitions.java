package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaDepuracionRegistrosDosMilQuince;
import com.co.confecamaras.tasks.DepuracionRegistrosDosMilQuince;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
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

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DepuracionRegistrosDosMilQuinceStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Depuracion Registros Dos Mil Quince")
    public void confecamarasRequiereRealizarLaDepuracionRegistrosDosMilQuince(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DepuracionRegistrosDosMilQuince", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa sus credenciales asignadas en la aplicacion SII3")
    public void ingresaSusCredencialesAsignadasEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Procesos sipref gobernabilidad, Depuracion registros Dos Mil Quince")
    public void seleccioneModuloDeRegistroProcesosSiprefGobernabilidadDepuracionRegistrosDosMilQuince() {
        withCurrentActor(DepuracionRegistrosDosMilQuince.enConfecamaraSII());
    }

    @Entonces("validara que se pueden depruar los registros correctamente")
    public void validaraQueSePuedenDepruarLosRegistrosCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaDepuracionRegistrosDosMilQuince.enConfecamaraSII()));
    }
}