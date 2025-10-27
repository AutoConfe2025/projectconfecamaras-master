package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRadicacionActualizacionProponente;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.RadicacionActualizacionProponente;
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

import static com.co.confecamaras.utils.Constantes.TESTER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RadicacionActualizacionProponenteStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        TESTER.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^que Tester ingresa en el aplicativo de ConfecamaraSII (\\d+)$")
    public void queTesterIngresaEnElAplicativoDeConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        TESTER.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("^ingresa sus credenciales asignadas en el home page$")
    public void ingresaSusCredencialesAsignadasEnElHomePage() {
        TESTER.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("^puede ingresar al modulo de Radicacion Actualizacion de proponente$")
    public void puedeIngresarAlModuloDeRadicacionActualizacionDeProponente() {
        TESTER.wasAbleTo(RadicacionActualizacionProponente.enConfecamaraSII(data.get("ConsultarPor"), data.get("Proponente"), data.get("CelebradoPor"),
                data.get("NombreContratante"), data.get("FechaEjecucion"), data.get("ValorPesos"), data.get("Clasificacion"),
                data.get("IdentificacionAnexo"), data.get("NumeroDocumento"), data.get("FechaDocumento"), data.get("OrigenDocumento"),
                data.get("RutaArchivo"), data.get("TipoIdentificacion"), data.get("Identificacion"), data.get("EmailConfirmacion"), data.get("FechaExpedicion")));
    }

    @Then("^validar que la actualizacion se realizo de manera correcta$")
    public void validarQueLaActualizacionSeRealizoDeManeraCorrecta() {
        TESTER.should(seeThat(RevisaRadicacionActualizacionProponente.enConfecamaraSII()));
    }
}