package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.ReAbrirCajaQuestion;
import com.co.confecamaras.questions.devdos.TextosPropiosQuestion;
import com.co.confecamaras.tasks.DoTextosPropios;
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

public class TextosPropiosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar textos propios")
    public void confecamarasRequiereRealizarTextosPropios(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "TextosPropios", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion, Textos Propios")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTextosPropios() {}

    @Entonces("realizara el test de textos propios")
    public void realizaraElTestDeTextosPropios() {
        withCurrentActor(
                DoTextosPropios.textosPropios(datos.get("Id Texto"), datos.get("Contenido"))
        );
        theActorInTheSpotlight().should(seeThat(TextosPropiosQuestion.validacion()));
    }
}
