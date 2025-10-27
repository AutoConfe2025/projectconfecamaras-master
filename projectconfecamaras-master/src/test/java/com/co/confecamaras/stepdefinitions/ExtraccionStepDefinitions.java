package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaExtraccionAfiliados;
import com.co.confecamaras.questions.RevisaExtraccionMatriculados;
import com.co.confecamaras.tasks.ExtraccionAfiliados;
import com.co.confecamaras.tasks.ExtraccionMatriculados;
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

public class ExtraccionStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Extraccion de Matriculados----------*/

    @Dado("^(.*) requiere realizar la Extraccion de Matriculados")
    public void confecamarasRequiereRealizarLaExtraccionDeMatriculados(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ExtraccionMatriculados", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion Sii3 con las credenciales asignadas")
    public void ingresaEnLaAplicacionSii3ConLasCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Matriculados")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstadisticasExtraccionesExtraccionMatriculados() {
        withCurrentActor(ExtraccionMatriculados.enConfecamaraSII(data.get("FechaMatriculaInicial"), data.get("FechaMatriculaFinal"),
                data.get("UltimoAnoRenovadoInicial"), data.get("UltimoAnoRenovadoFinal")));
    }

    @Entonces("validara que la extraccion matriculados se realizo correctamente")
    public void validaraQueLaExtraccionMatriculadosSeRealizoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaExtraccionMatriculados.enConfecamaraSII()));
    }

    /*----------Extraccion de Afiliados----------*/

    @Dado("^(.*) requiere realizar la Extraccion de Afiliados")
    public void confecamarasRequiereRealizarLaExtraccionDeAfiliados(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ExtraccionAfiliados", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Afiliados")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstadisticasExtraccionesExtraccionAfiliados() {
        withCurrentActor(ExtraccionAfiliados.enConfecamaraSII(data.get("TipoAfiliadoIncluir"), data.get("Email")));
    }

    @Entonces("validara que la extraccion afiliados se realizo correctamente")
    public void validaraQueLaExtraccionAfiliadosSeRealizoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaExtraccionAfiliados.enConfecamaraSII()));
    }
}