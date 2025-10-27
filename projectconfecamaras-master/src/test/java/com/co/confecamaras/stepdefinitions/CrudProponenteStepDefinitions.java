package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.CerrarCajaQuestion;
import com.co.confecamaras.questions.devdos.RadicacionInscripcionProponentePNQuestion;
import com.co.confecamaras.questions.devdos.RadicacionRenovacionProponenteQuestion;
import com.co.confecamaras.userinterfaces.RadicacionInscripcionProponente;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoInscripcionProponente;
import com.co.confecamaras.tasks.DoRenovacionProponente;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrudProponenteStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Radicacion Inscripcion de Proponente Persona Natural")
    public void confecamaras_requiere_realizar_la_radicacion_inscripcion_de_proponente_persona_natural(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Consultas y Transacciones, Tramites Registros Publicos, Expedientes")
    public void seleccione_modulo_de_consultas_y_transacciones_tramites_registros_publicos_expedientes() {}

    @Entonces("inscribira al proponente")
    public void inscribira_al_proponente() {
        Excel excel = new Excel(Excel.rutaExcelDev, "InscripcionProponente", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoInscripcionProponente.DoInscripcionProponente(datos.get("Consulta"), datos.get("Numero Proponente"), datos.get("Empresa"),
                        datos.get("Numero Doc"), datos.get("Fecha Doc"), datos.get("Origen Doc"), datos.get("Autorizo"), datos.get("Fecha Corte"),
                        datos.get("Activo Corriente"), datos.get("Patrimonio Neto"), datos.get("Ingresos Actividad"), datos.get("Grupo Nif"),
                        datos.get("Numero Doc Dos"), datos.get("Fecha Doc Dos"), datos.get("Origen Doc Dos"), datos.get("Clasificaciones"),
                        datos.get("Celebrado"), datos.get("Contratante"), datos.get("Fecha Ejecucion"), datos.get("Valor Pesos"), datos.get("Valor"),
                        datos.get("Campo Texto"), datos.get("Numero Doc Tres"), datos.get("Fecha Doc Tres"), datos.get("Origen Doc Tres"),
                        datos.get("Identificacion"), datos.get("Email"))
        );
        theActorInTheSpotlight().should(seeThat(RadicacionInscripcionProponentePNQuestion.validacion()));
    }

    @Entonces("radicara renovacion")
    public void radicara_renovacion() {
        Excel excel = new Excel(Excel.rutaExcelDev, "RenovacionProponente", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoRenovacionProponente.renovacionProponente(datos.get("Consulta"), datos.get("Numero Proponente"), datos.get("Fecha Corte BS"),
                        datos.get("Numero Doc"), datos.get("Fecha Doc"), datos.get("Origen Doc"), datos.get("Numero Doc"),
                        datos.get("Fecha Doc"), datos.get("Origen Doc"), datos.get("Numero Doc"), datos.get("Fecha Doc"), datos.get("Origen Doc"),
                        datos.get("Identificacion"), datos.get("Email"))
        );
        //theActorInTheSpotlight().should(seeThat(RadicacionRenovacionProponenteQuestion.validacion()));
    }
}