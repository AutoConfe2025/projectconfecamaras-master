package com.co.confecamaras.stepdefinitions.tableros;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.tableros.*;
import com.co.confecamaras.tasks.Consulta.ConsultaModuloTask;
import com.co.confecamaras.tasks.tableros.TableroGestion;
import com.co.confecamaras.utils.tableros.TablerosTitulos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class tablerosStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar tablero de gestion")
    public void RequiereconfecamarasRequiereConsultarTableroDeGestion(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese al sistema SII3 como usuario publico")
    public void ingreseAlSistemaSII3ComoUsuarioPublico(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
    }

    @Cuando("busque los tableros de gestion")
    public void busqueLosTablerosDeGestion() {
        withCurrentActor(TableroGestion.consultar());
    }

    @Entonces("podra consultar el tablero matriculados")
    public void podraConsultarElTableroMatriculados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloPrimerTablero.esIgual(), Matchers.is(TablerosTitulos.TEXTO_MATRICULADOS)));
    }

    @Y("podra ver el tablero matriculados vs meta")
    public void podraVerElTableroMatriculadosVsMeta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloTableroDos.esIgual(), Matchers.is(TablerosTitulos.TEXTO_MATRICULADOS_META)));
    }

    @Y("podra ver el tablero total ingresos vs presopuesto")
    public void podraVerElTableroTotalIngresosVsPresopuesto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloTableroTres.esIgual(), Matchers.is(TablerosTitulos.TEXTO_INGRESO_PRESUPUESTO)));
    }

    @Y("podra ver el tablero ingresos por tipo ingreso")
    public void podraVerElTableroIngresosPorTipoIngreso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloTableroCuatro.esIgual(), Matchers.is(TablerosTitulos.TEXTO_INGRESO_TIPO_INGRESO)));
    }

    @Y("podra ver el tablero comparativo ingreso por grupo de ingreso")
    public void podraVerElTableroComparativoIngresoPorGrupoDeIngreso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloTableroCinco.esIgual(), Matchers.is(TablerosTitulos.TEXTO_COMPARATIVO_GRUPO_INGRESO)));
    }

    //IsaacGomez - se implemento para que realice la busqueda de un modulo
    @Y("^consultara (.+) que abrira una nueva ventana$")
    public void consultaraModuloQueAbriraUnaNuevaVentana(String modulo) {
        theActorInTheSpotlight().attemptsTo(ConsultaModuloTask.consultarModulo(modulo));
    }
    //IsaacGomez - se implemento para que realice el ingreso al navegador y a confecamaras
    @Dado("^el (.+) requiere ver la informacion en Confecamaras$")
    public void usuarioRequiereVerLaInformacionEnConfecamaras(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

}
