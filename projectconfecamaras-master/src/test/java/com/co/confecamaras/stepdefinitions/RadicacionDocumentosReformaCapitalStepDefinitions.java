package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRadicacionDocumentosReformaCapital;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.RadicacionDocumentosReformaCapital;
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
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class RadicacionDocumentosReformaCapitalStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        CONFECAMARAS.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("que Confecamaras se encuentra en el aplicativo de ConfecamaraSII {int}")
    public void queConfecamarasSeEncuentraEnElAplicativoDeConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        CONFECAMARAS.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("el usuario radica el formulario de reformas comerciales capital suscrito")
    public void elUsuarioRadicaElFormularioDeReformasComercialesCapitalSuscrito() {
        CONFECAMARAS.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("se genera una liquidacion del documento reforma capital")
    public void seGeneraUnaLiquidacionDelDocumentoReformaCapital() {
        CONFECAMARAS.wasAbleTo(RadicacionDocumentosReformaCapital.enConfecamaraSII(data.get("ConsultarPor"), data.get("Matricula"), data.get("Filtrar"),
                data.get("TipoDocumento"), data.get("Numero"), data.get("OrigenDocumento"), data.get("CapitalSuscrito"), data.get("Documento"),
                data.get("Identificacion"), data.get("EmailConfirmacion"), data.get("FechaExpedicion")));
    }

    @Then("valida que se pago de manera correcta")
    public void validaQueSePagoDeManeraCorrecta() {
        CONFECAMARAS.should(seeThat(RevisaRadicacionDocumentosReformaCapital.enConfecamaraSII()));
    }
}