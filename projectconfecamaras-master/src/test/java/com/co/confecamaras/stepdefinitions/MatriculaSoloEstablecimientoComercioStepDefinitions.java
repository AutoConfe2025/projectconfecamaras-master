package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaMatriculaSoloEstablecimientoComercio;
import com.co.confecamaras.tasks.*;
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

public class MatriculaSoloEstablecimientoComercioStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        TESTER.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^que Tester ingresa en el aplicativo ConfecamaraSII (\\d+)$")
    public void queTesterIngresaEnElAplicativoConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        TESTER.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("^ingresa sus credenciales correctas en el home page$")
    public void ingresaSusCredencialesCorrectasEnElHomePage() {
        TESTER.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("^puede ingresar al modulo de Matricula Solo Establecimiento Comercio$")
    public void puedeIngresarAlModuloDeMatriculaSoloEstablecimientoComercio() {
        TESTER.attemptsTo(DataMatriculaSoloEstablecimientoComercio.enConfecamaraSII(data.get("ConsultaPor"),
                data.get("NombreEstablecimiento"), data.get("EstadoMatriculaRegistro"), data.get("FechaCancelacion"),
                data.get("MotivoCancelacion")));
        TESTER.wasAbleTo(MatriculaSoloEstablecimientoComercio.enConfecamaraSII(data.get("NombreCompleto"), data.get("TipoIdentificacion"),
                data.get("NumeroIdentificacion"), data.get("Domicilio"), data.get("TamanoEmpresa"), data.get("NombreEstablecimiento"), data.get("ValorActivosDos"),
                data.get("DomicilioEstablecimiento")));
        TESTER.wasAbleTo(LiquidacionSolicitudMatriculaSoloEstablecimiento.enConfecamaraSII());
        TESTER.wasAbleTo(GrabarFormularioSoloEstablecimientoComercio.enConfecamaraSII(data.get("Nomenclaturas"), data.get("NombreVias"), data.get("Nro"),
                data.get("Letras"), data.get("DomicilioEstablecimiento"), data.get("BarrioDos"), data.get("TelefonoUno"), data.get("TelefonoDos"),
                data.get("Zona"), data.get("CorreoElectronico"), data.get("Ubicacion"), data.get("PersonalOcupado"), data.get("TipoLocal"),
                data.get("ActividadEconomica"), data.get("Consulta"), data.get("CamaraComercio"), data.get("Matricula"), data.get("OrganizacionJuridica"),
                data.get("DireccionComercial"), data.get("Domicilio"), data.get("DireccionComercialDos"), data.get("DomicilioDos"), data.get("Fijo"),
                data.get("Celular"), data.get("valorDelEstablecimiento")));
        TESTER.wasAbleTo(CapturaEvidenciaSoloEstablecimientoComercio.enConfecamaraSII(data.get("NombresClienteRazonSocial"), data.get("PrimerNombre"), data.get("SegundoNombre"),
                data.get("PrimerApellido"), data.get("SegundoApellido"), data.get("DireccionComercial"), data.get("Domicilio"),
                data.get("CodigoPostal"), data.get("TelefonoUno"), data.get("TelefonoDos"), data.get("CorreoElectronico"),
                data.get("ConfirmacionCorreo"), data.get("FechaExpedicion")));
    }

    @Then("^validar que el proceso se realizo de manera correcta$")
    public void validarQueElProcesoSeRealizoDeManeraCorrecta() {
        TESTER.should(seeThat(RevisaMatriculaSoloEstablecimientoComercio.enConfecamaraSII()));
    }
}