package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaVinculosIdentificacion;
import com.co.confecamaras.tasks.ConsultarVinculosIdentificacion;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConsultaVinculosIdentificacionStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Consulta Vinculos Identificacion")
    public void confecamarasRequiereRealizarLaConsultaVinculosIdentificacion(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ConsultaVinculosIdentificacion", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales asignadas en el aplicativo")
    public void ingresaLasCredencialesAsignadasEnElAplicativo() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione el modulo Vinculos Identificacion para realizar una busqueda")
    public void seleccioneElModuloVinculosIdentificacionParaRealizarUnaBusqueda() {
        withCurrentActor(ConsultarVinculosIdentificacion.enConfecamaraSII(data.get("TipoIdentificacion"),
                data.get("NoIdentificacion")));
    }

    @Entonces("validara el resultado de esta consulta")
    public void validaraElResultadoDeEstaConsulta() {
        theActorInTheSpotlight().should(seeThat(RevisaVinculosIdentificacion.enConfecamaraSII()));
    }
}