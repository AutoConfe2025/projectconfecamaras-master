package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaDetalleXml;
import com.co.confecamaras.tasks.ConsultarReportesEE;
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

public class ConsultaReportesEEStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Consulta Reportes EE")
    public void confecamarasRequiereRealizarLaConsultaReportesEE(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ConsultaReportesEE", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales exitosas en el home page")
    public void ingresaLasCredencialesExitosasEnElHomePage() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione el modulo Reportes EE para realizar una consulta")
    public void seleccioneElModuloReportesEEParaRealizarUnaConsulta() {
        withCurrentActor(ConsultarReportesEE.enConfecamaraSII(data.get("Nit")));
    }

    @Entonces("validara el detalle xml")
    public void validaraElDetalleXml() {
        theActorInTheSpotlight().should(seeThat(RevisaDetalleXml.enConfecamaraSII()));
    }
}