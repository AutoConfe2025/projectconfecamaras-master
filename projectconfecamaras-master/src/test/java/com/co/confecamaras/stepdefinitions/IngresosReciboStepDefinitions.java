package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaIngresosRecibo;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.IngresosRecibo;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class IngresosReciboStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar los Ingresos por Recibo")
    public void confecamarasRequiereRealizarLosIngresosPorRecibo(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "IngresosRecibo", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion web Sii3 con las credenciales correctas")
    public void ingresaEnLaAplicacionWebSii3ConLasCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Ingresos por Recibo")
    public void seleccioneIntegracionERPRUESCFEMantenimientoEInformesIngresosPorRecibo() {
        withCurrentActor(IngresosRecibo.enConfecamaraSII(data.get("FechaInicial"), data.get("FechaFinal")));
    }

    @Entonces("validara que se genera la Relacion de movimientos por recibo")
    public void validaraQueSeGeneraLaRelacionDeMovimientosPorRecibo() {
        theActorInTheSpotlight().should(seeThat(RevisaIngresosRecibo.enConfecamaraSII()));
    }
}