package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.RevisaMatriculaPersonaNaturalEstablecimiento;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MatriculaPersonaNaturalSinEstablecimientoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Matricula de una Persona Sin Establecimiento")
    public void confecamaras_requiere_realizar_la_matricula_de_una_persona_sin_establecimiento(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Consultas y Transacciones, Tramites Registros Publicos")
    public void seleccione_modulo_de_consultas_y_transacciones_tramites_registros_publicos() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MatriculaPersonaNaturalSE", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DataMatriculaPersonaNaturalSinEstablecimiento.enConfecamaraSII(datos.get("ConsultaPor"),
                datos.get("IdentificacionDos"), datos.get("EstadoMatriculaRegistro"), datos.get("FechaCancelacion"),
                datos.get("MotivoCancelacion")));
        withCurrentActor(MatriculaSoloPersona.enConfecamaraSII(datos.get("NombreCompleto"), datos.get("TipoIdentificacion"),
                datos.get("Identificacion"), datos.get("Domicilio"), datos.get("TamanoEmpresa"), datos.get("ValorActivos"),
                datos.get("NumeroEmpleados")));
        withCurrentActor(LiquidacionSolicitudMatricula.enConfecamaraSII());
        withCurrentActor(GrabarFormularioPersonaNaturalDos.enConfecamaraSII(datos.get("Genero"), datos.get("LugarExpedicion"),
                datos.get("PaisExpedicion"), datos.get("EmprendimientoSocial"), datos.get("Nomenclaturas"), datos.get("NombreVias"),
                datos.get("Nro"), datos.get("Letras"), datos.get("Barrio"), datos.get("TelefonoUno"), datos.get("TelefonoDos"),
                datos.get("Zona"), datos.get("CorreoElectronico"),datos.get("Ubicacion"), datos.get("Sede"), datos.get("Autorizacion"),
                datos.get("ActivosCorrientes"), datos.get("Patrimonio"), datos.get("IngresosOperacionales"), datos.get("GrupoNiif"),
                datos.get("ActividadEconomica"), datos.get("Consulta"), datos.get("FechaInicio"), datos.get("GeneraCiiu"),
                datos.get("EsAportante"), datos.get("QueTipoEs")));
        withCurrentActor(CapturaEvidenciaSoloPersonaNatural.enConfecamaraSII(datos.get("NombresClienteRazonSocial"), datos.get("PrimerNombre"),
                datos.get("SegundoNombre"), datos.get("PrimerApellido"), datos.get("SegundoApellido"), datos.get("DireccionComercial"),
                datos.get("Domicilio"), datos.get("TelefonoUno"), datos.get("TelefonoDos"), datos.get("CorreoElectronico"),
                datos.get("ConfirmacionCorreo"), datos.get("FechaExpedicion")));
    }

    @Entonces("validara que se realizo el registro de la persona de manera exitosa")
    public void validaraQueSeRealizoElRegistroDeLaPersonaDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(RevisaMatriculaPersonaNaturalEstablecimiento.enConfecamaraSII()));
    }
}