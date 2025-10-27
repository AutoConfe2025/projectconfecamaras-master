package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaConsultaLiquidaciones;
import com.co.confecamaras.tasks.ConsultaLiquidaciones;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
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

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConsultaLiquidacionesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar los Consultas Liquidaciones")
    public void confecamarasRequiereRealizarLosConsultasLiquidaciones(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ConsultaLiquidaciones", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion web con las credenciales correctas")
    public void ingresaEnLaAplicacionWebConLasCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos consultas internas, Consulta liquidaciones")
    public void seleccioneModuloDeRegistroRegistrosPublicosConsultasInternasConsultaLiquidaciones() {
        withCurrentActor(ConsultaLiquidaciones.enConfecamaraSII(data.get("IdentificacionUno"), data.get("Nombre"),
                data.get("Expediente"), data.get("Recibo"), data.get("FechaInicial"), data.get("FechaFinal"),
                data.get("Liquidacion")));
    }

    @Entonces("validara que realizo las consultas por cada modulo de busqueda")
    public void validaraQueRealizoLasConsultasPorCadaModuloDeBusqueda() {
        theActorInTheSpotlight().should(seeThat(RevisaConsultaLiquidaciones.enConfecamaraSII()));
    }
}