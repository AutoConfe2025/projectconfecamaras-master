package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRevisionCfe;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.RevisionCfe;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.co.confecamaras.utils.Constantes.CONFECAMARAS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RevisionCfeStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        CONFECAMARAS.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("que Confecamaras desea ingresar en el aplicativo de ConfecamaraSII {int}")
    public void queConfecamarasDeseaIngresarEnElAplicativoDeConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        CONFECAMARAS.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("Confecamaras ingresa sus credenciales correctas en el home page")
    public void confecamarasIngresaSusCredencialesCorrectasEnElHomePage() {
        CONFECAMARAS.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("puede ingresar al modulo de Revision CFE")
    public void puedeIngresarAlModuloDeRevisionCFE() {
        CONFECAMARAS.wasAbleTo(RevisionCfe.enConfecamaraSII(data.get("FechaRevisar"), data.get("Filtro"), data.get("ReciboIndividual"),
                data.get("FechaInicial"), data.get("FechaFinal")));
    }

    @Then("validar que la reversion se realizo de manera correcta")
    public void validarQueLaReversionSeRealizoDeManeraCorrecta() {
        CONFECAMARAS.should(seeThat(RevisaRevisionCfe.enConfecamaraSII()));
    }
}