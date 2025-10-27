package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaExtraccionExperianNuevo;
import com.co.confecamaras.questions.RevisaExtraccionInformaNuevo;
import com.co.confecamaras.tasks.ExtraccionExperianNuevo;
import com.co.confecamaras.tasks.ExtraccionInformaNuevo;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
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

public class ExtraccionNuevoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Extracción Experian (nuevo)----------*/

    @Dado("^(.*) requiere realizar la Extraccion Experian Nuevo")
    public void confecamarasRequiereRealizarLaExtraccionExperianNuevo(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ExtracionExperianNuevo", true, 1);
        data =  dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa sus credenciales de cajaqa en la aplicacion SII3")
    public void ingresaSusCredencialesDeCajaqaEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Experian Nuevo")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstadisticasExtraccionesExtraccionExperianNuevo() {
        withCurrentActor(ExtraccionExperianNuevo.enConfecamarasSII(data.get("FechaInicial"), data.get("FechaFinal")));
    }

    @Entonces("verificara que se generan los resportes")
    public void verificaraQueSeGeneranLosResportes() {
        theActorInTheSpotlight().should(seeThat(RevisaExtraccionExperianNuevo.enConfecamarasSII()));
    }

    /*----------Extracción Informa (nuevo)----------*/

    @Dado("^(.*) requiere realizar la Extraccion Informa Nuevo")
    public void confecamarasRequiereRealizarLaExtraccionInformaNuevo(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ExtraccionInformaNuevo", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Informa Nuevo")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstadisticasExtraccionesExtraccionInformaNuevo() {
        withCurrentActor(ExtraccionInformaNuevo.enConfecamarasSII(data.get("FechaInicial"), data.get("FechaFinal"),
                data.get("FormatoAjustado"), data.get("Telefono60X")));
    }

    @Entonces("validara que se generan los resportes")
    public void validaraQueSeGeneranLosResportes() {
        theActorInTheSpotlight().should(seeThat(RevisaExtraccionInformaNuevo.enConfecamarasSII()));
    }
}