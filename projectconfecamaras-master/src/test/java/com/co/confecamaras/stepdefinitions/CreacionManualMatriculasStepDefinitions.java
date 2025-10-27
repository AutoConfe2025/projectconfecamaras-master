package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaCreacionManualMatriculas;
import com.co.confecamaras.tasks.CreacionManualMatriculas;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreacionManualMatriculasStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar una Creacion Manual de Matriculas")
    public void confecamarasRequiereRealizarUnaCreacionManualDeMatriculas(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "CreacionManualMatriculas", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion Sii3 con sus credenciales asignadas")
    public void confecamarasIngresaEnLaAplicacionSii3ConSusCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, Creacion de Matriculas")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionCreacionDeMatriculas() {
        withCurrentActor(CreacionManualMatriculas.enConfecamaraSII(data.get("OrganizacionComercial"), data.get("CategoriaComercial"),
                data.get("EstadoMatriculaRegistroComercial"), data.get("FechaMatriculaComercial"), data.get("OrganizacionCivil"),
                data.get("CategoriaCivil"), data.get("EstadoMatriculaRegistroCivil"), data.get("FechaMatriculaCivil"),
                data.get("OrganizacionEsadl"), data.get("CategoriaEsadl"), data.get("EstadoMatriculaRegistroEsadl"), data.get("FechaMatriculaEsadl")));
    }

    @Entonces("validara que la creacion de los distintos tipos de matricula se realizo correctamente")
    public void validaraQueLaCreacionDeLosDistintosTiposDeMatriculaSeRealizoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaCreacionManualMatriculas.enConfecamaraSII()));
    }
}