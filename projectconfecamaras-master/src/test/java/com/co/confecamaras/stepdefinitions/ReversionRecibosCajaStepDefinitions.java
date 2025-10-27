package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaReversoRecibo;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReversionRecibosCajaStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^(.*) desea ingresar en el aplicativo ConfecamaraSII")
    public void queConfecamarasDeseaIngresarEnElAplicativoConfecamaraSII(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ReversionRecibosCaja", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryReversionRecibosCaja.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @When("ingresa sus credenciales asignadas en el home")
    public void ingresaSusCredencialesAsignadasEnElHome() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuarios"), data.get("Identificacion"),
                data.get("Clave")));
    }

    @Then("puede ingresar al modulo de Reversion de Recibos de Caja")
    public void puedeIngresarAlModuloDeReversionDeRecibosDeCaja() {
        withCurrentActor(AnulacionRecibosCaja.enConfecamaraSII(DataBase.getNumeroReversionRecibosCaja(), data.get("Motivos"),
                data.get("ObservacionesAnulacion")));
    }

    @Then("validar que la reversion de realizo de manera correcta")
    public void validarQueLaReversionDeRealizoDeManeraCorrecta() {
        theActorInTheSpotlight().should(seeThat(RevisaReversoRecibo.enConfecamaraSII()));
    }
}