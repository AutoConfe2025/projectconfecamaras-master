package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaEstudioInscripcionDocumentosEsadl;
import com.co.confecamaras.tasks.DataEstudioInscripcionDocumentosEsadl;
import com.co.confecamaras.tasks.EstudioInscripcionDocumentosEsadl;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
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

public class EstudioInscripcionDocumentosEsadlStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        CONFECAMARAS.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("que Confecamaras ingresa en el aplicativo de ConfecamaraSII {int}")
    public void queConfecamarasIngresaEnElAplicativoDeConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        CONFECAMARAS.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("Confecamaras ingresa sus credenciales correctas en el home")
    public void confecamarasIngresaSusCredencialesCorrectasEnElHome() {

        CONFECAMARAS.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Then("puede ingresar al modulo de Estudio Inscripcion Documentos Esadl")
    public void puedeIngresarAlModuloDeEstudioInscripcionDocumentosEsadl() {
        CONFECAMARAS.wasAbleTo(DataEstudioInscripcionDocumentosEsadl.dataEstudioInscripcionDocumentosEsadl());
        CONFECAMARAS.wasAbleTo(EstudioInscripcionDocumentosEsadl.enConfecamaraSII(data.get("CodigoBarras"), data.get("Email"),
                data.get("Celular")));
    }

    @Then("validar que la inscripcion se realizo de manera correcta")
    public void validarQueLaInscripcionSeRealizoDeManeraCorrecta() {
        //CONFECAMARAS.should(seeThat(RevisaEstudioInscripcionDocumentosEsadl.enConfecamaraSII()));
    }
}