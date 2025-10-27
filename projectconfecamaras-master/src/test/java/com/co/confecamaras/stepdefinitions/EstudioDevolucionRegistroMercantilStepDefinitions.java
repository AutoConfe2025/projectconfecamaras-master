package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaEstudioDevolucionRegistroMercantil;
import com.co.confecamaras.tasks.EstudioDevolucionRegistroMercantil;
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

import static com.co.confecamaras.utils.Constantes.TESTER_UNO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EstudioDevolucionRegistroMercantilStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        TESTER_UNO.can(BrowseTheWeb.with(driver));
    }


    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("que Tester_uno ingresa en el aplicativo ConfecamaraSII {int}")
    public void queTesterUnoIngresaEnElAplicativoConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        TESTER_UNO.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("Tester_uno ingresa sus credenciales correctas en el home")
    public void testerUnoIngresaSusCredencialesCorrectasEnElHome() {
        TESTER_UNO.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("puede ingresar al modulo de estudio devolucion registro mercantil")
    public void puedeIngresarAlModuloDeEstudioDevolucionRegistroMercantil() {
        TESTER_UNO.wasAbleTo(EstudioDevolucionRegistroMercantil.enConfecamaraSII(data.get("CodigoBarras"), data.get("MotivosDevolucion"),
                data.get("TipoTramite"), data.get("ProcedeReingreso"), data.get("TipoDevolucion"), data.get("ModificarFormulario"),
                data.get("Obsevaciones")));
    }

    @Then("validar que la devolucion se realizo de manera correcta")
    public void validarQueLaDevolucionSeRealizoDeManeraCorrecta() {
        TESTER_UNO.should(seeThat(RevisaEstudioDevolucionRegistroMercantil.enConfecamaraSII()));
    }
}