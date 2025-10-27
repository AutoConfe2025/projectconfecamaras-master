package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRadicarActosDocumentosSinCosto;
import com.co.confecamaras.questions.RevisaRadicarDepositosEstadosFinancieros;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.tasks.ConsultasTransacciones.DepositoEstadosFinancierosTask;
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

public class RadicarStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Radicar Actos y Documentos Sin Costo----------*/

    @Dado("^(.*) requiere Radicar Actos y Documentos Sin Costo")
    public void confecamarasRequiereRadicarActosYDocumentosSinCosto(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RadicarActosDocSinCosto", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion Sii3 con sus credenciales")
    public void confecamarasIngresaEnLaAplicacionSii3ConSusCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione consulta por matricula e ingrese el numero correspondiente")
    public void seleccioneConsultaPorMatriculaEIngreseElNumeroCorrespondiente() {
        withCurrentActor(RadicarActosDocumentosSinCosto.enConfecamaraSII(data.get("ConsultarPor"), data.get("Matricula"),
                data.get("TipoDocumento"), data.get("NumeroDocumento"), data.get("FechaDocumento"), data.get("OrigenDocumento"),
                data.get("Municipio"), data.get("MotivoCorreccion"), data.get("TipoIdentificacion"), data.get("NroIdentificacion"),
                data.get("PrimerNombre"), data.get("SegundoNombre"), data.get("PrimerApellido"), data.get("SegundoApellido"),
                data.get("DireccionD"), data.get("MunicipioDos"), data.get("Email"), data.get("TelefonoFijo"), data.get("NroCelular")));
    }

    @Entonces("validara que se radico los documentos sin costo")
    public void validaraQueSeRadicoLosDocumentosSinCosto() {
        theActorInTheSpotlight().should(seeThat(RevisaRadicarActosDocumentosSinCosto.enConfecamaraSII()));
    }
}