package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaFirmadoElectronicoSobre;
import com.co.confecamaras.tasks.DataFirmadoElectronicoSobre;
import com.co.confecamaras.tasks.FirmadoEletronicoSobre;
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

public class FirmadoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Dado("^(.*) requiere realizar el Firmado electronico sobre")
    public void confecamarasRequiereRealizarElFirmadoElectronicoSobre(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "FirmadoElectronicoSobre", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con sus credenciales")
    public void confecamarasIngresaEnLaAplicacionConSusCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione en mis tramites el codigo para firmar")
    public void seleccioneEnMisTramitesElCodigoParaFirmar() {
        withCurrentActor(DataFirmadoElectronicoSobre.enConfecamaraSII(data.get("Matricula"), data.get("Celular")));
        withCurrentActor(FirmadoEletronicoSobre.enConfecamaraSII());
    }

    @Entonces("podra visualizar el sobre digital")
    public void podraVisualizarElSobreDigital() {
        theActorInTheSpotlight().should(seeThat(RevisaFirmadoElectronicoSobre.enConfecamaraSII()));
    }
}