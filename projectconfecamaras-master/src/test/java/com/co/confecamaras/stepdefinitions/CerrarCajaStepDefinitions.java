package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.CerrarCajaQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoCerrarCaja;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CerrarCajaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere cerrar la caja")
    public void confecamaras_requiere_cerrar_la_caja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Gestion de caja")
    public void seleccione_modulo_de_registro_registros_publicos_gestion_de_caja() {}

    @Entonces("cerrara la caja indicando el valor recaudado")
    public void cerrara_la_caja_indicando_el_valor_recaudado() {
        Excel excel = new Excel(Excel.rutaExcelDev, "CerrarCaja", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoCerrarCaja.cerrarCaja(datos.get("Valor"))
        );
    }

    @Entonces("validara que se haya realizado el cierre exitoso de la caja")
    public void validara_que_se_haya_realizado_el_cierre_exitoso_de_la_caja() {
        theActorInTheSpotlight().should(seeThat(CerrarCajaQuestion.validacion()));
    }

}
