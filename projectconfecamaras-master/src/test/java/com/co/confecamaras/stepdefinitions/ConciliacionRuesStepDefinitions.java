package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaConciliacionRues;
import com.co.confecamaras.tasks.ConcilliacionRues;
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

public class ConciliacionRuesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Conciliacion RUES")
    public void confecamarasRequiereRealizarLaConciliacionRUES(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ConciliacionRUES", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa sus credenciales en la aplicacion SII3")
    public void ingresaSusCredencialesEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Conciliacion RUES")
    public void seleccioneIntegracionERPRUESCFEMantenimientoEInformesConciliacionRUES() {
        withCurrentActor(ConcilliacionRues.enConfecamaraSII(data.get("Fecha")));
    }

    @Entonces("validara que las opciones de exportar funcionan correctamente")
    public void validaraQueLasOpcionesDeExportarFuncionanCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaConciliacionRues.enConfecamaraSII()));
    }
}