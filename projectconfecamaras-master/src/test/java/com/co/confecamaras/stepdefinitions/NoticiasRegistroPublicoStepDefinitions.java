package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaNoticiasRegistroPublico;
import com.co.confecamaras.tasks.DoNoticiasRegistro;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class NoticiasRegistroPublicoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere visaulizar el sello de noticias registros publicos")
    public void confecamarasRequiereVisaulizarElSelloDeNoticiasRegistrosPublicos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Noticias Registros Publicos")
    public void seleccioneConsultasYTransaccionesConsultasRegistrosPublicosNoticiasRegistrosPublicos() {Excel excel = new Excel(Excel.rutaExcelDev, "NoticiasRegistroPublico", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoNoticiasRegistro.noticiasRegistro(datos.get("Fecha Inicial"), datos.get("Fecha Final"), datos.get("Libro"))
        );}

    @Entonces("podra consultar mediante el numero de registro y ver el sello")
    public void podraConsultarMedianteElNumeroDeRegistroYVerElSello() {
        //theActorInTheSpotlight().should(seeThat(RevisaNoticiasRegistroPublico.enConfecamaraSII()));
    }
}