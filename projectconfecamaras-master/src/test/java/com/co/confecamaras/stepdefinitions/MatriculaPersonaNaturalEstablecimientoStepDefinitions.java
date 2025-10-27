package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaMatriculaPersonaNaturalEstablecimiento;
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

import static com.co.confecamaras.utils.Constantes.ANDREY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MatriculaPersonaNaturalEstablecimientoStepDefinitions {


    private WebDriver driver;

    @Before
    public void setUp(){
        ANDREY.can(BrowseTheWeb.with(driver));
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Given("^que Andrey ingresa en el aplicativo ConfecamaraSII (\\d+)$")
    public void queAndreyIngresaEnElAplicativoConfecamaraSII(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestaña"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        ANDREY.wasAbleTo(NavigateTo.confecamarasHomePage());
    }

    @When("^ingresa sus credenciales correctas en el home$")
    public void ingresaSusCredencialesCorrectasEnElHome() {
        ANDREY.wasAbleTo(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
    }

    @Then("^puede ingresar al modulo de Matricula Persona Natural Establecimiento$")
    public void puedeIngresarAlModuloDeMatriculaPersonaNaturalEstablecimiento() {
        ANDREY.attemptsTo(DataMatriculaPersonaNaturalEsteblecimiento.enConfecamaraSII(data.get("ConsultaPor"),
                data.get("IdentificacionDos"), data.get("EstadoMatriculaRegistro"), data.get("FechaCancelacion"),
                data.get("MotivoCancelacion")));
        ANDREY.attemptsTo(DataMatriculaPersonaNaturalEsteblecimientoDos.enConfecamaraSII(data.get("ConsultaPorDos"),
                data.get("NombreEstablecimiento"), data.get("EstadoMatriculaRegistro"), data.get("FechaCancelacion"),
                data.get("MotivoCancelacion")));
        ANDREY.wasAbleTo(MatriculaPersonaNaturalEstablecimiento.enConfecamaraSII(data.get("NombreCompleto"), data.get("TipoIdentificacion"),
                data.get("NumeroIdentificacion"), data.get("Domicilio"), data.get("TamanoEmpresa"), data.get("ValorActivos"), data.get("NumeroEmpleados"),
                data.get("SeleccionarBeneficiario"), data.get("NombreEstablecimiento"), data.get("ValorActivosDos"), data.get("DomicilioEstablecimiento")));
        ANDREY.wasAbleTo(LiquidacionSolicitudMatricula.enConfecamaraSII());
        ANDREY.wasAbleTo(GrabarFormularioPersonaNatural.enConfecamaraSII(data.get("Genero"), data.get("LugarExpedicion"), data.get("PaisExpedicion"),
                data.get("EmprendimientoSocial"), data.get("Nomenclaturas"), data.get("NombreVias"), data.get("Nro"), data.get("Letras"), data.get("Barrio"),
                data.get("TelefonoUno"), data.get("TelefonoDos"), data.get("Zona"), data.get("CorreoElectronico"), data.get("Ubicacion"), data.get("Sede"),
                data.get("Autorizacion"), data.get("ActivosCorrientes"), data.get("Patrimonio"), data.get("IngresosOperacionales"), data.get("GrupoNiif"),
                data.get("ActividadEconomica"), data.get("Consulta"), data.get("FechaInicio"), data.get("GeneraCiiu"), data.get("EsAportante"),
                data.get("QueTipoEs")));
        ANDREY.wasAbleTo(GrabarFormularioEstablecimiento.enConfecamaraSII(data.get("Nomenclaturas"), data.get("NombreVias"), data.get("Nro"),
                data.get("Letras"), data.get("DomicilioEstablecimiento"), data.get("BarrioDos"), data.get("TelefonoUno"), data.get("TelefonoDos"),
                data.get("Zona"), data.get("CorreoElectronico"), data.get("Ubicacion"), data.get("PersonalOcupado"), data.get("TipoLocal"),
                data.get("ActividadEconomica")));
        ANDREY.wasAbleTo(CapturaEvidencia.enConfecamaraSII(data.get("NombresClienteRazonSocial"), data.get("PrimerNombre"), data.get("SegundoNombre"),
                data.get("PrimerApellido"), data.get("SegundoApellido"), data.get("DireccionComercial"), data.get("Domicilio"),
                data.get("CodigoPostal"), data.get("TelefonoUno"), data.get("TelefonoDos"), data.get("CorreoElectronico"),
                data.get("ConfirmacionCorreo"), data.get("FechaExpedicion")));
    }

    @Then("^validar que el proceso se realizo de manera exitosa$")
    public void validarQueElProcesoSeRealizoDeManeraExitosa() {
        ANDREY.should(seeThat(RevisaMatriculaPersonaNaturalEstablecimiento.enConfecamaraSII()));
    }
}