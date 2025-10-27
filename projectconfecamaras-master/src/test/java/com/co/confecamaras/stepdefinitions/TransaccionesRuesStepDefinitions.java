package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaTransaccionRues;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.TransaccionesRues;
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

public class TransaccionesRuesStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        TESTER_UNO.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("que Tester_uno desea ingresar en el aplicativo ConfecamaraSII {int}")
    public void queTesterUnoDeseaIngresarEnElAplicativoConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        TESTER_UNO.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("Tester_uno ingresa sus credenciales exitosas en el home page")
    public void testerUnoIngresaSusCredencialesExitosasEnElHomePage() {
        TESTER_UNO.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("puede ingresar al modulo de transacciones rues")
    public void puedeIngresarAlModuloDeTransaccionesRues() {
        TESTER_UNO.wasAbleTo(TransaccionesRues.enConfecamaraSII(data.get("SeleccionarConsultaRues"), data.get("CCResponsable"),
                data.get("Matricula"), data.get("Beneficio"), data.get("IR"), data.get("GrupoActos"), data.get("ServicioRues"),
                data.get("TipoIdentificacion"), data.get("Identificacion"), data.get("EmailConfirmacion"), data.get("FechaExpedicion")));
    }

    @Then("validar que la transaccion rues se realizo de manera correcta")
    public void validarQueLaTransaccionRuesSeRealizoDeManeraCorrecta() {
        TESTER_UNO.should(seeThat(RevisaTransaccionRues.enConfecamaraSII()));
    }
}