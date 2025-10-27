package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.CalculoDigitoVerificacionQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoDigitoVerificacion;


import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CalculoDigitoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere generar un codigo de verificacion")
    public void confecamaras_requiere_generar_un_codigo_de_verificacion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Calcular digito de verificacion")
    public void seleccione_consultas_y_transacciones_consultas_registros_publicos_calcular_digito_de_verificacion() {}

    @Entonces("podra generar el digito de verificacion ingresando cedula nit")
    public void podra_generar_el_digito_de_verificacion_ingresando_cedula_nit() {
        Excel excel = new Excel(Excel.rutaExcelDev, "CalculoDigito", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoDigitoVerificacion.digitoVerificacion(datos.get("Cedula"), datos.get("Cedula Dos"))
        );
        theActorInTheSpotlight().should(seeThat(CalculoDigitoVerificacionQuestion.validacion()));
    }
}