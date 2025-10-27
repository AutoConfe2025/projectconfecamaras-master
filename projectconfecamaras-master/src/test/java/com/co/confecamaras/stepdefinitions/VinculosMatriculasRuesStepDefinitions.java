package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaVinculosMatriculaRues;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.VinculosMatriculasRues;
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

public class VinculosMatriculasRuesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar los Vinculos Matriculas RUES")
    public void confecamarasRequiereRealizarLosVinculosMatriculasRUES(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "VinculosMatriculasRUES", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion Sii3 con las credenciales correctas")
    public void ingresaEnLaAplicacionSii3ConLasCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Nacionales, Vinculos Matriculas RUES")
    public void seleccioneConsultasYTransaccionesConsultasRegistrosNacionalesVinculosMatriculasRUES() {
        withCurrentActor(VinculosMatriculasRues.enConfecamaraSII(data.get("TipoDocumento"), data.get("NumeroIdentificacion")));
    }

    @Entonces("validara que se desplega el detalle de la informacion")
    public void validaraQueSeDesplegaElDetalleDeLaInformacion() {
        theActorInTheSpotlight().should(seeThat(RevisaVinculosMatriculaRues.enConfecamaraSII()));
    }
}