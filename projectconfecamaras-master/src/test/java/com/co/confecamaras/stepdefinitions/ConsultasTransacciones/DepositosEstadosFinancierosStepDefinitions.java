package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRadicarDepositosEstadosFinancieros;
import com.co.confecamaras.tasks.ConsultasTransacciones.DepositoEstadosFinancierosTask;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DepositosEstadosFinancierosStepDefinitions {
    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Dado("^(.*) requiere Radicar Deposito de estados financieros")
    public void confecamarasRequiereRadicarDepositoDeEstadosFinancieros(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RadicarDepEstadosFinancieros", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Tramites registros publicos, Deposito de estados financieros")
    public void seleccioneConsultasYTransaccionesTramitesRegistrosPublicosDepositoDeEstadosFinancieros() {
        withCurrentActor(DepositoEstadosFinancierosTask.enConfecamaraSII(data.get("BuscarPor"), data.get("Nit"),
                data.get("FechaInformeSituacionFinanciera"), data.get("NroFoliosSituacionFinanciera"),
                data.get("FechaInformeResultadosIntegral"), data.get("NroFoliosResultadosIntegral"), data.get("FechaInformeFlujosEfectivo"),
                data.get("NroFoliosFlujosEfectivo"), data.get("FechaInformeCambiosPatrimonio"),
                data.get("NroFoliosCambiosPatrimonio"), data.get("FechaInformeNotasFinancieras"),
                data.get("NroFoliosNotasFinancieras"), data.get("FechaInformeDictamen"),
                data.get("NroFoliosDictamen"), data.get("FechaInformeOtros"), data.get("NroFoliosOtros")));
    }

    @Entonces("validara que se realizo el deposito de estados financieros de manera exitosa")
    public void validaraQueSeRealizoElDepositoDeEstadosFinancierosDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(RevisaRadicarDepositosEstadosFinancieros.enConfecamaraSII()));
    }
}
