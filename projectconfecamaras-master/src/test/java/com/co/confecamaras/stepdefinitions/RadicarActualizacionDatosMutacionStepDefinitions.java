package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRadicarActualizacionDatosMutacion;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RadicarActualizacionDatosMutacionStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^(.*) desea ingresar al aplicativo ConfecamaraSII")
    public void confecamarasDeseaIngresarAlAplicativoConfecamaraSII(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RadicarActualizacionDatosMutaci", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRadicarActualizacionDatosMutacion.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @When("Confecamaras ingresa sus credenciales asignadas en el home")
    public void confecamarasIngresaSusCredencialesAsignadasEnElHome() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("puede ingresar al modulo de Radicar Actualizacion Datos Mutacion")
    public void puedeIngresarAlModuloDeRadicarActualizacionDatosMutacion() {
        withCurrentActor(RadicarActualizacionDatosMutacion.enConfecamaraSII(data.get("ConsultarPor"), data.get("Matricula"), data.get("DatosModificar"),
                data.get("Direccion"), data.get("Telefono"), data.get("NumeroIdentificacion"), data.get("EmailConfirmacion"),
                data.get("FechaExpedicion")));
    }

    @Then("validar que la radicacion de realizo de manera correcta")
    public void validarQueLaRadicacionDeRealizoDeManeraCorrecta() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RevisaRadicarActualizacionDatosMutacion.enConfecamaraSII()));
    }
}