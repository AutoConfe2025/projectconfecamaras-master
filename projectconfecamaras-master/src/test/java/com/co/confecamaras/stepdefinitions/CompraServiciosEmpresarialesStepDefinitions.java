package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaCompraServiciosEmpresariales;
import com.co.confecamaras.tasks.CompraServiciosEmpresariales;
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


public class CompraServiciosEmpresarialesStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        TESTER_UNO.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^que Tester_uno ingresa en el aplicativo de ConfecamaraSII (\\d+)$")
    public void queTester_unoIngresaEnElAplicativoDeConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        TESTER_UNO.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("^Tester_uno ingresa sus credenciales correctas en el home page$")
    public void tester_unoIngresaSusCredencialesCorrectasEnElHomePage() {
        TESTER_UNO.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("^puede ingresar al modulo de compra de servicios empresariales$")
    public void puedeIngresarAlModuloDeCompraDeServiciosEmpresariales() {
        TESTER_UNO.wasAbleTo(CompraServiciosEmpresariales.enConfecamaraSII(data.get("TipoIdentificacion"), data.get("NumeroIdentificacion"),
                data.get("EmailConfirmacion")));
    }

    @Then("^validar que la compra se realizo de manera correcta$")
    public void validarQueLaCompraSeRealizoDeManeraCorrecta() {
        TESTER_UNO.should(seeThat(RevisaCompraServiciosEmpresariales.enConfecamaraSII()));
    }
}