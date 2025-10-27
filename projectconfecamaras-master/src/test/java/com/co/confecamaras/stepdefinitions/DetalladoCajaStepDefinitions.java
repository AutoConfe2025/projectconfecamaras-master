package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.DetalladoCajaQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoDetalladoCaja;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DetalladoCajaStepDefinitions {


    WebDriver driver;
    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar el Detallado de Caja")
    public void confecamaras_requiere_consultar_el_detallado_de_caja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Integracion ERP RUES CFE, Mantenimiento e Informes, Detallado de Caja por Cajero")
    public void seleccione_modulo_de_integracion_erp_rues_cfe_mantenimiento_e_informes_detallado_de_caja_por_cajero() {
    }

    @Entonces("podra consultar el Detallado de Caja por Cajero con los siguientes datos")
    public void podra_consultar_el_detallado_de_caja_por_cajero_con_los_siguientes_datos() {
        Excel excel = new Excel(Excel.rutaExcelDev, "DetalladoCaja", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoDetalladoCaja.detalladoCaja(datos.get("Operador"), datos.get("FechaInicial"), datos.get("FechaFinal"),
                        datos.get("TiposInforme"), datos.get("TiposSalida"), datos.get("EmailControl"),
                        datos.get("Ambiente"))
        );
        theActorInTheSpotlight().should(seeThat(DetalladoCajaQuestion.validacion()));
    }
}