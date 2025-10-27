package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.Validations;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoRecibosCaja;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RecibosCajaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar los recibos de caja")
    public void confecamaras_requiere_consultar_los_recibos_de_caja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Recibos")
    public void seleccione_consultas_y_transacciones_consultas_registros_publicos_recibos() {}

    @Entonces("podra consultar mediante el numero de recibo el recibo")
    public void podra_consultar_mediante_el_numero_de_recibo_el_recibo() {
        Excel excel = new Excel(Excel.rutaExcelDev, "RecibosCaja", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoRecibosCaja.recibosCaja(datos.get("Numero Recibo"))
        );
        System.out.println("****" + Validations.reciboCaja().answeredBy(theActorInTheSpotlight()) + "****");
    }
}