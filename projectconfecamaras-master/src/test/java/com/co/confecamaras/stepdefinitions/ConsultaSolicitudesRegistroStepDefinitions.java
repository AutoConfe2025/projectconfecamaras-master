package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaSolicitudesRegistro;
import com.co.confecamaras.tasks.ConsultarSolicitudesRegistro;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConsultaSolicitudesRegistroStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Consulta Solicitudes Registro")
    public void confecamarasRequiereRealizarLaConsultaSolicitudesRegistro(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ConsultaSolicitudesRegistro", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales correctas en el aplicativo")
    public void ingresaLasCredencialesCorrectasEnElAplicativo() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione el modulo Solicitudes Registro para realizar una busqueda")
    public void seleccioneElModuloSolicitudesRegistroParaRealizarUnaBusqueda() {
        withCurrentActor(ConsultarSolicitudesRegistro.enConfecamaraSII(data.get("FechaInicial"), data.get("FechaFinal")));
    }

    @Entonces("validara que la consulta se realizo de manera exitosa")
    public void validaraQueLaConsultaSeRealizoDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(RevisaSolicitudesRegistro.enConfecamaraSII()));
    }
}