package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaLiquidarRenovacionSimulador;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.LiquidarRenovacionSimulador;
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

public class LiquidarRenovacionSimuladorStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar Liquidar renovacion Simulador")
    public void confecamarasRequiereRealizrLiquidarRenovacionSimulador(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "LiquidacionRenovacionSimulador", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa a la aplicacion Sii3 con sus credenciales asignadas")
    public void confecamarasIngresaALaAplicacionSii3ConSusCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Liquidacion Renovacion Simulador")
    public void seleccioneConsultasYTransaccionesConsultasRegistrosPublicosLiquidacionRenovacionSimulador() {
        withCurrentActor(LiquidarRenovacionSimulador.enConfecamaraSII(data.get("Matrícula"), data.get("NuevosActivos"),
                data.get("NuevosActivosDos"), data.get("NumeroEmpleadosNivelNacional")));
    }

    @Entonces("validara que aparece el total de la preliquidacion")
    public void validaraQueApareceElTotalDeLaPreliquidacion() {
        theActorInTheSpotlight().should(seeThat(RevisaLiquidarRenovacionSimulador.enConfecamaraSII()));
    }
}